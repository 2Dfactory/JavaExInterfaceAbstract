package com.personnage;

import com.comportement.perso.AucunSoin;
import com.comportement.perso.Deplacement;
import com.comportement.perso.Dialoguer;
import com.comportement.perso.EspritCombatif;
import com.comportement.perso.Marcher;
import com.comportement.perso.Pacifiste;
import com.comportement.perso.Soin;

public abstract class Personnage {

	//Variable d'instance définissant le comportement par défaut du personnage
	protected EspritCombatif espritCombatif = new Pacifiste();
	protected Deplacement deplacement = new Marcher();
	protected Soin soin = new AucunSoin();
	
	//Constructeur par défaut
	public Personnage() {}

	public Personnage(EspritCombatif espritCombatif, Deplacement deplacement, Soin soin) {
		this.espritCombatif = espritCombatif;
		this.deplacement = deplacement;
		this.soin = soin;
	}

	/**
	 * Mode de déplacement du personnage
	 */
	public void seDeplacer() {
		//On utilise les objets de déplacement de façon polymorphe
		deplacement.Deplacer();
	}

	/**
	 * Mode de combat du personnage
	 */
	public void combattre() {
		//On utilise les objets de combat de façon polymorphe
		espritCombatif.Combat();
	}
	
	/**
	 * Mode d'administration des soins du personnage
	 */
	public void soigner() {
		//On utilise les objets de soin de façon polymorphe
		soin.soigner();
	}
	
	
	/**
	 * Redéfinit le comportement au combat du personnage
	 * @param espritCombatif
	 */
	public void setEspritCombatif(EspritCombatif espritCombatif) {
		this.espritCombatif = espritCombatif;
	}

	/**
	 * Redéfinit le mode de déplacement du personnage
	 * @param deplacement
	 */
	public void setDeplacement(Deplacement deplacement) {
		this.deplacement = deplacement;
	}

	/**
	 * Redéfinit le mode d'administration des soins du personnage
	 * @param soin
	 */
	public void setSoin(Soin soin) {
		this.soin = soin;
	}
	
	
	
	
}
