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
		
		l.droite(0, 10);
		l.droite(0, 10);
		l.droite(1, 5);
		l.bas(1, 5);
		
		System.out.println(l.toString());

		Modele m = new Modele(l);
		//m.creerLesMouvements();
		/*m.creerLesMouvements();*/
		
		//System.out.println(l.toString());
	}

}