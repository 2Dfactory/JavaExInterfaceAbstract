package com.personnage;

import com.comportement.perso.Deplacement;
import com.comportement.perso.EspritCombatif;
import com.comportement.perso.Soin;

public class Civil extends Personnage {

	public Civil() {
	}

	public Civil(EspritCombatif espritCombatif, Deplacement deplacement, Soin soin) {
		super(espritCombatif, deplacement, soin);
	}
	
}
