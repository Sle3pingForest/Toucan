package toucan.modele;

public class MouvementBas extends Mouvement{
	
	public MouvementBas(int d) {
		this.distance = d;
		this.yarr = this.y+ d;
	}


	public MouvementBas(Mouvement mouvement, int d) {
		super(mouvement, d);
		this.yarr = this.y + d;
	}


	@Override
	public int posX(int t) {
		return xarr;
	}

	@Override
	public int posY(int t) {
		// TODO Auto-generated method stub
		return y + t ;
	}

}
