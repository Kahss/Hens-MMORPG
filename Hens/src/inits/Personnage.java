package inits;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class Personnage {

	// Les attributs
	
	private String pseudo;
	private String owner;
	private int sexe;
	
	private int niveau;
	private float vie;
	private float harmonie;
	private float vieRegen;
	private float harRegen;
	private float puissance;
	private float defense;
	private float vitesse;
	private float concentration;
	
	float vieCurrent;
	float harmonieCurrent;
	float vieRegenCurrent;
	float harRegenCurrent;
	float puissanceCurrent;
	float defenseCurrent;
	float vitesseCurrent;
	float concentrationCurrent;
	
	int[] skin;
	int[] pos;
	int mapID;
	int direction;
	int orientation;
	int hairChosen,bodyChosen,hatChosen,animation,animSelec;	
	Texture bodySkin;
	TextureRegion body;
	// Les getters et setters (merci la génération automatique *o* !) 
	
	public void loadCurrentSkin(){
		if(sexe==0){
			bodySkin= new Texture(Gdx.files.internal("data/Skin/SKINS_FILLE.png"));
			}
		
		if(sexe==1){
			bodySkin= new Texture(Gdx.files.internal("data/Skin/SKINS_FILLE.png"));
			}
		
		switch(direction){
		case 0: orientation=00;break;
		case 1: orientation=300;break;
		case 2: orientation=600;break;
		case 3: orientation=900;break;
		case 4: orientation=1200;break;
		case 5: orientation=1500;break;
		case 6: orientation=1800;break;
		case 7: orientation=2100;break;
		}
	
		
		switch(skin[0]){
		case 1: orientation=300;break;
		case 2: orientation=600;break;
		case 3: orientation=900;break;
		case 4: orientation=1200;break;
		case 5: orientation=1500;break;
		case 6: orientation=1800;break;
		case 7: orientation=2100;break;
		}

		body.setRegion(orientation,0,300,300);
		
	}
	
	public String getPseudo() {
		return pseudo;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
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

	public int[] getSkin() {
		return skin;
	}

	public void setSkin(int[] skin) {
		this.skin = skin;
	}

	public int[] getPos() {
		return pos;
	}

	public void setPos(int[] pos) {
		this.pos = pos;
	}

	public int getMapID() {
		return mapID;
	}

	public void setMapID(int mapID) {
		this.mapID = mapID;
	}

	// Le constructeur

	public Personnage(
		String pseudo,
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
		
		int[] skin,
		int[] pos,
		int mapID) {
		
		this.pseudo = pseudo;
		this.owner = owner;
		
		this.niveau = niveau;
		this.vie = vie;
		this.harmonie = harmonie;
		this.vieRegen = vieRegen;
		this.harRegen = harRegen;
		this.puissance = puissance;
		this.defense = defense;
		this.vitesse = vitesse;
		this.concentration = concentration;
		
		// TODO : à voir quand est-ce que le constructeur du perso est appelé
		// si construit uniquement à la création du personnage on aura
		// this.vieCurrent = this.vie = vie;
		// -> raccourcissement du constructeur.
		
		this.vieCurrent = vieCurrent;
		this.harmonieCurrent = harmonieCurrent;
		this.vieRegenCurrent = vieRegenCurrent;
		this.harRegenCurrent = harRegenCurrent;
		this.puissanceCurrent = puissanceCurrent;
		this.defenseCurrent = defenseCurrent;
		this.vitesseCurrent = vitesseCurrent;
		this.concentrationCurrent = concentrationCurrent;
		
		this.skin = skin;
		this.pos = pos;
		this.mapID = mapID;
	}
	
	public Personnage(){
		
	
	}
}
