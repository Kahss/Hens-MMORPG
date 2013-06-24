package main;

import java.util.Scanner;

import javax.swing.JCheckBox;
import javax.swing.JPanel;

import org.lwjgl.input.Keyboard;
import org.newdawn.slick.Color;
import org.newdawn.slick.Font;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.InputListener;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.TrueTypeFont;
import org.newdawn.slick.gui.AbstractComponent;
import org.newdawn.slick.gui.ComponentListener;
import org.newdawn.slick.gui.MouseOverArea;
import org.newdawn.slick.gui.TextField;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;
import org.newdawn.slick.util.InputAdapter;

import charSheets.Anar;
import charSheets.Personnage;
import charSheets.Sulimo;
import charSheets.Ulmo;
import charSheets.Wilwar; 

public class CreateCharacter extends BasicGameState implements ComponentListener, InputListener{
	static final int ID = 3;
	private MouseOverArea sulimoBT;
	private MouseOverArea wilwarBT;
	private MouseOverArea ulmoBT;
	private MouseOverArea anarBT,ValidName,EnterGame;
	private Personnage ThisChar=null;
	private int Type;
	private Image anarImg,ulmoImg,wilwarImg,sulimoImg;
	private Image fondAnar,fondUlmo,fondWilwar,fondSulimo;
	private String name;
	private TextField Name;
	private StateBasedGame game;
	public void init(GameContainer container, StateBasedGame game)
			throws SlickException {
		ulmoBT = new MouseOverArea(container,new Image("image/GUI/CreateChar/ulmoBT.jpg"), 50, 140,this);
    	anarBT = new MouseOverArea(container,new Image("image/GUI/CreateChar/anarBT.jpg"), 200, 140,this);
    	wilwarBT = new MouseOverArea (container, new Image("image/GUI/CreateChar/wilwarBT.jpg"),350,140,this);
    	sulimoBT = new MouseOverArea (container, new Image("image/GUI/CreateChar/sulimoBT.jpg"),500,140,this);
    	ValidName = new MouseOverArea (container, new Image ("image/GUI/CreateChar/valid.jpg"), 50, 250,this);
    	EnterGame = new MouseOverArea (container, new Image ("image/GUI/CreateChar/valid.jpg"), 250, 700,this);
    	Type=0;
    	anarImg = new Image("image/GUI/CreateChar/anarBT.jpg");
    	wilwarImg = new Image("image/GUI/CreateChar/wilwarBT.jpg");
    	ulmoImg = new Image("image/GUI/CreateChar/ulmoBT.jpg");
    	sulimoImg = new Image("image/GUI/CreateChar/sulimoBT.jpg");
    	fondWilwar = new Image ("image/GUI/CreateChar/fondanar.png");
    	fondUlmo = new Image ("image/GUI/CreateChar/fondanar.png");
    	fondSulimo = new Image ("image/GUI/CreateChar/fondSulimo.png");
    	fondAnar = new Image ("image/GUI/CreateChar/fondanar.png");
    	
    	Name = new TextField(container,  container.getDefaultFont() , 50, 200, 80, 30, this);
    
    	
	}

	
	public void render(GameContainer container, StateBasedGame game, Graphics g)
			throws SlickException {
	
		g.drawString("Bienvenue dans la création de personnage!!", 50, 20);
		
		g.setBackground(Color.gray);
	    if(Type==0){g.drawString("Veuillez choisir la classe de votre personnage", 50, 90);
	    	anarBT.render(container, g);
	    	ulmoBT.render(container, g);
	    	wilwarBT.render(container, g);
	    	sulimoBT.render(container, g);
	    	//container.setPaused(true);
	    }
	    else if(Type==1){
	    	fondAnar.draw(0, 0);
	    	g.drawString("Choisissez votre nom. Appuyez sur '1' pour valider.", 50, 290);
	    	
	    	ulmoBT.render(container, g);
	    	wilwarBT.render(container, g);
	    	sulimoBT.render(container, g);
	    	Name.render(container, g);
	    	ValidName.render(container, g);
	    	if(name!=null){
	    		if(name=="Rubis"){
	    			g.drawString("Veuillez choisir un autre prénom", 50, 350);
	    		}
	    		else{
	    			g.drawString("vous avez choisi"+name, 50, 400);
	    			EnterGame.render(container, g);
	    		}
	    	
	    	}
	    		
	   
	    }
	    else if(Type==2){
	    	fondWilwar.draw(0, 0);
	    	g.drawString("Choisissez votre nom. Appuyez sur'1' pour valider.", 50, 290);
	    	anarBT.render(container, g);
	    	ulmoBT.render(container, g);
	    	sulimoBT.render(container, g);
	    	Name.render(container, g);
	    	
	    	
	    	ValidName.render(container, g);
	    	
	    	if(name!=null){
	    		if(name=="Rubis"){
	    			g.drawString("Veuillez choisir un autre prénom", 50, 350);
	    		}
	    		else{
	    			g.drawString("vous avez choisi "+name, 50, 400);
	    			EnterGame.render(container, g);
	    		}
	    	
	    	}
	    	}
	    
	    else if(Type==3){
	    	fondUlmo.draw(0,0);
	    	g.drawString("Choisissez votre nom. Appuyez sur'1' pour valider.", 50, 290);
	    	anarBT.render(container, g);
	    	wilwarBT.render(container, g);
	    	sulimoBT.render(container, g);
	    	Name.render(container, g);
	    	ValidName.render(container, g);
	    	if(name!=null){
	    		if(name=="Rubis"){
	    			g.drawString("Veuillez choisir un autre prénom", 50, 350);
	    		}
	    		else{
	    			g.drawString("vous avez choisi "+name, 50, 400);
	    			EnterGame.render(container, g);
	    		}
	    	
	    	}
	    }
	    else if(Type==4){
	    	fondSulimo.draw(0, 0);
	    	g.drawString("Choisissez votre nom. Appuyez sur'1' pour valider.", 50, 290);
	      	anarBT.render(container, g);
	    	ulmoBT.render(container, g);
	    	wilwarBT.render(container, g);
	    	Name.render(container, g);
	    	ValidName.render(container, g);
	    	if(name!=null){
	    		if(name=="Rubis"){
	    			g.drawString("Veuillez choisir un autre prénom", 50, 350);
	    		}
	    		else{
	    			g.drawString("vous avez choisi "+name, 50, 400);
	    			EnterGame.render(container, g);
	    		}
	    	
	    	}
	    }
		
	       
	}
	
	
	public void update(GameContainer container, StateBasedGame game, int delta)
			throws SlickException {
			
		if(Type>0){
			 Input input = container.getInput();
	         
		        if (input.isKeyDown(Keyboard.KEY_1))
		        {
		           name=Name.getText();
		             
		        }
		        if(input.isKeyDown(Keyboard.KEY_2)){
		        	 game.enterState(GameState.ID);	
		        }
		        
		  if (input.isKeyDown(Keyboard.KEY_NUMPAD1))
	        {
	            game.enterState(GameState.ID);
	             
	        }
		}
		}
		
		
		
		
		
		
	

	
	public int getID() {
		return ID;
	}


	@Override
	public void componentActivated(AbstractComponent source) {
		// TODO Auto-generated method stub
		
		if(source==anarBT){
			
			ThisChar=new Anar(	name, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);	
					
			Type=1;
			
		}
		if(source==wilwarBT){
			
			ThisChar=new Wilwar(name, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
			Type=2;
		}
		
		if(source==ulmoBT){
			ThisChar=new Ulmo(name, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
			Type=3;
		}
		if(source==sulimoBT){
			ThisChar=new Sulimo();
			Type=4;
		}
		
		if(Type>0){
			if(source==ValidName){
				  name=Name.getText();
			}

		}
		
		if(source==EnterGame){
			game.enterState(GameState.ID);
		
		}
		
		
	}

	
	
	
	
}
