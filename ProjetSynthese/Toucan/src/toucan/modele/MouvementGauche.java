package toucan.modele;

public class MouvementGauche extends Mouvement{
	
	public MouvementGauche(int d) {
		super(d);
		this.distance = d;
		this.xarr = this.x - d;
		this.yarr = this.y;
		
	}
	
	public MouvementGauche(Mouvement m, int d){
		super(m,d);
		this.xarr = this.x - d;
		
	}

	@Override
	public int posX(int t) {		
		int d = 0;
		d = this.x - (t - this.x); 
		return d;
	}

	@Override
	public int posY(int t) {
		// TODO Auto-generated method stub
		return yarr;
	}

}
