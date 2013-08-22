package screens;

import screens.UIs.UIMenu;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.maps.tiled.renderers.IsometricTiledMapRenderer;
import com.badlogic.gdx.scenes.scene2d.ui.Table;

import game.*;

public class SMenu implements Screen {
	private SpriteBatch batch;
	private Texture fond,GUI,fondCreaChar,fond2CreaChar;
	private Sprite sprite,sFondUlmo;

	CreateChar createChar;
	private game.Hens hens;
	private UIMenu stage;
	
	public SMenu(Hens hens){
		// TODO Auto-generated method stub
		this.setHens(hens);
		batch = new SpriteBatch();
		fond = new Texture(Gdx.files.internal("data/fond.jpg"));
		TextureRegion fond1 = new TextureRegion(fond, 0, 0, 1024, 768);
		sprite = new Sprite(fond1);
		stage = new UIMenu(this);
		stage.loadUI();
		Gdx.input.setInputProcessor(stage);
	}
	@Override
	public void render(float delta) {
		// TODO Auto-generated method stub
		Gdx.gl.glClearColor(0.1f, 0.1f, 1, 1);
		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(sprite, 0, 0);
		batch.setColor(Color.WHITE);
		batch.end();
		stage.act(Math.min(Gdx.graphics.getDeltaTime(), 1 / 30f));
		stage.draw();
		
		if(Gdx.input.isKeyPressed(Keys.C)){
			getHens().setScreen(getHens().sCreateChar);
		}
	}
	

	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void show() {

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
	public game.Hens getHens() {
		return hens;
	}
	public void setHens(game.Hens hens) {
		this.hens = hens;
	}

}
