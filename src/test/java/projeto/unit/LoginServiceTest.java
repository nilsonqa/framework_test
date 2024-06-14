package projeto.unit;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import selenium.java.restassured.LoginService;

public class LoginServiceTest {

	  private LoginService loginService;

	    @Before
	    public void setUp() {
	        loginService = new LoginService();
	    }

	    @Test
	    public void testLoginWithNullUsername() {
	        String result = loginService.login(null, "some_password");
	        assertEquals("Epic sadface: Username and password are required.", result);
	    }

	    @Test
	    public void testLoginWithEmptyUsername() {
	        String result = loginService.login("", "some_password");
	        assertEquals("Epic sadface: Username and password are required.", result);
	    }

	    @Test
	    public void testLoginWithNullPassword() {
	        String result = loginService.login("standard_user", null);
	        assertEquals("Epic sadface: Username and password are required.", result);
	    }

	    @Test
	    public void testLoginWithEmptyPassword() {
	        String result = loginService.login("standard_user", "");
	        assertEquals("Epic sadface: Username and password are required.", result);
	    }

	    @Test
	    public void testLoginWithInvalidCredentials() {
	        String result = loginService.login("wrong_user", "wrong_password");
	        assertEquals("Epic sadface: Username or password is incorrect", result);
	    }

	    @Test
	    public void testLoginWithLockedOutUser() {
	        String result = loginService.login("locked_out_user", "secret_sauce");
	        assertEquals("Epic sadface: Sorry, this user has been locked out.", result);
	    }

	    @Test
	    public void testLoginWithInvalidUsernameFormat() {
	        String result = loginService.login("invalid@username", "secret_sauce");
	        assertEquals("Epic sadface: Username must be 3-20 characters long and can contain letters, numbers, dots, hyphens, and underscores.", result);
	    }

	    @Test
	    public void testLoginWithShortPassword() {
	        String result = loginService.login("standard_user", "short");
	        assertEquals("Epic sadface: Password must be at least 8 characters long.", result);
	    }

	    @Test
	    public void testLoginWithCorrectCredentials() {
	        String result = loginService.login("e2etreinamentos", "e2e@1234");
	        assertEquals("Login successful! Welcome, e2etreinamentos!", result);
	    }
}
