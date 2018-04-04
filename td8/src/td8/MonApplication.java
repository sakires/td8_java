package td8;

import java.awt.image.SinglePixelPackedSampleModel;
import java.util.Set;
import java.util.TreeSet;

public class MonApplication {

	public static void main(String[] args) {
		final Etudiant jean = new Etudiant("Dupont", "Jean", 125);
		final Etudiant gabrielle = new Etudiant("Delacroix", "Gabrielle", 125);
		
		final Set<Etudiant> ensemble = new TreeSet<Etudiant>();
		ensemble.add(jean);
		ensemble.add(gabrielle);
		System.out.println(ensemble.size());
		System.out.println(ensemble);
		System.out.println(jean.equals(gabrielle));
		try {
			System.out.println(jean.compareTo("gabrielle"));
		} catch (ClassCastException e) {
			System.err.println("erreur objet different ");
		}
		catch (NullPointerException e) {
			System.err.println("erreur objet null");
		}
	}

}
