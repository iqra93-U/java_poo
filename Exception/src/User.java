
public class User {
	public String nom;
	public String prenom;
	public int age;
	public Category cat = Category.UNDEFINED;

	public User() {}
	public User (String nom , String prenom, int age) {
		this.nom = nom;
		this.prenom = prenom ; 
		this.age = age; 
		
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Category getCat() {
		return cat;
	}

	public void setCat(Category cat) {
		this.cat = cat;
	}

}
