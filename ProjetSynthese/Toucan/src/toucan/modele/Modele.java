package toucan.modele;

import java.util.ArrayList;

public class Modele {
	
	LesCases lesCases;
	public static final int OUEST = 1;
	public static final int SUD = 2;
	public static final int EST = 3;
	public static final int NORD = 4;
	public static final int STABLE = 0;
	
	public Modele(int i) {
		this.lesCases = new LesCases(i);
		for(int j = 0 ; j < i ; j++){
			Case c = new Case();
			this.lesCases.ajouterCase(c);
		}
	}
	
	public void setPosition (int noCase, int x, int y){
		this.lesCases.getCase(noCase).getL().setPosition(x,y);
	}

	public void creerLesMouvements(int ... i) {
		assert(i.length%3 == 0) :"Le nombre de Parametre doit etre multiple de 3";
		for(int j = 0; j < i.length ; j+=3){
			switch(i[j+1]){
				case OUEST :
					lesCases.droite(i[j], i[j+2]);
					break;
				case SUD :
					lesCases.bas(i[j], i[j+2]);
					break;
				case EST :
					lesCases.gauche(i[j], i[j+2]);
					break;
				case NORD :
					lesCases.haut(i[j], i[j+2]);
					break;
				case STABLE:
					lesCases.stable(i[j], i[j+2]);
					break;
			}	
		}
	}
	
	public String toString() {
		
		return null;
		
		
	}
	public static void main(String[] args) {

		Modele m = new Modele(2); 
		

		m.creerLesMouvements(0,1 ,5);
		m.creerLesMouvements(0,3 ,5);
		m.creerLesMouvements(0,2 ,5);
		m.creerLesMouvements(0,4 ,5);
		m.creerLesMouvements(0,1 ,5);
		m.creerLesMouvements(0,3 ,5);

		System.out.println(m.toString());
	}

}
