package goosegame;
import goosegame.cell.*;

public class BoardNormal extends Board {


  /**
   * Constructor
   * @param nb the number of cells of this board
   */
  public BoardNormal(int nb){
    super(nb);
  }

  /** Establish a standard board
   * @return cells of standard board
   */
  public Cell initBoard(int n){
    Cell res;
    if(n == 0) return new Start();
    else if((n%9 == 0)&&(n<63)) return new Goose(n);
    else if(n == 31 & n == 52) return new Trap(n);
    else if(n == 19) return new Wait(n);
    else if(n == 6) {
      res = new Horse(n);
      super.setDestination(res,12);
    }
    else if(n == 42) {
      res = new Labyrinth(n);
      super.setDestination(res,30);
    }
    else if(n == 58) {
      res = new Skull(n);
      super.setDestination(res,30);
    }
    else return new Normal(n);
    return res;
  }


}
