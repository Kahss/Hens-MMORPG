package charSheets;

public class Ulmo extends Personnage {
	private int debrouillard,calme,sage,altruiste;
	
	
	public Ulmo(){
	super();
	debrouillard=0;
	calme=0;
	sage=0;
	altruiste=0;
	}
	public Ulmo(String Pnom, int Plvl, float PhpMax, float PharMax, int Preput,
			float PRhp, float PRhar, float Ppui, float Pdef, float Pms, double Pvit, double Pconc,int Pdebrouillard, int Pcalme,int Psage, int Paltruiste){
		super(Pnom, Plvl, PhpMax, PharMax, Preput, PRhp, PRhar, Ppui, Pdef,Pms, Pvit, Pconc);
		this.debrouillard=Pdebrouillard;
		this.calme=Pcalme;
		this.sage=Psage;
		this.altruiste=Paltruiste;		
		
	
}
	public int getDebrouillard() {
		return debrouillard;
	}
	public void setDebrouillard(int debrouillard) {
		this.debrouillard = debrouillard;
	}
	public int getCalme() {
		return calme;
	}
	public void setCalme(int calme) {
		this.calme = calme;
	}
	public int getSage() {
		return sage;
	}
	public void setSage(int sage) {
		this.sage = sage;
	}
	public int getAltruiste() {
		return altruiste;
	}
	public void setAltruiste(int altruiste) {
		this.altruiste = altruiste;
	}

	
}