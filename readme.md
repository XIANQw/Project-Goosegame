# GooseGame

## AUTEURS :
- XIAN Qiwei
- CHANE-SING-GUAN Raphael
- LIN Dixuan
- Youva MOKEDDES

## Présentation

Programmer une application de jeu de l'oie. Cela permet d'ajouter plusieur de joueurs et
on peut voir le processus du jeu.

## Instructions pour:

### générer et consulter la documentation

Ce projet est composé par dossiers:
- src : Ce dossier contient les fichiers sources .java
- classes : Il y a les fichiers compilés .class
- doc : Pour contenir les fichiers des documentations
- test : Contenir les fichiers de la teste, pour tester les méthodes de chaque class qu'on a créé.

Pour voir les détails de chaque class, vous pouvez taper cette commande pour implanter javadoc
```
make doc
```

### compiler les sources du projet

Pour compiler les fichiers sources, vous utilisez cette commande.
```
make file
```


### compiler et exécuter les tests

Pour compiler les fichiers tests, vous tapez la commande
```
make test
```
après vous voyez tous les tests passés.



### générer le fichier.jar
Pour implanter un fichier exécutable.jar, vous utilisez cette commande
```
make jar
```
le fichier manifest-ex peut créer automatiquement et ajouter Main-Class par soi-même.


### exécuter le programme

Tout d'abord il faut déclarer la classe main dans un fichier "mainifest-ex",
On écrit "Main-Class: goosegame.Main": url "title" dans ce fichier, après on exécute le programme .jar
par la commande  
```
make runJar
```
