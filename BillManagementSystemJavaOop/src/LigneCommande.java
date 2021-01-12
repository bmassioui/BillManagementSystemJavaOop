/**
 * 
 */

/**
 * @author bob
 *
 */
public class LigneCommande {
	private Facture Facture;
	private Article Article;
	private int Qte;
	public LigneCommande(Facture facture, Article article, int qte) {
		super();
		Facture = facture;
		Article = article;
		Qte = qte;
	}
	
	public double getPrixTTC() {
		return (Article.getPrixHT() * (1 + Facture.getTva() / 100)) * this.Qte;
	}
	
	public void afficher() {
		Article.afficher();
		System.out.println("\t\t" + Qte + "\t" + getPrixTTC());
	}
}
