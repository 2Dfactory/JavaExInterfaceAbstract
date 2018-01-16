package com.personnage;

import com.comportement.perso.CombatPistolet;
import com.comportement.perso.Deplacement;
import com.comportement.perso.EspritCombatif;
import com.comportement.perso.Soin;

public class Guerrier extends Personnage {

	public Guerrier() {
		super();
		this.espritCombatif = new CombatPistolet();
	}

	public Guerrier(EspritCombatif espritCombatif, Deplacement deplacement, Soin soin) {
		super(espritCombatif, deplacement, soin);
	}

}
