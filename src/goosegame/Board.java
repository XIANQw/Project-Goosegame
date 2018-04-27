package goosegame;
import goosegame.cell.*;
import java.util.*;

/**The class of board, it contains some methods for using the board*/
public abstract  class Board{
  protected final Cell[] theCells;
  protected  int nbOfCell;
  protected Map<Cell,Integer> destination;

 /**
  * Constructor of board
  * @param nb the number of cells of this board
  */
  public Board(int nb){
    this.theCells = new Cell[nb+1];
    this.nbOfCell = nb;
    this.destination = new HashMap<Cell,Integer>();
    for(int i=0;i<nb+1;i++) theCells[i] = initBoard(i);
  }

  /** Initialize a cell at position n
   * @param n the position of cell
   * @return cell which is at position n
   */
  protected abstract Cell initBoard(int n);

  /** Get the destination of cell Teleport
   * @param c the cell Teleport
   * @return destination
   */
  public int getDestination(Cell c){
    return this.destination.get(c);
  }

  /** Set a destination of a cell Teleport
   * @param c The cell to set destination
   * @param nb the number of destination cell
   */
  protected void setDestination(Cell c,int nb){
    destination.put(c,nb);
  }

  /** Get the destination of cell Teleport
   * @param index the number of cell to be searched
   * @return cell is searched
   */
  public Cell getCell(int index){
    return this.theCells[index];
  }

  /** Get the number of cells of this board
   * @return number of cells
   */
  public int getNbOfCells(){
    return this.nbOfCell;
  }
}
