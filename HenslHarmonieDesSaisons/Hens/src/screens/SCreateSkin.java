package screens;

import java.io.IOException;

import inits.Compte;
import inits.Personnage;
import inits.util.SkinManager;
import screens.UIs.UICreateSkin;
import game.Hens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;

public class SCreateSkin implements Screen {
	Hens hens;
	UICreateSkin stage;
	SpriteBatch batch;
	Skin skinCreaSkin;
	Texture ulmoBody, ulmoHair,ulmoHabit;
	TextureRegion[][] tBodyCurrent, tHairCurrent, tHabitCurrent;
	TextureRegion bodyCurrent,hairCurrent,habitCurrent;
	private int classe;
	private int skinPos;
	int orientation,hairChosen;
	private Personnage me;
	private Compte compte;
	private SkinManager charManager;
	private int styleChosen, posChosen;
	private int classSelected;

	// le constructeur
	
	public SCreateSkin (Hens hens, Personnage meselec, Compte compte, int classSelected) throws IOException{
	this.compte = compte;
	this.setClasse(classe);
	this.hens=hens;
	this.me=meselec;
	this.styleChosen = 0;
	this.posChosen = 2;
	this.setClassSelected(classSelected);
	charManager = new SkinManager();
	batch = new SpriteBatch();
	stage = new UICreateSkin(this);
	textureLoad(charManager);
	stage.loadUI();	
	Gdx.input.setInputProcessor(stage);
	skinPos=600;
}
	
	// les méthodes libgdx
	
	@Override
	public void render(float delta) {
		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
		Gdx.gl.glClearColor(0.3f, 0.35f, 0.3f, 1);
		batch.begin();
		batch.draw(bodyCurrent, 340, 250, 0, 0, 300, 300, 1, 1, 0);
		batch.draw(hairCurrent, 340, 250, 0, 0, 300, 300, 1, 1, 0);
//		batch.draw(habitCurrent, 340, 250, 0, 0, 300, 300, 1, 1, 0);
		batch.end();
		stage.act(Math.min(Gdx.graphics.getDeltaTime(), 1 / 30f));
		stage.draw();
		stage.setsCreateSkin(this);
	}

	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}
	
	// les méthodes de classe
	
	public void textureLoad(SkinManager charManager){
	int i = getStyleChosen();
	int j = getPosChosen();
	loadClassSkin();
	setBodyCurrent(charManager.getBodySkinDecoupef()[0][j]);
	setHairCurrent(tHairCurrent[i][j]);
	}
	
	// TODO : La méthode ne marche que pour les filles, à implémenter aussi pour les garçons
	// On pourra faire une autre méthode qui ne gère que les sexes, vu que les skins ne dépendents pas des classes choisies
	public void loadClassSkin() {
		switch(this.classSelected) {
		case 1:
//			settHairCurrent(this.charManager.getHairAnarf());
//			settHabitCurrent(this.charManager.getClotheAnarf());
			break;
		case 2 :
//			settHairCurrent(this.charManager.getHairSulimof());
//			settHabitCurrent(this.charManager.getClotheSulimof());
			break;
		case 3 :
			settHairCurrent(this.charManager.getHairUlmof());
//			settHabitCurrent(this.charManager.getClotheUlmof());
			break;
		case 4 : 
//			settHairCurrent(this.charManager.getHairWilwarf());
//			settHabitCurrent(this.charManager.getClotheWilwarf());
			break;
		}
	}
	
	public void turnSkinLeft() {
		setPosChosen((getPosChosen() + 1) % 8);
		textureLoad(charManager);
		batch.begin();
		batch.draw(bodyCurrent, 340, 250, 0, 0, 300, 300, 1, 1, 0);
		batch.draw(hairCurrent, 340, 250, 0, 0, 300, 300, 1, 1, 0);
		batch.end();
	}
	
	public void turnSkinRight() {
		setPosChosen((getPosChosen() + 7) % 8);
		textureLoad(charManager);
		batch.begin();
		batch.draw(bodyCurrent, 340, 250, 0, 0, 300, 300, 1, 1, 0);
		batch.draw(hairCurrent, 340, 250, 0, 0, 300, 300, 1, 1, 0);
		batch.end();
	}
	
	public void changeHair(int styleChosen) {
		setStyleChosen(styleChosen);
		textureLoad(charManager);
		batch.begin();
		batch.draw(bodyCurrent, 340, 250, 0, 0, 300, 300, 1, 1, 0);
		batch.draw(hairCurrent, 340, 250, 0, 0, 300, 300, 1, 1, 0);
		batch.end();
	}
	
	// les getters et les setters 
	
	public int getSkinPos() {
		return skinPos;
	}
	
	
	public void setSkinPos(int skinPos) {
		this.skinPos = skinPos;
	}
	
	public int getClasse() {
		return classe;
	}
	
	
	public void setClasse(int classe) {
		this.classe = classe;
	}
	
	
	public Personnage getMe() {
		return me;
	}
	
	
	public void setMe(Personnage me) {
		this.me = me;
	}
	
	
	public Compte getCompte() {
		return compte;
	}
	
	
	public void setCompte(Compte compte) {
		this.compte = compte;
	}


	public int getStyleChosen() {
		return styleChosen;
	}


	public void setStyleChosen(int styleChosen) {
		this.styleChosen = styleChosen;
	}


	public int getPosChosen() {
		return posChosen;
	}


	public void setPosChosen(int posChosen) {
		this.posChosen = posChosen;
	}


	public SkinManager getCharManager() {
		return charManager;
	}


	public void setCharManager(SkinManager charManager) {
		this.charManager = charManager;
	}

	public TextureRegion getBodyCurrent() {
		return bodyCurrent;
	}


	public void setBodyCurrent(TextureRegion bodyCurrent) {
		this.bodyCurrent = bodyCurrent;
	}


	public TextureRegion getHairCurrent() {
		return hairCurrent;
	}


	public void setHairCurrent(TextureRegion hairCurrent) {
		this.hairCurrent = hairCurrent;
	}


	public TextureRegion getHabitCurrent() {
		return habitCurrent;
	}


	public void setHabitCurrent(TextureRegion habitCurrent) {
		this.habitCurrent = habitCurrent;
	}


	public Hens getHens() {
		return hens;
	}


	public void setHens(Hens hens) {
		this.hens = hens;
	}

	public int getClassSelected() {
		return classSelected;
	}

	public void setClassSelected(int classSelected) {
		this.classSelected = classSelected;
	}

	public TextureRegion[][] gettBodyCurrent() {
		return tBodyCurrent;
	}

	public void settBodyCurrent(TextureRegion[][] tBodyCurrent) {
		this.tBodyCurrent = tBodyCurrent;
	}

	public TextureRegion[][] gettHairCurrent() {
		return tHairCurrent;
	}

	public void settHairCurrent(TextureRegion[][] tHairCurrent) {
		this.tHairCurrent = tHairCurrent;
	}

	public TextureRegion[][] gettHabitCurrent() {
		return tHabitCurrent;
	}

	public void settHabitCurrent(TextureRegion[][] tHabitCurrent) {
		this.tHabitCurrent = tHabitCurrent;
	}
}