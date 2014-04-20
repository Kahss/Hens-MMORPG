package inits;

import java.util.List;

public class Anar extends Personnage {
	
	private int Colerique;
	private int Courageux;
	private int Jovial;
	private int Orgueilleux;

	public Anar(String pseudo, 
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
		
		Colerique=0;
		Courageux=0;
		Jovial=0;
		Orgueilleux=0;
	}


	public int getColerique() {
		return Colerique;
	}


	public void setColerique(int colerique) {
		Colerique = colerique;
	}


	public int getCourageux() {
		return Courageux;
	}


	public void setCourageux(int courageux) {
		Courageux = courageux;
	}


	public int getJovial() {
		return Jovial;
	}


	public void setJovial(int jovial) {
		Jovial = jovial;
	}


	public int getOrgueilleux() {
		return Orgueilleux;
	}


	public void setOrgueilleux(int orgueilleux) {
		Orgueilleux = orgueilleux;
	}

}
