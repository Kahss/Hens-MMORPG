package game;

import java.io.Serializable;



public class Player implements Serializable{
   private static final long serialVersionUID = 1L;
   public int x;
   public int y;
   public int id;
  ;
   private int xChar,yChar,xMouse,yMouse,xGrid,yGrid;
   private int xTileChar,yTileChar;
   
   public Player(int x, int y, int id){
      this.x = x;
      this.y = y;
      this.id = id;
   }
}