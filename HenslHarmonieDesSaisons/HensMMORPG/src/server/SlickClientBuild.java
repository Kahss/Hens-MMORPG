package server;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Vector;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;

public class SlickClientBuild extends BasicGame {

	   ClientThread ct;
	   Vector<Player> players;
	   Player me;
	   Input input;
	   public SlickClientBuild()
	    {
	        super("Hens MMORPG - L'harmonie des Saisons BUILD");
	    }

	   public void connect(){
		      String ip ="169.254.57.235" ;
		       ct = new ClientThread(ip); 
		        ct.start();
		        me = ct.me;
		        players = ct.players;
		    }
	public static void main(String[] args) throws SlickException {
		Socket socket;
		AppGameContainer app = new AppGameContainer( new SlickClientBuild() );
		app.setShowFPS(false);
	    app.setAlwaysRender(true);
	    app.setTargetFrameRate(60);
	    app.setDisplayMode(1024, 768, false);
	    app.start();
		try {
			socket = new Socket(InetAddress.getLocalHost(),2009);
			socket.close();
		}catch (UnknownHostException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public void init(GameContainer arg0) throws SlickException {

		 try{
	         players = new Vector<Player>();     
	         connect();
		 }
		 catch(Exception e){
	    	  
	      }
	}
	
	
	
	public void render(GameContainer arg0, Graphics arg1) throws SlickException {
		
	}

	

	
	public void update(GameContainer arg0, int arg1) throws SlickException {

		
	}

}
