package screens;

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

public class SCreateSkin implements Screen {
	Hens hens;
	UICreateSkin stage;
	SpriteBatch batch;
	Skin skinCreaSkin;
	SCreateChar sCreateChar;
	Texture ulmoBody, ulmoHair,ulmoHabit;
	TextureRegion ulmoBody1,ulmoHair1,ulmoBodyCurrent,ulmoHairCurrent;
	private int classe;
	private int skinPos,hairSelection;
	int orientation,hairChosen;
	private Personnage me;

	
public SCreateSkin (Hens hens, SCreateChar sCreateChar,int classe){
	this.setClasse(classe);
	this.sCreateChar=sCreateChar;
	this.hens=hens;
	batch = new SpriteBatch();
	stage = new UICreateSkin(this);
	textureLoad();
	stage.loadUI();	
	Gdx.input.setInputProcessor(stage);
	ulmoBodyCurrent=ulmoBody1;
	ulmoHairCurrent=ulmoHair1;
	skinPos=4;
	setMe(sCreateChar.me);

}
	

	@Override
	public void render(float delta) {
		// TODO Auto-generated method stub
		
		switch(getClasse()){
		case 1:Gdx.gl.glClearColor(0.3f, 0.35f, 0.3f, 1);
		break;
		case 2:Gdx.gl.glClearColor(0.35f, 0.3f, 0.3f, 1);
		break;
		case 3:Gdx.gl.glClearColor(0.34f, 0.34f, 0.3f, 1);
		break;
		case 4:Gdx.gl.glClearColor(0.3f, 0.3f, 0.35f, 1);
		break;
		}
		
		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(ulmoBodyCurrent, 340, 250, 0, 0, 300, 300, 1, 1, 0);
		batch.draw(ulmoHairCurrent, 340, 250, 0, 0, 300, 300, 1, 1, 0);
		batch.end();
		stage.act(Math.min(Gdx.graphics.getDeltaTime(), 1 / 30f));
		stage.draw();
		loadCurrentSkin();
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
	public void loadCurrentSkin(){
		switch(getSkinPos()){
		case 0: orientation=00;break;
		case 1: orientation=300;break;
		case 2: orientation=600;break;
		case 3: orientation=900;break;
		case 4: orientation=1200;break;
		case 5: orientation=1500;break;
		case 6: orientation=1800;break;
		case 7: orientation=2100;break;
		}
	
		
		switch(hairSelection){
		case 1: hairChosen=0;break;
		case 2: hairChosen=300;break;
		case 3: hairChosen=600;break;
		}
		
		ulmoBody1.setRegion(orientation, 0, 300, 300);
		ulmoHair1.setRegion(orientation, hairChosen, 300, 300);
	}
	
	public TextureRegion getUlmoBodyCurrent() {
	return ulmoBodyCurrent;
}

public void setUlmoBodyCurrent(TextureRegion ulmoBodyCurrent) {
	this.ulmoBodyCurrent = ulmoBodyCurrent;
}

public TextureRegion getUlmoHairCurrent() {
	return ulmoHairCurrent;
}

public void setUlmoHairCurrent(TextureRegion ulmoHairCurrent) {
	this.ulmoHairCurrent = ulmoHairCurrent;
}


public int getSkinPos() {
	return skinPos;
}


public void setSkinPos(int skinPos) {
	this.skinPos = skinPos;
}


public int getHairSelection() {
	return hairSelection;
}


public void setHairSelection(int hairSelection) {
	this.hairSelection = hairSelection;
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

}