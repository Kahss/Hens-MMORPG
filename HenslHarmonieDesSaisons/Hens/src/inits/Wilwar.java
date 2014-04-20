package inits;

import java.util.List;

public class Wilwar extends Personnage {
	private int Sage;
	private int Indomptable;
	private int Doux;
	private int Determine;

	public Wilwar(String pseudo, 
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
		
		Sage=0;
		Indomptable=0;
		Doux=0;
		Determine=0;
	}


	public int getSage() {
		return Sage;
	}


	public void setSage(int Sage) {
		this.Sage = Sage;
	}


	public int getIndomptable() {
		return Indomptable;
	}


	public void setIndomptable(int Indomptable) {
		this.Indomptable = Indomptable;
	}


	public int getDoux() {
		return Doux;
	}


	public void setDoux(int Doux) {
		this.Doux = Doux;
	}


	public int getDetermine() {
		return Determine;
	}


	public void setDetermine(int Determine) {
		this.Determine = Determine;
	}

}
