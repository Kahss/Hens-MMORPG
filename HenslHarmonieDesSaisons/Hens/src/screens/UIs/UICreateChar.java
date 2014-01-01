package screens.UIs;

import java.io.IOException;

import screens.SCreateChar;
import screens.SCreateSkin;
import game.Hens;
import inits.Anar;
import inits.Personnage;
import inits.util.XStreamUtil;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Pixmap.Format;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton.TextButtonStyle;
import com.badlogic.gdx.scenes.scene2d.ui.TextField;
import com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldStyle;
import com.badlogic.gdx.scenes.scene2d.utils.ChangeListener;
import com.badlogic.gdx.scenes.scene2d.utils.ChangeListener.ChangeEvent;
import com.badlogic.gdx.scenes.scene2d.utils.Drawable;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class UICreateChar extends Stage {
	Skin skin;
	Table table;
	 TextButton sulimoButton,ulmoButton,anarButton,wilwarButton,validName; 
	private TextField enterNameField;
	private String name=null;
	private SCreateChar sCreateChar;
	private int classSelected,classeVerif;
	
	
public SCreateChar getsCreateChar() {
		return sCreateChar;
	}

	public void setsCreateChar(SCreateChar sCreateChar) {
		this.sCreateChar = sCreateChar;
	}

public void loadUI(){
	skin = new Skin();
	Pixmap pixmap = new Pixmap(1, 1, Format.RGBA8888);
	pixmap.setColor(Color.WHITE);
	pixmap.fill();
	skin.add("white", new Texture(pixmap));
	skin.add("default", new BitmapFont());
	skin.add("curseur",new Texture(Gdx.files.internal("data/GUI/CreateChar/curseur_tfield.png")));
	TextFieldStyle textFieldStyle = new TextFieldStyle();
	textFieldStyle.background= skin.newDrawable("white",Color.BLACK);
	textFieldStyle.font=skin.getFont("default");
	textFieldStyle.cursor=skin.newDrawable("curseur");
	textFieldStyle.disabledFontColor= new Color(Color.LIGHT_GRAY);
	textFieldStyle.fontColor=new Color(Color.WHITE);
	skin.add("field", textFieldStyle);
	TextButtonStyle textButtonStyle = new TextButtonStyle();
	textButtonStyle.up = skin.newDrawable("white", Color.DARK_GRAY);
	textButtonStyle.down = skin.newDrawable("white", Color.GRAY);
	textButtonStyle.over = skin.newDrawable("white", Color.LIGHT_GRAY);
	textButtonStyle.font = skin.getFont("default");
	skin.add("default", textButtonStyle);
	table = new Table();
	table.setFillParent(true);
	this.addActor(table);

	ulmoBt();
	sulimoBt();
	anarBt();
	wilwarBt();
	nameField();
}

public UICreateChar(SCreateChar sCreateChar1){
	this.sCreateChar = sCreateChar1;
	
}

public void ulmoBt(){ //bouton ulmo creation perso
	 ulmoButton = new TextButton("Ulmo", skin);
	ulmoButton.setHeight(25);
	table.add(ulmoButton).padLeft(10);

	
	ulmoButton.addListener(new ChangeListener() {
		public void changed (ChangeEvent event, Actor actor) {
			System.out.println("Clicked! Is checked: " + ulmoButton.isChecked());
			ulmoButton.setText("Selected");
			anarButton.setText("Anar");
			wilwarButton.setText("Wilwar");
			sulimoButton.setText("Sulimo");
			sCreateChar.setsFond(new Sprite(sCreateChar.getFondUlmo()));
			classSelected=4;
		}
	});	
}

public void sulimoBt(){ //bouton sulimo creation perso
	 sulimoButton = new TextButton("Sulimo", skin);

	table.add(sulimoButton).padLeft(10);

	
	sulimoButton.addListener(new ChangeListener() {
		public void changed (ChangeEvent event, Actor actor) {
			System.out.println("Clicked! Is checked: " + sulimoButton.isChecked());
			sulimoButton.setText("Selected!");
			ulmoButton.setText("Ulmo");
			anarButton.setText("Anar");
			wilwarButton.setText("Wilwar");
			sCreateChar.setsFond(new Sprite(sCreateChar.getFondSulimo()));
			classSelected=3;
			
		}
	});
}

public void anarBt(){ //bouton sulimo creation perso
	 anarButton = new TextButton("Anar", skin);
	anarButton.setHeight(25);
	table.add(anarButton).padLeft(10);

	
	anarButton.addListener(new ChangeListener() {
		public void changed (ChangeEvent event, Actor actor) {
			System.out.println("Clicked! Is checked: " + anarButton.isChecked());
			anarButton.setText("Selected");		
			ulmoButton.setText("Ulmo");
			wilwarButton.setText("Wilwar");
			sulimoButton.setText("Sulimo");
			sCreateChar.setsFond(new Sprite(sCreateChar.getFondAnar()));
			classSelected=2;
		}
	});
}

public void wilwarBt(){ //bouton sulimo creation perso
	 wilwarButton = new TextButton("Wilwar", skin);
	wilwarButton.setHeight(25);
	table.add(wilwarButton).padLeft(10);

	
	wilwarButton.addListener(new ChangeListener() {
		public void changed (ChangeEvent event, Actor actor) {
			System.out.println("Clicked! Is checked: " + wilwarButton.isChecked());
			wilwarButton.setText("Selected");
			ulmoButton.setText("Ulmo");
			anarButton.setText("Anar");
			sulimoButton.setText("Sulimo");
			sCreateChar.setsFond(new Sprite(sCreateChar.getFondWilwar()));
			classSelected=1;
		}
	});

}

public void nameField(){
	
	table.row();
	table.add();
	table.add();table.add();table.add();
	
	enterNameField = new TextField("", skin,"field");
	table.add(enterNameField);
	validName = new TextButton("Créez votre personnage!", skin);
	table.add(validName);
	
	validName.addListener(new ChangeListener() {
		public void changed (ChangeEvent event, Actor actor) {
			System.out.println("Clicked! Is checked: " + wilwarButton.isChecked());

			name=enterNameField.getText();
			switch(classSelected){
			case 1:
				sCreateChar.CreatePersonnage(name,"Wilwar",sCreateChar.getMyCompte().getNomDeCompte());
				break;
			case 2:
				sCreateChar.CreatePersonnage(name,"Anar",sCreateChar.getMyCompte().getNomDeCompte());
				break;
			case 3: 
				sCreateChar.CreatePersonnage(name,"Sulimo",sCreateChar.getMyCompte().getNomDeCompte());
				break;
			case 4:
				sCreateChar.CreatePersonnage(name,"Ulmo",sCreateChar.getMyCompte().getNomDeCompte());
				break;

			}
		
		}
		});
	table.row();
	TextButton validChar= new TextButton("Choisir son apparence",skin);
	
	table.add(validChar);
	validChar.addListener(new ChangeListener() {
		public void changed (ChangeEvent event, Actor actor) {
		//	sCreateChar.getMyCompte().getCreatedChar().add(sCreateChar.getMe());
			try {
				sCreateChar.getHens().setScreen(new SCreateSkin(sCreateChar.getHens(),sCreateChar.getMe(),sCreateChar.getMyCompte()));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("ça marche?");
		
		}
		
		});

}
}