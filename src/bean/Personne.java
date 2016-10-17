package bean;

import java.util.Date;

public class Personne {

	private String nom;
	private String prenom;
	private String login;
	private String password;
	private Boolean droitImage;
	private Date dateDeNaissance;
	
	public Personne() {

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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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
}
