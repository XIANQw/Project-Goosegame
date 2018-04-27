.PHONY: clean doc test
TP = TP9
TARGET = classes
SOURCE = src
PACKAGE = goosegame
TEST = test
DOC = doc
JAR = GooseGame
SOURCE_FILES = $(wildcard $(SOURCE)/**/**/*.java $(SOURCE)/**/*.java)
SOURCE_TEST = $(wildcard $(TEST)/**/*.java)



file: $(patsubst $(SOURCE)/%.java,$(TARGET)/%.class,$(SOURCE_FILES))

$(TARGET)/%.class: $(TARGET) $(SOURCE)/%.java
	javac -cp $(SOURCE) $(word 2,$^) -d $<

$(TARGET):
	mkdir -p $(TARGET)


test: $(patsubst $(TEST)/$(PACKAGE)/%.java,$(TEST)/$(PACKAGE)/%.class,$(SOURCE_TEST))

$(TEST)/$(PACKAGE)/%.class: $(TEST)/$(PACKAGE)/%.java
	javac -cp test-1.7.jar $<
	java -jar test-1.7.jar $(subst $(TEST)/$(PACKAGE)/,$(PACKAGE)., $(subst .class,,$@)) &

$(TEST)/$(TARGET):
	mkdir -p $@

jar: manifest-ex  $(JAR).jar
manifest-ex:
	@echo "Main-Class: goosegame.Main" >> manifest-ex

$(JAR).jar: file
	cd $(TARGET); jar cvfm ../$(JAR).jar ../manifest-ex $(PACKAGE)

run: file
	cd $(TARGET); java $(PACKAGE).Main

runJar:
	java -jar $(JAR).jar

doc:
	cd $(SOURCE);javadoc -d ../$(DOC) -subpackages $(PACKAGE)

new:
	mkdir $(TARGET)
	mkdir $(SOURCE)
	mkdir $(SOURCE)/$(PACKAGE)
	mkdir $(TEST)


archive: clean
	zip -r $(TP).zip . -x "sol/*"


clean:
	rm -frv $(TARGET)
	rm -frv test/$(PACKAGE)/*.class
	rm -frv doc
	rm -frv manifest-ex
