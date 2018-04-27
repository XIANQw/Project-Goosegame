package goosegame;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import goosegame.cell.*;

public class StartTest {

	private Start c1;
	private Normal c2;
  private Player p1;


	@Before
	public void before() {
    this.c1 = new Start();
    this.c2 = new Normal(15);
    this.p1 = new Player("A",this.c1);
	}

	@Test
	public void createTest() {
		assertNotNull(new Start()) ;
	}

  @Test
	public void getNumTest() {
		assertEquals(0,this.c1.getNum());
	}

  @Test
	public void getTypeTest() {
		assertEquals(Type.start,this.c1.getType());
	}

  @Test
	public void is_occupedTest() {
    assertTrue(this.c1.is_occuped());
    this.p1.setCell(this.c2);
    assertFalse(this.c1.is_occuped());
	}

	@Test
	public void equalsTest(){
		assertEquals(this.c1,new Start());
		assertFalse(this.c1.equals(new Normal(2)));
	}



    // ---Pour permettre l'execution des tests ----------------------
    public static junit.framework.Test suite() {
	return new junit.framework.JUnit4TestAdapter(goosegame.StartTest.class);
    }

}
