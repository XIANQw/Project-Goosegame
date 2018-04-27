package goosegame.cell;
import goosegame.*;

/**
 * The class of Labyrinth, a son class of Teleport
 *
 */
public class Trap extends Normal{

  public Trap(int num){
    super(num);
    this.type = Type.trap;
  }
 
  /** Get a string for descrpting this cell
   * @return the String of descrption
   */
  public String toString(){
    return super.toString()+" ("+this.type+")";
  }

  /** Check if this cell is equals with an object
   * @return true if they are equals, else false
   */
  public boolean equals(Object o){
    if(o instanceof Trap){
      Trap autre = (Trap) o;
      return this.hashCode() == autre.hashCode();
    }
    return false;
  }
}
