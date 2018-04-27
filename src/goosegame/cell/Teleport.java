package goosegame.cell;
import goosegame.*;
/**
 * The abstract class Teleport
 *
 */
abstract class Teleport extends Normal{

  public Teleport(int num){
    super(num);
    this.type = Type.teleport;
  }
  /** Get a string for descrpting this cell
   * @return the String of descrption
   */
  public String toString(){
    return super.toString()+" (teleport to ";
  }

}
