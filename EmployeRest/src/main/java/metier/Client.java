package metier;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Client {
	private Long id;
	private String nom;
	private String prenom;
	private double montant;
	public Client(Long id, String nom, String prenom, double montant) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.montant = montant;
	}
	public Client() {
		super();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
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
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public double getMontant() {
		return montant;
	}
	public void setMontant(double montant) {
		this.montant = montant;
	}
	
	

}
