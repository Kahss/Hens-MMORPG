package screens;

import java.io.IOException;

import inits.Compte;
import inits.Personnage;
import screens.UIs.UICreateChar;
import screens.UIs.UICreateSkin;
import game.Hens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Pixmap.Format;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.ui.CheckBox.CheckBoxStyle;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton.TextButtonStyle;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class SCreateSkin implements Screen {
	Hens hens;
	UICreateSkin stage;
	SpriteBatch batch;
	Skin skinCreaSkin;
	Texture ulmoBody, ulmoHair,ulmoHabit;
	TextureRegion ulmoBody1,ulmoHair1,bodyCurrent,hairCurrent,habitCurrent;
	private int classe;
	private int skinPos;
	int orientation,hairChosen;
	private Personnage me;
	private Compte compte;


	
public SCreateSkin (Hens hens, Personnage meselec, Compte compte) throws IOException{
	this.compte = compte;
	this.setClasse(classe);
	this.hens=hens;
	this.me=meselec;
	batch = new SpriteBatch();
	stage = new UICreateSkin(this);
	textureLoad();
	stage.loadUI();	
	Gdx.input.setInputProcessor(stage);
	skinPos=600;
}
	

	@Override
	public void render(float delta) {
		// TODO Auto-generated method stub
		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
		Gdx.gl.glClearColor(0.3f, 0.35f, 0.3f, 1);
		batch.begin();
	
		//habitCurrent=me.loadCurrentHabit();
		batch.draw(bodyCurrent, 340, 250, 0, 0, 300, 300, 1, 1, 0);
		batch.draw(hairCurrent, 340, 250, 0, 0, 300, 300, 1, 1, 0);
		//batch.draw(habitCurrent, 340, 250, 0, 0, 300, 300, 1, 1, 0);
		batch.end();
		stage.act(Math.min(Gdx.graphics.getDeltaTime(), 1 / 30f));
		stage.draw();
		stage.setsCreateSkin(this);
	
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
	
	public void textureLoad(){
	ulmoBody=new Texture(Gdx.files.internal("data/skin/SKINS_FILLE.png"));
	ulmoHair=new Texture(Gdx.files.internal("data/skin/COUPE_ULMOFILLE.png"));
	ulmoHair1=new TextureRegion(ulmoHair,600,0,300,300);
	ulmoBody1=new TextureRegion(ulmoBody,600,0,300,300);
	
}
	


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

}