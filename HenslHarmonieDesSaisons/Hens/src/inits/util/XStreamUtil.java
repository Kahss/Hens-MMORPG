package inits.util;

import inits.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;

import screens.UIs.UIMenu;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class XStreamUtil {
	Compte compte;
	String initialPath, pathChar,pathCompte;
	XStream xStream;
	
public XStreamUtil()	{
	URL tempPath = UIMenu.class.getResource("");
	initialPath = tempPath.toString().substring("file:/".length(), tempPath.toString().length()-"/Hens/bin/screens/UIs".length()) + "Hens-android/assets/";
	xStream = new XStream ( new DomDriver());
}


public void createChar(Personnage perso){
	try{
		pathChar = initialPath + "personnages/" + perso.getPseudo() + ".xml";
		System.out.println(pathChar);
		File fichier = new File (pathChar);
	    FileOutputStream fos = new FileOutputStream(fichier);
			try {
				xStream.toXML(perso, fos);
			    } finally {
				fos.close();
			    }
		
	}catch (FileNotFoundException e) {
		    e.printStackTrace();
		} catch (IOException ioe) {
		    ioe.printStackTrace();
		}
}

public Personnage loadChar(String pseudo) throws FileNotFoundException {
	return (Personnage) xStream.fromXML( new FileReader(initialPath + "personnages/" + pseudo));
}

public void createAccount(String ndCompte, String mdp) {
try{	
	pathCompte = initialPath + "comptes/" + ndCompte + ".xml";
	System.out.println(pathCompte);
	File fichier = new File (pathCompte);
	Compte comptemethod=new Compte(ndCompte,mdp);
    FileOutputStream fos = new FileOutputStream(fichier);
		try {
			xStream.toXML(comptemethod, fos);
		    } finally {
			fos.close();
		    }
	
}catch (FileNotFoundException e) {
	    e.printStackTrace();
	} catch (IOException ioe) {
	    ioe.printStackTrace();
	}
}

public void saveAccount(Compte compte){
try{	
	pathCompte = initialPath + "comptes/" + compte.getNomDeCompte() + ".xml";
	System.out.println(pathCompte);
	File fichier = new File (pathCompte);
    FileOutputStream fos = new FileOutputStream(fichier);
		try {
			xStream.toXML(compte, fos);
		    } finally {
			fos.close();
		    }
	
}catch (FileNotFoundException e) {
	    e.printStackTrace();
	} catch (IOException ioe) {
	    ioe.printStackTrace();
	}
}

public Compte loadCompte(String ndcompte){
	try {
		compte = (Compte)xStream.fromXML(new FileReader(initialPath+"comptes/"+ndcompte+".xml"));
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return compte;
}

public Compte getCompte() {
	return compte;
}


public void setCompte(Compte compte) {
	this.compte = compte;
}


public String getInitialPath() {
	return initialPath;
}


public void setInitialPath(String initialPath) {
	this.initialPath = initialPath;
}


}