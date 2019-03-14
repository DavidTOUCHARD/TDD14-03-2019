package eu.ensup.testunitaire.domaine;

public class Etudiant {

	int id;
	String nom;
	String prenom;
	String email;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	@Override
	public String toString() {
		return "Etudiant [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", email=" + email + "]";
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Etudiant(int id, String nom, String prenom, String email) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
	}
	public Etudiant(String nom, String prenom, String email) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
	}

	@Override
	public boolean equals(Object obj) {
		Etudiant etu = (Etudiant) obj;

		if (this.id == etu.id && this.nom.equals(etu.nom) && this.prenom.equals(etu.prenom) && this.email.equals(etu.email))
			return true;
		else 
			return false;

		// type casting of the argument.
		
		// comparing the state of argument with
		// the state of 'this' Object.
		//return (etu.nom == this.nom && etu.id == this.id);
	}

}
