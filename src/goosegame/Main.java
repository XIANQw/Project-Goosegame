package goosegame;
import java.util.*;
import goosegame.cell.*;

/** main to test goosegame */
public class Main{

  public static void main(String[] args){
    Board board = new BoardNormal(63);
    Game game = new Game(board);
    Player p1 = new Player("A",board.getCell(0));
    Player p2 = new Player("B",board.getCell(0));
    Player p3 = new Player("C",board.getCell(0));
    Player p4 = new Player("D",board.getCell(0));
    game.addPlayer(p1);
    game.addPlayer(p2);
    game.addPlayer(p3);
    game.addPlayer(p4);
    game.play();
    }
}
