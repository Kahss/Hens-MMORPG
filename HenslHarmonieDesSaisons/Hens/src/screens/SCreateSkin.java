package screens;

import java.io.IOException;

import inits.Compte;
import inits.Personnage;
import inits.skinManager.CharManager;
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
	private Personnage me;
	private Compte compte;
	private CharManager cmanager;

	
public SCreateSkin (Hens hens, Personnage me, Compte compte) throws IOException{
	this.compte = compte;
	this.hens=hens;
	this.me=me;
	batch = new SpriteBatch();
	stage = new UICreateSkin(this);
	stage.loadUI();	
	cmanager=new CharManager();
	Gdx.input.setInputProcessor(stage);
}
	

	@Override
	public void render(float delta) {
		// Clean écran
		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
		Gdx.gl.glClearColor(0.3f, 0.35f, 0.3f, 1);
		// Début de l'affichage
		batch.begin();
		//affichage du skin
		batch.draw(cmanager.CurrentBody(me), 340, 250, 0, 0, 300, 300, 1, 1, 0);
		batch.draw(cmanager.CurrentHair(me), 340, 250, 0, 0, 300, 300, 1, 1, 0);
		//batch.draw(habitCurrent, 340, 250, 0, 0, 300, 300, 1, 1, 0);
		batch.end();
		//affichage de l'interface
		stage.act(Math.min(Gdx.graphics.getDeltaTime(), 1 / 30f));
		stage.draw();
		stage.setsCreateSkin(this);
	
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


public CharManager getCmanager() {
	return cmanager;
}


public void setCmanager(CharManager cmanager) {
	this.cmanager = cmanager;
}

}