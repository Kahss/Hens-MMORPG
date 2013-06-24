package charSheets;

public class Sulimo extends Personnage{
private int solitaire,turbulent,genereux,libre;
	
	public Sulimo(){
	super();
	solitaire=0;
	turbulent=0;
	genereux=0;
	libre=0;
	}
	
	public Sulimo(String Pnom, int Plvl, float PhpMax, float PharMax, int Preput,
			float PRhp, float PRhar, float Ppui, float Pdef, float Pms, double Pvit, double Pconc, int Pgenereux, int Plibre, int Pturbulent, int Psolitaire){
		super(Pnom, Plvl, PhpMax, PharMax, Preput, PRhp, PRhar, Ppui, Pdef,Pms, Pvit, Pconc);
		this.solitaire=Psolitaire;
		this.turbulent=Pturbulent;
		this.genereux=Pgenereux;
		this.libre=Plibre;
	}

	public int getSolitaire() {
		return solitaire;
	}

	public void setSolitaire(int solitaire) {
		this.solitaire = solitaire;
	}

	public int getTurbulent() {
		return turbulent;
	}

	public void setTurbulent(int turbulent) {
		this.turbulent = turbulent;
	}

	public int getGenereux() {
		return genereux;
	}

	public void setGenereux(int genereux) {
		this.genereux = genereux;
	}

	public int getLibre() {
		return libre;
	}

	public void setLibre(int libre) {
		this.libre = libre;
	}
	

}
	
	

