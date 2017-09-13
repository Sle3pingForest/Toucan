package toucan.modele;

public class MouvementDroite extends Mouvement{

	public MouvementDroite(int d) {
		this.distance = d;
		this.xarr = this.x + d;
	}



	public MouvementDroite(Mouvement mouvement, int d) {
		super(mouvement, d);
		this.xarr = this.x + d;
	}



	@Override
	public int posX(int t) {
		// TODO Auto-generated method stub
		int d = 0;
		
		d = x + (t - x ); 
		
		
		return d;
	}

	@Override
	public int posY(int t) {
		// TODO Auto-generated method stub
		
		
		return yarr;
	}

}
