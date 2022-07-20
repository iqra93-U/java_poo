package Dao;

import Models.Restaurant;


public interface SalaireDao {

	public boolean CreateResto();
	public Restaurant ReadResto();
	public boolean UpdateResto();
	public boolean DeleteeResto();
	
	public boolean rechercheBynom(String nom , String prenom);
	public boolean rechercheSalaireByid(String id);
	
	
}
