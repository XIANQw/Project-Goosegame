package goosegame.cell;
import goosegame.*;

/**
 * The class of Goose, a son class of Normal
 *
 * @author XIAN Qiwei
  */
public class Goose extends Normal{

  public Goose(int num){
    super(num);
    this.type = Type.goose;
  }

  /** Get a string for descrpting this cell
   * @return the String of descrption
   */
  public String toString(){
    return super.toString()+" ("+this.type+")";
  }
}
