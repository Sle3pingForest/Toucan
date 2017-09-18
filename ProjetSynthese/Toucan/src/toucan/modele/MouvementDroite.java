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
		this.x = mouvement.getXarr() + 1;
		this.xarr = this.x + d - 1;
		this.y = mouvement.getYarr();
		this.yarr = this.y;
	}


	/**
	 * Retourne la position x d une case par rapport au temps t
	 */
	@Override
	public int posX(int t) {
		int d = 0;
		d = t - tempsDepart + x; 
		
		return d;
	}

	/**
	 * Retourne la position y d une case par rapport au temps t
	 */
	@Override
	public int posY(int t) {
		if( yarr < 0 ) {
			this.yarr = 0;
		}
		return yarr;
	}

}
