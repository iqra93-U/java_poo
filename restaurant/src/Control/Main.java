package Control;
import Models.*;
import java.util.Scanner;

public class Main {
	public static void main (String args[]) {
	
		System.out.println ("Lancement de l'application Restaurant");
		
		Restaurant restaurantTable = new Restaurant();
		Employe salarie2 = new Employe();
		Employe salarie = new Employe();
		salarie.setNom("Mohammat");
		salarie2.setNom("Imen");
		
		System.out.println("write a name");
			Scanner input= new Scanner(System.in);
			String Firstname = input.nextLine();
			
		System.out.println("write a second name");
			Scanner input2= new Scanner(System.in);
			String Lastname = 	input.nextLine();
		Employe salarie3 = new Employe(Firstname,Lastname);
		
		Employe[] tabsalarie2 = new Employe[] {
                salarie,salarie2,salarie3   
        };
		
		
	}

}