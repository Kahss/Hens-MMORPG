package game;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.util.Vector;

import javax.swing.JTextArea;


class ClientThread extends Thread implements Runnable{
   Socket socket;
   Vector<Player> players;
   int playerID;
   Player me;
   DataOutputStream out;
    ObjectInputStream in;
    boolean loop = true;
   
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
   
   @SuppressWarnings("unchecked")
public void run(){
      try{
         while(loop){
            try{
               if(!socket.isClosed() && socket.isConnected()){
                    out.writeInt(me.x);
                    out.writeInt(me.y);
                    out.flush();
                    
                    //players = new Vector<Player>();
                    players = (Vector<Player>) in.readObject();
                    
                    System.out.println("size" + players.size());
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