package main;


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
	private int c,d;
	private Input input;
	private Player youri;
	
	public void init(GameContainer container, StateBasedGame arg1)
			throws SlickException {
		perso = new Image("image/rubis.png");
		fond = new Image ("image/maison1.png");
		c=0;
		d=0;
		input = container.getInput();
		 youri = new Player(input);
	        youri.init();
		container.setShowFPS(false);
	}

	public void render(GameContainer container, StateBasedGame game, Graphics g)
			throws SlickException {
		 g.drawString("Bienvenu dans le jeu!",100,100);
		 fond.draw(c,d);
		 perso.draw(489,328);
		 youri.render(g);
		
	}

	@Override
	public void update(GameContainer container, StateBasedGame game, int delta)
			throws SlickException {
		youri.update(container, delta);
		c=youri.getX();
		d=youri.getY();
		
	    			   
	    	if ( input.isKeyPressed(Input.KEY_ESCAPE))
	         {
	             System.exit(0);
	         }
	    	if(input.isKeyPressed(Input.KEY_F1))
	    	{
	    		game.enterState(Menu.ID);
	    	}
	    	
	} 
		
	
	public int getID() {
		return ID;
	}

}


