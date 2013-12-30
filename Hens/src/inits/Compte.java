package inits;

import inits.util.XStreamUtil;

import java.io.File;
import java.util.ArrayList;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class Compte {
private String nomDeCompte, mdp;
String pathCompte,initialPath;
private ArrayList<Personnage> createdChar;
private XStreamUtil xStreamUtil;


public Compte (String ndc,String mdp){
	this.nomDeCompte=ndc;
	this.mdp=mdp;
	createdChar=new ArrayList<Personnage>(5);
	initialPath = "C:/Users/Thibaut/Desktop/Workspace/Hens-android/assets/";
}

public ArrayList<Personnage> getCreatedChar() {
	return createdChar;
}

public void setCreatedChar(ArrayList<Personnage> createdChar) {
	this.createdChar = createdChar;
}

public void addCharacter(Personnage p){
	if(createdChar.size()<5){
		createdChar.add(p);
	}
	else{
		System.out.println("Vous ne pouvez pas cr�er de personnage suppl�mentaire, votre compte est d�j� � sa capacit� maximum");
	}
}


public void removeCharacter(Personnage p){
	createdChar.remove(p);
}

public String getNomDeCompte() {
	return nomDeCompte;
}

public void setNomDeCompte(String nomDeCompte) {
	this.nomDeCompte = nomDeCompte;
}

public String getMdp() {
	return mdp;
}

public void setMdp(String mdp) {
	this.mdp = mdp;
}

}
