package Models;

public class Employe {

	public int id ; 
	public String nom ;
	public String prenom ;
	public Double salary_brut ;
	public Restaurant idresto;
	//instance of restaurant 
	// object of restaurant 
	//public String restaurant;
	
	
	public Employe() {};
	public Employe(String nom, String prenom){
		this.nom = nom;
		this.prenom = prenom;
		
	};
	public Employe(int id , String nom, String prenom , Double salary_brut) {}
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
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public Double getSalary_brut() {
		return salary_brut;
	}
	public void setSalary_brut(Double salary_brut) {
		this.salary_brut = salary_brut;
	};
	
	
	
}