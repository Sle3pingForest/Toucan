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
		
	}
	
	public void droite(int d) {
		l.droite(d);
	}
	
	public void monter(int d) {}
	
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
		
		/*int temps = 0;
		int d = 0,i =0;
		boolean trouve = false;
		
		ArrayList<Mouvement> m = l.getMouvements();
		
		while (m.size() > i && !trouve)	{
			
			temps += m.get(i).getDistance();
			if ( temps > t) {
				if (m.get(i).getY() < m.get(i).getYarr())	d = m.get(i).getY() + (t - m.get(i).getY() ); 
				else d = m.get(i).getY() - ( t - m.get(i).getY());
				trouve=true;
			} else if (temps == t) {
				d = m.get(i).getYarr();
				trouve=true;
			
			}
			i++;
		
		}
		return d;*/
		
	}
	
}
