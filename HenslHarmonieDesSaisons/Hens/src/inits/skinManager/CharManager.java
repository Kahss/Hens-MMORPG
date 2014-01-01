package inits.skinManager;

import inits.Personnage;

import java.util.ArrayList;
import java.util.List;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class CharManager {
	//spritesheets Corps
	private Texture bodySkinF,bodySkinG;
	private TextureRegion[]  bodySkinf,bodySking;
	//spritesheets cheveux
	private Texture hairUlmoF,hairAnarF,hairWilwarF,hairSulimoF;
	private Texture hairUlmoG,hairAnarG,hairWilwarG,hairSulimoG;
	private TextureRegion[][] hairUlmof,hairAnarf,hairWilwarf,hairSulimof;
	private TextureRegion[][] hairUlmog,hairAnarg,hairWilwarg,hairSulimog;
	private int hairParseLine,hairParseOri;
	//spritesheets chapeaux
	private Texture hatUlmoF,hatAnarF,hatWilwarF,hatSulimoF;
	private Texture hatUlmoG,hatAnarG,hatWilwarG,hatSulimoG;
	private TextureRegion[][] hatUlmof,hatAnarf,hatWilwarf,hatSulimof;
	private TextureRegion[][] hatUlmog,hatAnarg,hatWilwarg,hatSulimog;
	private int hatSkin;
	//spritesheets habits
	private Texture clotheUlmoF,clotheAnarF,clotheWilwarF,clotheSulimoF;
	private Texture clotheUlmoG,clotheAnarG,clotheWilwarG,clotheSulimoG;
	private TextureRegion[][] clotheUlmof,clotheAnarf,clotheWilwarf,clotheSulimof;
	private TextureRegion[][] clotheUlmog,clotheAnarg,clotheWilwarg,clotheSulimog;
	private int  clotheSkin;
	
	
	
	public CharManager(){
	//init textures - Corps
		bodySkinF= new Texture(Gdx.files.internal("data/Skin/SKINS_FILLE.png"));
		bodySkinG= new Texture(Gdx.files.internal("data/Skin/SKINS_FILLE.png"));
	//-hair
		hairUlmoF= new Texture(Gdx.files.internal("data/Skin/COUPE_ULMOFILLE.png"));
		hairAnarF= new Texture(Gdx.files.internal("data/Skin/COUPE_ULMOFILLE.png"));
		hairWilwarF= new Texture(Gdx.files.internal("data/Skin/COUPE_ULMOFILLE.png"));
		hairSulimoF= new Texture(Gdx.files.internal("data/Skin/COUPE_ULMOFILLE.png"));
		hairUlmoG= new Texture(Gdx.files.internal("data/Skin/COUPE_ULMOFILLE.png"));
		hairAnarG= new Texture(Gdx.files.internal("data/Skin/COUPE_ULMOFILLE.png"));
		hairWilwarG= new Texture(Gdx.files.internal("data/Skin/COUPE_ULMOFILLE.png"));
		hairSulimoG= new Texture(Gdx.files.internal("data/Skin/COUPE_ULMOFILLE.png"));
	//-hat
		hatUlmoF= new Texture(Gdx.files.internal("data/Skin/COUPE_ULMOFILLE.png"));
		hatAnarF= new Texture(Gdx.files.internal("data/Skin/COUPE_ULMOFILLE.png"));
		hatWilwarF= new Texture(Gdx.files.internal("data/Skin/COUPE_ULMOFILLE.png"));
		hatSulimoF= new Texture(Gdx.files.internal("data/Skin/COUPE_ULMOFILLE.png"));
		hatUlmoG= new Texture(Gdx.files.internal("data/Skin/COUPE_ULMOFILLE.png"));
		hatAnarG= new Texture(Gdx.files.internal("data/Skin/COUPE_ULMOFILLE.png"));
		hatWilwarG= new Texture(Gdx.files.internal("data/Skin/COUPE_ULMOFILLE.png"));
		hatSulimoG= new Texture(Gdx.files.internal("data/Skin/COUPE_ULMOFILLE.png"));
	//-clothe
		clotheUlmoF= new Texture(Gdx.files.internal("data/Skin/COUPE_ULMOFILLE.png"));
		clotheAnarF= new Texture(Gdx.files.internal("data/Skin/COUPE_ULMOFILLE.png"));
		clotheWilwarF= new Texture(Gdx.files.internal("data/Skin/COUPE_ULMOFILLE.png"));
		clotheSulimoF= new Texture(Gdx.files.internal("data/Skin/COUPE_ULMOFILLE.png"));
		clotheUlmoG= new Texture(Gdx.files.internal("data/Skin/COUPE_ULMOFILLE.png"));
		clotheAnarG= new Texture(Gdx.files.internal("data/Skin/COUPE_ULMOFILLE.png"));
		clotheWilwarG= new Texture(Gdx.files.internal("data/Skin/COUPE_ULMOFILLE.png"));
		clotheSulimoG= new Texture(Gdx.files.internal("data/Skin/COUPE_ULMOFILLE.png"));
	
	//methodes tableau spritesheet découpé
		loadBodySpriteTable(bodySkinf,bodySkinF);
		loadBodySpriteTable(bodySking,bodySkinG);
	//-hair F
		loadSpriteTable(hairUlmof,hairUlmoF);
		loadSpriteTable(hairAnarf,hairAnarF);
		loadSpriteTable(hairWilwarf,hairWilwarF);
		loadSpriteTable(hairSulimof,hairSulimoF);
	// hair G
		loadSpriteTable(hairUlmog,hairUlmoG);
		loadSpriteTable(hairAnarg,hairAnarG);
		loadSpriteTable(hairWilwarg,hairWilwarG);
		loadSpriteTable(hairSulimog,hairSulimoG);
	//hat F
		loadSpriteTable(hatUlmof,hatUlmoF);
		loadSpriteTable(hatAnarf,hatAnarF);
		loadSpriteTable(hatWilwarf,hatWilwarF);
		loadSpriteTable(hatSulimof,hatSulimoF);
	//hat G
		loadSpriteTable(hatUlmog,hatUlmoG);
		loadSpriteTable(hatAnarg,hatAnarG);
		loadSpriteTable(hatWilwarg,hatWilwarG);
		loadSpriteTable(hatSulimog,hatSulimoG);
	//clothe F
		loadSpriteTable(clotheUlmof,clotheUlmoF);
		loadSpriteTable(clotheAnarf,clotheAnarF);
		loadSpriteTable(clotheWilwarf,clotheWilwarF);
		loadSpriteTable(clotheSulimof,clotheSulimoF);
	//clothe G
		loadSpriteTable(clotheUlmog,clotheUlmoG);
		loadSpriteTable(clotheAnarg,clotheAnarG);
		loadSpriteTable(clotheWilwarg,clotheWilwarG);
		loadSpriteTable(clotheSulimog,clotheSulimoG);
		
	}
	//methodes tableau spritesheet découpé - développement
	public void loadSpriteTable( TextureRegion[][] tab, Texture tex ) {
		tab = new TextureRegion[4][8];
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 8; j++) {
				tab[i][j] = new TextureRegion(tex, 300*j, 300*i, 300, 300);
			}
		}
	}
	
	public void loadBodySpriteTable( TextureRegion[] tab, Texture tex ) {
		tab = new TextureRegion[8];
		for (int i = 0; i < 8; i++) {
			tab[i] = new TextureRegion(tex,300*i, 0, 300, 300);
		}
	}
	
