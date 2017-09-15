package toucan.modele;

public class MouvementDroite extends Mouvement{

	public MouvementDroite(int d) {
		super(d);
		this.distance = d;
		this.tempsArr = this.tempsDepart + d;
		this.xarr = this.x + d;
		this.yarr = this.y;
	}



	public MouvementDroite(Mouvement mouvement, int d) {
		super(mouvement, d);
		this.xarr = this.x + d;
		this.yarr = this.y;
	}



	@Override
	public int posX(int t) {
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
