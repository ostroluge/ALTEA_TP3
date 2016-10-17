package managedBean;

import java.util.Date;

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
	private Date dateDeNaissance;
	private int civilite;
	
	public Inscription() {

	}

	public void signUp() {
		MetierPersonnes.addPersonne(login, motDePasse, nom, prenom, droitImage, dateDeNaissance, civilite);
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

	public Date getDateDeNaissance() {
		return dateDeNaissance;
	}

	public void setDateDeNaissance(Date dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}

	public int getCivilite() {
		return civilite;
	}

	public void setCivilite(int civilite) {
		this.civilite = civilite;
	}
}
