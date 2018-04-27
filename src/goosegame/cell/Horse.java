package goosegame.cell;
import goosegame.*;

/**
 * The class of Horse, a son class of Teleport
 */
public class Horse extends Teleport{
  private int Destination;

  public Horse(int num){
    super(num);
    super.type = Type.teleport;
    this.Destination = 12;
  }

  /** Get a string for descrpting this cell
   * @return the String of descrption
   */
  public String toString(){
    return super.toString()+ this.Destination +")";
  }

}
