package exercise.library;

/**
 * @author FDF
 * 
 * Implementation of book services
 *
 */
public class BookServiceImpl implements BookService {

	/**
	 *  @author FDF
	 *  Retrieve a book details from a provided isbn id
	 *  
	 * @param isbn reference id
	 * @return a book object
	 * @see Book.java
	 */
		/*	Requirements:
	      o Should retrieve a book by its ISBN
	      o Should ensure that the isbn is prefixed by 'ISBN-'
	      o Should throw a BookNotFoundException where appropriate
		 */	  
	public Book retrieveBook(String isbn) throws BookNotFoundException, Exception{
		BookServiceUtils.checkIsbn(isbn);
		Book book=null;
		BookRepositoryImpl bookRepo = new BookRepositoryImpl();
		try{
			book=bookRepo.retrieveBook(isbn);
		} catch (Exception e){
			System.out.println(e.toString());
		}
		if(book == null){
			throw new BookNotFoundException("Book associated with ISBN: "+ isbn +" not found.");
		}
		return book;
	}
	
	/**
	 *  @author FDF
	 *  Retrieve a book details from a provided isbn id
	 *  
	 * @param isbn reference id
	 * @return a book summary defined by provided rules
	 * @see Book.java
	 */
	 /*Requirements:
	      o Should ensure that the isbn is prefixed by 'ISBN-'
	      o Should throw a BookNotFoundException where appropriate
	      o Should provide a book summary that concatenates the isbn, the title, and the first ten words of the review
	        followed by '...'
		*/	
    public String getBookSummary(String isbn) throws BookNotFoundException, Exception{
    	String result="";
    	String[] result2=null;
    	int limit=10;
    	BookServiceImpl bookRepo = new BookServiceImpl();
    	Book book=bookRepo.retrieveBook(isbn);
    	result="["+book.getIsbn()+"] ";
    	result=result.concat(book.getTitle())+" -";
    	result2=book.getDescription().split(" ") ;
    	if(result2.length >10){
    		for(int i=0;i<limit;i++){
        		result=result.concat(" "+result2[i]);  
        	}
    		result=result.concat("..."); 
    	} else {    		
        	result=result.concat(" "+book.getDescription());    		
    	}
    	//TODO LOG
    	return result;
    }
}
