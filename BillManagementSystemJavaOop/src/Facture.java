import java.util.ArrayList;
import java.util.Collection;
/**
 * 
 */

/**
 * @author bob
 *
 */
public class Facture {
	private long num;
	private String Date;
	private double Tva;
	private Client Client;
	private Collection<LigneCommande> lignes;

	public Facture(long num, String date, double tva, Client client) {
		super();
		this.num = num;
		Date = date;
		Tva = tva;
		Client = client;
		this.lignes = new ArrayList<LigneCommande>();
	}

	public void ajouterLigneCommande(LigneCommande ligne) {
		this.lignes.add(ligne);
	}

	public double getTva() {
		return this.Tva;
	}

	public double getTotal() {
		double total = 0.0;
		for (LigneCommande c : this.lignes) {
			total += c.getPrixTTC();
		}
		return total;
	}

	public void afficher() {
		System.out.println("Num\t: " + num + "\t\t\tDate\t:" + Date);
		Client.afficher();
		System.out.println("\t\t\t\tTVA\t:" + Tva);
		System.out.println("---------------------------------------------------");
		System.out.println("Désignation\tPrix HT\t\tQte\tPrix TTC");
		System.out.println("---------------------------------------------------");
		for (LigneCommande c : lignes) {
			c.afficher();
		}
		System.out.println("---------------------------------------------------");
		System.out.println("\t\t\t\tTotal\t:" + getTotal());
		System.out.println("---------------------------------------------------");
	}
}
