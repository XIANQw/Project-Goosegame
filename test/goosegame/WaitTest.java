package goosegame;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import goosegame.cell.*;

public class WaitTest {

	private Wait c1;
	private Normal c2;


	@Before
	public void before() {
    this.c1 = new Wait(2);
    this.c2 = new Normal(15);
	}


	@Test
	public void equalsTest(){
		assertEquals(this.c1,new Wait(2));
		assertFalse(this.c1.equals(new Normal(2)));
	}



    // ---Pour permettre l'execution des tests ----------------------
  public static junit.framework.Test suite() {
	   return new junit.framework.JUnit4TestAdapter(goosegame.WaitTest.class);
  }

}
