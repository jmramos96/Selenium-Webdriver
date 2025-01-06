package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pages.CheckoutPage;
import runner.RunBase;
import runner.RunCucumberTest;


public class CheckoutStep extends RunCucumberTest {

	CheckoutPage finaliza = new CheckoutPage();

	@Dado("^que eu acesso a página do produto$")
	public void Busca_Produto() {
		getDriver(RunBase.Browser.Chrome);
		finaliza.Seleciona_produto();
	}

	@Quando("^escolho a variedade do produto$")
	public void Escolha_Produto() {
		finaliza.seleciona_var();
	}

	@Então("^adiciono no carrinho$")
	public void Adiciona_No_Carrinho() {
		finaliza.Adiciona_Carrinho();
	}

	@E("^confirmo se o item foi para o carrinho$")
	public void Confirma_O_Carrinho() {
		finaliza.Confirma_Carrinho();
	}

}
