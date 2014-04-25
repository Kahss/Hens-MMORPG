package screens.UIs;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Pixmap.Format;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton.TextButtonStyle;
import com.badlogic.gdx.scenes.scene2d.utils.ChangeListener;
import com.badlogic.gdx.scenes.scene2d.utils.ChangeListener.ChangeEvent;

import screens.SCreateChar;
import screens.SGame;

public class UIGameGeneral extends Stage{
	SGame sGame;
	Skin skin;
	Table table;
	boolean open;
	TextButton retourButton,showButton;
	ShapeRenderer shapeRenderer;
	int wait;
	public UIGameGeneral(SGame sGame) {
	this.sGame=sGame;
	shapeRenderer = new ShapeRenderer();
	wait=10;
	}
	
	
	public void loadUI(){
		skin = new Skin();
		Pixmap pixmap = new Pixmap(1, 1, Format.RGBA8888);
		pixmap.setColor(Color.WHITE);
		pixmap.fill();
		skin.add("white", new Texture(pixmap));
		skin.add("default", new BitmapFont());
		TextButtonStyle textButtonStyle = new TextButtonStyle();
		textButtonStyle.up = skin.newDrawable("white", Color.DARK_GRAY);
		textButtonStyle.down = skin.newDrawable("white", Color.GRAY);
		textButtonStyle.over = skin.newDrawable("white", Color.LIGHT_GRAY);
		textButtonStyle.font = skin.getFont("default");
		skin.add("default", textButtonStyle);
		table = new Table();
		table.setFillParent(true);
		this.addActor(table);
		table.left();
		table.top();
		table.padTop(40);
		//table.setPosition(-1024/2, 768/2);
		retourBt();
		showBt();
	}
	//Gdx.app.retour()
	
	private void retourBt(){ //bouton sulimo creation perso
		retourButton = new TextButton("Retour compte", skin);

		table.add(retourButton);

		retourButton.addListener(new ChangeListener() {
			public void changed (ChangeEvent event, Actor actor) {

				sGame.getHens().setScreen(new SCreateChar(sGame.getHens(),sGame.getMyCompte()));
			}	
		});
	}
	
	private void showBt(){ //bouton sulimo creation perso
		showButton = new TextButton("Ouvrir la fenêtre", skin);
		table.row();
		table.padTop(40);
		table.add(showButton);

		showButton.addListener(new ChangeListener() {
			public void changed (ChangeEvent event, Actor actor) {
				if(open){
					close();
					wait=10;
				}
			
				if(!open&&wait==0){
					open();
				}
			}	
		});
	}
	
	private void close(){

		 Gdx.app.log("machin", "fermer");
		 open=false;
	}
	private void open(){
		 Gdx.app.log("machin", "ouvrir");
		 open=true;
	}
	
	public void updateUI(){
		if(wait>0){
		wait--;
		}
	}
}


