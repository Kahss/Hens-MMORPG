package game;

import java.util.Vector;

import javax.swing.JOptionPane;

import screens.SCreateChar;
import screens.SCreateSkin;
import screens.SMenu;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Hens extends Game {
	public SMenu smenu;
	public SCreateChar sCreateChar;
	private OrthographicCamera camera;
	private SpriteBatch batch;
	private Texture fond,GUI,fondCreaChar,fond2CreaChar;
	private Sprite sprite,sFondUlmo;
	ClientThread ct;
	public Screen currentScreen;
    public SCreateSkin sCreateSkin;
	
	 Vector<game.Player> players;
	   game.Player me;
	   int ALL_KEYS = 0xFF;
	
	// D : je ne comprends pas très bien le fonctionnement et l'intérêt, il faudra que tu m'expliques
	public void connect(){
	      String ip = JOptionPane.showInputDialog("Input server IP.");
	       ct = new ClientThread(ip);
	        ct.start();
	        //ct.setPriority(Thread.MAX_PRIORITY);
	        
	        me = ct.me;
	        players = ct.players;
	    } 
	
	public void create() {		
		float w = Gdx.graphics.getWidth();
		float h = Gdx.graphics.getHeight();
		camera = new OrthographicCamera(1, h/w);
	smenu = new SMenu(this);
	currentScreen=smenu;
	setScreen(currentScreen);
	//	connect();
	}
	
	public Screen getCurrentScreen() {
		return currentScreen;
	}
	
	public void setCurrentScreen(Screen currentScreen) {
		this.currentScreen = currentScreen;
	}
	
	@Override
	public void dispose() {
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
