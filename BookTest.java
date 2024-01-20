/*
 * /******
Name: Gabriel Cristo
Assignment: Getting Started in Java
Date: 1/19
Notes: Tests book class 
******/
 */
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.jupiter.api.Test;

class BookTest {

	private Book book;
  	private Person person;
  		
  	  @Before
  	  public void setUp() {
  		  	person = new Person("john", "doe", 1989);
  		  	book = new Book("Moby Dick", person, 19.99f);
  	  }

	  @Test
	  public void testTitle() {
		  book = new Book("Moby Dick", person, 19.99f);
		  	if(book == null) {
		  		System.out.println("Book is null!");
		  		fail();
		  	}
	    	assertTrue("Moby Dick".equals(book.getTitle()));
	  }

	  @Test
	  public void testAuthor() {
		  book = new Book("Moby Dick", person, 19.99f);
		  	if(book == null) {
		  		System.out.println("Book is null!");
		  		fail();
		  	}
	    	assertTrue(person == book.getAuthor());
	  }

	  @Test
	  public void testPrice() {
		  book = new Book("Moby Dick", person, 19.99f);
		  	if(book == null) {
		  		System.out.println("Book is null!");
		  		fail();
		  	}
	    	assertTrue(19.99f == book.getPrice());
	  }
 
}
