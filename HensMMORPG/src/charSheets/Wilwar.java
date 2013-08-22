package charSheets;

public class Wilwar extends Personnage{
	private int doux,determine,sage,indomptable;
	
	
	



	public Wilwar(){
	     super();
	     doux=0;
	     determine=0;
	     sage=0;
	     indomptable=0;
	  }


	public Wilwar (String Pnom, int Plvl, float PhpMax, float PharMax, int Preput,
	float PRhp, float PRhar, float Ppui, float Pdef, float Pms, double Pvit, double Pconc, int Pdoux, int Pdetermine, int Psage, int Pindomptable){
		super( Pnom, Plvl, PhpMax, PharMax, Preput, PRhp, PRhar, Ppui, Pdef,Pms, Pvit, Pconc);
		this.doux=Pdoux;
		this.determine=Pdetermine;
		this.indomptable=Pindomptable;
		this.sage=Psage;
		}


	public int getDoux() {
		return doux;
	}


	public void setDoux(int doux) {
		this.doux = doux;
	}


	public int getDetermine() {
		return determine;
	}


	public void setDetermine(int determine) {
		this.determine = determine;
	}


	public int getSage() {
		return sage;
	}


	public void setSage(int sage) {
		this.sage = sage;
	}


	public int getIndomptable() {
		return indomptable;
	}


	public void setIndomptable(int indomptable) {
		this.indomptable = indomptable;
	}	
	
}