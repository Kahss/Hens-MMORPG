package inits.util;

import inits.Personnage;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class SkinManager {
	//spritesheets corps
	private Texture bodySkinGlobalf, bodySkinGlobalg;
	private TextureRegion[][] bodySkinDecoupef, bodySkinDecoupeg;
	//spritesheets cheveux
	private Texture hairUlmoF,hairAnarF,hairWilwarF,hairSulimoF;
	private Texture hairUlmoG,hairAnarG,hairWilwarG,hairSulimoG;
	private TextureRegion[][] hairUlmof,hairAnarf,hairWilwarf,hairSulimof;
	private TextureRegion[][] hairUlmog,hairAnarg,hairWilwarg,hairSulimog;
	//spritesheets chapeaux
	private Texture hatUlmoF,hatAnarF,hatWilwarF,hatSulimoF;
	private Texture hatUlmoG,hatAnarG,hatWilwarG,hatSulimoG;
	private TextureRegion[][] hatUlmof,hatAnarf,hatWilwarf,hatSulimof;
	private TextureRegion[][] hatUlmog,hatAnarg,hatWilwarg,hatSulimog;
	//spritesheets habits
	private Texture clotheUlmoF,clotheAnarF,clotheWilwarF,clotheSulimoF;
	private Texture clotheUlmoG,clotheAnarG,clotheWilwarG,clotheSulimoG;
	private TextureRegion[][] clotheUlmof,clotheAnarf,clotheWilwarf,clotheSulimof;
	private TextureRegion[][] clotheUlmog,clotheAnarg,clotheWilwarg,clotheSulimog;
	// tableaux globaux pour les différentes catégories à 4 dimensions : sexe - village - style - orientation
	private TextureRegion[][][][] bodyGlobal, hairGlobal, hatGlobal, clotheGlobal;
	
	public SkinManager(){
	// init textures - body
		bodySkinGlobalf = new Texture(Gdx.files.internal("data/Skin/SKINS_FILLE.png"));
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
	//methode tableau spritesheet découpé corps
		bodySkinDecoupef = new TextureRegion[1][8];
		loadSpriteTable(bodySkinDecoupef, bodySkinGlobalf, 1, 8);
	//methodes tableau spritesheet découpé -hair F
		hairUlmof = new TextureRegion[3][8];
		loadSpriteTable(hairUlmof,hairUlmoF, 3, 8);
//		loadSpriteTable(hairAnarf,hairAnarF, 4, 8);
//		loadSpriteTable(hairWilwarf,hairWilwarF, 4, 8);
//		loadSpriteTable(hairSulimof,hairSulimoF, 4, 8);
	// hair G
//		loadSpriteTable(hairUlmog,hairUlmoG, 4, 8);
//		loadSpriteTable(hairAnarg,hairAnarG, 4, 8);
//		loadSpriteTable(hairWilwarg,hairWilwarG, 4, 8);
//		loadSpriteTable(hairSulimog,hairSulimoG, 4, 8);
	//hat F
		hatUlmof = new TextureRegion[3][8];
		loadSpriteTable(hatUlmof,hatUlmoF, 3, 8);
//		loadSpriteTable(hatAnarf,hatAnarF, 4, 8);
//		loadSpriteTable(hatWilwarf,hatWilwarF, 4, 8);
//		loadSpriteTable(hatSulimof,hatSulimoF, 4, 8);
	//hat G
//		loadSpriteTable(hatUlmog,hatUlmoG, 4, 8);
//		loadSpriteTable(hatAnarg,hatAnarG, 4, 8);
//		loadSpriteTable(hatWilwarg,hatWilwarG, 4, 8);
//		loadSpriteTable(hatSulimog,hatSulimoG, 4, 8);
	//clothe F
		clotheUlmof = new TextureRegion[3][8];
		loadSpriteTable(clotheUlmof,clotheUlmoF, 3, 8);
//		loadSpriteTable(clotheAnarf,clotheAnarF, 4, 8);
//		loadSpriteTable(clotheWilwarf,clotheWilwarF, 4, 8);
//		loadSpriteTable(clotheSulimof,clotheSulimoF, 4, 8);
	//clothe G
//		loadSpriteTable(clotheUlmog,clotheUlmoG, 4, 8);
//		loadSpriteTable(clotheAnarg,clotheAnarG, 4, 8);
//		loadSpriteTable(clotheWilwarg,clotheWilwarG, 4, 8);
//		loadSpriteTable(clotheSulimog,clotheSulimoG, 4, 8);
	// Concaténation des différents tableaux dans un tableau commun
		this.setHairGlobal(concatenationHair());
		this.setBodyGlobal(concatenationBody());
	}
	
	private TextureRegion[][][][] concatenationHair() {
		TextureRegion[][][][] retour = new TextureRegion[][][][]{{getHairAnarf(),getHairSulimof(),getHairUlmof(),getHairWilwarf()},{getHairAnarg(),getHairSulimog(),getHairUlmog(),getHairWilwarg()}};
		return retour;
	}
	
	private TextureRegion[][][][] concatenationBody() {
		TextureRegion[][][][] retour = new TextureRegion[][][][]{{getBodySkinDecoupef(),getBodySkinDecoupef(),getBodySkinDecoupef(),getBodySkinDecoupef()},{getBodySkinDecoupeg(),getBodySkinDecoupeg(),getBodySkinDecoupeg(),getBodySkinDecoupeg()}};
		return retour;
	}	
	
	// TODO : compléter les concaténations pour chaque type de données
//	private TextureRegion[][][][] concatenationBody() {
//	}
//	
//	private TextureRegion[][][][] concatenationHat() {
//	}
//	
//	private TextureRegion[][][][] concatenationClothe() {
//	}
	
	//methodes tableau spritesheet découpé - développement
	//hauteur et largeur ont ete rajoute pour permettre une plus grand flexibilite de la methode
	//par exemple, la texture pour les corps est en 1x8 et non pas en 3x8 comme les coupes
	public void loadSpriteTable( TextureRegion[][] tab, Texture tex, int hauteur, int largeur ) {
		for (int i = 0; i < hauteur; i++) {
			for (int j = 0; j < largeur; j++) {
				tab[i][j] = new TextureRegion(tex, 300*j, 300*i, 300, 300);
			}
		}
	}
	
	// Skin cheveux, ne fonctionne pour le moment qu'avec Ulmo
	// TODO : implémenter la méthodes pour les autres villages
	// 0 = fille // 1 = garçon
	public TextureRegion CurrentHair(Personnage me){
		TextureRegion renvoi= new TextureRegion();
		if(me.getSexe()==0){
			renvoi= hairUlmof[me.getHairChosen()][me.getOrientation()];
		}
		else if(me.getSexe()==1){
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

	public TextureRegion[][] getBodySkinDecoupef() {
		return bodySkinDecoupef;
	}

	public void setBodySkinDecoupef(TextureRegion[][] bodySkinDecoupe) {
		this.bodySkinDecoupef = bodySkinDecoupe;
	}

	public TextureRegion[][] getBodySkinDecoupeg() {
		return bodySkinDecoupeg;
	}

	public void setBodySkinDecoupeg(TextureRegion[][] bodySkinDecoupeg) {
		this.bodySkinDecoupeg = bodySkinDecoupeg;
	}

	public TextureRegion[][][][] getHairGlobal() {
		return hairGlobal;
	}

	public void setHairGlobal(TextureRegion[][][][] hairGlobal) {
		this.hairGlobal = hairGlobal;
	}

	public TextureRegion[][][][] getBodyGlobal() {
		return bodyGlobal;
	}

	public void setBodyGlobal(TextureRegion[][][][] bodyGlobal) {
		this.bodyGlobal = bodyGlobal;
	}

	public TextureRegion[][][][] getHatGlobal() {
		return hatGlobal;
	}

	public void setHatGlobal(TextureRegion[][][][] hatGlobal) {
		this.hatGlobal = hatGlobal;
	}

	public TextureRegion[][][][] getClotheGlobal() {
		return clotheGlobal;
	}

	public void setClotheGlobal(TextureRegion[][][][] clotheGlobal) {
		this.clotheGlobal = clotheGlobal;
	}

	
}

