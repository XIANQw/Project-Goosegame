package goosegame.cell;
import goosegame.*;

/**
 * The class of Wait, a son class of Normal
 *
 */
public class Wait extends Normal{
  private int NbRounds;

  public Wait(int num){
    super(num);
    super.type = Type.wait;
    this.NbRounds = 2;
  }

  /** Get a string for descrpting this cell
   * @return the String of descrption
   */
  public String toString(){
    return super.toString()+" (wait in 2 rounds)";
  }

  /** Check if this cell is equals with an object
   * @return true if they are equals, else false
   */
  public boolean equals(Object o){
    if(o instanceof Wait){
      Wait autre = (Wait) o;
      return this.hashCode() == autre.hashCode();
    } 
    return false;
  }
}
