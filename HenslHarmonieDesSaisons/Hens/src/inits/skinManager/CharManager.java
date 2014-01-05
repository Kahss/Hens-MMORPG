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
	//init textures - hair
	// TODO : faire correspondre les bons tableaux avec les bonnes images
		hairUlmoF= new Texture(Gdx.files.internal("data/Skin/COUPE_ULMOFILLE.png"));
//		hairAnarF= new Texture(Gdx.files.internal("data/Skin/COUPE_ULMOFILLE.png"));
//		hairWilwarF= new Texture(Gdx.files.internal("data/Skin/COUPE_ULMOFILLE.png"));
//		hairSulimoF= new Texture(Gdx.files.internal("data/Skin/COUPE_ULMOFILLE.png"));
//		hairUlmoG= new Texture(Gdx.files.internal("data/Skin/COUPE_ULMOFILLE.png"));
//		hairAnarG= new Texture(Gdx.files.internal("data/Skin/COUPE_ULMOFILLE.png"));
//		hairWilwarG= new Texture(Gdx.files.internal("data/Skin/COUPE_ULMOFILLE.png"));
//		hairSulimoG= new Texture(Gdx.files.internal("data/Skin/COUPE_ULMOFILLE.png"));
	//-hat
		hatUlmoF= new Texture(Gdx.files.internal("data/Skin/COUPE_ULMOFILLE.png"));
//		hatAnarF= new Texture(Gdx.files.internal("data/Skin/COUPE_ULMOFILLE.png"));
//		hatWilwarF= new Texture(Gdx.files.internal("data/Skin/COUPE_ULMOFILLE.png"));
//		hatSulimoF= new Texture(Gdx.files.internal("data/Skin/COUPE_ULMOFILLE.png"));
//		hatUlmoG= new Texture(Gdx.files.internal("data/Skin/COUPE_ULMOFILLE.png"));
//		hatAnarG= new Texture(Gdx.files.internal("data/Skin/COUPE_ULMOFILLE.png"));
//		hatWilwarG= new Texture(Gdx.files.internal("data/Skin/COUPE_ULMOFILLE.png"));
//		hatSulimoG= new Texture(Gdx.files.internal("data/Skin/COUPE_ULMOFILLE.png"));
	//-clothe
		clotheUlmoF= new Texture(Gdx.files.internal("data/Skin/COUPE_ULMOFILLE.png"));
//		clotheAnarF= new Texture(Gdx.files.internal("data/Skin/COUPE_ULMOFILLE.png"));
//		clotheWilwarF= new Texture(Gdx.files.internal("data/Skin/COUPE_ULMOFILLE.png"));
//		clotheSulimoF= new Texture(Gdx.files.internal("data/Skin/COUPE_ULMOFILLE.png"));
//		clotheUlmoG= new Texture(Gdx.files.internal("data/Skin/COUPE_ULMOFILLE.png"));
//		clotheAnarG= new Texture(Gdx.files.internal("data/Skin/COUPE_ULMOFILLE.png"));
//		clotheWilwarG= new Texture(Gdx.files.internal("data/Skin/COUPE_ULMOFILLE.png"));
//		clotheSulimoG= new Texture(Gdx.files.internal("data/Skin/COUPE_ULMOFILLE.png"));
	//methodes tableau spritesheet d�coup� -hair F
		hairUlmof = new TextureRegion[4][8];
		loadSpriteTable(hairUlmof,hairUlmoF);
//		loadSpriteTable(hairAnarf,hairAnarF);
//		loadSpriteTable(hairWilwarf,hairWilwarF);
//		loadSpriteTable(hairSulimof,hairSulimoF);
	// hair G
//		loadSpriteTable(hairUlmog,hairUlmoG);
//		loadSpriteTable(hairAnarg,hairAnarG);
//		loadSpriteTable(hairWilwarg,hairWilwarG);
//		loadSpriteTable(hairSulimog,hairSulimoG);
	//hat F
		hatUlmof = new TextureRegion[4][8];
		loadSpriteTable(hatUlmof,hatUlmoF);
//		loadSpriteTable(hatAnarf,hatAnarF);
//		loadSpriteTable(hatWilwarf,hatWilwarF);
//		loadSpriteTable(hatSulimof,hatSulimoF);
	//hat G
//		loadSpriteTable(hatUlmog,hatUlmoG);
//		loadSpriteTable(hatAnarg,hatAnarG);
//		loadSpriteTable(hatWilwarg,hatWilwarG);
//		loadSpriteTable(hatSulimog,hatSulimoG);
	//clothe F
		clotheUlmof = new TextureRegion[4][8];
		loadSpriteTable(clotheUlmof,clotheUlmoF);
//		loadSpriteTable(clotheAnarf,clotheAnarF);
//		loadSpriteTable(clotheWilwarf,clotheWilwarF);
//		loadSpriteTable(clotheSulimof,clotheSulimoF);
	//clothe G
