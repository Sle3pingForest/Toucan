package toucan.modele;

public class MouvementGauche extends Mouvement{
	
	public MouvementGauche(int d) {
		super(d);
		this.distance = d;
		this.tempsArr = this.tempsDepart + d;
		this.xarr = this.x - d;
		this.yarr = this.y;
		
	}
	
	public MouvementGauche(Mouvement m, int d){
		super(m,d);
		if (m.getXarr() > 0) {
			this.x = m.getXarr() - 1;
			this.xarr = this.x - d + 1;
		} else {
			this.x = 0;
			this.xarr = 0;
		}
		
		this.y = m.getYarr();
		this.yarr = this.y;
		
	}

	@Override
	public int posX(int t) {		
		int d = 0;
		d =  x - (t - tempsDepart); 
		if (d < 0) d = 0;
		
		return d;
	}

	@Override
	public int posY(int t) {
		// TODO Auto-generated method stub
		return yarr;
	}

}
