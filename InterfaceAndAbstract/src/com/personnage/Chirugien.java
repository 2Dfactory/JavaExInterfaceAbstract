package com.personnage;

import com.comportement.perso.Deplacement;
import com.comportement.perso.EspritCombatif;
import com.comportement.perso.Operation;
import com.comportement.perso.PremierSoin;
import com.comportement.perso.Soin;

public class Chirugien extends Personnage {

	public Chirugien() {
		this.soin = new Operation();
	}

	public Chirugien(EspritCombatif espritCombatif, Deplacement deplacement, Soin soin) {
		super(espritCombatif, deplacement, soin);
	}

}
