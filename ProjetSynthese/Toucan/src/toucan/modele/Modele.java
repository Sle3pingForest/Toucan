package toucan.modele;

import java.util.ArrayList;

public class Modele {
	
	LesCases lesCases;
	
	public Modele(LesCases l) {
		lesCases = l;
	}

	public void creerLesMouvements() {
		lesCases.droite(0,10);
		System.out.println(lesCases.toString());
	}
}
