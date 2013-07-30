package game;

import java.security.Key;
import java.util.Vector;

import javax.swing.JOptionPane;


import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.utils.ScreenUtils;




public class Hens extends Game {
	CreateChar createChar;
	Base base;
	private OrthographicCamera camera;
	private SpriteBatch batch;
	private Texture fond,GUI,fondCreaChar,fond2CreaChar;
	private Sprite sprite,sFondUlmo;
	private com.badlogic.gdx.Screen screen;
	ClientThread ct;
	MyInputProcessor inputProcessor = new MyInputProcessor();
	
	 Vector<game.Player> players;
	   game.Player me;
	   int ALL_KEYS = 0xFF;
	
	public void connect(){
	      String ip = JOptionPane.showInputDialog("Input server IP.");
	       ct = new ClientThread(ip);
	        ct.start();
	        //ct.setPriority(Thread.MAX_PRIORITY);
	        
	        me = ct.me;
	        players = ct.players;
	    } 
	@Override
	public void create() {		
		float w = Gdx.graphics.getWidth();
		float h = Gdx.graphics.getHeight();
		camera = new OrthographicCamera(1, h/w);
		batch = new SpriteBatch();
	createChar = new CreateChar(this);
	base = new Base(this);
	setScreen(base);
	//	connect();
		Gdx.input.setInputProcessor(inputProcessor);
	}

	@Override
	public void dispose() {
		batch.dispose();
		fond.dispose();
	}



	@Override
	public void resize(int width, int height) {
	}

	@Override
	public void pause() {
	}


	@Override
	public void resume() {
	}
}
