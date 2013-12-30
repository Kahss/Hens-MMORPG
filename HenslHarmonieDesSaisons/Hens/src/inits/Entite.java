package inits;

import java.util.List;

public class Entite{

	protected int sexe;
	protected int niveau;
	protected float vie;
	protected float harmonie;
	protected float vieRegen;
	protected float harRegen;
	protected float puissance;
	protected float defense;
	protected float vitesse;
	protected float concentration;
	protected float vieCurrent;
	protected float harmonieCurrent;
	protected float vieRegenCurrent;
	protected float harRegenCurrent;
	protected float puissanceCurrent;
	protected float defenseCurrent;
	protected float vitesseCurrent;
	protected float concentrationCurrent;
	protected List<Integer> skin;
	protected List<Integer> pos;
	protected int mapID;
	protected int direction;
	protected int orientation;
	
	
	public Entite(){
		
	}

	public Entite(int sexe, int niveau, float vie, float harmonie,
			float vieRegen, float harRegen, float puissance, float defense,
			float vitesse, float concentration, float vieCurrent,
			float harmonieCurrent, float vieRegenCurrent,
			float harRegenCurrent, float puissanceCurrent,
			float defenseCurrent, float vitesseCurrent,
			float concentrationCurrent, List<Integer> skin, List<Integer> pos,
			int mapID, int direction, int orientation) {
		super();
		this.sexe = sexe;
		this.niveau = niveau;
		this.vie = vie;
		this.harmonie = harmonie;
		this.vieRegen = vieRegen;
		this.harRegen = harRegen;
		this.puissance = puissance;
		this.defense = defense;
		this.vitesse = vitesse;
		this.concentration = concentration;
		this.vieCurrent = vieCurrent;
		this.harmonieCurrent = harmonieCurrent;
		this.vieRegenCurrent = vieRegenCurrent;
		this.harRegenCurrent = harRegenCurrent;
		this.puissanceCurrent = puissanceCurrent;
		this.defenseCurrent = defenseCurrent;
		this.vitesseCurrent = vitesseCurrent;
		this.concentrationCurrent = concentrationCurrent;
		this.pos = pos;
		this.mapID = mapID;
		this.direction = direction;
		this.orientation = orientation;
	}
	
	
	
}
