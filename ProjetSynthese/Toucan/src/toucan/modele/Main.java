package toucan.modele;

public class Main {
	
	public static void main(String[] args) {

		Modele m = new Modele(2); 
		m.creerLesMouvements(0,Modele.SUD,5, 0, Modele.OUEST,10, 1, Modele.OUEST, 10, 1, Modele.STABLE,10);
		System.out.println(m.toString());
	}
}
