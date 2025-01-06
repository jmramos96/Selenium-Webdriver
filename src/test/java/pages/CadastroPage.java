package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import runner.RunCucumberTest;
import support.Utils;

public class CadastroPage extends RunCucumberTest {

	private By create_email_field = By.id("email_create");
	private By create_password_field = By.id("passwd");

	public void acessarPagina() {
		getDriver().get("http://www.automationpractice.pl/index.php?controller=authentication&back=my-account");
		Assert.assertTrue(getDriver().findElement(By.className("page-heading")).isDisplayed());
	}

	public void InsereEmail() {
		getDriver().findElement(create_email_field).sendKeys(Utils.Email_Aleatorio());
	}

	public void primeiroNome() {
		getDriver().findElement(By.id("customer_firstname")).sendKeys("Jonathan");
	}

	public void segundoNome() {
		getDriver().findElement(By.id("customer_lastname")).sendKeys("Ramos");
	}

	public void senha() {
		getDriver().findElement(create_password_field).sendKeys("12345");
	}
}
