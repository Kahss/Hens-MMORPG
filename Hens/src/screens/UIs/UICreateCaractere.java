package screens.UIs;

import screens.SCreateCaractere;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Pixmap.Format;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.ui.TextField;
import com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldStyle;

public class UICreateCaractere extends Stage{
SCreateCaractere sCreateCaractere;
int classe;
Table table;
Skin skin;
int compteur1,compteur2,compteur3,compteur4;
Image barreCar1,barreCar2,barreCar3,barreCar4;
TextField fieldCar1, fieldCar2, fieldCar3, fieldCar4;
TextFieldStyle textFieldStyle;

	public UICreateCaractere(SCreateCaractere sCreateCaractere,int classe) {
		this.sCreateCaractere=sCreateCaractere;
		this.classe=classe;
	}
	
public void loadUI(){
	skin=new Skin();Pixmap pixmap = new Pixmap(1, 1, Format.RGBA8888);
	pixmap.setColor(Color.WHITE);
	pixmap.fill();
	skin.add("white", new Texture(pixmap));
	skin.add("default", new BitmapFont());
	textFieldStyle=new TextFieldStyle();
	textFieldStyle.background= skin.newDrawable("white",Color.BLACK);
	textFieldStyle.font=skin.getFont("default");
	textFieldStyle.disabledFontColor= new Color(Color.LIGHT_GRAY);
	textFieldStyle.fontColor=new Color(Color.WHITE);
	skin.add("field", textFieldStyle);
	caracBar();
	fields();
}
	
private void caracBar(){
	barreCar1=new Image();
	barreCar1.setWidth(50);
	barreCar1.setHeight(1);
	barreCar1.setColor(Color.WHITE);
	barreCar2=new Image();
	barreCar2.setWidth(50);
	barreCar2.setHeight(1);
	barreCar2.setColor(Color.CYAN);
	barreCar3=new Image();
	barreCar3.setWidth(50);
	barreCar3.setHeight(1);
	barreCar3.setColor(Color.BLUE);
	barreCar4=new Image();
	barreCar4.setWidth(50);
	barreCar4.setHeight(1);
	barreCar4.setColor(Color.LIGHT_GRAY);
	table = new Table();
	table.setFillParent(true);
	this.addActor(table);
	table.add();//titre
	table.row();
	table.add();
	table.add();//noms des caractéres
	table.row();
	table.add();
	table.add(barreCar1);
	table.add(barreCar2);
	table.add(barreCar3);
	table.add(barreCar4);
	table.row();
	table.add(fieldCar1);
	table.add(fieldCar2);
	table.add(fieldCar3);
	table.add(fieldCar4);
	
	
}
	
private void fields(){
fieldCar1=new TextField("cnxbdfqgfvs",skin,"field");
fieldCar2=new TextField("tr tze",skin,"field");
fieldCar3=new TextField(" ret fds g",skin,"field");
fieldCar4=new TextField(" azer ha",skin,"field");
}


public void checkCar(){
	compteur1= Integer.parseInt(fieldCar1.getText());
	compteur2= Integer.parseInt(fieldCar2.getText());
	compteur3= Integer.parseInt(fieldCar3.getText());
	compteur4= Integer.parseInt(fieldCar4.getText());
}
	
public void setCarBar(){
barreCar1.setHeight(compteur1);
barreCar2.setHeight(compteur2);
barreCar3.setHeight(compteur3);
barreCar4.setHeight(compteur4);
}
}
