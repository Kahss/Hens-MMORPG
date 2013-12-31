package inits;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class Ulmo extends Personnage {
	private int Calme;
	private int Lunatique;
	private int Vagabond;
	private int Altruiste;
	private String classe="Ulmo";
	private Texture hairSkin,hatSkin;
	private TextureRegion hair,hat;


	public Ulmo(String pseudo, String owner, int niveau, float vie,
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
		
		Calme=0;
		Lunatique=0;
		Vagabond=0;
		Altruiste=0;
	}


	@Override
	public TextureRegion loadCurrentHair(int selec,int ori) {
		hairSkin=new Texture(Gdx.files.internal("data/Skin/COUPE_ULMOFILLE.png"));
		skin= new ArrayList<Integer>(5);
		skin.add(0);
		skin.add(0);
	
		skin.set(1, selec);
		switch(skin.get(1)){
		case 1: hairChosen=300;break;
		case 2: hairChosen=600;break;
		case 3: hairChosen=900;break;
		case 4: hairChosen=1200;break;
		case 5: hairChosen=1500;break;
		case 6: hairChosen=1800;break;
		case 7: hairChosen=2100;break;
		}
		
		hair = new TextureRegion(hairSkin);
		hair.setRegion(ori,hairChosen,300,300);
		return hair;
	}
	
	public void hairUpdate(int ori) {
		hair = new TextureRegion(hairSkin);
		hair.setRegion(ori,hairChosen,300,300);
	}
	
	public TextureRegion loadCurrentHat(int ori){
	
		switch(skin.get(2)){
		case 1: hatChosen=0;break;
		case 2: hatChosen=300;break;
		case 3: hatChosen=600;break;
		case 4: hatChosen=1200;break;
		case 5: hatChosen=1500;break;
		case 6: hatChosen=1800;break;
		case 7: hatChosen=2100;break;
		}
		return hat;
	}

	public TextureRegion getHair() {
		return hair;
	}


	public void setHair(TextureRegion hair) {
		this.hair = hair;
	}


	public int getCalme() {
		return Calme;
	}


	public void setCalme(int Calme) {
		Calme = Calme;
	}


	public int getLunatique() {
		return Lunatique;
	}


	public void setLunatique(int Lunatique) {
		Lunatique = Lunatique;
	}


	public int getVagabond() {
		return Vagabond;
	}


	public void setVagabond(int Vagabond) {
		Vagabond = Vagabond;
	}


	public int getAltruiste() {
		return Altruiste;
	}


	public void setAltruiste(int Altruiste) {
		Altruiste = Altruiste;
	}

	
	public String getClasse() {
		return classe;
	}


	public void setClasse(String classe) {
		this.classe = classe;
	}
	
	public List<Integer> getSkin() {
		return skin;
	}


	public void setSkin(List<Integer> skin) {
		this.skin = skin;
	}



}
