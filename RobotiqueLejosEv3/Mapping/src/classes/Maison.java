package classes;


public class Maison {

	private Point point;
	private int couleur;
	
	public Maison(Point point, int couleur) {
		this.point = point;
		this.couleur = couleur;
	}
	public Point getPoint() {
		return point;
	}
	public void setPoint(Point point) {
		this.point = point;
	}
	public int getCouleur() {
		return couleur;
	}
	public void setCouleur(int couleur) {
		this.couleur = couleur;
	}
	
	
}
