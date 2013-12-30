package inits.util;

import inits.Compte;
import inits.Personnage;

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
	Personnage perso;
	Compte compte;
	String initialPath, pathChar,pathCompte;
	XStream xStream;
	
public XStreamUtil()	{
	/* initialPath = "C:/Users/Thibaut/Desktop/Workspace/Hens-android/assets/";
	C:\Users\Denis\Documents\GitHub\Hens-MMORPG\HenslHarmonieDesSaisons\Hens\bin\screens\UIs\
	URL tempPath0 = UIMenu.class.getResource("").toString().substring("file:/".length(), UIMenu.class.getResource("").toString().length()); */
	URL tempPath = UIMenu.class.getResource("");
	initialPath = tempPath.toString().substring("file:/".length(), tempPath.toString().length()-"/Hens/bin/screens/UIs".length()) + "Hens-android/assets/";
	xStream = new XStream ( new DomDriver());
}


public void createChar(String pseudo){
	try{
		pathChar = initialPath + "personnages/" + pseudo + ".xml";
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

public void loadChar(String pseudo){
	perso = (Personnage)xStream.fromXML(initialPath+"personnages/"+pseudo+".xml");
	
}

public void createAccount(String ndCompte, String mdp){
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


public Personnage getPerso() {
	return perso;
}


public void setPerso(Personnage perso) {
	this.perso = perso;
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