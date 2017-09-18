package toucan.modele;

public class MouvementStable extends Mouvement {
	
	protected MouvementStable(int d) {
		super(d);
		this.distance = d;
		this.tempsArr =  d ;
		this.xarr = this.x;
		this.yarr = this.y;
	}

	protected MouvementStable(Mouvement m, int d) {
		super(m, d);
		this.x = m.getXarr();
		this.xarr = this.x ;
		this.y = m.getYarr();
		this.yarr = this.y;
	}

	@Override
	public int posX(int t) {
		xarr = 0;
		return xarr;
	}

	@Override
	public int posY(int t) {
		yarr = 0;
		return yarr;
	}

}
