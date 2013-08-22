package inits;

public class Anar extends Personnage {
	private int Colerique;
	private int Courageux;
	private int Jovial;
	private int Orgueilleux;
	private String classe="Anar";
	
	
	public String getClasse() {
		return classe;
	}


	public void setClasse(String classe) {
		this.classe = classe;
	}


	public Anar(String pseudo, String owner, int niveau, float vie,
			float harmonie, float vieRegen, float harRegen, float puissance,
			float defense, float vitesse, float concentration,
			float vieCurrent, float harmonieCurrent, float vieRegenCurrent,
			float harRegenCurrent, float puissanceCurrent,
			float defenseCurrent, float vitesseCurrent,
			float concentrationCurrent, int[] skin, int[] pos, int mapID) {
		super(pseudo, owner, niveau, vie, harmonie, vieRegen, harRegen, puissance,
				defense, vitesse, concentration, vieCurrent, harmonieCurrent,
				vieRegenCurrent, harRegenCurrent, puissanceCurrent, defenseCurrent,
				vitesseCurrent, concentrationCurrent, skin, pos, mapID);
		
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
