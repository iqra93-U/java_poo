import java.util.Scanner;

public class Main  {
	public static void main (String args[]) throws CategorieException {
		
	
		Scanner users = new Scanner(System.in);
		System.out.println("write a first name");
		String Fname = users.nextLine();
		System.out.println("write a second name");
		String Sname = users.nextLine();
		System.out.println("write your age");
		int Uage = users.nextInt();
		User newuser = new User(Fname,Sname,Uage);
		
		
		try {
			System.out.println("write your category \n a. ENFANT\n b.IS_15_TO_17\n c.SENIOR");
			String Ucat = users.next();
			CheckCategorie(Uage, Ucat);
			
		}catch(CategorieException e) {
			System.out.print(e);
			
			
		}
	
		
	}
	public static void CheckCategorie(int Uage, String Ucat) throws CategorieException {
		if ((Uage >=0 && Uage<=14)&& (Ucat.equals("a"))) {		
			throw new CategorieException ("your age is  in  category enfants"+ Category.ENFANT);
		}
	}
}
