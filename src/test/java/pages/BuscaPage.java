package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import runner.RunCucumberTest;

public class BuscaPage extends RunCucumberTest {


	public String nomeProduto() {
		return "Printed Chiffon Dress";
	}

	public void acessarPagina() {
		getDriver().get("http://www.automationpractice.pl/index.php");
	}

	public void busca_produto() {
		getDriver().findElement(By.id("search_query_top")).sendKeys(nomeProduto());
	}

	public void clica_busca_produto() {
		getDriver().findElement(By.cssSelector("button[type='submit']")).click();
	}

	public void resultados_retornados() {
		WebDriverWait wait = new WebDriverWait(getDriver(), 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title='" + nomeProduto() + "']")));
		getDriver().findElement(By.xpath("//a[@title='" + nomeProduto() + "']")).click();
	}

	public void confirma_busca() {
		Assert.assertTrue(getDriver().findElement(By.xpath("//a[@title='" + nomeProduto() + "']")).isDisplayed());
	}
}
