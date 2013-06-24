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
import org.newdawn.slick.SlickException;

public  class SlickClient extends BasicGame{
   
   ClientThread ct;
   Vector<Player> players;
   Player me;
   Input input;
   private Image  upleft, downright, downleft, upright, currentSprite,down,left,right,up;
   private int xChar,yChar,xMouse,yMouse,xGrid,yGrid;
   private int xTileChar,yTileChar;
  
   public SlickClient()
    {
        super("Hens MMORPG - L'harmonie des Saisons");
    }
   
   public void connect(){
	      String ip = JOptionPane.showInputDialog("Rentrez l'ip serveur:");
	       ct = new ClientThread(ip); 
	        ct.start();
	        me = ct.me;
	        players = ct.players;
	    }
   
   public void init(GameContainer gc) throws SlickException {
	   	   downleft = new Image("image/Skin/pers34dgauche.png");
	       upright = new Image("image/Skin/persdodroite.png");
	       upleft = new Image("image/Skin/persdogauche.png");
	       downright = new Image("image/Skin/pers34droite.png");
	       down = new Image ("image/Skin/persface.png");
	       right = new Image ("image/Skin/persprofildroite.png");
	       left= new Image("image/Skin/persprofilgauche.png");
	       up= new Image ("image/Skin/persdos.png");
	       currentSprite = down;
 
	       xChar=489+27;
	       yChar=328+120;
	       xGrid=0;
	       yGrid=0;
	   try{
         players = new Vector<Player>();     
         connect();
      }
      
      catch(Exception e){
    	  
      }
   }
   
  
   
   public void render(GameContainer gc, Graphics g) throws SlickException{
       currentSprite.draw(xChar-27,yChar-120);
       g.drawString(String.valueOf(xTileChar), 800, 100);
       g.drawString(String.valueOf(yTileChar), 880, 100);
      
       for(int i = 0; i < players.size(); i++){
           g.setColor(Color.cyan);
           g.fillRect(players.get(i).x, players.get(i).y, 50, 50);
        }
     
   }
   
   public void update(GameContainer gc, int delta)throws SlickException{
	      players = new Vector<Player>();
	      System.out.println("ct size: " + ct.players.size());
	      me = ct.me;
	      players = ct.players;
	      input = gc.getInput();
	     	xMouse=input.getAbsoluteMouseX(); 
	     	yMouse=input.getAbsoluteMouseY();
	           
	         
	         if(input.isMousePressed(Input.MOUSE_LEFT_BUTTON)){
	  		     if (xMouse>xChar && yMouse>yChar)
	  		     {
	  		    
	  		         currentSprite = downright;
	  		    	 xGrid=xMouse;
	  		    	 yGrid=yMouse;
	  		         xTileChar=(yGrid/64+xGrid/128);
	  		         yTileChar=(yGrid/64-xGrid/128);
	  		         
	  		        }
	  		     else if (xMouse>xChar && yMouse<yChar)
	  		        {
	  		            currentSprite = upright;
	  		            xGrid=xMouse;
	  			    	 yGrid=yMouse;
	  			         xTileChar=(yGrid/64+xGrid/128);
	  			         yTileChar=(yGrid/64-xGrid/128);
	  		        }  
	  		     
	  		        else  if (xMouse<xChar && yMouse<yChar)
	  		        {
	  		            currentSprite = upleft;
	  		            xGrid=xMouse;
	  			    	 yGrid=yMouse;
	  			         xTileChar=(yGrid/64+xGrid/128);
	  			         yTileChar=(yGrid/64-xGrid/128);
	  		             
	  		        }
	  		         
	  		        else if (xMouse<xChar && yMouse>yChar)
	  		        {
	  		            currentSprite = downleft;
	  		            xGrid=xMouse;
	  			    	 yGrid=yMouse;
	  			         xTileChar=(yGrid/64+xGrid/128);
	  			         yTileChar=(yGrid/64-xGrid/128);
	  		             
	  		        }
	  		     
	         } 		         
	      
	   }
   
   public static void main(String[] args) throws SlickException{
    AppGameContainer app = new AppGameContainer( new SlickClient() );
   
    app.setShowFPS(false);
    app.setAlwaysRender(true);
    app.setTargetFrameRate(60);
    app.setDisplayMode(1024, 768, false);
    app.start();
   }
}
   
class ClientThread extends Thread implements Runnable{
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
	   public ClientThread(String ip){
	      super("ClientThread");
	      
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
	      
	      public ClientThread( Socket acceptedSocket, Vector<Player> players, int playerID, JTextArea textArea){
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