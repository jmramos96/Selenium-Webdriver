package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import runner.RunCucumberTest;

import static support.Utils.gerarCor;
import static support.Utils.gerarSize;

public class CheckoutPage extends RunCucumberTest {

	BuscaPage busca = new BuscaPage();

	public void Seleciona_produto() {
		busca.acessarPagina();
		busca.busca_produto();
		busca.clica_busca_produto();
		busca.resultados_retornados();
	}

	public void seleciona_var() {
		WebDriverWait wait = new WebDriverWait(getDriver(), 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("add_to_cart")));

		// Seleciona o tamanho
		WebElement selectElement = getDriver().findElement(By.id("group_1"));
		Select select = new Select(selectElement);
		select.selectByValue(String.valueOf(gerarSize()));

		// Seleciona a cor
		String cor = gerarCor();
		WebElement selectElements = getDriver().findElement(By.id(cor));
		selectElements.click();
	}

	public void Adiciona_Carrinho() {
		// Clica no botão de adicionar ao carrinho
		getDriver().findElement(By.id("add_to_cart")).click();
	}

	public void Confirma_Carrinho() {
		WebDriverWait wait = new WebDriverWait(getDriver(), 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("cross")));
		Assert.assertTrue(getDriver().findElement(By.className("cross")).isDisplayed());

	}
}