package goosegame.cell;
import goosegame.*;

/**
 * The interface of Cell
  */
public interface Cell{

  /** Get number of cell
   * @return number of cell
   */
  int getNum();

  /** Get the type of cell
   * @return type of cell
   */
  Type getType();

  /** check if this cell is occuped
   * @return true for occuped else false
   */
  boolean is_occuped();

  /** change the state of this cell
   */
  void changeState();

  /** Get a string for descrpting this cell
   * @return the String of descrption
   */
  String toString();

  /** Return the hashcode of this cell
   * @return hashcode
   */
  int hashCode();

  /** Check if this cell is equals with an object
   * @param o an Object to compare
   * @return true if they are equals, else false
   */
  boolean equals(Object o);


}
