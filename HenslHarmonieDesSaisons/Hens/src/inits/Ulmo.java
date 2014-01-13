package inits;

import java.util.List;

public class Ulmo extends Personnage {
	private int Calme;
	private int Lunatique;
	private int Vagabond;
	private int Altruiste;
	private String classe="Ulmo";
	private int hairSkin,hatSkin,clotheSkin;
	
	public Ulmo(String pseudo,
			String owner,
			int niveau,
			float vie,
			float harmonie,
			float vieRegen,
			float harRegen,
			float puissance,
			float defense,
			float vitesse,
			float concentration,
			float vieCurrent,
			float harmonieCurrent,
			float vieRegenCurrent,
			float harRegenCurrent,
			float puissanceCurrent,
			float defenseCurrent,
			float vitesseCurrent,
			float concentrationCurrent,
			List<Integer> skin,
			List<Integer> pos,
			int mapID) {
		super(pseudo, owner, niveau, vie, harmonie, vieRegen, harRegen, puissance,
				defense, vitesse, concentration, vieCurrent, harmonieCurrent,
				vieRegenCurrent, harRegenCurrent, puissanceCurrent, defenseCurrent,
				vitesseCurrent, concentrationCurrent, skin, pos, mapID);
		this.classeInt = 2;
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


	public String getClasse() {
		return classe;
	}


	public void setClasse(String classe) {
		this.classe = classe;
	}

	public int getHairSkin() {
		return hairSkin;
	}

	public void setHairSkin(int hairSkin) {
		this.hairSkin = hairSkin;
	}

	public int getHatSkin() {
		return hatSkin;
	}

	public void setHatSkin(int hatSkin) {
		this.hatSkin = hatSkin;
	}

	public int getClotheSkin() {
		return clotheSkin;
	}

	public void setClotheSkin(int clotheSkin) {
		this.clotheSkin = clotheSkin;
	}


}
