package goosegame;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import goosegame.cell.*;

public class GameTest {

  private Board bNormal;
  private Player p1;
  private Player p2;
  private Game game;


	@Before
	public void before() {
    this.bNormal = new BoardNormal(63);
    this.p1 = new Player("A",new Start());
    this.p2 = new Player("B",new Start());
    this.game = new Game(bNormal);
	}

	@Test
	public void createTest() {
		assertNotNull(this.game);
	}

  @Test
	public void addPlayerTest() {
    this.game.addPlayer(this.p1);
    game.play();
    assertEquals(this.p1,this.game.getWinner());
	}

  @Test
	public void getWinnerTest() {
    this.game.addPlayer(this.p1);
    game.play();
    assertEquals(this.p1,this.game.getWinner());
	}

  @Test
	public void playTest() {
    assertNull(this.game.getWinner());
    this.game.addPlayer(this.p1);
    this.game.addPlayer(this.p2);
    this.game.play();
    assertNotNull(this.game.getWinner());
	}

  // ---Pour permettre l'execution des tests ----------------------
  public static junit.framework.Test suite() {
	  return new junit.framework.JUnit4TestAdapter(goosegame.GameTest.class);
  }

}
