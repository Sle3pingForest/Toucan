package toucan.modele;

import java.util.ArrayList;

public class Case {
	
	LesMouvements l;
	
	
	public Case() {
		l = new LesMouvements();
	}
	
	public Case(int i, int o) {
		l = new LesMouvements(i,o);
	}

	public void gauche(int d) {
		l.gauche(d);
		
	}
	
	public void droite(int d) {
		l.droite(d);
	}
	
	public void haut(int d) {
		l.haut(d);
	}
	
	public void bas(int d) {
		l.bas(d);
	}
	
	
	public LesMouvements getL() {
		return l;
	}

	public void setL(LesMouvements l) {
		this.l = l;
	}

	
	public int posX(int t) {
		
		return l.posX(t);
	}
	

	
	public int posY(int t) {
		
		return l.posY(t);
		
	}


	
}
