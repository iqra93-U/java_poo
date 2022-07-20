package Dao;

public interface RestaurantDao {

	public boolean CreateResto();
	public boolean ReadResto();
	public boolean UpdateResto();
	public boolean DeleteeResto();
	
	public boolean rechercheByname(String nom);
	public boolean rechercheByid(String id);
	
}
