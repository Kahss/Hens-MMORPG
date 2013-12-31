package screens.UIs;

import screens.SCreateChar;
import screens.SLoadChar;
import screens.SMenu;
import inits.Anar;
import inits.Compte;
import inits.Personnage;
import inits.util.XStreamUtil;

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
import com.badlogic.gdx.scenes.scene2d.ui.TextField;
import com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldStyle;
import com.badlogic.gdx.scenes.scene2d.utils.ChangeListener;
import com.badlogic.gdx.scenes.scene2d.utils.ChangeListener.ChangeEvent;

import java.io.FileNotFoundException;
import java.net.URL;

public class UIMenu extends Stage {
	
	private String verifs;
	Skin skin;
	private Personnage me1,me;
	Table table;
	 TextButton createButton,LoadButton,ExitButton,createAccountBt,loginBt;
	private SMenu smenu; 
	private TextField compteField, mdpField;
	XStreamUtil xStreamUtil;
	 
public UIMenu(SMenu menu){
		this.smenu=menu;
	
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
	TextFieldStyle textFieldStyle = new TextFieldStyle();
	textFieldStyle.font=skin.getFont("default");
	textFieldStyle.fontColor=new Color(Color.WHITE);
	textFieldStyle.background=skin.newDrawable("white",Color.BLACK);
	skin.add("field", textFieldStyle);
	skin.add("default", textButtonStyle);
	table = new Table();
	table.setFillParent(true);
	this.addActor(table);

	logins();
	createAccountBt();
}

private void logins(){
	compteField=new TextField("effron",skin,"field");
	mdpField=new TextField("Uchiwa",skin,"field");
	mdpField.setPasswordMode(true);
	loginBt=new TextButton("Connexion",skin);
	xStreamUtil=new XStreamUtil();
	table.row();
	table.add(compteField).padBottom(10);
	table.row();
	table.add(mdpField).padBottom(10);
	table.row();
	table.add(loginBt).padRight(5);

	
	loginBt.addListener(new ChangeListener() {
		public void changed (ChangeEvent event, Actor actor) {
			String compteInput=compteField.getText();
			String mdpInput=mdpField.getText();
			Compte compteLoaded =xStreamUtil.loadCompte(compteInput);
			Compte compteTest=new Compte(compteInput,mdpInput);
			if(compteLoaded.getMdp().equals(compteTest.getMdp())){
				System.out.println("Compte verifié!");
				try {
					smenu.getHens().setScreen(new SLoadChar(smenu.getHens(),compteLoaded));
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			else{
				System.out.println("Ce compte n'existe pas,ou le mot de passe est incorrect");
				
			}
		}	
	});
	
}


private void createAccountBt(){
	createAccountBt=new TextButton("Créez votre compte",skin);
	table.add(createAccountBt);
	createAccountBt.addListener(new ChangeListener() {
		public void changed (ChangeEvent event, Actor actor) {
		String compteInput=compteField.getText();
		String mdpInput=mdpField.getText();
		xStreamUtil=new XStreamUtil();
		xStreamUtil.createAccount(compteInput,mdpInput);
		System.out.println("Compte Créé "+compteInput);
			
		}	
	});
	
}

	
}
