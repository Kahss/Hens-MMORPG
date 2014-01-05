package inits;

import java.util.ArrayList;

public class Compte {
private String nomDeCompte, mdp;
String pathCompte,initialPath;
private ArrayList<Personnage> createdChar;

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
		System.out.println("Vous ne pouvez pas créer de personnage supplémentaire, votre compte est déjà à sa capacité maximum");
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
