package server;

import java.io.DataOutputStream;
import java.io.ObjectInputStream;
import java.net.Socket;
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
import org.newdawn.slick.SlickException;;

public class  ClientThreadBuild extends Thread implements Runnable{
	   Socket socket;
	   Socket acceptedSocket;
	   Vector<Player> players;
	   int playerID;
	   Input input;
	   Player me;
	   DataOutputStream out;
	    ObjectInputStream in;
	    boolean loop = true;
	    JTextArea textArea;
	    
	   @SuppressWarnings("unchecked")
	   public ClientThreadBuild(String ip){
	      super();
	      
	      try{
	         players = new Vector<Player>();
	         socket = new Socket(ip, 4444);
	         socket.setTcpNoDelay(true);
	         out = new DataOutputStream(socket.getOutputStream());
	           in = new ObjectInputStream(socket.getInputStream());
	         playerID = in.readInt(); 
	         players = (Vector<Player>) in.readObject();
	         
	         if(players != null)
	            System.out.println("Not Null: " + players.size());
	         
	         boolean b = false;
	         for(int i = 0; i < players.size(); i++){
	            if(!b){
	               if(players.get(i).id == playerID){
	                  me = players.get(i);
	                  b = true;
	               }
	            }
	         }
	      }
	      
	      catch(Exception e){
	         e.printStackTrace();
	      }
	   
	   }
	      
	      public ClientThreadBuild( Socket acceptedSocket, Vector<Player> players, int playerID, JTextArea textArea){
	         super("ClientThread");
	         this.acceptedSocket = acceptedSocket;
         	 this.players = players;									
         	
			players.add(new Player(input , playerID));  
			boolean b = false;
	         for(int i = 0; i < players.size(); i++){
	            if(!b){
	               if(players.get(i).id == playerID){
	                  me = players.get(i);
	                  b = true;
	               }
	            }
	         }
	         
	         this.playerID = playerID;
	         this.textArea = textArea;
	      }
	      
	   @SuppressWarnings("unchecked")
	public void run(){
	      try{
	         while(loop){
	            try{
	               if(!socket.isClosed() && socket.isConnected()){
	                    out.writeInt(me.x);
	                    out.writeInt(me.y);
	                    out.flush();
	                    
	                  players = new Vector<Player>();
	                    players = (Vector<Player>) in.readObject();
	                    sleep(15);
	               }
	               
	               else
	                  loop = false;
	            
	              }
	            catch(Exception e){
	                   e.printStackTrace();
	                   socket.close();
	             }  
	         }
	         
	         
	         
	      }
	      
	      catch(Exception e){
	         e.printStackTrace();
	      }
	   }

}
