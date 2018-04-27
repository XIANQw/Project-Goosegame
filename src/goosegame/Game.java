package goosegame;

import java.util.*;
import goosegame.cell.*;

/**The class of game, it contains some methods for join player and start a game*/
public class Game{
  protected List<Player> thePlayers;
  protected Board board;
  private Player winner;

  public Game(Board board){
    this.board = board;
    this.thePlayers = new ArrayList<Player>();
    this.winner = null;
  }

  /** Add a player
   * @param p the Player which be added
   *
  */
  public void addPlayer(Player p){
    this.thePlayers.add(p);
  }

  /** Get the winner
   * @return winner
   *
  */
  public Player getWinner(){
    return this.winner;
  }

  /**  Game start
   */
  public void play(){
    Map<Player,Integer> waitPlayer = new HashMap<Player,Integer>();
    int cellFuture, NbOfDice;
    Type celltype;
    String display;
    for(Player player:this.thePlayers) player.setCell(this.board.getCell(0));

    while(this.winner == null){
      for(Player player:this.thePlayers){
        display = player.toString()+" is in "+ player.getCell().toString() + ". ";
        // if this player should wait
        if(waitPlayer.containsKey(player)){
          if(waitPlayer.get(player)==1) waitPlayer.remove(player);
          else waitPlayer.put(player,waitPlayer.get(player)-1);
          display+= player.toString()+" cannot play";
          System.out.println(display);
          continue;
        }
        if(player.getCell().getType() == Type.trap){
          display += player.toString()+" cannot play";
          continue;
        }
        NbOfDice = player.twoDiceThrow();
        display += player.toString() + " throws " + NbOfDice;
        cellFuture = player.getCell().getNum() + NbOfDice;
        // exceed the numbers of cells()
        if(cellFuture > this.board.getNbOfCells()) cellFuture = (2*this.board.getNbOfCells()) - cellFuture + 1;
        display += " and reaches " + this.board.getCell(cellFuture).toString();

        celltype = this.board.getCell(cellFuture).getType();
        // arrive the last cell
        // if the next cell is wait or teleport
        if(celltype == Type.wait) waitPlayer.put(player, 2);
        else if (celltype == Type.goose){
          cellFuture += NbOfDice;
          if(cellFuture >= this.board.getNbOfCells()) cellFuture = (2*this.board.getNbOfCells()) - cellFuture + 1;
          display+= " and jumps to " + this.board.getCell(cellFuture).toString();
        }
        else if(celltype == Type.teleport){
          cellFuture = this.board.getDestination(this.board.getCell(cellFuture));
          display+= " and jumps to " + this.board.getCell(cellFuture).toString();
        }
        // if there is another player at the next cell
        if(this.board.getCell(cellFuture).is_occuped()){
          display+= " "+this.board.getCell(cellFuture).toString() + " is busy ";
          for(Player temp:this.thePlayers) {
            if(temp.getCell().getNum() == cellFuture){
              temp.setCell(player.getCell());
              display += temp.toString() + " is sent to "+player.getCell().toString();
            }
          }
        }
        if(cellFuture == this.board.getNbOfCells()) {
          this.winner = player;
          System.out.println(display);
          break;
        }
        player.setCell(this.board.getCell(cellFuture));
        System.out.println(display);
      }
    }
    System.out.println(this.winner.toString()+" has won !!!");
  }

}
