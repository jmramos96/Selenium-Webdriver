package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.CadastroPage;
import runner.RunBase;
import runner.RunCucumberTest;


public class CriaContaStep extends RunCucumberTest {

	CadastroPage cadastra = new CadastroPage();

	@Dado("^que eu esteja na página de autenticação do automation practice$")
	public void acessar_automation_practice() {
		getDriver(RunBase.Browser.Chrome);
		cadastra.acessarPagina();
	}

	@E("^insiro meu e-mail cadastrado$")
	public void insiro_meu_e_mail() {
		cadastra.InsereEmail();
	}

	@E("^clico em criar uma conta$")
	public void clico_em_criar_uma_conta() {
		getDriver().findElement(By.id("SubmitCreate")).click();
	}

	@E("^informo meu primeiro nome$")
	public void informo_meu_primeiro_nome() {
		WebDriverWait wait = new WebDriverWait(getDriver(), 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("customer_firstname")));
		cadastra.primeiroNome();
	}

	@E("^informo o meu último nome$")
	public void informo_o_meu_último_nome() {
		cadastra.segundoNome();
	}

	@E("^insiro uma senha$")
	public void insiro_uma_senha() {
		cadastra.senha();
	}

	@Quando("^eu clicar em Registrar$")
	public void eu_clicar_em_Registrar() {
		getDriver().findElement(By.id("submitAccount")).click();
	}

	@Então("^devo ser logado na minha conta$")
	public void devo_ser_logado_na_minha_conta() {
		Assert.assertTrue(getDriver().findElement(By.className("alert-success")).isDisplayed());
	}

}
