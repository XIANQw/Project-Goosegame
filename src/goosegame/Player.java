package goosegame;
import goosegame.cell.*;

import java.util.*;
/** A player in the "jeu de l'oie" game */
public class Player {
    /** current cell of the player */
    protected Cell cell;
    /** name of the player*/
    protected String name;
    /**
     * @param name the name of this player
     * @param cell the starting cell of this player
    */
    public Player (String name, Cell cell){
        this.name = name;
        this.cell = cell;
        this.cell.changeState();
    }
    /**  A player with no current cell (== null)
     * @param name the name of this player
     *
    */
    public Player (String name){
        this(name, null);
    }
    /** */
    public String toString() { return name; }
    /** returns the current cell of the player
      *  @return the current cell of the player
      */
    public Cell getCell() {
       return this.cell ;
    }
    /** changes the cell of the player
     * @param newCell the new cell
    */
    public void setCell(Cell newCell) {
       this.cell.changeState();
       this.cell = newCell;
       this.cell.changeState();
    }
    /** result of a 1d6 throw
     * @return random result of a 1d6 throw
    */
    private int oneDieThrow() {
       return ((int) (Math.random()*10000) % 6)+ 1;
    }
    /** result of a 2d6 throw
      * @return random result of a 2d6 throw
    */
    public int twoDiceThrow() {
        int result = oneDieThrow() + oneDieThrow();
        return result;
    }

    /** Return the hashcode of this cell
     * @return hashcode
     */
    public int hashCode(){
      return this.name.hashCode();
    }

    /** Check if this player is equals with an object
     * @return true if they are equals, else false
     */
     public boolean equals(Object o){
      if(o instanceof Player){
        Player autre = (Player) o;
        return this.hashCode() == autre.hashCode();
      }
      return false;
    }
}
