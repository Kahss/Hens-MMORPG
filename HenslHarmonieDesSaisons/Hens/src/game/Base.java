package game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.maps.tiled.renderers.IsometricTiledMapRenderer;

public class Base implements Screen {
	private SpriteBatch batch;
	private Texture fond,GUI,fondCreaChar,fond2CreaChar;
	private Sprite sprite,sFondUlmo;
	IsometricTiledMapRenderer iso;
	CreateChar createChar;
	Hens hens;
	Input input;
	MyInputProcessor inputProcessor = new MyInputProcessor();
	
	public Base(Hens hens){
		// TODO Auto-generated method stub
		this.hens =hens;
		batch = new SpriteBatch();
		fond = new Texture(Gdx.files.internal("data/fond.jpg"));
		TextureRegion fond1 = new TextureRegion(fond, 0, 0, 1024, 768);
		sprite = new Sprite(fond1);
		sprite.setSize(0.9f, 0.9f * sprite.getHeight() / sprite.getWidth());
		sprite.setOrigin(sprite.getWidth()/2, sprite.getHeight()/2);
		sprite.setPosition(-sprite.getWidth()/2, -sprite.getHeight()/2);
		
	}
	@Override
	public void render(float delta) {
		// TODO Auto-generated method stub
		Gdx.input.setInputProcessor(inputProcessor);
		Gdx.gl.glClearColor(0.1f, 0.1f, 1, 1);
		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(sprite, 0, 0);
		batch.end();
		if(Gdx.input.isKeyPressed(Keys.A)){
			hens.setScreen(hens.createChar);
		}
		
		if(Gdx.input.isKeyPressed(Keys.B)){
			hens.setScreen(hens.base);
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

}
