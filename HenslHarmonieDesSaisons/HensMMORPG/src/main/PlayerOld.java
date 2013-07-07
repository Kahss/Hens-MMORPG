package main;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.gui.AbstractComponent;
import org.newdawn.slick.gui.ComponentListener;
public class PlayerOld{
     
    private Input input;
    private Image  upleft, downright, downleft, upright, currentSprite,down,left,right,up;
    private int xChar,yChar,xMouse,yMouse,xGrid,yGrid;
    private int xTileChar,yTileChar;
    public PlayerOld(Input input)
    {
        this.input = input;
    }
    public void init() throws SlickException
    {
        downleft = new Image("image/Skin/pers34dgauche.png");
        upright = new Image("image/Skin/persdodroite.png");
        upleft = new Image("image/Skin/persdogauche.png");
        downright = new Image("image/Skin/pers34droite.png");
        down = new Image ("image/Skin/persface.png");
        right = new Image ("image/Skin/persprofildroite.png");
        left= new Image("image/Skin/persprofilgauche.png");
        up= new Image ("image/Skin/persdos.png");
        
        currentSprite = down;
        
        xChar=489+27;
        yChar=328+120;
        xGrid=0;
        yGrid=0;
        
    }
    
    public void render (Graphics g)
    {
        currentSprite.draw(xChar-27,yChar-120);
        g.drawString(String.valueOf(xTileChar), 800, 100);
        g.drawString(String.valueOf(yTileChar), 880, 100);
      
    }
     
    public void update (GameContainer container, int delta)
    {  input = container.getInput();
    	xMouse=input.getAbsoluteMouseX(); 
    	yMouse=input.getAbsoluteMouseY();
          
        
        if(input.isMousePressed(Input.MOUSE_LEFT_BUTTON)){
		     if (xMouse>xChar && yMouse>yChar)
		     {
		    
		         currentSprite = downright;
		    	 xGrid=xMouse;
		    	 yGrid=yMouse;
		         xTileChar=(yGrid/64+xGrid/128);
		         yTileChar=(yGrid/64-xGrid/128);
		         
		        }
		     else if (xMouse>xChar && yMouse<yChar)
		        {
		            currentSprite = upright;
		            xGrid=xMouse;
			    	 yGrid=yMouse;
			         xTileChar=(yGrid/64+xGrid/128);
			         yTileChar=(yGrid/64-xGrid/128);
		        }  
		     
		        else  if (xMouse<xChar && yMouse<yChar)
		        {
		            currentSprite = upleft;
		            xGrid=xMouse;
			    	 yGrid=yMouse;
			         xTileChar=(yGrid/64+xGrid/128);
			         yTileChar=(yGrid/64-xGrid/128);
		             
		        }
		         
		        else if (xMouse<xChar && yMouse>yChar)
		        {
		            currentSprite = downleft;
		            xGrid=xMouse;
			    	 yGrid=yMouse;
			         xTileChar=(yGrid/64+xGrid/128);
			         yTileChar=(yGrid/64-xGrid/128);
		             
		        }
		         
        
         
    }
     
   
      
		
		
	}
	public Input getInput() {
		return input;
	}
	public void setInput(Input input) {
		this.input = input;
	}
	public Image getUpleft() {
		return upleft;
	}
	public void setUpleft(Image upleft) {
		this.upleft = upleft;
	}
	public Image getDownright() {
		return downright;
	}
	public void setDownright(Image downright) {
		this.downright = downright;
	}
	public Image getDownleft() {
		return downleft;
	}
	public void setDownleft(Image downleft) {
		this.downleft = downleft;
	}
	public Image getUpright() {
		return upright;
	}
	public void setUpright(Image upright) {
		this.upright = upright;
	}
	public Image getCurrentSprite() {
		return currentSprite;
	}
	public void setCurrentSprite(Image currentSprite) {
		this.currentSprite = currentSprite;
	}
	public Image getDown() {
		return down;
	}
	public void setDown(Image down) {
		this.down = down;
	}
	public Image getLeft() {
		return left;
	}
	public void setLeft(Image left) {
		this.left = left;
	}
	public Image getRight() {
		return right;
	}
	public void setRight(Image right) {
		this.right = right;
	}
	public Image getUp() {
		return up;
	}
	public void setUp(Image up) {
		this.up = up;
	}
	public int getxChar() {
		return xChar;
	}
	public void setxChar(int xChar) {
		this.xChar = xChar;
	}
	public int getyChar() {
		return yChar;
	}
	public void setyChar(int yChar) {
		this.yChar = yChar;
	}
	public int getxMouse() {
		return xMouse;
	}
	public void setxMouse(int xMouse) {
		this.xMouse = xMouse;
	}
	public int getyMouse() {
		return yMouse;
	}
	public void setyMouse(int yMouse) {
		this.yMouse = yMouse;
	}
	public int getxTileChar() {
		return xTileChar;
	}
	public void setxTileChar(int xTileChar) {
		this.xTileChar = xTileChar;
	}
	public int getyTileChar() {
		return yTileChar;
	}
	public void setyTileChar(int yTileChar) {
		this.yTileChar = yTileChar;
	}
}

      