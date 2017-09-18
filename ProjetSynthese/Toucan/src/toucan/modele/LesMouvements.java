package toucan.modele;

import java.util.ArrayList;

public class LesMouvements {

	ArrayList<Mouvement> mouvements;
	
	private int xinit;
	private int yinit;
	
	
	LesMouvements (){
		xinit = 0;
		yinit = 0;
		mouvements = new ArrayList<Mouvement>();
	}
	
	LesMouvements (int i, int o){
		xinit = i;
		yinit = o;
		mouvements = new ArrayList<Mouvement>();
	}

	int posX(int t) {
		
		
		int temps = 0;
		int d = 0,i =0;
		boolean trouve = false;
		
		ArrayList<Mouvement> m = mouvements;
		
		while (m.size() > i && !trouve)	{
			
			temps += m.get(i).getDistance();
			
			if ( temps >= t) {
					d = m.get(i).posX(t);
					trouve=true;
				
			} else {
					i++;
			}
		}
		return d;
	}
	
	
	int posY(int t) {
		
		
		int temps = 0;
		int d = 0,i =0;
		boolean trouve = false;
		
		ArrayList<Mouvement> m = mouvements;
		
		while (m.size() > i && !trouve)	{
			
			temps += m.get(i).getDistance();
			
			if ( temps >= t) {
					d =m.get(i).posY(t);
					trouve=true;
			} else {
				i++;
			}
			
		}

		
		return d;
	}
	

	public ArrayList<Mouvement> getMouvements() {
		return mouvements;
	}
	
	public void droite(int d) {
		int t = mouvements.size();
		Mouvement p;
		
		if (t > 0){
			p = new MouvementDroite(mouvements.get(t-1) , d);
		}
		else{
			p = new MouvementDroite(d);
		}
		 
		mouvements.add(p);
	}
	
	public void gauche(int d){
		int t = mouvements.size();
		Mouvement p;
		if(t > 0){
			p =new MouvementGauche(mouvements.get(t-1),d);
		}
		else{
			p = new MouvementGauche(d);
		}
		mouvements.add(p);
	}
	
	public void bas(int d) {
		
		int t = mouvements.size();
		Mouvement p;
		
		if (t > 0){
			p = new MouvementBas(mouvements.get(t-1) , d);
		}
		else p = new MouvementBas(d);
		
		mouvements.add(p);
	}
	
	public void haut(int d){
		int t = mouvements.size();
		Mouvement p;
		
		if (t > 0)	p = new MouvementHaut(mouvements.get(t-1) , d);
		else p = new MouvementHaut(d);
		
		mouvements.add(p);
	}


	public void setMouvements(ArrayList<Mouvement> mouvements) {
		this.mouvements = mouvements;
	}
	
	

	public void setPosition(int x, int y){
		this.xinit = x;
		this.yinit = y;
	}

	public int getXinit() {
		return xinit;
	}


	public void setXinit(int xinit) {
		this.xinit = xinit;
	}


	public int getYinit() {
		return yinit;
	}


	public void setYinit(int yinit) {
		this.yinit = yinit;
	}
}
