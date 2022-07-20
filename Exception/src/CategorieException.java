
public class CategorieException extends Exception {

	public CategorieException(String msgException) {
		super("Error de categorie, votre age ne permet pas la categorie" + msgException );
	}
}
