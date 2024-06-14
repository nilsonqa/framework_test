package projeto.ui.pages;

import projeto.ui.elementos.ElementsLogin;
import projeto.ui.metodos.Methods;

public class LoginPage {

	
	Methods metodo = new Methods();
	ElementsLogin elLogin = new ElementsLogin();
	
	/**
	 * Realizar o login do usuário informando o username e password
	 * @param username
	 * @param password
	 * @author E2E Treinamentos
	 */
	public void login(String username, String password) {
		metodo.escrever(elLogin.username, username);
		metodo.escrever(elLogin.password, password);
		metodo.tirarPrint("LoginUsuarioValido", "loginUsuario");
		metodo.clicar(elLogin.btnLogin);
	}
	
	public void validoUsuarioLogado() {
		metodo.validarUrl("https://www.saucedemo.com/inventory.html");
		metodo.tirarPrint("LoginUsuarioValido","validoUsuarioLogado");
	}
		
	
}
