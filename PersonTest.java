/*
 * /******
Name: Gabriel Cristo
Assignment: Getting Started in Java
Date: 1/19
Notes: Tests person class 
******/
*/
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * A JUnit test class for the Person class.
 */
public class PersonTest {

  private Person john;

  @Before
  public void setUp() {

    john = new Person("john", "doe", 1989);
  }

  @Test
  public void testFirst() {
    assertEquals("john", john.getFirstName());

  }

  @Test
  public void testSecond() {
    assertEquals("doe", john.getLastName());
  }

  @Test
  public void testYearOfBirth() {
    assertEquals(1989, john.getYearOfBirth());
  }

}
