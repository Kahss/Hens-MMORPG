package screens.UIs;

import inits.util.XStreamUtil;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import screens.SCreateCaractere;
import screens.SCreateChar;
import screens.SCreateSkin;
import screens.SGame;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Pixmap.Format;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Button;
import com.badlogic.gdx.scenes.scene2d.ui.Button;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Label.LabelStyle;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.ui.Button.ButtonStyle;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton.TextButtonStyle;
import com.badlogic.gdx.scenes.scene2d.utils.ChangeListener;
import com.badlogic.gdx.scenes.scene2d.utils.ChangeListener.ChangeEvent;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class UICreateSkin extends Stage {
	private SCreateChar sCreateChar;
	private SCreateSkin sCreateSkin;
	Skin	skinUICreaSkin;
	TextButton boxHair1, boxHair2, boxHair3,
	boxHabit1,boxHabit2,boxHabit3,
	turnSkinRight,turnSkinLeft,goToCar, goToGame;
	Table table;
	Label titre, tHair,tHabit;
	XStream xstream = new XStream ( new DomDriver());
	
	public UICreateSkin(SCreateSkin sCreateSkin) {
		this.setsCreateSkin(sCreateSkin);
		sCreateSkin.setMe(this.getsCreateSkin().getMe());
	}
	
public void loadUI() {
	skinUICreaSkin=new Skin();
	Pixmap pixmap = new Pixmap(1, 1, Format.RGBA8888);
	pixmap.setColor(Color.WHITE);
	pixmap.fill();
	skinUICreaSkin.add("default", new BitmapFont());
	skinUICreaSkin.add("white", new Texture(pixmap));
	ButtonStyle ButtonStyle= new ButtonStyle();
	ButtonStyle.up=skinUICreaSkin.newDrawable("white",Color.BLACK);
	ButtonStyle.checked=skinUICreaSkin.newDrawable("white",Color.DARK_GRAY);
	ButtonStyle.over=skinUICreaSkin.newDrawable("white",Color.LIGHT_GRAY);
	skinUICreaSkin.add("button", ButtonStyle);
	TextButtonStyle textButtonStyle = new TextButtonStyle();
	textButtonStyle.up = skinUICreaSkin.newDrawable("white", Color.DARK_GRAY);
	textButtonStyle.down = skinUICreaSkin.newDrawable("white", Color.GRAY);
	textButtonStyle.over = skinUICreaSkin.newDrawable("white", Color.LIGHT_GRAY);
	textButtonStyle.font = skinUICreaSkin.getFont("default");
	skinUICreaSkin.add("default", textButtonStyle);
	LabelStyle labelStyle=new LabelStyle(new BitmapFont(), new Color(Color.WHITE));
	skinUICreaSkin.add("texts", labelStyle);
	table = new Table();
	table.setFillParent(true);
	texts();
	boxHair();
	boxHabit();
	rotateSkin();
	goToCaractere();
	goToGame();
	this.addActor(table);
	table.top().left();
	table.add(titre).left();
	table.row();table.add().height(200);
	table.row();
	table.add(tHair).left().colspan(2);
	table.row();
	table.add(boxHair1);
	table.add(boxHair2).left();
	table.add(boxHair3).spaceLeft(10);
	table.row();
	table.add(tHabit).left().colspan(2);
	table.row();
	table.add(boxHabit1);
	table.add(boxHabit2).left();
	table.add(boxHabit3);
	table.row().height(50);
	table.row().padTop(200);
	table.add();table.add();table.add();
	table.add(turnSkinLeft).padLeft(155);
	table.add(turnSkinRight).padLeft(10);
	table.row();
	table.add(goToCar);
	table.row();
	table.add(goToGame);
	
	}
	
private void boxHair(){ // Choix des cheveux
		boxHair1=new TextButton("Cheveux1",skinUICreaSkin.get("default",TextButtonStyle.class));
		boxHair2=new TextButton("Cheveux2",skinUICreaSkin.get("default",TextButtonStyle.class));
		boxHair3=new TextButton("Cheveux3",skinUICreaSkin.get("default",TextButtonStyle.class));
	boxHair1.addListener(new ChangeListener() {
		public void changed (ChangeEvent event, Actor actor) {
			getsCreateSkin().setHairSelection(0);	
			sCreateSkin.setHairCurrent(sCreateSkin.getMe().loadCurrentHair(sCreateSkin.getHairSelection(),sCreateSkin.getSkinPos()));
		}	
	});
	boxHair2.addListener(new ChangeListener() {
		public void changed (ChangeEvent event, Actor actor) {
			getsCreateSkin().setHairSelection(1);	
			sCreateSkin.setHairCurrent(sCreateSkin.getMe().loadCurrentHair(sCreateSkin.getHairSelection(),sCreateSkin.getSkinPos()));
		}
	});
	boxHair3.addListener(new ChangeListener() {
		public void changed (ChangeEvent event, Actor actor) {
			getsCreateSkin().setHairSelection(2);		
			sCreateSkin.setHairCurrent(sCreateSkin.getMe().loadCurrentHair(sCreateSkin.getHairSelection(),sCreateSkin.getSkinPos()));
		}
	});
}
	
private void boxHabit(){ //choix du chapeau
	boxHabit1=new TextButton("Habits1",skinUICreaSkin.get("default",TextButtonStyle.class));
	boxHabit2=new TextButton("Habits2",skinUICreaSkin.get("default",TextButtonStyle.class));
	boxHabit3=new TextButton("Habits3",skinUICreaSkin.get("default",TextButtonStyle.class));
}

private void rotateSkin(){ // boutons pour orienter le skin
	turnSkinRight=new TextButton("Rotate right",skinUICreaSkin.get("default",TextButtonStyle.class));
	turnSkinLeft=new TextButton("Rotate left",skinUICreaSkin.get("default",TextButtonStyle.class));
	turnSkinLeft.addListener(new ChangeListener() {
		public void changed (ChangeEvent event, Actor actor) {	
			if(getsCreateSkin().getSkinPos()>=0){
				getsCreateSkin().setSkinPos(getsCreateSkin().getSkinPos()-300);
			}
			if(getsCreateSkin().getSkinPos()==-300){
				getsCreateSkin().setSkinPos(2100);
			}
			System.out.println("allo?")	;	
			sCreateSkin.setHairCurrent(sCreateSkin.getMe().loadCurrentHair(sCreateSkin.getHairSelection(),sCreateSkin.getSkinPos()));
			sCreateSkin.setBodyCurrent(sCreateSkin.getMe().loadCurrentBody(sCreateSkin.getSkinPos()));
		}	
		});

turnSkinRight.addListener(new ChangeListener() {
	public void changed (ChangeEvent event, Actor actor) {
		if(getsCreateSkin().getSkinPos()<=2100){
			getsCreateSkin().setSkinPos(getsCreateSkin().getSkinPos()+300);
		}
		if(getsCreateSkin().getSkinPos()==2400){
			getsCreateSkin().setSkinPos(0);
		}
		System.out.println("allo?");
		sCreateSkin.setHairCurrent(sCreateSkin.getMe().loadCurrentHair(sCreateSkin.getHairSelection(),sCreateSkin.getSkinPos()));
		sCreateSkin.setBodyCurrent(sCreateSkin.getMe().loadCurrentBody(sCreateSkin.getSkinPos()));
	}	
	
	});
}

private void texts(){
	titre= new Label("Choix de l'apparence",skinUICreaSkin,"texts");
	tHair=new Label("Choix de la coupe de cheveux",skinUICreaSkin,"texts");
	tHabit=new Label("Choix des vêtements",skinUICreaSkin,"texts");
}

private void goToCaractere(){
	goToCar=new TextButton("Définir son caractére",skinUICreaSkin.get("default",TextButtonStyle.class));
	goToCar.addListener(new ChangeListener() {
		public void changed (ChangeEvent event, Actor actor) {
			getsCreateSkin().getHens().setScreen(new SCreateCaractere(getsCreateSkin().getHens(),1));
		}	
	});
}

private void goToGame(){

	goToGame=new TextButton("Go!",skinUICreaSkin.get("default",TextButtonStyle.class));
	goToGame.addListener(new ChangeListener() {
		public void changed (ChangeEvent event, Actor actor) {
			XStreamUtil xStreamCreator = new XStreamUtil();
			xStreamCreator.createChar(getsCreateSkin().getMe());
			xStreamCreator.saveAccount(getsCreateSkin().getCompte());
			getsCreateSkin().getHens().setScreen(new SGame(getsCreateSkin().getHens(),getsCreateSkin().getMe()));
		}	
	});
}

public SCreateSkin getsCreateSkin() {
	return sCreateSkin;
}

public void setsCreateSkin(SCreateSkin sCreateSkin) {
	this.sCreateSkin = sCreateSkin;
}}

		

