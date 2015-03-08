package git2;

public class HelloWorldTest {
	
	HelloWorld classUnderTest = new HelloWorld();
	
	public void greetingsShouldReturnHelloWorld( ){
		assertEquals("Hello World", classUnderTest.greetings());
	}

}
