package git2;
import static org.junit.Assert.*;

import org.junit.Test;

public class HelloWorldTest {
	
	HelloWorld classUnderTest = new HelloWorld();
	
	@Test
	public void greetingsShouldReturnHelloWorld( ){
		assertEquals("Hello World", classUnderTest.greetings());
	}

}
