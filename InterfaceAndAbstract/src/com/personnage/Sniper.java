package com.personnage;

import com.comportement.perso.CombatFusil;
import com.comportement.perso.Deplacement;
import com.comportement.perso.EspritCombatif;
import com.comportement.perso.Soin;

public class Sniper extends Personnage {

	public Sniper() {
		super();
		this.espritCombatif = new CombatFusil();
	
	}

	public Sniper(EspritCombatif espritCombatif, Deplacement deplacement, Soin soin) {
		super(espritCombatif, deplacement, soin);
	}

	
	
}
