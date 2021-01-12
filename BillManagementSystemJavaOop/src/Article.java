/**
 * 
 */

/**
 * @author bob
 *
 */
public class Article {
	private String Ref;
	private String Nom;
	private double PrixHT;
	public Article(String ref, String nom, double prixHT) {
		Ref = ref;
		Nom = nom;
		PrixHT = prixHT;
	}
	public String getRef() {
		return Ref;
	}
	public void setRef(String ref) {
		Ref = ref;
	}
	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		Nom = nom;
	}
	public double getPrixHT() {
		return PrixHT;
	}
	public void setPrixHT(double prixHT) {
		PrixHT = prixHT;
	}
	public void afficher() {
		System.out.print(getRef() + " " + getNom() + "\t" + getPrixHT());
	}
}
