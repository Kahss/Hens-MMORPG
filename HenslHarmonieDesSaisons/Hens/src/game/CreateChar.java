package game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class CreateChar implements Screen {
	private SpriteBatch batch;
	private Texture fond,GUI,fondCreaChar,fond2CreaChar;
	private Sprite sprite,sFondUlmo;
	Hens hens;
	
	public CreateChar(Hens hens){
		this.hens =hens;
		batch = new SpriteBatch();
		GUI = new Texture(Gdx.files.internal("data/GUI/CreateChar/GuiCreateChar.png"));
		fondCreaChar = new Texture(Gdx.files.internal("data/GUI/CreateChar/FondCreateChar.png"));
		fond2CreaChar = new Texture(Gdx.files.internal("data/GUI/CreateChar/FondCreateChar.png"));
		
		TextureRegion fondUlmo = new TextureRegion(fondCreaChar,0,0,1024,768);
		sFondUlmo = new Sprite (fondUlmo);
		sFondUlmo.setSize(1024, 768);
		sFondUlmo.setPosition(0, 0);
	}
	
	
	@Override
	public void render(float delta) {
		Gdx.gl.glClearColor(0.1f, 0.1f, 1, 1);
		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(sFondUlmo, 0, 0);
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

}
