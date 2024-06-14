package selenium.java.restassured;

public class LoginService {
	
	public String login(String username, String password) {		
		if (username == null || username.isEmpty() || password == null || password.isEmpty()) {
		    return "Epic sadface: Username and password are required.";
		}
		if (username.equals("locked_out_user")) {
			return "Epic sadface: Sorry, this user has been locked out.";
		}
		
		if (!username.matches("^[a-zA-Z0-9._-]{3,20}$")) {
		    return "Epic sadface: Username must be 3-20 characters long and can contain letters, numbers, dots, hyphens, and underscores.";
		}

		if (password.length() > 15 || password.length() < 8) {
		    return "Epic sadface: Password must be at least 8 characters long.";
		}	
		if (!username.equals("e2etreinamentos") || !password.equals("e2e@1234")) {
			return "Epic sadface: Username or password is incorrect";
		}
		return "Login successful! Welcome, " + username + "!";
	}
}