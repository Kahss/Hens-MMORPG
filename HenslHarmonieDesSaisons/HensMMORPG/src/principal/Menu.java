package main;
import java.util.Vector;

import javax.swing.JOptionPane;

import org.newdawn.slick.gui.AbstractComponent;
import org.newdawn.slick.gui.ComponentListener;
import org.newdawn.slick.gui.MouseOverArea;
import org.lwjgl.input.Keyboard;
import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

public class Menu extends BasicGameState implements ComponentListener {
	
	static final int ID = 2;
	private Image menu;
	private MouseOverArea quit; 
	private MouseOverArea play;
	ClientThread ct;
	 Vector<main.Player> players;
	   main.Player me;
	   int ALL_KEYS = 0xFF;
	
	public void connect(){
	      String ip = JOptionPane.showInputDialog("Input server IP.");
	       ct = new ClientThread(ip);
	        ct.start();
	        //ct.setPriority(Thread.MAX_PRIORITY);
	        
	        me = ct.me;
	        players = ct.players;
	    } 
	
	public void init(GameContainer container, StateBasedGame game)
			throws SlickException {
		menu = new Image("image/fond.jpg");
	
		quit = new MouseOverArea(container,new Image("image/quit.png"), 350, 620,this);
		quit.setNormalColor(new Color(0.7f,0.7f,0.7f,1f));
		quit.setMouseOverColor(new Color(0.9f,0.9f,0.9f,1f)); 

     	play = new MouseOverArea(container,new Image("image/play.png"), 350, 430, this);
		play.setNormalColor(new Color(0.7f,0.7f,0.7f,1f));
		play.setMouseOverColor(new Color(0.9f,0.9f,0.9f,1f));
		container.setShowFPS(false);
		connect();
	}


	public void render(GameContainer container, StateBasedGame game, Graphics g)
			throws SlickException {
			menu.draw(0,0);
			quit.render(container,g);
			play.render(container, g);
	}


	public void update(GameContainer container, StateBasedGame game, int delta)
			throws SlickException {
		
		   Input input = container.getInput();
	         
	        if (input.isKeyDown(Keyboard.KEY_NUMPAD1))
	        {
	            game.enterState(GameState.ID);
	             
	        }
	        
	        if (input.isKeyDown(Keyboard.KEY_NUMPAD4))
	        {
	        	game.enterState(CreateCharacter.ID);
	        }
	        
	         
	        if (input.isKeyDown(Keyboard.KEY_NUMPAD2))
	        {
	            container.exit();    
	        }
	         
	        if (input.isKeyDown(Keyboard.KEY_ESCAPE))
	        {
	             
	        container.exit();    
	         
	        }
		
	}

	@Override
	public int getID() {
		// TODO Auto-generated method stub
		return ID;
	}


	@Override
	public void componentActivated(AbstractComponent source) {
	}
	
	}