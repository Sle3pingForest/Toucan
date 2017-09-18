package toucan.modele;

public class MouvementBas extends Mouvement{
	
	public MouvementBas(int d) {
		super(d);
		this.distance = d;
		this.tempsArr = this.tempsDepart + d;
		this.yarr = this.y + d;
		this.xarr = this.x;
	}


	public MouvementBas(Mouvement mouvement, int d) {
		super(mouvement, d);
		this.x = mouvement.getXarr();
		this.y = mouvement.getYarr() + 1;
		this.xarr = mouvement.getXarr();
		this.yarr = this.y + d - 1;
	}

	/**
	 * Retourne la position x d une case par rapport au temps t
	 */
	@Override
	public int posX(int t) {
		return xarr;
	}

	/**
	 * Retourne la position y d une case par rapport au temps t
	 */
	@Override
	public int posY(int t) {
		int d = 0 ; 	
		d = t - tempsDepart + y ; 
		
		return d;
	}

}
