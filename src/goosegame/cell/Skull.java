package goosegame.cell;
import goosegame.*;

/**
 * The class of Skull, a son class of Teleport
 *
 */
public class Skull extends Teleport{
  int Destination;

  public Skull(int num){
    super(num);
    this.type = Type.teleport;
    this.Destination = 1;
  }
  /** Get a string for descrpting this cell
   * @return the String of descrption
   */
  public String toString(){
    return super.toString() +this.Destination +")";
  }
}
