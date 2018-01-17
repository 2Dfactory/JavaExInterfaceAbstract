package com.personnage;

import com.comportement.perso.Deplacement;
import com.comportement.perso.EspritCombatif;
import com.comportement.perso.PremierSoin;
import com.comportement.perso.Soin;

public class Medecin extends Personnage {

	public Medecin() {
		this.soin = new PremierSoin();
	}

	public Medecin(EspritCombatif espritCombatif, Deplacement deplacement, Soin soin) {
		super(espritCombatif, deplacement, soin);
	}

}