//methodes d'update du skin affiché.
	// Skin cheveux
	public TextureRegion CurrentHair(Personnage me){
		TextureRegion renvoi= new TextureRegion();
		if(me.getSexe()==1){
			renvoi= hairUlmof[me.getHairChosen()][me.getOrientation()];
		}
		else if(me.getSexe()==0){
			renvoi= hairUlmog[me.getHairChosen()][me.getOrientation()];
		}
		
		return renvoi;
	}
	//Skin chapeau
	public TextureRegion CurrentHat(Personnage me){
		TextureRegion renvoi= new TextureRegion();
		if(me.getSexe()==1){
			renvoi= hatUlmof[me.getHatChosen()][me.getOrientation()];
		}
		else if(me.getSexe()==0){
			renvoi= hatUlmog[me.getHatChosen()][me.getOrientation()];
		}
		
		return renvoi;
	}
	//Skin Habits
	public TextureRegion CurrentClothe(Personnage me){
		TextureRegion renvoi= new TextureRegion();
		if(me.getSexe()==1){
			renvoi= clotheUlmof[me.getClotheChosen()][me.getOrientation()];
		}
		else if(me.getSexe()==0){
			renvoi= clotheUlmog[me.getClotheChosen()][me.getOrientation()];
		}
		
		return renvoi;
	}
	//Skin Corps
	public TextureRegion CurrentBody(Personnage me){
		TextureRegion renvoi= new TextureRegion();
		if(me.getSexe()==1){
			renvoi= bodySkinf[me.getOrientation()];
		}
		else if(me.getSexe()==0){
			renvoi= bodySking[me.getOrientation()];
		}
		
		return renvoi;
	}
}

