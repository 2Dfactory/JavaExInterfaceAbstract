import com.personnage.Chirugien;
import com.personnage.Civil;
import com.personnage.Guerrier;
import com.personnage.Medecin;
import com.personnage.Personnage;
import com.personnage.Sniper;

public class Test {

	public static void main(String[] args) {
		Personnage[] tPers = {new Guerrier(), new Civil(), new Medecin(), new Sniper(), new Chirugien()};
		
	    for(int i = 0; i < tPers.length; i++){
	      System.out.println("\nInstance de " + tPers[i].getClass().getName());
	      System.out.println("*****************************************");
	      tPers[i].combattre();
	      tPers[i].seDeplacer();
	      tPers[i].soigner();
	    }	

	}

}
