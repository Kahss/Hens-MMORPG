package screens;

import screens.UIs.UIGameGeneral;
import screens.keyBindings.KBGeneral;
import game.Hens;
import inits.Personnage;
import inits.monstres.Sanglion;
import inits.util.SkinManager;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputMultiplexer;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TmxMapLoader;
import com.badlogic.gdx.maps.tiled.renderers.IsometricTiledMapRenderer;

public class SGame implements Screen {
	private Personnage me;
	//sanglier provisoire
	private Sanglion sang;
	private int oriSang,oriF;
	private UIGameGeneral stage;
	private SpriteBatch batch;
	
	private OrthographicCamera camera;
	private TiledMap map;
	private IsometricTiledMapRenderer renderer;
	
	private int xFinal,yFinal,x1,y1,xClic,yClic;
	private int xDelta,yDelta;
	private float nFrame;
	private KBGeneral keyBinding;
	private SkinManager skinManager;
	
	// Sert juste à l'affichage des coordonnées sur l'écran (debug)
	private BitmapFont xFinalV = new BitmapFont();
	private BitmapFont yFinalV = new BitmapFont();
	private BitmapFont x1V = new BitmapFont();
	private BitmapFont y1V = new BitmapFont();
	private BitmapFont oriSanglion = new BitmapFont();
	
	
	public SGame (Hens hens, Personnage me){
		this.me=me;
		sang= new Sanglion(5, 1);
		stage= new UIGameGeneral(this);
		batch = new SpriteBatch();
		
		camera=new OrthographicCamera();
		
		keyBinding=new KBGeneral(this);
		Gdx.input.setInputProcessor(new InputMultiplexer(stage,keyBinding));
		
		stage.loadUI();
		
		xFinal=2000;
		yFinal=0;
		x1=2000;
		y1=0;
		skinManager=new SkinManager();
	}

	
	public void render(float delta) {
		Gdx.app.log("SGame","render()");
		
		int[] layers ={0,1,2,3};
		int[] layersTop={4,5,6,7};
		
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT); // nettoyer l'écran
		
		renderer.setView(camera);

		renderer.render(layers); //couches inférieures de la map
		afficheSkin();
		
		
		renderer.render(layersTop); //couches supérieures de la map
		afficheCoordonnees();
		
		recupereXY();		
		move();
		
