import org.junit.Test;

import junit.framework.TestCase;

public class PostAndUserTest extends TestCase {

	@Test
	public void testUserConstructor() {
		User u = new User("honeydoo");

	}

	@Test
	public void testisValidUsername() throws Exception {
		// User u = new User("check2", "password");
		assertEquals("isValidUsername deoesn't work", true, User.isValidUsername("check2"));
		assertEquals("isValidUsername doesn't work", false, User.isValidUsername("@cowbaby1"));

	}
}
