package managedBean;

import java.util.ArrayList;
import java.util.HashMap;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import bean.Livre;
import metier.MetierCatalogue;

@ManagedBean(name = "livresEmpruntes")
@SessionScoped
public class LivresEmpruntes {

	private HashMap<Long, Boolean> checked = new HashMap<Long, Boolean>();
	private String login;
	
	public ArrayList<Livre> getLivresARendre() {
		return MetierCatalogue.getLivreEmprunte(getLogin());
	}
	
	public String getLoginValue() {
		FacesContext facesContext = FacesContext.getCurrentInstance();
		Login login = (Login) facesContext.getExternalContext().getSessionMap().get("login");
		return login.getName();
	}

	public String rendreLivres() {
		ArrayList<Livre> livres = MetierCatalogue.getCatalogue()
				.getListeLivres();
		for (Livre livre : livres) {
			if (checked.get(livre.getId()) != null && checked.get(livre.getId())) {
				livre.setEmprunteur(null);	
			}
		}
		return null;
	}
	
	public HashMap<Long, Boolean> getChecked() {
		return checked;
	}

	public void setChecked(HashMap<Long, Boolean> checked) {
		this.checked = checked;
	}

	public String getLogin() {
		return getLoginValue();
	}

	public void setLogin(String login) {
		this.login = login;
	}
}
