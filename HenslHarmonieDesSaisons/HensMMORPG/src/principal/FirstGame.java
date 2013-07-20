package principal;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;


public class FirstGame extends StateBasedGame {
	private Menu menu;
	private GameState gameState;
	private CreateCharacter createCharacter;
	private static String [] refs ={"image/iconewindow.png","image/iconewindow.png"};
	
	
	public FirstGame(String name) {
		super("Hens, l'Harmonie des Saisons");
		
	}

	 public static void principal(String[] args) throws SlickException {
		 		AppGameContainer container = new AppGameContainer(new FirstGame("Hens L'harmonie des Saisons"));
	            container.setDisplayMode(1024, 768, false);
	            container.setTargetFrameRate(60);
	            container.setMultiSample(4);
	            container.setVSync(true);
	            container.start();
	            container.setIcons(refs);	           
	    }
	
	public void initStatesList(GameContainer arg0) throws SlickException {
		 	menu = new Menu();
		 	gameState = new GameState();
	        createCharacter = new CreateCharacter();
	        addState(menu);
	        addState(gameState);
	        addState(createCharacter);

	}

}
