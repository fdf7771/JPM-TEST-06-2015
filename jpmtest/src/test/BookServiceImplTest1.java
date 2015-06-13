package test;


import static org.junit.Assert.*;

import org.junit.Test;

import exercise.library.BookNotFoundException;
import exercise.library.BookServiceImpl;

public class BookServiceImplTest1  {

	/*  Acceptance criteria:
    o Input 'INVALID-TEXT' should throw an Exception, informing the client that the book isbn must begin with 'ISBN'.
    o Input 'ISBN-777' should throw BookNotFoundException.
    o Input 'ISBN-001' should return the book entitled 'Harry Potter and the Deathly Hallows'.
	 */	
	@Test(expected=Exception.class)
	  public void testretrieveBook1() throws BookNotFoundException, Exception {
		BookServiceImpl book = new BookServiceImpl();
		book.retrieveBook("INVALID-TEXT");
	}
	@Test(expected=BookNotFoundException.class)
	  public void testretrieveBook2() throws BookNotFoundException, Exception {
		BookServiceImpl book = new BookServiceImpl();
		book.retrieveBook("ISBN-777");
	  }
	@Test
	  public void testretrieveBook3() throws BookNotFoundException, Exception {
		BookServiceImpl book = new BookServiceImpl();
		
	    assertEquals("Error on ISBN-001", "Harry Potter and the Deathly Hallows", book.retrieveBook("ISBN-001").getTitle());
	  }
	  
	  
	  /* Acceptance criteria:
      o Input 'INVALID-TEXT' should throw an Exception, informing the client that the book isbn must begin with 'ISBN'.
      o Input 'ISBN-777' should throw BookNotFoundException.
      o Input 'ISBN-001' should return '[ISBN-001] Harry Potter and the Deathly Hallows - Sorcery and Magic.'
      o Input 'ISBN-002' should return '[ISBN-002] The Player of Games - Jernau Morat Gurgeh. The Player of Games. Master of every...'
      o Input 'ISBN-003' should return '[ISBN-003] Genius: Richard Feynman and Modern Physics - A brilliant interweaving of Richard Feynman's colourful life and a...'
	   */
	@Test(expected=Exception.class)
	  public void testgetBookSummary1() throws BookNotFoundException, Exception{
		  BookServiceImpl book = new BookServiceImpl();
		  book.getBookSummary("INVALID-TEXT");
	 }
	@Test(expected=BookNotFoundException.class)
	  public void testgetBookSummary2() throws BookNotFoundException, Exception{
		  BookServiceImpl book = new BookServiceImpl();
		  book.getBookSummary("ISBN-777");
	}
	@Test
	  public void testgetBookSummary3() throws BookNotFoundException, Exception{
		  BookServiceImpl book = new BookServiceImpl();
		  assertEquals("Error on ISBN-001", "[ISBN-001] Harry Potter and the Deathly Hallows - Sorcery and Magic.", book.getBookSummary("ISBN-001"));
		  assertEquals("Error on ISBN-002", "[ISBN-002] The Player of Games - Jernau Morat Gurgeh. The Player of Games. Master of every...", book.getBookSummary("ISBN-002"));
		  assertEquals("Error on ISBN-003", "[ISBN-003] Genius: Richard Feynman and Modern Physics - A brilliant interweaving of Richard Feynman's colourful life and a...", book.getBookSummary("ISBN-003"));
	  }


}