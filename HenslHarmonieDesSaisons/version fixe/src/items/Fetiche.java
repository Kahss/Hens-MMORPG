package items;

public class Fetiche extends Item{
private int damage,reqLvl;
private String reqClasse;

public Fetiche(){
damage=0;
reqLvl=1;
reqClasse=null;
}

public Fetiche(int Pdmg, int PreqLvl, String PreqClasse){
damage=Pdmg;
reqLvl=PreqLvl;
reqClasse=PreqClasse;
	
}

public int getDamage() {
	return damage;
}

public void setDamage(int damage) {
	this.damage = damage;
}

public int getReqLvl() {
	return reqLvl;
}

public void setReqLvl(int reqLvl) {
	this.reqLvl = reqLvl;
}

public String getReqClasse() {
	return reqClasse;
}

public void setReqClasse(String reqClasse) {
	this.reqClasse = reqClasse;
}

}

