package server;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.ServerSocket;
import java.io.DataOutputStream;
import java.io.ObjectInputStream;
import java.util.Vector;

public class Serveur {
	
	public static void main(String[] zero) {
		
		ServerSocket socketServeur;
		Socket socketDuServeur;
		
		try {
			socketServeur = new ServerSocket(2009);
			socketDuServeur = socketServeur.accept();
			System.out.println("Un utilisateur s'est connecté"+InetAddress.getLocalHost());
			socketServeur.close();
			socketDuServeur.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}

}
