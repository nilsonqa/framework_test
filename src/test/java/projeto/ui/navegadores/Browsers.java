package projeto.ui.navegadores;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import projeto.ui.drivers.Drivers;

public class Browsers extends Drivers {

	private final static boolean executarComNavegador = true;

	public static void iniciarTeste() {
		if (driver == null) {
			ChromeOptions options = new ChromeOptions();
			if (!executarComNavegador) {
				options.addArguments("--headless");
			}
			options.addArguments("--start-maximized");
			driver = new ChromeDriver(options);
			driver.get("https://www.saucedemo.com/");
		}
	}

	public static void finalizarTudo() {
		if (driver != null) {
			driver.quit();
		}
	}
}