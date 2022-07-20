package Dao;

public class DaoImplSalaire implements SalaireDao  {

	private static final String ADD_SQL = "INSERT INTO employe(DEFAULT,nom,prenom,salary_brut,idresto)Values(?,?,?,?,?,?)";
}
