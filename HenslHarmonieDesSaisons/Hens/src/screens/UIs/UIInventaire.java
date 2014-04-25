package screens.UIs;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
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

import screens.SGame;

public class UIInventaire extends Stage{
	SGame sGame;
	Skin skin;
	Table table;
	boolean open;
	TextButton exitButton,showButton;
	ShapeRenderer shapeRenderer;
	int wait;
	public UIInventaire(Screen screen){
	shapeRenderer = new ShapeRenderer();
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
		exitBt();
		showBt();
	}
	//Gdx.app.exit()
	
	private void exitBt(){ //bouton sulimo creation perso
		exitButton = new TextButton("Quitter le jeu", skin);

		table.add(exitButton);

		exitButton.addListener(new ChangeListener() {
			public void changed (ChangeEvent event, Actor actor) {
				Gdx.app.exit();
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
		 shapeRenderer.begin(ShapeType.Filled);
		 shapeRenderer.setColor(1, 1, 0, 1);
		 shapeRenderer.rect(100, 200, 200, 300);
		 shapeRenderer.end();
		 Gdx.app.log("machin", "ouvrir");
		 open=true;
	}
	
	public void updateUI(){
		if(wait>0){
		wait--;
		}
	}
}


