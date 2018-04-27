package goosegame;

import static org.junit.Assert.*;
import java.util.*;
import org.junit.Before;
import org.junit.Test;
import goosegame.cell.*;

public class BoardTest {

	private Cell c1;
	private Cell c3;
  private Board bNormal;


	@Before
	public void before() {
		this.c1 = new Normal(15);
    this.c3 = new Horse(10);
    this.bNormal = new BoardNormal(63);
	}

	@Test
	public void createTest() {
		assertNotNull(this.bNormal);
	}

  @Test
	public void setDestinationTest() {
    this.bNormal.setDestination(this.c3,this.c1.getNum());
    assertEquals(15,this.bNormal.getDestination(this.c3));
	}

  @Test
	public void getDestination() {
    this.bNormal.setDestination(this.c3,15);
    assertEquals(15,this.bNormal.getDestination(this.c3));
	}

  @Test
	public void getCellTest() {
    assertEquals(this.c1,this.bNormal.getCell(15));
    assertFalse(this.c1.equals(this.bNormal.getCell(16)));
	}

  @Test
	public void getNbOfCellsTest() {
    assertEquals(63,this.bNormal.getNbOfCells());
	}

  @Test
  public void initBoardTest(){
    assertEquals(this.bNormal.initBoard(6),new Horse(6));
    assertEquals(this.bNormal.initBoard(17),new Normal(17));
  }


    // ---Pour permettre l'execution des tests ----------------------
    public static junit.framework.Test suite() {
	return new junit.framework.JUnit4TestAdapter(goosegame.BoardTest.class);
    }

}
