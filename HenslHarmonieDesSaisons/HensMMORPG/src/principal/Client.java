package principal;

import principal.CreateCharacter;
import principal.GameState;
import principal.Menu;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

import com.thoughtworks.xstream.XStream;

import java.io.*;
import java.net.*;
import java.util.Vector;

import javax.swing.JOptionPane;

public class Client extends StateBasedGame{
	private Menu menu;
	private GameState gameState;
	private CreateCharacter createCharacter;
 	public static  ClientThread ct;
   public static Vector<Player> players;
   	
   Player me;
   int ALL_KEYS = 0xFF;
   boolean keys[];
   
   public Client()
    {
        super("Test Online Client - by William Starkovich");
    }
   
  
   public static void main(String[] args) throws SlickException{
    AppGameContainer app =
      new AppGameContainer( new Client() );
   
    app.setShowFPS(false);
    app.setAlwaysRender(true);
    app.setTargetFrameRate(60);
    app.setDisplayMode(1024, 768, false);
    app.start();
   }

@Override
public void initStatesList(GameContainer arg0) throws SlickException {
	// TODO Auto-generated method stub
 	menu = new Menu();
 	gameState = new GameState();
    createCharacter = new CreateCharacter();
    addState(menu);
    addState(gameState);
    addState(createCharacter);
}
/*
public void init(GameContainer gc) throws SlickException {
    try{
       keys = new boolean[ALL_KEYS];
       
       for(int i = 0; i < ALL_KEYS; i++){
          keys[i] = false;
       }
       
       players = new Vector<Player>();
       
       connect();
    }
    
    catch(Exception e){
       
    }
 }

public void update(GameContainer gc, int delta)throws SlickException{
controls();

players = new Vector<Player>();

me = ct.me;
players = ct.players;
}

public void render(GameContainer gc, Graphics g) throws SlickException{
g.setColor(Color.black);
g.fillRect(0,0,640,480);

for(int i = 0; i < players.size(); i++){
   g.setColor(Color.cyan);
   g.fillRect(players.get(i).x, players.get(i).y, 50, 50);
}

g.drawString("Players: " + players.size(), 50, 10);
}

public void keyPressed(int key, char c) {
keys[key] = true;
}

public void keyReleased(int key, char c) {
keys[key] = false;
}

public void controls(){
if(keys[Input.KEY_UP]){
   me.y--;
}

else if(keys[Input.KEY_DOWN]){
   me.y++;
}

else if(keys[Input.KEY_LEFT]){
   me.x--;
}

else if(keys[Input.KEY_RIGHT]){
   me.x++;
}*/


}
