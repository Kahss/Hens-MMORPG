package inits;

import java.util.List;

public class Monstre extends Entite {
	
	public Monstre(int sexe, 
			int niveau, 
			float vie, 
			float harmonie,
			float vieRegen, 
			float harRegen, 
			float puissance, 
			float defense,
			float vitesse, 
			float concentration, 
			List<Integer> skin, 
			List<Integer> pos,
			int mapID) {
		super(sexe, niveau, vie, harmonie, vieRegen, harRegen, puissance, defense, vitesse, concentration, skin, pos, mapID);
	}

	public Monstre() {
		super();
		// TODO : voir Entite pour implementer une entite bidon mais non vide
	}
	
	
}
