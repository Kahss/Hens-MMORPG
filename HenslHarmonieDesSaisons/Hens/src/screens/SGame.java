package screens;

import screens.UIs.UIGameGeneral;
import screens.keyBindings.KBGeneral;
import game.Hens;
import inits.Personnage;
import inits.Ulmo;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputMultiplexer;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TiledMapTileLayer;
import com.badlogic.gdx.maps.tiled.TmxMapLoader;
import com.badlogic.gdx.maps.tiled.renderers.IsometricTiledMapRenderer;

public class SGame implements Screen {
	private Personnage me;
	private Hens hens;
	private UIGameGeneral stage;
	private SpriteBatch batch;
	private OrthographicCamera camera;
	private TiledMap map;
	private IsometricTiledMapRenderer renderer;
	private TmxMapLoader loader;
	private int xFinal,yFinal,x1,y1,xCurrent,yCurrent,xClic,yClic;
	private int xDiff,yDiff,xDelta,yDelta;
	private float nFrame;
	private KBGeneral keyBinding;
	private BitmapFont var1;
	
	
	public SGame (Hens hens, Personnage me){
		this.hens=hens;
		this.me=me;
		stage= new UIGameGeneral(this);
		batch = new SpriteBatch();
		loader= new TmxMapLoader();
		map=loader.load("maps/MAP_1.tmx");
		renderer=new IsometricTiledMapRenderer(map);
		camera=new OrthographicCamera();
		keyBinding=new KBGeneral(this);
		Gdx.input.setInputProcessor(new InputMultiplexer(stage,keyBinding));
		stage.loadUI();
		xCurrent=2000;
		yCurrent=0;
		xFinal=2000;
		yFinal=0;
		x1=2000;
		y1=0;
		
		renderer.setView(camera);
	}

	@Override
	public void render(float delta) {
		BitmapFont xCurrentV = new BitmapFont();
		BitmapFont yCurrentV = new BitmapFont();
		BitmapFont xFinalV = new BitmapFont();
		BitmapFont yFinalV = new BitmapFont();
		BitmapFont x1V = new BitmapFont();
		BitmapFont y1V = new BitmapFont();
		
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);

		 int[] layers ={0,1,2,3};
		 int[] layersTop={4,5,6,7};
		renderer.render(layers);
		
		batch.begin();
		
		batch.draw(me.getBody(), 437, 309, 0, 0, 150, 150, 1, 1, 0);
		batch.draw(((Ulmo) me).getHair(),437 , 309, 0, 0, 150, 150, 1, 1, 0);
		xCurrentV.draw(batch, "xCurrent : " + String.valueOf(xCurrent),10,120);
		yCurrentV.draw(batch, "yCurrent : " + String.valueOf(yCurrent),10,100);
		xFinalV.draw(batch, "xFinal : " + String.valueOf(xFinal),10,80);
		yFinalV.draw(batch, "yFinal : " + String.valueOf(yFinal),10,60);
		x1V.draw(batch, "x1 : " + String.valueOf(x1),10,40);
		y1V.draw(batch, "y1 : " + String.valueOf(y1),10,20);
		
		batch.end();
		
		renderer.render(layersTop);
		xClic=keyBinding.getX();
		yClic=keyBinding.getY();
		camera.position.y=getY1();
		camera.position.x=getX1();
		move();
		camera.update();
		keyBinding.setGame(this);
	}
	
	
	private void move(){

		if(xClic>xFinal&&yClic>yFinal){
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
			if(getX1()>=xClic-1||getY1()>=yClic-1){
				xFinal=xClic;
				yFinal=yClic;
				setX1(xClic);
				setY1(yClic);
			}
		}
		
		if(xClic<xFinal&&yClic<yFinal){
			yDelta=-(yClic-yFinal);
			xDelta=-(xClic-xFinal);
			int xDsquare=xDelta*xDelta;
			int yDsquare=yDelta*yDelta;
			Double c=Math.sqrt(xDsquare+yDsquare);
			Double cosa=xDelta/c;
			Double acosa=Math.acos(cosa);
			Double acosaDeg=(180*acosa)/Math.PI;
			nFrame=(float)(0.15f*c*(1+(acosaDeg/90)));
			setX1((int) (getX1()-xDelta/nFrame));
			setY1((int) (getY1()-yDelta/nFrame));
			System.out.println("Je suis en train d'animer!3");
			if(getX1()<=xClic+1||getY1()<=yClic+1){
				xFinal=xClic;
				yFinal=yClic;
				setX1(xClic);
				setY1(yClic);
			}
		}
	
		if(xClic>xFinal&&yClic<yFinal){
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
			if(getX1()>=xClic||getY1()<=yClic){
				xFinal=xClic;
				yFinal=yClic;
				setX1(xClic);
				setY1(yClic);
			}
		}	
		if(xClic<xFinal&&yClic>yFinal){
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
			if(getX1()<=xClic||getY1()>=yClic){
				xFinal=xClic;
				yFinal=yClic;
				setX1(xClic);
				setY1(yClic);
			}
		}
	}



	@Override
	public void resize(int width, int height) {
		camera.viewportWidth=width;
		camera.viewportHeight=height;
		camera.update();
	}

	public OrthographicCamera getCamera() {
		return camera;
	}

	public void setCamera(OrthographicCamera camera) {
		this.camera = camera;
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
