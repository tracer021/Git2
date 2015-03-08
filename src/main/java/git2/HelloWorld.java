package git2;

import java.util.Date;

public class HelloWorld {
	
	private String name;
	
	public String greetings() {
//		System.out.println("foo");
//		System.out.println("Hello World");
		return "Hello world. How are you?";
	}

	public Date getCurrentDate() {
		return new Date();
	}
	
	public String getLocation() {
		return "Makati";
	}

}
