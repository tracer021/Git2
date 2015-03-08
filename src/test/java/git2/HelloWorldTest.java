package git2;
import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

public class HelloWorldTest {
	
	HelloWorld classUnderTest = new HelloWorld();
	
	@Test
	public void greetingsShouldReturnHelloWorld( ){
		assertEquals("Hello world. How are you?", classUnderTest.greetings());
	}
	
	public void getDateReturnsTheLatestDate() {
		assertNotNull(classUnderTest.getCurrentDate());
	}

}
