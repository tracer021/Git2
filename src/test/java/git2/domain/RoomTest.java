package git2.domain;

import static org.junit.Assert.*;

import org.junit.Test;

public class RoomTest {

	Room classUnderTest = new Room();
	
	
	@Test
	public void prepersistAssignsADateonDateCreatedProperty() {
		assertNull(classUnderTest.getDateCreated());
		classUnderTest.prePersist();
		assertNotNull(classUnderTest.getDateCreated());
		
		
	}

}
