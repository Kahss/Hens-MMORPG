package screens;

import screens.UIs.UILoadChar;
import game.Hens;
import inits.Compte;
import inits.Personnage;
import inits.Ulmo;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class SLoadChar implements Screen{
	Personnage me;
	XStream xstream = new XStream(new DomDriver());
	Hens hens;
	SpriteBatch batch;
	UILoadChar stage;
	private Compte myCompte;
	public SLoadChar(Hens hens,Compte compte){
		this.hens=hens;
		this.setMyCompte(compte);
		batch=new SpriteBatch();
		stage=new UILoadChar(this);
		stage.loadUI();
		Gdx.input.setInputProcessor(stage);
	}

	@Override
	public void render(float delta) {
		Gdx.gl.glClearColor(0.15f, 0.2f, 0.17f, 1);
		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
		BitmapFont compteCurrent = new BitmapFont();
		batch.begin();
		compteCurrent.draw(batch,"Bienvenue "+ getMyCompte().getNomDeCompte()+"!", 0, 600);
		batch.end();
		stage.act(Math.min(Gdx.graphics.getDeltaTime(), 1 / 30f));
		stage.draw();
		Table.drawDebug(stage);
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

	public Compte getMyCompte() {
		return myCompte;
	}

	public void setMyCompte(Compte myCompte) {
		this.myCompte = myCompte;
	}
}
