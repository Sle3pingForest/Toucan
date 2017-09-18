package toucan.modele;

import java.util.ArrayList;

public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Case c = new Case();
		Case c2 = new Case();
		ArrayList<Case> cm = new ArrayList<Case>();
		cm.add(c);
		cm.add(c2);
		LesCases l = new LesCases(cm);
		
		//l.droite(0, 10);
		//l.droite(1, 15);
		//l.gauche(0, 5);
		//l.bas(0,5);
		//l.droite(1, 5);
		//l.droite(1, 5);
		//l.bas(1, 5);
		
		

		Modele m = new Modele(l); 
		m.creerLesMouvements(0,1 ,5);
		m.creerLesMouvements(0,3 ,5);
		m.creerLesMouvements(0,2 ,5);
		m.creerLesMouvements(0,4 ,5);
		m.creerLesMouvements(0,1 ,5);
		m.creerLesMouvements(0,3 ,5);
		
		
		ArrayList<Case> md = m.getLesCases().getCases();
		
		for (Case po : md) {
			for (Mouvement mm : po.getL().getMouvements()) {
				
				System.out.println("   " + mm.toString() + "sdfksdfbjk     " + mm.getTempsDepart() + "   "  + mm.getX());
			}
		}
		System.out.println(l.toString());
	}

}
