package inits;

import java.util.List;

public class Entite{

	protected int sexe;
	protected int niveau;
	protected float vie;
	protected float harmonie;
	protected float vieRegen;
	protected float harRegen;
	protected float puissance;
	protected float defense;
	protected float vitesse;
	protected float concentration;
	protected float vieCurrent;
	protected float harmonieCurrent;
	protected float vieRegenCurrent;
	protected float harRegenCurrent;
	protected float puissanceCurrent;
	protected float defenseCurrent;
	protected float vitesseCurrent;
	protected float concentrationCurrent;
	protected List<Integer> skin;
	protected List<Integer> pos;
	protected int mapID;
	protected int direction;
	protected int orientation;
	
	
	public Entite(){
		
	}

	public Entite(int sexe, int niveau, float vie, float harmonie,
			float vieRegen, float harRegen, float puissance, float defense,
			float vitesse, float concentration, float vieCurrent,
			float harmonieCurrent, float vieRegenCurrent,
			float harRegenCurrent, float puissanceCurrent,
			float defenseCurrent, float vitesseCurrent,
			float concentrationCurrent, List<Integer> skin, List<Integer> pos,
			int mapID, int direction, int orientation) {
		super();
		this.sexe = sexe;
		this.niveau = niveau;
		this.vie = vie;
		this.harmonie = harmonie;
		this.vieRegen = vieRegen;
		this.harRegen = harRegen;
		this.puissance = puissance;
		this.defense = defense;
		this.vitesse = vitesse;
		this.concentration = concentration;
		this.vieCurrent = vieCurrent;
		this.harmonieCurrent = harmonieCurrent;
		this.vieRegenCurrent = vieRegenCurrent;
		this.harRegenCurrent = harRegenCurrent;
		this.puissanceCurrent = puissanceCurrent;
		this.defenseCurrent = defenseCurrent;
		this.vitesseCurrent = vitesseCurrent;
		this.concentrationCurrent = concentrationCurrent;
		this.pos = pos;
		this.mapID = mapID;
		this.direction = direction;
		this.orientation = orientation;
	}

	public int getSexe() {
		return sexe;
	}

	public void setSexe(int sexe) {
		this.sexe = sexe;
	}

	public int getNiveau() {
		return niveau;
	}

	public void setNiveau(int niveau) {
		this.niveau = niveau;
	}

	public float getVie() {
		return vie;
	}

	public void setVie(float vie) {
		this.vie = vie;
	}

	public float getHarmonie() {
		return harmonie;
	}

	public void setHarmonie(float harmonie) {
		this.harmonie = harmonie;
	}

	public float getVieRegen() {
		return vieRegen;
	}

	public void setVieRegen(float vieRegen) {
		this.vieRegen = vieRegen;
	}

	public float getHarRegen() {
		return harRegen;
	}

	public void setHarRegen(float harRegen) {
		this.harRegen = harRegen;
	}

	public float getPuissance() {
		return puissance;
	}

	public void setPuissance(float puissance) {
		this.puissance = puissance;
	}

	public float getDefense() {
		return defense;
	}

	public void setDefense(float defense) {
		this.defense = defense;
	}

	public float getVitesse() {
		return vitesse;
	}

	public void setVitesse(float vitesse) {
		this.vitesse = vitesse;
	}

	public float getConcentration() {
		return concentration;
	}

	public void setConcentration(float concentration) {
		this.concentration = concentration;
	}

	public float getVieCurrent() {
		return vieCurrent;
	}

	public void setVieCurrent(float vieCurrent) {
		this.vieCurrent = vieCurrent;
	}

	public float getHarmonieCurrent() {
		return harmonieCurrent;
	}

	public void setHarmonieCurrent(float harmonieCurrent) {
		this.harmonieCurrent = harmonieCurrent;
	}

	public float getVieRegenCurrent() {
		return vieRegenCurrent;
	}

	public void setVieRegenCurrent(float vieRegenCurrent) {
		this.vieRegenCurrent = vieRegenCurrent;
	}

	public float getHarRegenCurrent() {
		return harRegenCurrent;
	}

	public void setHarRegenCurrent(float harRegenCurrent) {
		this.harRegenCurrent = harRegenCurrent;
	}

	public float getPuissanceCurrent() {
		return puissanceCurrent;
	}

	public void setPuissanceCurrent(float puissanceCurrent) {
		this.puissanceCurrent = puissanceCurrent;
	}

	public float getDefenseCurrent() {
		return defenseCurrent;
	}

	public void setDefenseCurrent(float defenseCurrent) {
		this.defenseCurrent = defenseCurrent;
	}

	public float getVitesseCurrent() {
		return vitesseCurrent;
	}

	public void setVitesseCurrent(float vitesseCurrent) {
		this.vitesseCurrent = vitesseCurrent;
	}

	public float getConcentrationCurrent() {
		return concentrationCurrent;
	}

	public void setConcentrationCurrent(float concentrationCurrent) {
		this.concentrationCurrent = concentrationCurrent;
	}

	public List<Integer> getSkin() {
		return skin;
	}

	public void setSkin(List<Integer> skin) {
		this.skin = skin;
	}

	public List<Integer> getPos() {
		return pos;
	}

	public void setPos(List<Integer> pos) {
		this.pos = pos;
	}

	public int getMapID() {
		return mapID;
	}

	public void setMapID(int mapID) {
		this.mapID = mapID;
	}

	public int getDirection() {
		return direction;
	}

	public void setDirection(int direction) {
		this.direction = direction;
	}

	public int getOrientation() {
		return orientation;
	}

	public void setOrientation(int orientation) {
		this.orientation = orientation;
	}
	
	
	
}
