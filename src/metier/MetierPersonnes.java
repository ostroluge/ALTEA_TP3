package metier;

import java.util.Date;
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
			personne2.setDroitImage(true);

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

	public static void addPersonne (String login, String password, String nom, String prenom, boolean droitImage, Date dateDeNaissance, int civilite) {
	    Personne newPersonne = new Personne();
	    newPersonne.setLogin(login);
	    newPersonne.setNom(nom);
	    newPersonne.setPassword(password);
	    newPersonne.setPrenom(prenom);
	    newPersonne.setDroitImage(droitImage);
	    newPersonne.setDateDeNaissance(dateDeNaissance);
	    newPersonne.setCivilite(civilite);
	    getPersonnes().getListePersonnes().put(login + password, newPersonne);
	}

	public static boolean loginExisteDeja(String login) {
		HashMap<String, Personne> list = getPersonnes().getListePersonnes();
		for (Personne personne : list.values()) {
			if (personne.getLogin().equals(login)) {
				return true;
			}
		}
		return false;
	}
}
