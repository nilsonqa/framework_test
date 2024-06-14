package projeto.ui.steps;

import io.cucumber.java.After;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import projeto.ui.navegadores.Browsers;
import projeto.ui.pages.LoginPage;

public class LoginTest {

	LoginPage lPage = new LoginPage();

	String username = "standard_user";
	String password = "secret_sauce";
	
	@After
	public void encerrarTest() {
		Browsers.finalizarTudo();
	}

	@Dado("que esteja na tela de login")
	public void queEstejaNaTelaDeLogin() {
		Browsers.iniciarTeste();
	}

	@Quando("enviar os dados de acesso")
	public void enviarOsDadosDeAcesso() {
		lPage.login(username, password);
	}

	@Entao("usuario acessa pagina logado")
	public void usuarioAcessaPaginaLogado() {
		lPage.validoUsuarioLogado();
	}


}
