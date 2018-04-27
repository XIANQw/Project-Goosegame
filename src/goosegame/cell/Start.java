package goosegame.cell;
import goosegame.*;

/**
 * The class of Skull, a son class of Teleport
 *
 */
public class Start implements Cell{

  private int cellNum;
  private Type type;
  private boolean occuped;

  public Start(){
    this.cellNum = 0;
    this.type = Type.start;
  }

  /** Get number of cell
   * @return number of cell
   */
  public int getNum(){
    return this.cellNum;
  }

  /** Get the type of cell
   * @return type of cell
   */
  public Type getType(){
    return this.type;
  }

  /** check if this cell is occuped
   * @return true for occuped else false
   */
  public boolean is_occuped(){
    return this.occuped;
  }

  /** change the state of this cell
   */
  public void changeState(){
    this.occuped = !this.occuped;
  }

  /** Get a string for descrpting this cell
   * @return the String of descrption
   */
  public String toString(){
    return "Cell Start";
  }
  /** Return the hashcode of this cell
   * @return hashcode
   */
  public int hashCode(){
    return this.cellNum;
  }

  /** Check if this cell is equals with an object
   * @return true if they are equals, else false
   */
  public boolean equals(Object o){
    if(o instanceof Start){
      Start autre = (Start) o;
      return this.hashCode() == autre.hashCode();
    }
    return false;
  }


}
