
import java.util.Date;
/**
 * 
 */

/**
 * @author bob
 *
 */
public class Program {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Client ahmed = new Client("Ahmed", "Kénitra");
		Article art11 = new Article("Art11", "Table", 8000);
		Article art22 = new Article("Art22", "Chaise", 300);
		
		Facture facture = new Facture(1234, "27/12/2020", 20, ahmed);
		
		LigneCommande ligne1 = new LigneCommande(facture, art11, 5);
		LigneCommande ligne2 = new LigneCommande(facture, art22, 20);
		
		facture.ajouterLigneCommande(ligne1);
		facture.ajouterLigneCommande(ligne1);
		
		facture.afficher();
	}

}
