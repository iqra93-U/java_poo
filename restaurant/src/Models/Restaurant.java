package Models;

public class Restaurant {

	
	public String id;
	public String nom;
	public String adress;
	public int no_table;
	public boolean status;
	
	
	public Restaurant() {};

	public Restaurant(String id,String nom, String adress,int no_table,boolean status ) {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public int getNo_table() {
		return no_table;
	}
	
	public int getNo_salarie() {
		return no_salarie;
	}

	public void setNo_table(int no_table) {
		this.no_table = no_table;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	};
	
	public void setno_salarie(int no_salarie) {
		this.no_salarie = no_salarie;
	};
}
