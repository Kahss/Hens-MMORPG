package inits;

import java.util.List;

import com.badlogic.gdx.graphics.g2d.TextureRegion;

public abstract class Personnage extends Entite {

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
	
	// Le constructeur

	public Personnage (
		String pseudo,
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
		
		super(sexe, niveau, vie, harmonie, vieRegen, harRegen, puissance, defense, vitesse, concentration, skin, pos, mapID);

		this.pseudo = pseudo;
		this.owner = owner;
		
	}

	public Personnage(){
		// TODO : Faire un constructeur qui cree un monstre bidon, mais non vide
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
