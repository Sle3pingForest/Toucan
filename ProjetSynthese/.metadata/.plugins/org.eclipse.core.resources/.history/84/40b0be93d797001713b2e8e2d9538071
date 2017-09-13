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

	public void creerLesMouvements(int numero, int i,  int deplacement) {
		switch(i){
			case OUEST :
				lesCases.droite(numero, deplacement);
				break;
			case SUD :
				lesCases.bas(numero, deplacement);
				break;
			case EST :
				lesCases.gauche(numero, deplacement);
				break;
			case NORD :
				lesCases.haut(numero, deplacement);
				break;
			case STABLE:
				lesCases.stable(numero, deplacement);
				break;
				
		}
		System.out.println(lesCases.toString());
	}
}
