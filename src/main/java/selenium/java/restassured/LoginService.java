package selenium.java.restassured;

public class LoginService {

	// Desafio - crie testes unitários para esse método de login
	public String login(String username, String password) {
		if (username == null || username.isEmpty()) {
			return "Epic sadface: Username is required";
		}

		if (username.equals("locked_out_user")) {

			return "Epic sadface: Sorry, this user has been locked out.";
		}

		if (!username.equals("standard_user") || !password.equals("secret_sauce")) {

			return "Epic sadface: Username or password is incorrect";
		}

		return "Login successful! Welcome, " + username + "!";
	}

}