//		loadSpriteTable(clotheUlmog,clotheUlmoG);
//		loadSpriteTable(clotheAnarg,clotheAnarG);
//		loadSpriteTable(clotheWilwarg,clotheWilwarG);
//		loadSpriteTable(clotheSulimog,clotheSulimoG);
	}
	
	//methodes tableau spritesheet d�coup� - d�veloppement
	public void loadSpriteTable( TextureRegion[][] tab, Texture tex ) {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 8; j++) {
				tab[i][j] = new TextureRegion(tex, 300*j, 300*i, 300, 300);
			}
		}
	}
	
	// Skin cheveux, ne fonctionne pour le moment qu'avec Ulmo
	// TODO : impl�menter la m�thodes pour les autres villages
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
	public TextureRegion[][] getHairUlmof() {
		return hairUlmof;
	}
	public void setHairUlmof(TextureRegion[][] hairUlmof) {
		this.hairUlmof = hairUlmof;
	}
	public TextureRegion[][] getHairAnarf() {
		return hairAnarf;
	}
	public void setHairAnarf(TextureRegion[][] hairAnarf) {
		this.hairAnarf = hairAnarf;
	}
	public TextureRegion[][] getHairWilwarf() {
		return hairWilwarf;
	}
	public void setHairWilwarf(TextureRegion[][] hairWilwarf) {
		this.hairWilwarf = hairWilwarf;
	}
	public TextureRegion[][] getHairSulimof() {
		return hairSulimof;
	}
	public void setHairSulimof(TextureRegion[][] hairSulimof) {
		this.hairSulimof = hairSulimof;
	}
	public TextureRegion[][] getHairUlmog() {
		return hairUlmog;
	}
	public void setHairUlmog(TextureRegion[][] hairUlmog) {
		this.hairUlmog = hairUlmog;
	}
	public TextureRegion[][] getHairAnarg() {
		return hairAnarg;
	}
	public void setHairAnarg(TextureRegion[][] hairAnarg) {
		this.hairAnarg = hairAnarg;
	}
	public TextureRegion[][] getHairWilwarg() {
		return hairWilwarg;
	}
	public void setHairWilwarg(TextureRegion[][] hairWilwarg) {
		this.hairWilwarg = hairWilwarg;
	}
	public TextureRegion[][] getHairSulimog() {
		return hairSulimog;
	}
	public void setHairSulimog(TextureRegion[][] hairSulimog) {
		this.hairSulimog = hairSulimog;
	}
	public TextureRegion[][] getHatUlmof() {
		return hatUlmof;
	}
	public void setHatUlmof(TextureRegion[][] hatUlmof) {
		this.hatUlmof = hatUlmof;
	}
	public TextureRegion[][] getHatAnarf() {
		return hatAnarf;
	}
	public void setHatAnarf(TextureRegion[][] hatAnarf) {
		this.hatAnarf = hatAnarf;
	}
	public TextureRegion[][] getHatWilwarf() {
		return hatWilwarf;
	}
	public void setHatWilwarf(TextureRegion[][] hatWilwarf) {
		this.hatWilwarf = hatWilwarf;
	}
	public TextureRegion[][] getHatSulimof() {
		return hatSulimof;
	}
	public void setHatSulimof(TextureRegion[][] hatSulimof) {
		this.hatSulimof = hatSulimof;
	}
	public TextureRegion[][] getHatUlmog() {
		return hatUlmog;
	}
	public void setHatUlmog(TextureRegion[][] hatUlmog) {
		this.hatUlmog = hatUlmog;
	}
	public TextureRegion[][] getHatAnarg() {
		return hatAnarg;
	}
	public void setHatAnarg(TextureRegion[][] hatAnarg) {
		this.hatAnarg = hatAnarg;
	}
	public TextureRegion[][] getHatWilwarg() {
		return hatWilwarg;
	}
	public void setHatWilwarg(TextureRegion[][] hatWilwarg) {
		this.hatWilwarg = hatWilwarg;
	}
	public TextureRegion[][] getHatSulimog() {
		return hatSulimog;
	}
	public void setHatSulimog(TextureRegion[][] hatSulimog) {
		this.hatSulimog = hatSulimog;
	}
	public TextureRegion[][] getClotheUlmof() {
		return clotheUlmof;
	}
	public void setClotheUlmof(TextureRegion[][] clotheUlmof) {
		this.clotheUlmof = clotheUlmof;
	}
	public TextureRegion[][] getClotheAnarf() {
		return clotheAnarf;
	}
	public void setClotheAnarf(TextureRegion[][] clotheAnarf) {
		this.clotheAnarf = clotheAnarf;
	}
	public TextureRegion[][] getClotheWilwarf() {
		return clotheWilwarf;
	}
	public void setClotheWilwarf(TextureRegion[][] clotheWilwarf) {
		this.clotheWilwarf = clotheWilwarf;
	}
	public TextureRegion[][] getClotheSulimof() {
		return clotheSulimof;
	}
	public void setClotheSulimof(TextureRegion[][] clotheSulimof) {
		this.clotheSulimof = clotheSulimof;
	}
	public TextureRegion[][] getClotheUlmog() {
		return clotheUlmog;
	}
	public void setClotheUlmog(TextureRegion[][] clotheUlmog) {
		this.clotheUlmog = clotheUlmog;
	}
	public TextureRegion[][] getClotheAnarg() {
		return clotheAnarg;
	}
	public void setClotheAnarg(TextureRegion[][] clotheAnarg) {
		this.clotheAnarg = clotheAnarg;
	}
	public TextureRegion[][] getClotheWilwarg() {
		return clotheWilwarg;
	}
	public void setClotheWilwarg(TextureRegion[][] clotheWilwarg) {
		this.clotheWilwarg = clotheWilwarg;
	}
	public TextureRegion[][] getClotheSulimog() {
		return clotheSulimog;
	}
	public void setClotheSulimog(TextureRegion[][] clotheSulimog) {
		this.clotheSulimog = clotheSulimog;
	}

}
