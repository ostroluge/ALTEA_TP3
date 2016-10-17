package managedBean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import metier.MetierPersonnes;

@ManagedBean(name = "inscription")
@SessionScoped
public class Inscription {

	private String nom;
	private String prenom;
	private String login;
	private String motDePasse;
	private Boolean droitImage;
	
	public Inscription() {

	}

	public void signUp() {
		MetierPersonnes.addPersonne(login, motDePasse, nom, prenom, droitImage);
	}
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getMotDePasse() {
		return motDePasse;
	}

	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}

	public Boolean getDroitImage() {
		return droitImage;
	}

	public void setDroitImage(Boolean droitImage) {
		this.droitImage = droitImage;
	}
}
