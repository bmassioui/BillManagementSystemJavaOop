import java.util.ArrayList;
import java.util.Collection;

/**
 * 
 */

/**
 * @author bob
 *
 */
public class Client {
	private String Nom;
	private String Adresse;
	private Collection<Facture> Factures;

	public Client(String nom, String adresse) {
		Nom = nom;
		Adresse = adresse;
		Factures = new ArrayList<Facture>();
	}

	public String getNom() {
		return Nom;
	}

	public void setNom(String nom) {
		Nom = nom;
	}

	public String getAdresse() {
		return Adresse;
	}

	public void setAdresse(String adresse) {
		Adresse = adresse;
	}

	public void afficher() {
		System.out.println("Nom\t: " + getNom());
		System.out.println("Adresse\t: " + getAdresse());
	}
}
