package goosegame;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import goosegame.cell.*;

public class NormalTest {

	private Normal c1;
	private Normal c2;
  private Normal c3;
  private Player p1;
  private Player p2;


	@Before
	public void before() {
		this.c1 = new Normal(15);
    this.c3 = new Normal(16);
    this.c2 = new Wait(17);
    this.p1 = new Player("A",c1);
    this.p2 = new Player("B",c3);
	}

	@Test
	public void createTest() {
		assertNotNull(this.c1);
	}

  @Test
	public void getNumTest() {
		assertEquals(15,this.c1.getNum());
	}

  @Test
	public void getTypeTest() {
		assertEquals(Type.normal,this.c1.getType());
	}

  @Test
	public void is_occupedTest() {
    assertTrue(this.c1.is_occuped());
    this.p1.setCell(this.c2);
    assertFalse(this.c1.is_occuped());
	}

  @Test
	public void is_occupedTest2() {
    assertTrue(this.c3.is_occuped());
    assertTrue(this.c1.is_occuped());
    this.p1.setCell(this.c3);
    this.p2.setCell(this.c1);
    assertTrue(this.c3.is_occuped());
    assertTrue(this.c1.is_occuped());
	}

  @Test
	public void ChangeStateTest() {
    assertFalse(this.c2.is_occuped());
    this.c2.changeState();
    assertTrue(this.c2.is_occuped());
    this.c2.changeState();
    assertFalse(this.c2.is_occuped());
  }

  @Test
	public void EqualsTest() {
		assertEquals(this.c1,new Normal(15));
  	assertFalse(new Wait(15).equals(this.c1));
	}


    // ---Pour permettre l'execution des tests ----------------------
    public static junit.framework.Test suite() {
	return new junit.framework.JUnit4TestAdapter(goosegame.NormalTest.class);
    }

}