		camera.update();
	}
	
	
	private void afficheCoordonnees() {
		batch.begin();
		xFinalV.draw(batch, "xFinal : " + String.valueOf(xFinal),10,80);
		yFinalV.draw(batch, "yFinal : " + String.valueOf(yFinal),10,60);
		x1V.draw(batch, "x1 : " + String.valueOf(x1),10,40);
		y1V.draw(batch, "y1 : " + String.valueOf(y1),10,20);	
		//sanglion provisoire
		oriSanglion.draw(batch, "orientation Sanglion : " + String.valueOf(oriF),10,100);	
		batch.end();
	}


	private void afficheSkin() {
		batch.begin();
		batch.draw(skinManager.getBodyGlobal()[me.getSexe()][0][me.getBodyChosen()][me.getOrientation()],437 , 309, 0, 0, 150, 150, 1, 1, 0);
		batch.draw(skinManager.getHairGlobal()[me.getSexe()][me.getClasseInt()][me.getHairChosen()][me.getOrientation()], 437, 309, 0, 0, 150, 150, 1, 1, 0);
		//dessin provisoire du sanglion
		oriSang++;
		if(oriSang==60){
			oriSang=0;
			oriF=oriF+300;
			if(oriF==2400){
				oriF=0;
			}
		}
		batch.draw(sang.loadCurrentSkin(oriF),600-getX1() , 100-getY1(), 0, 0, 150, 150, 1, 1, 0);
		
		batch.end();		
	}


	private void recupereXY() {
		xClic=keyBinding.getX();
		yClic=keyBinding.getY();
		camera.position.y=getY1();
		camera.position.x=getX1();		
	}

	private void move(){
		Gdx.app.log("SGame","move()");

		if(xClic>=xFinal&&yClic>yFinal){
			yDelta=yClic-yFinal;
			xDelta=xClic-xFinal;
			int xDsquare=xDelta*xDelta;
			int yDsquare=yDelta*yDelta;
			Double c=Math.sqrt(xDsquare+yDsquare);
			Double cosa=xDelta/c;
			Double acosa=Math.acos(cosa);
			Double acosaDeg=(180*acosa)/Math.PI;
			nFrame=(float) (0.15f*c*(1+(acosaDeg/90)));
			setX1((int)(getX1()+xDelta/nFrame));
			setY1((int)(getY1()+yDelta/nFrame));
			System.out.println("Je suis en train d'animer!movement x:"+xDelta/nFrame+" movment y:"+yDelta/nFrame);
			me.setOrientation(6);
			if(getX1()>=xClic-1||getY1()>=yClic-1){
				xFinal=xClic;
				yFinal=yClic;
				setX1(xClic);
				setY1(yClic);
			}
		}
		
		if ( xClic <= xFinal && yClic < yFinal ) {
			yDelta = yFinal - yClic ;
			xDelta= xFinal - xClic ;
			Double c = Math.sqrt( xDelta*xDelta + yDelta*yDelta ); // Th. de Pythagore
			Double acosa = Math.acos( xDelta / c );
			Double acosaDeg = (180*acosa)/Math.PI;
			nFrame=(float)(0.15f*c*(1+(acosaDeg/90)));
			setX1((int) (getX1()-xDelta/nFrame));
			setY1((int) (getY1()-yDelta/nFrame));
			System.out.println("Je suis en train d'animer!3");
			me.setOrientation(2);
			if(getX1()<=xClic+1||getY1()<=yClic+1){
				xFinal=xClic;
				yFinal=yClic;
				setX1(xClic);
				setY1(yClic);
			}
		}
	
		if(xClic>xFinal&&yClic<=yFinal){
			yDelta=-(yClic-yFinal);
			xDelta=xClic-xFinal;
			int xDsquare=xDelta*xDelta;
			int yDsquare=yDelta*yDelta;
			Double c=Math.sqrt(xDsquare+yDsquare);
			Double cosa=xDelta/c;
			Double acosa=Math.acos(cosa);
			Double acosaDeg=(180*acosa)/Math.PI;
			nFrame=(float)(0.15f*c*(1+(acosaDeg/90)));
			setX1((int) (getX1()+xDelta/nFrame));
			setY1((int) (getY1()-yDelta/nFrame));
			System.out.println("Je suis en train d'animer!2");
			me.setOrientation(4);
			if(getX1()>=xClic||getY1()<=yClic){
				xFinal=xClic;
				yFinal=yClic;
				setX1(xClic);
				setY1(yClic);
			}
		}	
		if(xClic<xFinal&&yClic>=yFinal){
			yDelta=(yClic-yFinal);
			xDelta=-(xClic-xFinal);
			int xDsquare=xDelta*xDelta;
			int yDsquare=yDelta*yDelta;
			Double c=Math.sqrt(xDsquare+yDsquare);
			Double cosa=xDelta/c;
			Double acosa=Math.acos(cosa);
			Double acosaDeg=(180*acosa)/Math.PI;
			nFrame=(float)(0.15f*c*(1+(acosaDeg/90)));
			setX1((int) (getX1()-xDelta/nFrame));
			setY1((int) (getY1()+yDelta/nFrame));
			System.out.println("Je suis en train d'animer!4");
			me.setOrientation(0);
			if(getX1()<=xClic||getY1()>=yClic){
				xFinal=xClic;
				yFinal=yClic;
				setX1(xClic);
				setY1(yClic);
			}
		}
	}



	public void resize(int width, int height) {
		Gdx.app.log("SGame","resize()");

		camera.viewportWidth = width;
		camera.viewportHeight = height;
		camera.update();
	}

	public OrthographicCamera getCamera() {
		return camera;
	}

	public void setCamera(OrthographicCamera camera) {
		this.camera = camera;
	}

	
	public void show() {
		Gdx.app.log("SGame","show");

		map = new TmxMapLoader().load("maps/MAP_1.tmx");
		renderer = new IsometricTiledMapRenderer(map);
		camera = new OrthographicCamera();
		
		keyBinding.setGame(this);
	}

	
	public void hide() {
		Gdx.app.log("SGame","hide()");

		dispose();
	}

	
	public void pause() {
		Gdx.app.log("SGame","pause()");
	}

	
	public void resume() {
		Gdx.app.log("SGame","resume()");
	}

	
	public void dispose() {
		Gdx.app.log("SGame","dispose()");

		map.dispose();
		renderer.dispose();
	}
	
	public int getX() {
		return getX1();
	}

	public void setX(int x) {
		this.setX1(x);
	}

	public int getY() {
		return getY1();
	}

	public void setY(int y) {
		this.setY1(y);
	}

	public int getX1() {
		return x1;
	}

	public void setX1(int x1) {
		this.x1 = x1;
	}

	public int getY1() {
		return y1;
	}

	public void setY1(int y1) {
		this.y1 = y1;
	}

}
