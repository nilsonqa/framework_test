package projeto.ui.navegadores;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import projeto.ui.drivers.Drivers;

public class Navegadores extends Drivers {
	
	// true executa mostrando o navegador
	private final static boolean executarComNavegador =  true;

	public static void iniciarTeste() {
		ChromeOptions options = new ChromeOptions();
		if(!executarComNavegador) {
			options.addArguments("--headless"); 
		}
		options.addArguments("--start-maximized"); 
		driver = new ChromeDriver(options);
		driver.get("https://www.saucedemo.com/");
	}

	public static void finalizarTeste() {
		driver.quit();

	}

}
