package inits.skinManager;

import inits.Personnage;

import java.util.ArrayList;
import java.util.List;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class CharManager {
	//spritesheets cheveux
	private Texture hairUlmoF,hairAnarF,hairWilwarF,hairSulimoF;
	private Texture hairUlmoG,hairAnarG,hairWilwarG,hairSulimoG;
	private List<TextureRegion> hairUlmof,hairAnarf,hairWilwarf,hairSulimof;
	private int hairSkin;
	//spritesheets chapeaux
	private Texture hatUlmoF,hatAnarF,hatWilwarF,hatSulimoF;
	private Texture hatUlmoG,hatAnarG,hatWilwarG,hatSulimoG;
	private int hatSkin;
	//spritesheets habits
	private Texture clotheUlmoF,clotheAnarF,clotheWilwarF,clotheSulimoF;
	private Texture clotheUlmoG,clotheAnarG,clotheWilwarG,clotheSulimoG;
	private int  clotheSkin;
	
	
	
	public CharManager(){
		//init textures - hair
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
		loadHair();
		loadHat();
		loadClothe();
		
	}
	
	
	
	//methodes tableau spritesheet découpé - développement
	public void loadHair(){
		int i =0;
		while(i<=7){

			i++;
		}
	}
	// Skin cheveux
	public TextureRegion CurrentHair(Personnage me){
	
	}
	//definir la colonne ( orientation)
	public TextureRegion loadCurrentHair(int selec,int ori) {
		hairUlmo=new Texture(Gdx.files.internal("data/Skin/COUPE_ULMOFILLE.png"));
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
}

