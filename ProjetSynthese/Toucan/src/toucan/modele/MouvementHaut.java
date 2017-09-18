package toucan.modele;

public class MouvementHaut extends Mouvement{
	
	public MouvementHaut (int d) {
		super(d);
		this.distance = d;
		this.tempsArr = this.tempsDepart + d;
		this.yarr = this.y - d;
		this.xarr = this.x;
		
	}


	public MouvementHaut(Mouvement mouvement, int d) {
		super( mouvement, d);

		this.x = mouvement.getXarr();
		this.xarr = this.x;
		if (mouvement.getYarr() > 0 ){
			this.y = mouvement.getYarr() - 1;
			this.yarr = this.y - d + 1;
		} else {
			this.y = 0;
			this.yarr = 0;
		}
		
	}


	@Override
	public int posX(int t) {
		return xarr;
	}

	@Override
	public int posY(int t) {
		int d = 0;
		d =  tempsDepart - t - y; 
		if (d < 0) d = 0;
		
		return d;
	}
}
