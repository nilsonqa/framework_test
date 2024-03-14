package projeto.ui.metodos;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import projeto.ui.drivers.Drivers;

public class Metodos extends Drivers {

	public void escrever(By element, String texto) {
		try {
			driver.findElement(element).sendKeys(texto);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clicar(By element) {
		try {
			driver.findElement(element).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void limparCampo(By element) {
		try {
			driver.findElement(element).clear();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void duploClick(By elemento) {
		WebElement element = driver.findElement(elemento);
		Actions actions = new Actions(driver);
		actions.doubleClick(element).perform();
	}

	public void clicaESegura(By by) {
		WebElement element = driver.findElement(by);
		Actions actions = new Actions(driver);
		actions.clickAndHold(element).perform();
	}

	public void aguardarElementoSerVisivel(By by, int timeoutInSeconds) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
		wait.until(ExpectedConditions.visibilityOfElementLocated(by));
	}

	public void aguardarElementoClicavel(By by, int timeoutInSeconds) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
		wait.until(ExpectedConditions.elementToBeClickable(by));
	}

	public void submit(By element) {
		try {
			driver.findElement(element).submit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void moverParaElemento(By by) {
		WebElement element = driver.findElement(by);
		Actions actions = new Actions(driver);
		actions.moveToElement(element).perform();
	}

	public void moverEClicar(By by) {
		WebElement element = driver.findElement(by);
		Actions actions = new Actions(driver);
		actions.moveToElement(element).click().perform();
	}

	public void tab(By elemento) {
		WebElement element = driver.findElement(elemento);
		Actions actions = new Actions(driver);
		actions.sendKeys(element, "\t").perform();
	}

	public void enter(By by) {
		WebElement element = driver.findElement(by);
		Actions actions = new Actions(driver);
		actions.sendKeys(element, "\n").perform();
	}

	public void scroll(By by) {
		WebElement element = driver.findElement(by);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
	}

	public void tirarPrint(String nomeDoArquivo) {
		// Captura o screenshot como arquivo
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			// Copia o screenshot para um arquivo permanente
			File destino = new File(nomeDoArquivo + ".png");
			org.apache.commons.io.FileUtils.copyFile(screenshotFile, destino);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void validarUrl(String url) {
		try {
			assertEquals(driver.getCurrentUrl(), url);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
