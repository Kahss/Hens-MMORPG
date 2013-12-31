package screens.UIs;

import inits.Personnage;
import inits.Ulmo;
import inits.util.XStreamUtil;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;

import screens.SCreateChar;
import screens.SGame;
import screens.SLoadChar;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Pixmap.Format;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton.TextButtonStyle;
import com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldStyle;
import com.badlogic.gdx.scenes.scene2d.utils.ChangeListener;
import com.badlogic.gdx.scenes.scene2d.utils.ChangeListener.ChangeEvent;

public class UILoadChar extends Stage {
	private SLoadChar sLoadChar;
	private Personnage character;
	Skin skin;
	Table table;
	TextButton createButton;
	XStreamUtil xstream = new XStreamUtil();
	
	public UILoadChar (SLoadChar loadChar){
		this.sLoadChar=loadChar;
	}

	public void loadUI() throws FileNotFoundException{
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
		TextFieldStyle textFieldStyle = new TextFieldStyle();
		textFieldStyle.font=skin.getFont("default");
		textFieldStyle.fontColor=new Color(Color.WHITE);
		textFieldStyle.background=skin.newDrawable("white",Color.BLACK);
		skin.add("field", textFieldStyle);
		skin.add("default", textButtonStyle);
		table = new Table();
		table.setFillParent(true);
		this.addActor(table);
		
		createBt();
		createCharListBt();
	}

	private void createBt(){ //bouton sulimo creation perso
		 createButton = new TextButton("Créez votre personnage", skin);

		table.add(createButton);

		createButton.addListener(new ChangeListener() {
			public void changed (ChangeEvent event, Actor actor) {
				sLoadChar.getHens().setScreen(new SCreateChar(sLoadChar.getHens(),sLoadChar.getMyCompte()));
			}	
		});
	}
	
	private void createCharListBt() throws FileNotFoundException {
		URL tempPath = UIMenu.class.getResource("");
		String initialPath = tempPath.toString().substring("file:/".length(), tempPath.toString().length()-"/Hens/bin/screens/UIs".length()) + "Hens-android/assets/personnages/";
		File fileChar = new File(initialPath);
			
		String[] listChar = fileChar.list();
		
		TextButton[] listButton = new TextButton[listChar.length];
		
		System.out.println("longueur listChar : " + listChar.length);
		System.out.println("longueur listButton : " + listButton.length);
		
		for(int i = 0; i < listChar.length; i++) {
			listButton[i] = new TextButton(listChar[i], skin);
			System.out.println(initialPath + listChar[i]);
			character = (Personnage) xstream.loadChar(listChar[i]);
			listButton[i].addListener(new ChangeListener() {
				public void changed (ChangeEvent event, Actor actor) {
					sLoadChar.getHens().setScreen(new SGame (sLoadChar.getHens(), character));
				}
			});
			table.row();
			table.add(listButton[i]);
		}
	}


}

