package managedBean;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import bean.Livre;
import metier.MetierCatalogue;

@ManagedBean (name="listeLivres")
@SessionScoped
public class ListeLivres {
	
	public ArrayList<Livre> getLivres() {
		return MetierCatalogue.getLivreNonEmprunte();
	}

	public ArrayList<Livre> getLivresARendre() {
		return MetierCatalogue.getLivresEmpruntes();
	}
}
