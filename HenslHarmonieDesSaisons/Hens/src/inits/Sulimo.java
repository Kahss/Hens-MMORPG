package inits;

import java.util.List;

public class Sulimo extends Personnage {
	private int Solitaire;
	private int Libre;
	private int Genereux;
	private int Turbulent;
	private String classe="Sulimo";
	
	public Sulimo(String pseudo, String owner, int niveau, float vie,
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
		
		Solitaire=0;
		Libre=0;
		Genereux=0;
		Turbulent=0;
	}


	public String getClasse() {
		return classe;
	}


	public void setClasse(String classe) {
		this.classe = classe;
	}


	public int getSolitaire() {
		return Solitaire;
	}


	public void setSolitaire(int Solitaire) {
		this.Solitaire = Solitaire;
	}


	public int getLibre() {
		return Libre;
	}


	public void setLibre(int Libre) {
		this.Libre = Libre;
	}


	public int getGenereux() {
		return Genereux;
	}


	public void setGenereux(int Genereux) {
		this.Genereux = Genereux;
	}


	public int getTurbulent() {
		return Turbulent;
	}


	public void setTurbulent(int Turbulent) {
		this.Turbulent = Turbulent;
	}

}
