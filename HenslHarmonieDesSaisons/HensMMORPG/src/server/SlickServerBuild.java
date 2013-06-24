package server;
import java.io.IOException;
import java.net.Socket;
import java.net.ServerSocket;
import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import org.newdawn.slick.gui.MouseOverArea;
import java.net.*;
import java.util.Vector;
import java.io.*;

public class SlickServerBuild extends JFrame {
	private static final long serialVersionUIDBUILD = 1L;
	
	   static JTextArea textArea;
	   JScrollPane scrollPane;
	   public SlickServerBuild(){
		      super(" BUILD");
		      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		      setSize(500, 400);
		      setLocationRelativeTo(null);
		      textArea = new JTextArea();
		
		      
		      scrollPane = new JScrollPane(textArea);
		      
		      //getContentPane().add(textArea);
		      getContentPane().add(scrollPane);       
		      setLayout(null);
		      JButton button = new JButton(" >> JavaProgrammingForums.com <<");
		  
		       
		     button.setBouds(10,10,200,40);
		       getContentPane().add(button);
		     //Add action listener to button
		       button.addActionListener(new ActionListener() {
		    	 
		           public void actionPerformed(ActionEvent e)
		           {
		               //Execute when button is pressed
		        	   SlickServerBuild.textArea.append("You clicked the button");
		           }
		       });    
		   }
	   
	   
	public static void main(String[] zero) throws IOException {
		 Vector<Player> player = new Vector<Player>();
		ServerSocket socketServeur;
		Socket socketDuServeur;
		SlickServerBuild ss = new SlickServerBuild();
	    ss.setVisible(true);
	    
	    boolean listening = true;
	    while(listening){
			socketServeur = new ServerSocket(2009);
			socketDuServeur = socketServeur.accept();
			 SlickServerBuild.textArea.append("Un utilisateur s'est connecté");
			socketServeur.close();
			socketDuServeur.close();
		}
	}

}
