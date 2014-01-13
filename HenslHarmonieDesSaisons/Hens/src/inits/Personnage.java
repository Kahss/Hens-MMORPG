package inits;

import java.util.List;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class Personnage extends Entite {

	// Les attributs
	
	private String pseudo;
	private String owner;

	int hairChosen,
	bodyChosen,
	hatChosen,
	animation,
	animSelec,
	orientation,
	classeInt;
	
//	public TextureRegion loadCurrentBody(int ori){
//		if(sexe==0){
//			bodySkin= new Texture(Gdx.files.internal("data/Skin/SKINS_FILLE.png"));
//			}
//		if(sexe==1){
//			bodySkin= new Texture(Gdx.files.internal("data/Skin/SKINS_FILLE.png"));
//			}
//		setBody(new TextureRegion(bodySkin));
//		getBody().setRegion(ori,0,300,300);
//		return getBody();
//	}

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
		
		List<Integer> skin,
		List<Integer> pos,
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


	public TextureRegion loadCurrentHair(int selec, int ori) {
		// TODO Auto-generated method stub
		return null;
	}
	

	public TextureRegion loadCurrentHabit(int selec, int ori) {
		// TODO Auto-generated method stub
		return null;
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

	public int getHairChosen() {
		return hairChosen;
	}

	public void setHairChosen(int hairChosen) {
		this.hairChosen = hairChosen;
	}

	public int getBodyChosen() {
		return bodyChosen;
	}

	public void setBodyChosen(int bodyChosen) {
		this.bodyChosen = bodyChosen;
	}

	public int getHatChosen() {
		return hatChosen;
	}

	public void setHatChosen(int hatChosen) {
		this.hatChosen = hatChosen;
	}

	public int getAnimation() {
		return animation;
	}

	public void setAnimation(int animation) {
		this.animation = animation;
	}

	public int getAnimSelec() {
		return animSelec;
	}

	public void setAnimSelec(int animSelec) {
		this.animSelec = animSelec;
	}
	public int getOrientation() {
		return orientation;
	}

	public void setOrientation(int orientation) {
		this.orientation = orientation;
	}

	public int getClasseInt() {
		return classeInt;
	}

	public void setClasseInt(int classeInt) {
		this.classeInt = classeInt;
	}
}
