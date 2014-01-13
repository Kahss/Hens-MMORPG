/*******************************************************************************
 * Copyright 2011 See

 AUTHORS file.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/

package screens;

import java.util.List;

import screens.UIs.UICreateChar;
import game.Hens;
import inits.*;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.ui.Table;


public class SCreateChar implements Screen  {
	
	UICreateChar stage;
	SpriteBatch batch;
	private Personnage me;
	Texture GUI,fondCreaChar,fondCreaChar2;
	TextureRegion fondAnar, fondUlmo,fondWilwar,fondSulimo;
 	private Sprite sFond;
	private Hens hens;
	public String verifs;
	private Compte myCompte;

 	public SCreateChar(Hens hens,Compte compte){
 		this.setHens(hens);
 		this.setMyCompte(compte);
		batch = new SpriteBatch();
		stage = new UICreateChar(this);
		textureLoad();
		stage.loadUI();	
	Gdx.input.setInputProcessor(stage);
 	
 	}
 	
	@Override
	public void render(float delta) {
		Gdx.gl.glClearColor(0.2f, 0.2f, 0.2f, 1);
		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(sFond, 0, 0 );
		batch.end();
		

		stage.act(Math.min(Gdx.graphics.getDeltaTime(), 1 / 30f));
		stage.setsCreateChar(this);
		stage.draw();
		Table.drawDebug(stage);
		
		// Prendre ici pour afficher texte
		
		BitmapFont verif = new BitmapFont();
		batch.begin();
		if(Gdx.input.isKeyPressed(Keys.N)){
			verif.draw(batch,"Un Anarien à été crée, son nom est ",50,20);
			sFond = new Sprite(fondUlmo);
			
		}
		
		if(getMe()!=null){
			if(verifs.equals("Anar")){
				verif.draw(batch,"Un Anarien à été crée, son nom est "+getMe().getPseudo(),10,20);
		
			}
			
			if(verifs.equals("Wilwar")){
				verif.draw(batch,"Un Wilwarien à été crée, son nom est "+getMe().getPseudo(),10,20);
			
			}
			
			if(verifs.equals("Sulimo")){
				verif.draw(batch,"Un Sulimois à été crée, son nom est "+getMe().getPseudo(),10,20);
			
			}
			if(verifs.equals("Ulmo")){
				verif.draw(batch,"Un Ulmois à été crée, son nom est "+getMe().getPseudo(),10,20);
		
			}
			else{
			
			
			}
			batch.end();
		}

		else{
			verif.draw(batch,"OUINNNNNNNNN",10,10);
			batch.end();
		}
		

	}

	@Override
	public void resize (int width, int height) {
		stage.setViewport(width, height, false);
	}

	@Override
	public void dispose () {
		stage.dispose();
	}



public void textureLoad(){
	fondCreaChar= new Texture(Gdx.files.internal("data/GUI/CreateChar/FondCreateChar.png"));
	fondCreaChar2= new Texture(Gdx.files.internal("data/GUI/CreateChar/FondCreateChar2.png"));
	 fondAnar = new TextureRegion(fondCreaChar,0,0,1024,768);
	 fondSulimo = new TextureRegion(fondCreaChar,0,768,1024,768);
	 fondUlmo= new TextureRegion(fondCreaChar2,0,0,1024,768);
	 fondWilwar= new TextureRegion(fondCreaChar2,0,768,1024,768);
	GUI = new Texture(Gdx.files.internal("data/GUI/CreateChar/GuiCreateChar.png"));
	setsFond(new Sprite (fondAnar));
	getsFond().setSize(1024, 768);
	getsFond().setPosition(0, 0);
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

public void CreatePersonnage(String Name, String Classe,  String NdCompte ){
	int lvl,map;
	float vie,har,vieR,harR,puis,def,vit,conc,vieC,harC,vieRC,harRC,puisC,defC,vitC,concC;
	List<Integer> skin = null;
	List<Integer> pos =null;
	lvl=1;
		verifs=Classe;
		vie=60;	har=80;	vieR=1;	harR=8;
		puis=0; def=8; vit=100; conc=0;
		vieC=60; harC=60; vieRC=1; harRC=8;
		puisC=0; defC=8; vitC=100; concC=0; 
		map=45;
		// TODO : ça marche, mais il doit y avoir moyen de factoriser pour rendre ça un peu plus propre
		if(Classe.equals("Anar"))
		 setMe(new Anar (Name,NdCompte, lvl,vie,har,vieR,harR,puis,def,vit,conc,vieC,harC,vieRC,harRC,puisC,defC,vitC,concC,skin,pos,map));
		if(Classe.equals("Ulmo"))
		 setMe(new Ulmo(Name,NdCompte, lvl,vie,har,vieR,harR,puis,def,vit,conc,vieC,harC,vieRC,harRC,puisC,defC,vitC,concC,skin,pos,map));
		if(Classe.equals("Wilwar"))
		 setMe(new Wilwar(Name,NdCompte, lvl,vie,har,vieR,harR,puis,def,vit,conc,vieC,harC,vieRC,harRC,puisC,defC,vitC,concC,skin,pos,map));
		if(Classe.equals("Sulimo"))
		 setMe(new Sulimo(Name,NdCompte, lvl,vie,har,vieR,harR,puis,def,vit,conc,vieC,harC,vieRC,harRC,puisC,defC,vitC,concC,skin,pos,map));
}

public TextureRegion getFondAnar() {
	return fondAnar;
}

public void setFondAnar(TextureRegion fondAnar) {
	this.fondAnar = fondAnar;
}

public TextureRegion getFondUlmo() {
	return fondUlmo;
}

public void setFondUlmo(TextureRegion fondUlmo) {
	this.fondUlmo = fondUlmo;
}

public TextureRegion getFondWilwar() {
	return fondWilwar;
}

public void setFondWilwar(TextureRegion fondWilwar) {
	this.fondWilwar = fondWilwar;
}

public TextureRegion getFondSulimo() {
	return fondSulimo;
}

public void setFondSulimo(TextureRegion fondSulimo) {
	this.fondSulimo = fondSulimo;
}

public Sprite getsFond() {
	return sFond;
}

public void setsFond(Sprite sFond) {
	this.sFond = sFond;
}

public Hens getHens() {
	return hens;
}

public void setHens(Hens hens) {
	this.hens = hens;
}

public Personnage getMe() {
	return me;
}

public void setMe(Personnage me) {
	this.me = me;
}

public Compte getMyCompte() {
	return myCompte;
}

public void setMyCompte(Compte myCompte) {
	this.myCompte = myCompte;
}

}
