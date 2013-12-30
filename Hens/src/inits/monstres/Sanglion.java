package inits.monstres;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

import inits.Monstre;

public class Sanglion extends Monstre {
		int orientation,state;
	
	public Sanglion(int niveau,int sexe){
		skinSheet=new Texture(Gdx.files.internal("data/skinsMonstres/sanglionSkin.png"));
		skin=new TextureRegion(skinSheet);
		skin.setRegion(orientation, state, 400, 300);
		vie=60+12*niveau;
		this.sexe=sexe;
		this.niveau=niveau;
		harmonie=80+5*niveau;
		vieRegen=0.5f+0.1f*niveau;
		harRegen=3+1*niveau;
		puissance=15+2*niveau;
		defense=7+0.8f*niveau;
		vitesse=1;
		concentration=0;
		deplacement=100+1*niveau;
		vieCurrent=vie;
		harmonieCurrent=harmonie;
		vieRegenCurrent=vieRegen;
		harRegenCurrent=harRegen;
		puissanceCurrent=puissance;
		defenseCurrent=defense;
		vitesseCurrent=vitesse;
		concentrationCurrent=concentration;
		deplacementCurrent=deplacement;
		orientation=900;
	}
	
	public TextureRegion loadCurrentSkin(int ori){
		skin.setRegion(ori,0,300,300);
		return skin;
	}
}
