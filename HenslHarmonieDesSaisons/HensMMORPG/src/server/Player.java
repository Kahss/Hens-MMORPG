package server;

import java.io.Serializable;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.gui.AbstractComponent;
import org.newdawn.slick.gui.ComponentListener;

public class Player implements Serializable{
   private static final long serialVersionUID = 1L;
   int x;
   int y;
   int id;
   public Input input;

   public Player(Input input, int id)
	    {
	        this.input = input;
	        this.id = id;
	    }

   

}