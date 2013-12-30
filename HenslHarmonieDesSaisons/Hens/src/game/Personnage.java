package game;

public class Personnage {
 private String nomPerso;
 private int lvl,reput;
 private float hpMax,Rhp,harMax,Rhar,pui,def,ms,CurHar,CurHp,CC;
 private double vit,conc;
 
 


public Personnage(){
	lvl=1;
	reput=0;
	hpMax=60;
	Rhp=1;
	harMax=200;
	Rhar=20;
	pui=0;
	def=5;
	ms=130;
	vit=0;
	conc=0;
	nomPerso=null;
	CurHp=60;
	CurHar=200;
	
}
	



public Personnage(String Pnom, int Plvl, float PhpMax, float PharMax, int Preput,
		float PRhp, float PRhar, float Ppui, float Pdef, float Pms, double Pvit, double Pconc ){
	lvl=1;
	reput=0;
	hpMax=PhpMax;
	Rhp=PRhp;
	harMax=PharMax;
	Rhar=PRhar;
	pui=0;
	def=Pdef;
	ms=Pms;
	vit=0;
	conc=0;
	nomPerso=Pnom;
	CC=3;
	
	
}




public String getNomPerso() {
	return nomPerso;
}




public void setNomPerso(String nomPerso) {
	this.nomPerso = nomPerso;
}




public int getLvl() {
	return lvl;
}




public void setLvl(int lvl) {
	this.lvl = lvl;
}




public int getReput() {
	return reput;
}




public void setReput(int reput) {
	this.reput = reput;
}




public float getHpMax() {
	return hpMax;
}




public void setHpMax(float hpMax) {
	this.hpMax = hpMax;
}




public float getRhp() {
	return Rhp;
}




public void setRhp(float rhp) {
	Rhp = rhp;
}




public float getHarMax() {
	return harMax;
}




public void setHarMax(float harMax) {
	this.harMax = harMax;
}




public float getRhar() {
	return Rhar;
}




public void setRhar(float rhar) {
	Rhar = rhar;
}




public float getPui() {
	return pui;
}




public void setPui(float pui) {
	this.pui = pui;
}




public float getDef() {
	return def;
}




public void setDef(float def) {
	this.def = def;
}




public float getMs() {
	return ms;
}




public void setMs(float ms) {
	this.ms = ms;
}




public float getCurHar() {
	return CurHar;
}




public void setCurHar(float curHar) {
	CurHar = curHar;
}




public float getCurHp() {
	return CurHp;
}




public void setCurHp(float curHp) {
	CurHp = curHp;
}




public float getCC() {
	return CC;
}




public void setCC(float cC) {
	CC = cC;
}




public double getVit() {
	return vit;
}




public void setVit(double vit) {
	this.vit = vit;
}




public double getConc() {
	return conc;
}




public void setConc(double conc) {
	this.conc = conc;
}

}