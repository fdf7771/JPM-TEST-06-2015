/**
 * 
 */
package exercise.library;

/**
 * @author FDF
 *
 * Utility class, not meaningful for this exercise, 
 * used to centralize project utilities so to ease
 * Maintenance and avoid redundant code.
 * Checks isbn variable
 * throw exception if variable is null, empty or does
 * not start with provided check string.
 * 
 * @param isbn reference
 * @return exception if input in incorrect
 */

public class BookServiceUtils {

	/**
	 * comparison string
	 * 
	 */
	private final static String checkString ="ISBN-";

	public static void checkIsbn(String isbn) throws Exception{
		boolean passed=false;
		if(!isbn.isEmpty() && isbn!=null){
			/**
			 * the trim is just to highlight that input data consistency
			 * has to be checked somehow, usually before reaching the
			 * backend
			 */
			isbn=isbn.trim();
			if(isbn.startsWith(checkString)){
				passed=true;
			}
		}
		if(!passed){
			throw new Exception("Provided isbn reference does not start with 'ISBN-'.");
		}
	}
}
