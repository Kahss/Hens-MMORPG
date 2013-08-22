package charSheets;


public class Anar extends Personnage {
	private int colerique,jovial,courageux,orgueil;
	
	public Anar(){
	super();
	colerique=0;
	jovial=0;
	courageux=0;
	orgueil=0;
	}


	public Anar(String Pnom, int Plvl, float PhpMax, float PharMax, int Preput,
			float PRhp, float PRhar, float Ppui, float Pdef, float Pms, double Pvit, double Pconc, int Pcolerique, int Pjovial, int Pcourageux, int Porgueil){
		super(Pnom, Plvl, PhpMax, PharMax, Preput, PRhp, PRhar, Ppui, Pdef,Pms, Pvit, Pconc);
		this.colerique=Pcolerique;
		this.jovial=Pjovial;
		this.courageux=Pcourageux;
		this.orgueil=Porgueil;
		
		
	}


	public int getColerique() {
		return colerique;
	}


	public void setColerique(int colerique) {
		this.colerique = colerique;
	}


	public int getJovial() {
		return jovial;
	}


	public void setJovial(int jovial) {
		this.jovial = jovial;
	}


	public int getCourageux() {
		return courageux;
	}


	public void setCourageux(int courageux) {
		this.courageux = courageux;
	}


	public int getOrgueil() {
		return orgueil;
	}


	public void setOrgueil(int orgueil) {
		this.orgueil = orgueil;
	}
	}