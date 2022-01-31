package users;

public class Employee {
private int id;
private float salaire;
private String nom,prenom;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public float getSalaire() {
	return salaire;
}
public void setSalaire(float salaire) {
	this.salaire = salaire;
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



public Employee(String nom, String prenom) {
	super();
	this.nom = nom;
	this.prenom = prenom;
}
public void gereDemande()
{
System.out.println("Gestion des demandes de: "+this.getNom());	
}
public Employee() {
	super();
}



}
