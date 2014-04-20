package inits;

import java.util.List;

public class Ulmo extends Personnage {
	
	private int Calme;
	private int Lunatique;
	private int Vagabond;
	private int Altruiste;
	
	public Ulmo (String pseudo, 
			String owner, 
			int niveau,
			int sexe,
			float vie,
			float harmonie, 
			float vieRegen, 
			float harRegen, 
			float puissance,
			float defense, 
			float vitesse, 
			float concentration,

			List<Integer> skin,  
			List<Integer> pos, 
			int mapID) {
		
		super(pseudo, owner, sexe, niveau, vie, harmonie, vieRegen, harRegen, puissance, defense, vitesse, concentration, skin, pos, mapID);
		Calme=0;
		Lunatique=0;
		Vagabond=0;
		Altruiste=0;
	}

	public int getCalme() {
		return Calme;
	}


	public void setCalme(int calme) {
		Calme = calme;
	}


	public int getLunatique() {
		return Lunatique;
	}


	public void setLunatique(int lunatique) {
		Lunatique = lunatique;
	}


	public int getVagabond() {
		return Vagabond;
	}


	public void setVagabond(int vagabond) {
		Vagabond = vagabond;
	}


	public int getAltruiste() {
		return Altruiste;
	}


	public void setAltruiste(int altruiste) {
		Altruiste = altruiste;
	}
}
