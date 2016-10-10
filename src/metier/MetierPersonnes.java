package metier;

import java.util.HashMap;

import bean.ListingEmprunteur;
import bean.Personne;

public class MetierPersonnes {

	private static ListingEmprunteur personnesInstance;
	
	public static ListingEmprunteur getPersonnes() {
		if (personnesInstance == null) {
			personnesInstance = new ListingEmprunteur();

			Personne personne1 = new Personne();
			personne1.setLogin("test");
			personne1.setPassword("test");
			personne1.setNom("Test");
			personne1.setPrenom("Test");

			Personne personne2 = new Personne();
			personne2.setLogin("root");
			personne2.setPassword("root");
			personne2.setNom("Root");
			personne2.setPrenom("Root");

			HashMap<String, Personne> listePersonne = new HashMap<String, Personne>();
			listePersonne.put(personne1.getLogin() + personne1.getPassword(),
					personne1);
			listePersonne.put(personne2.getLogin() + personne2.getPassword(),
					personne2);

			personnesInstance.setListePersonnes(listePersonne);
		}
		return personnesInstance;
	}
	
	public static Personne getPersonne(String login, String password) {
		HashMap<String, Personne> list = getPersonnes().getListePersonnes();
		for (Personne personne : list.values()) {
			if (personne.getLogin().equals(login) && personne.getPassword().equals(password)) {
				return personne;
			}
		}
		return null;
	}
}
