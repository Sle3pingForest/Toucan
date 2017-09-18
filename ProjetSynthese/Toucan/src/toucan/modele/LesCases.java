package toucan.modele;

import java.util.ArrayList;

/**
 * @author giang2u
 *
 */
public class LesCases {

	private ArrayList<Case> lesCases;
	private int temps;
	
	public LesCases(int i) {
		this.lesCases = new ArrayList<Case>(i);
	}


	/**
	 * @param c
	 */
	public LesCases(ArrayList<Case> c) {
		lesCases = c;
		temps = 0;
	}

	/**
	 * @param o numero de case
	 * @param a taille du deplacement
	 */
	public void droite(int o, int a) {
		Case c = lesCases.get(o);
		c.droite(a);
		this.setTemps(temps+a);
	}


	/**
	 * @param o numero de case
	 * @param a taille du deplacement
	 */
	public void bas(int o, int a) {
		Case c = lesCases.get(o);
		c.bas(a);
		this.setTemps(temps+a);
	}

	
	/**
	 * @param o numero de case
	 * @param a taille du deplacement
	 */
	public void gauche(int o, int a){
		Case c = lesCases.get(o);
		c.gauche(a);
		this.setTemps(temps+a);
	}

	
	/**
	 * @param o numero de case
	 * @param a taille du deplacement
	 */
	public void haut(int o, int a){
		Case c = lesCases.get(o);
		c.haut(a);
		this.setTemps(temps+a);
	}

	
	/**
	 * fais un mouvement avec depacement nul
	 * @param o numero de case
	 * @param a taille du deplacement
	 */
	public void stable(int numero, int deplacement) {
		// TODO Auto-generated method stub

	}

	
	 // Getter et Setter
	
	
	public ArrayList<Case> getCases() {
		return lesCases;
	}
    
    public Case getCase(int i){
    	return this.lesCases.get(i);
    }

	public void setLesCases(ArrayList<Case> lesCases) {
		this.lesCases = lesCases;
	}
	
	public void ajouterCase(Case c){
		this.lesCases.add(c);
	}

	/**
	 * @return le temps de la case le plus long
	 */
	public int getMaxTemps() {


		int maxTemps = 0;

		for (Case c : lesCases) {
			int tempscurr = 0;
			for (Mouvement m : c.getL().getMouvements()) {
				tempscurr += m.getDistance(); 
			}
			if (maxTemps < tempscurr) maxTemps = tempscurr; 
		}
		return maxTemps;
	}

	public void setTemps(int temps) {
		this.temps = temps;
	}

	/**
	 * Classe toString de la prof qui affiche les coordonees
	 */
	@Override
	public String toString() {
		int maxTemps = getMaxTemps() ;
		StringBuilder sb = new StringBuilder() ;
		for (int i = 0 ; i < lesCases.size() ; i++) {
			sb.append("Case " + i + ": ") ;
			Case c = lesCases.get(i) ;
			for (int t = 0 ; t <= maxTemps ; t++) {
				int x = c.posX(t) ;
				int y = c.posY(t) ;
				sb.append("\t" + t + " (" + x + "," + y + ") ") ;
				if (t % 5 == 0) {
					sb.append("\n\t") ;
				}
			}
			sb.append("\n") ;
		}
		return sb.toString() ;
	}




}
