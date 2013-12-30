package screens;

import inits.*;
import game.Hens;
import game.TestXStream;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Pixmap.Format;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Button;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton.TextButtonStyle;
import com.badlogic.gdx.scenes.scene2d.utils.ChangeListener;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;
import com.badlogic.gdx.scenes.scene2d.utils.ChangeListener.ChangeEvent;




public class CreateChar implements Screen {
	private SpriteBatch batch;
	private Texture GUI,fondCreaChar,fond2CreaChar;
	private TextureRegion fondAnar, fondUlmo;
	private Sprite sFond;
	Hens hens;
	private Stage stage;
	private Table table;
	private Button anarBt,sulimoBt,ulmoBt,wilwarBt;
	private Personnage me1,me;
	private String verifs;
	private Skin skin;
	private final TextButton button;
	
	

	
	public CreateChar(Hens hens){
		this.hens =hens;
		batch = new SpriteBatch();
		//load des texture
		fondCreaChar= new Texture(Gdx.files.internal("data/GUI/CreateChar/FondCreateChar.png"));
		 fondAnar = new TextureRegion(fondCreaChar,0,0,1024,768);
		 fondUlmo = new TextureRegion(fondCreaChar,0,768,1024,768);
		fond2CreaChar= new Texture(Gdx.files.internal("data/GUI/CreateChar/FondCreateChar2.png"));
		GUI = new Texture(Gdx.files.internal("data/GUI/CreateChar/GuiCreateChar.png"));
		stage = new Stage(1024,768,false);
		Gdx.input.setInputProcessor(stage);
		skin = new Skin();
	/*	TextureRegion anarBtUp = new TextureRegion(GUI,0,0,150,50);
		TextureRegionDrawable anarUp = new TextureRegionDrawable(anarBtUp);
		TextureRegion anarBtDown = new TextureRegion(GUI,150,0,150,50);
		TextureRegionDrawable anarDown = new TextureRegionDrawable(anarBtDown);
		TextureRegion sulimoBouton = new TextureRegion(GUI,0,50,150,50);
		TextureRegionDrawable sulimo = new TextureRegionDrawable(sulimoBouton);
		TextureRegion ulmoBouton = new TextureRegion(GUI,0,100,150,50);
		TextureRegionDrawable ulmo = new TextureRegionDrawable(ulmoBouton);
		TextureRegion wilwarBouton = new TextureRegion(GUI,0,150,150,50);
		TextureRegionDrawable wilwar = new TextureRegionDrawable(wilwarBouton);
		anarBt= new Button(anarUp,anarDown);
		sulimoBt = new Button(sulimo);
		ulmoBt = new Button(ulmo);
		wilwarBt = new Button(wilwar);*/
		sFond = new Sprite (fondAnar);
		sFond.setSize(1024, 768);
		sFond.setPosition(0, 0);
		
		
		//création de la GUI
		
	/*	stage.addActor(anarBt);
		anarBt.setBounds(50, 30, 150, 50);
		
		stage.addActor(sulimoBt);
		sulimoBt.setBounds(45, 140, 150, 50);
		stage.addActor(ulmoBt);
		ulmoBt.setBounds(40, 250, 150, 50);

		stage.addActor(wilwarBt);
		wilwarBt.setBounds(35, 360, 150, 50);
	    Gdx.input.setInputProcessor(stage);
	    
		Table table = new Table();
		table.setFillParent(true);
		stage.addActor(table);
		table.add(ulmoBt);*/


// _____________________________________________ TEST SIMPLE UI /!\

		// Generate a 1x1 white texture and store it in the skin named "white".
				Pixmap pixmap = new Pixmap(1, 1, Format.RGBA8888);
				pixmap.setColor(Color.WHITE);
				pixmap.fill();
				skin.add("white", new Texture(pixmap));
				// Store the default libgdx font under the name "default".
				skin.add("default", new BitmapFont());
		
				// Configure a TextButtonStyle and name it "default". Skin resources are stored by type, so this doesn't overwrite the font.
				TextButtonStyle textButtonStyle = new TextButtonStyle();
				textButtonStyle.up = skin.newDrawable("white", Color.DARK_GRAY);
				textButtonStyle.down = skin.newDrawable("white", Color.DARK_GRAY);
				textButtonStyle.checked = skin.newDrawable("white", Color.BLUE);
				textButtonStyle.over = skin.newDrawable("white", Color.LIGHT_GRAY);
				textButtonStyle.font = skin.getFont("default");
				skin.add("default", textButtonStyle);
				// Create a table that fills the screen. Everything else will go inside this table.
				Table table = new Table();
				table.setFillParent(true);
				stage.addActor(table);
				
				// Create a button with the "default" TextButtonStyle. A 3rd parameter can be used to specify a name other than "default".
			 button = new TextButton("Click me!", skin);
				table.add(button);
				button.addListener(new ChangeListener() {
					public void changed (ChangeEvent event, Actor actor) {
						System.out.println("Clicked! Is checked: " + button.isChecked());
						button.setText("Good job!");
					}
				});
				
				table.add(new Image(skin.newDrawable("white", Color.RED))).size(64);
		

	}
	
	
	@Override
	public void render(float delta) {
		Gdx.gl.glClearColor(0.3f, 0.25f, 0.2f, 1);
		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(fondAnar, 0, 0);
		batch.end();
		stage.act(Gdx.graphics.getDeltaTime());
        stage.draw();
	
	        
	        Table.drawDebug(stage);    
	        
		if(stage.keyDown(Keys.A)){
			hens.setScreen(hens.createChar);
		}
		
		if(stage.keyDown(Keys.B)){
			hens.setScreen(hens.smenu);
		}
		
		if(stage.keyDown(Keys.N)){
			CreatePersonnage("Effron","Anar","Scaramento");
	
		
		}
		
		
			BitmapFont verif = new BitmapFont();
			batch.begin();
		
			if(me!=null){
				if(verifs.equals("Anar")){
					verif.draw(batch,"Un Anarien à été crée, son nom est "+me.getPseudo(),10,20);
					batch.end();
				}
				else{
				batch.end();	
				}
			}
	
			else{
				verif.draw(batch,"OUINNNNNNNNN",10,10);
				batch.end();
			}
		
		
		
		//verif crea perso

	
	}
	
	public void CreatePersonnage(String Name, String Classe,  String NdCompte ){
		int lvl,map;
		float vie,har,vieR,harR,puis,def,vit,conc,vieC,harC,vieRC,harRC,puisC,defC,vitC,concC;
		int[] skin,pos;
		lvl=1;
			verifs=Classe;
			vie=60;	har=80;	vieR=1;	harR=8;
			puis=0; def=8; vit=100; conc=0;
			vieC=60; harC=60; vieRC=1; harRC=8;
			puisC=0; defC=8; vitC=100; concC=0; 
			skin=new int[5]; pos=new int[2];
			skin[0]=1;		pos[0]=1;
			map=45;
			 me = new Anar (Name,NdCompte, lvl,vie,har,vieR,harR,puis,def,vit,conc,vieC,harC,vieRC,harRC,puisC,defC,vitC,concC,skin,pos,map);	
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
