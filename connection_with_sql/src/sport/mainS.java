package sport;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.ArrayList;

public class mainS {
	
	 static List<Sport> ListSport = new ArrayList<Sport>();
	public static void main(String[] args) throws SQLException {

		Sport s1 = new Sport ( "Football", Type.EQUIPE);
		Sport s2 = new Sport ( "Natation", Type.EQUIPE);
		Sport s3 = new Sport ( "Tennis", Type.EQUIPE);
		Sport s4 = new Sport ( "Cricket", Type.EQUIPE);
		
		ListSport.add(s1); ListSport.add(s2); ListSport.add(s3); 
		
		try {
			Class.forName("org.postgresql.Driver");
			Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/sport", "usport", "usport");
			
			// prepare request 
			PreparedStatement preparedStatement = conn.prepareStatement("INSERT INTO sport(nom, type,actif,description ) VALUES (?,?,?,?)");
			
			
			// Insertion des donn�es pour la requ�te
       
            preparedStatement.setString(1, "cricket");
            preparedStatement.setString(2, Type.EQUIPE.toString());
            preparedStatement.setBoolean(3, false);
            preparedStatement.setString(4, "11 players with a bat and ball");
          
            System.out.println(preparedStatement); 
            
            
            // Execution de la requete
            
            preparedStatement.executeUpdate();

            
			// 3. Request + 4.Execution
			Statement stmt = conn.createStatement();
			ResultSet res = stmt.executeQuery("SELECT * FROM sport");

			// 5. Lire r�sultats
			while (res.next()) {
				System.out.println(res.getInt(1));
				System.out.println(res.getString(2));
				System.out.println(res.getString(3));
				System.out.println(res.getString(5));
			}

			// 6. Fermer connexion
			conn.close();

			for (int i=0; i<ListSport.size(); i++) {
				System.out.println (ListSport.get(i).getNom()  + '\n' + ListSport.get(i).getType() );
			}
			
			
			
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}

	}


}
