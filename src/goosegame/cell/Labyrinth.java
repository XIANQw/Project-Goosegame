package goosegame.cell;
import goosegame.*;

/**
 * The class of Labyrinth, a son class of Teleport
 *
 */
public class Labyrinth extends Teleport{
  private int Destination;

  public Labyrinth(int num){
    super(num);
    super.type = Type.teleport;
    this.Destination = 30;
  }

  /** Get a string for descrpting this cell
   * @return the String of descrption
   */
  public String toString(){
    return super.toString()+ this.Destination +")";
  }
}
