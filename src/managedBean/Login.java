package managedBean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import bean.Personne;
import metier.MetierPersonnes;

@ManagedBean (name="login")
@SessionScoped
public class Login {

	private String name;
	private String password;
	
	public Login() {
	
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String logUser() {
		Personne personne = MetierPersonnes.getPersonne(this.name, this.password);
		if (personne == null) {
			return "Rejected";
		}
		return "Accepted";
	}

	public Personne getPersonne() {
		Personne personne = MetierPersonnes.getPersonne(this.name, this.password);
		if (personne != null) {
			return personne;
		}
		return null;
	}
}
