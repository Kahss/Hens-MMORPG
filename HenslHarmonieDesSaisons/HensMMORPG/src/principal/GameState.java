package principal;


import java.util.Vector;

import javax.swing.JOptionPane;

import org.lwjgl.input.Keyboard;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

public class GameState extends BasicGameState{

	static final int ID = 1;
	private Image perso;
	private Image fond;
	private int c,d,invc,invd,xMouse,yMouse;
	private Input input;
	private Player me;
	int id,x,y;


	 
	
	
	
	public void init(GameContainer container, StateBasedGame arg1)
			throws SlickException {
		fond = new Image ("image/maison1.png");
		c=0;
		d=0;
		invd=0;
		invc=0;
		input = container.getInput(); 
		me = new Player(x, y ,id ,input);
        me.init();
		Client.players = new Vector<Player>();
	
		container.setShowFPS(false);
		
	}

	public void render(GameContainer container, StateBasedGame game, Graphics g)
			throws SlickException {
		 g.drawString("Bienvenue dans le jeu!",100,100);
		 fond.draw(invc,invd);

		 me.render(g);
		  g.drawString(String.valueOf(xMouse),20,140);
	        g.drawString(String.valueOf(yMouse),80,140); 
	}

	@Override
	public void update(GameContainer container, StateBasedGame game, int delta)
			throws SlickException {
		me.update(container, delta);
		c=me.getxChar();
		d=me.getyChar();
	 	xMouse=input.getAbsoluteMouseX(); 
    	yMouse=input.getAbsoluteMouseY();
    	Client.players = new Vector<Player>();
        c=xMouse;
    	d=yMouse;
	    	if ( input.isKeyPressed(Input.KEY_ESCAPE))
	         {
	             System.exit(0);
	         }
	    	if(input.isKeyPressed(Input.KEY_F1))
	    	{
	    		game.enterState(Menu.ID);
	    	}
	    	
	    	if(input.isKeyPressed(Input.KEY_F2)){
	    		
	       	 invc=invc-(c-506);
		   	 invd=invd-(d-420);
	    	}
	    	 if(input.isKeyPressed(Input.KEY_F2)){
	    		
			     if (xMouse>506 && yMouse>420)
			     {
			    	 c=xMouse;
			    	 d=yMouse;
			    
			     }
			     else if (xMouse>506 && yMouse<420)
			     {	
			            d=xMouse;
				    	 c=yMouse; 
				    	   invc=invc+(c-506);
				   	    invd=invd+(d-420);
			     } 
			     else  if (xMouse<506 && yMouse<420)
			     {
			            c=xMouse;
				    	d=yMouse;
				    	   invc=invc+(c-506);
				   	    invd=invd+(d-420);
			        }
			         
			        else if (xMouse<506 && yMouse>420)
			        {
			           

			            c=xMouse;
				    	d=yMouse;
				    	   invc=invc+(c-506);
				   	    invd=invd+(d-420);
			        }
			         
	        
	         
	    }
	} 
		
	
	public int getID() {
		return ID;
	}

}


