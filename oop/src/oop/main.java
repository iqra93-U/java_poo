package oop;

public class main {
	public static void main(String args[]) {
		Voiture car = new Voiture();
		System.out.println(car.getName());
		if(car.peutRouler()) {
			System.out.println("oui il peux rouler");
		}
		if(car.peutVoler()) {
			System.out.println("oui il peux voler");
		}
		if(car.peutNaviguer()) {
			System.out.println("oui il peux naviguer");
		}
		Bateau ship = new Bateau();
		System.out.println(ship.getName());
		if(ship.peutNaviguer()) {
			System.out.println("oui il peux naviguer");
		}
		if(ship.peutVoler()) {
			System.out.println("oui il peux naviguer");
		}
		if(ship.peutRouler()) {
			System.out.println("oui il peux rouler");
		}
		
		
	}

}
