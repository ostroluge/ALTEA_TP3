package bean;

import java.util.HashMap;

public class ListingEmprunteur {

	private HashMap<String, Personne> listePersonnes;

	public ListingEmprunteur() {

	}

	public HashMap<String, Personne> getListePersonnes() {
		return listePersonnes;
	}

	public void setListePersonnes(HashMap<String, Personne> listePersonnes) {
		this.listePersonnes = listePersonnes;
	}
}
