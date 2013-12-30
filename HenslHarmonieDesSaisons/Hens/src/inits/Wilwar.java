package inits;

import java.util.List;

public class Wilwar extends Personnage {
	private int Sage;
	private int Indomptable;
	private int Doux;
	private int Determine;
	private String classe="Wilwar";
	
	
	public String getClasse() {
		return classe;
	}


	public void setClasse(String classe) {
		this.classe = classe;
	}


	public Wilwar(String pseudo, String owner, int niveau, float vie,
			float harmonie, float vieRegen, float harRegen, float puissance,
			float defense, float vitesse, float concentration,
			float vieCurrent, float harmonieCurrent, float vieRegenCurrent,
			float harRegenCurrent, float puissanceCurrent,
			float defenseCurrent, float vitesseCurrent,
			float concentrationCurrent, List<Integer> skin,  List<Integer> pos, int mapID) {
		super(pseudo, owner, niveau, vie, harmonie, vieRegen, harRegen, puissance,
				defense, vitesse, concentration, vieCurrent, harmonieCurrent,
				vieRegenCurrent, harRegenCurrent, puissanceCurrent, defenseCurrent,
				vitesseCurrent, concentrationCurrent, skin, pos, mapID);
		
		Sage=0;
		Indomptable=0;
		Doux=0;
		Determine=0;
	}


	public int getSage() {
		return Sage;
	}


	public void setSage(int Sage) {
		Sage = Sage;
	}


	public int getIndomptable() {
		return Indomptable;
	}


	public void setIndomptable(int Indomptable) {
		Indomptable = Indomptable;
	}


	public int getDoux() {
		return Doux;
	}


	public void setDoux(int Doux) {
		Doux = Doux;
	}


	public int getDetermine() {
		return Determine;
	}


	public void setDetermine(int Determine) {
		Determine = Determine;
	}

}
