package inits;

import java.util.List;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class Monstre {
	protected String nom;
	
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
	protected float deplacement;
	protected float vieCurrent;
	protected float harmonieCurrent;
	protected float vieRegenCurrent;
	protected float harRegenCurrent;
	protected float puissanceCurrent;
	protected float defenseCurrent;
	protected float vitesseCurrent;
	protected float concentrationCurrent;
	protected float deplacementCurrent;
	List<Integer> pos;
	int mapID;
	int orientation;
	protected Texture skinSheet;
	protected TextureRegion skin;
	
	public Monstre(){
		
	}
	
}
