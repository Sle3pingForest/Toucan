package toucan.modele;

import java.util.ArrayList;

public class Modele {
	
	LesCases lesCases;
	public static final int OUEST = 1;
	public static final int SUD = 2;
	public static final int EST = 3;
	public static final int NORD = 4;
	public static final int STABLE = 0;
	
	public Modele(LesCases l) {
		lesCases = l;
	}

	public void creerLesMouvements(int i, int numero, int deplacement) {
		switch(i){
			case OUEST :
				lesCases.droite(numero, deplacement);
			case SUD :
				lesCases.bas(numero, deplacement);
			case EST :
				lesCases.gauche(numero, deplacement);
			case NORD :
				lesCases.haut(numero, deplacement);
			case STABLE:
				lesCases.stable(numero, deplacement);
				
		}
		System.out.println(lesCases.toString());
	}
}
