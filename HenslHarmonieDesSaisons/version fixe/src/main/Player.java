package main;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.gui.AbstractComponent;
import org.newdawn.slick.gui.ComponentListener;
public class Player {
     
    private Input input;
    private Image  upleft, downright, downleft, upright, currentSprite;

    private Image heart;
     
    private int x,y,a,b;
    private int numberOfHearts = 5;
    
    

    public Player(Input input)
    {
        this.input = input;
    }
    public void init() throws SlickException
    {

        downleft = new Image("image/rubis.png");
        upright = new Image("image/rubis.png");
        upleft = new Image("image/rubis.png");
        downright = new Image("image/rubis.png");
        x=400;
		y=500;
        currentSprite = downright;
         
    }
    
    public void render (Graphics g)
    {
        currentSprite.draw(489,328);
         

      
    }
     
    public void update (GameContainer container, int delta)
    {
          
        input = container.getInput();
        if(input.isMouseButtonDown(Input.MOUSE_LEFT_BUTTON)){
    		a= x +(512-input.getMouseX())/10 ;
		     b= y+(407-input.getMouseY())/20 ;
		     x=a;
		     y=b;
		     if (input.getMouseX()>x&input.getMouseY()>y){
		            currentSprite = upright;
		            a= x +(512-input.getMouseX())/10 ;
				     b= y+(407-input.getMouseY())/20 ;
				     x=a;
				     y=b;
		                          
		        }
		         
		     
		        else if (input.getMouseX()>x&input.getMouseY()<y)
		        {
		            currentSprite = downright;
		            a= x +(512-input.getMouseX())/10 ;
				     b= y+(407-input.getMouseY())/20 ;
				     x=a;
				     y=b;
		             
		        }
		        else  if (input.getMouseX()<x&input.getMouseY()<y)
		        {
		            currentSprite = downleft;
		            a= x +(512-input.getMouseX())/10 ;
				     b= y+(407-input.getMouseY())/20 ;
				     x=a;
				     y=b;
		             
		        }
		         
		        else if (input.getMouseX()<x&input.getMouseY()>y)
		        {
		            currentSprite = upleft;
		            a= x +(512-input.getMouseX())/10 ;
				     b= y+(407-input.getMouseY())/20 ;
				     x=a;
				     y=b;
		             
		        }
		         
        
         
    }
     
   
      
		
		
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
}