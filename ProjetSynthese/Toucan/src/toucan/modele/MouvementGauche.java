package toucan.modele;

public class MouvementGauche extends Mouvement{
	
	public MouvementGauche(int d) {
		
	}

	@Override
	public int posX(int t) {
		// TODO Auto-generated method stub
		return  x - (t - x ); 
	}

	@Override
	public int posY(int t) {
		// TODO Auto-generated method stub
		return yarr;
	}

}
