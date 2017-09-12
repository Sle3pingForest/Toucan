package toucan.modele;

public abstract class Mouvement {
	
	int distance;
	int tempsDepart;
	int tempsArr;
	int x;
	int y;
	int xarr;
	int yarr;
	
	protected Mouvement(){
		distance = 0;
		tempsDepart = 0;
		tempsArr = 0;
		x = 0;
		y = 0;
		xarr = 0;
		yarr = 0;
	}
	
	 protected Mouvement(Mouvement m ,int d) {
		distance = m.getDistance();
		tempsDepart = m.getTempsArr() + 1;
		tempsArr = tempsDepart + d;
		x = m.getXarr();
		y = m.getYarr();
	}
	
	public int getTempsDepart() {
		return tempsDepart;
	}

	public void setTempsDepart(int tempsDepart) {
		this.tempsDepart = tempsDepart;
	}

	public int getTempsArr() {
		return tempsArr;
	}

	public void setTempsArr(int tempsArr) {
		this.tempsArr = tempsArr;
	}

	public  abstract int posX(int t);
	
	public abstract int posY(int t);
	

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getXarr() {
		return xarr;
	}

	public void setXarr(int xarr) {
		this.xarr = xarr;
	}

	public int getYarr() {
		return yarr;
	}

	public void setYarr(int yarr) {
		this.yarr = yarr;
	}

}
