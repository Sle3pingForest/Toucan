package toucan.modele;

public class MouvementGauche extends Mouvement{
	
	public MouvementGauche(int d) {
		this.distance = d;
		this.xarr = this.x - d;
		
	}
	
	public MouvementGauche(Mouvement m, int d){
		super(m,d);
		this.xarr = this.x - d;
		
	}

	@Override
	public int posX(int t) {
		return  x - (t - x ); 
	}

	@Override
	public int posY(int t) {
		// TODO Auto-generated method stub
		return yarr;
	}

}
