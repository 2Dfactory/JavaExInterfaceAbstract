package com.personnage;

import com.comportement.perso.AucunSoin;
import com.comportement.perso.Deplacement;
import com.comportement.perso.Dialoguer;
import com.comportement.perso.EspritCombatif;
import com.comportement.perso.Marcher;
import com.comportement.perso.Pacifiste;
import com.comportement.perso.Soin;

public abstract class Personnage {

	//Variable d'instance d�finissant le comportement par d�faut du personnage
	protected EspritCombatif espritCombatif = new Pacifiste();
	protected Deplacement deplacement = new Marcher();
	protected Soin soin = new AucunSoin();
	
	//Constructeur par d�faut
	public Personnage() {}

	public Personnage(EspritCombatif espritCombatif, Deplacement deplacement, Soin soin) {
		this.espritCombatif = espritCombatif;
		this.deplacement = deplacement;
		this.soin = soin;
	}

	/**
	 * Mode de d�placement du personnage
	 */
	public void seDeplacer() {
		//On utilise les objets de d�placement de fa�on polymorphe
		deplacement.Deplacer();
	}

	/**
	 * Mode de combat du personnage
	 */
	public void combattre() {
		//On utilise les objets de combat de fa�on polymorphe
		espritCombatif.Combat();
	}
	
	/**
	 * Mode d'administration des soins du personnage
	 */
	public void soigner() {
		//On utilise les objets de soin de fa�on polymorphe
		soin.soigner();
	}
	
	
	/**
	 * Red�finit le comportement au combat du personnage
	 * @param espritCombatif
	 */
	public void setEspritCombatif(EspritCombatif espritCombatif) {
		this.espritCombatif = espritCombatif;
	}

	/**
	 * Red�finit le mode de d�placement du personnage
	 * @param deplacement
	 */
	public void setDeplacement(Deplacement deplacement) {
		this.deplacement = deplacement;
	}

	/**
	 * Red�finit le mode d'administration des soins du personnage
	 * @param soin
	 */
	public void setSoin(Soin soin) {
		this.soin = soin;
	}
	
	
	
	
}
