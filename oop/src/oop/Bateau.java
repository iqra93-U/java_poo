package oop;

public class Bateau extends Vehicule implements ActionVehicule {
	
	public Bateau() {
		super("Bateau");
		this.name = "Bateau";
		this.setName("Bateau");
	}

	@Override
	public boolean peutRouler() {
	
		return (false);
	}

	@Override
	public boolean peutVoler() {
		return (true);
	}

	@Override
	public boolean peutNaviguer() {
	
		return (false);
	}

}
