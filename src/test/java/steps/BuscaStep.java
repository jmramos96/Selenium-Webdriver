package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pages.BuscaPage;
import runner.RunBase;
import runner.RunCucumberTest;


public class BuscaStep extends RunCucumberTest {

	BuscaPage busca = new BuscaPage();

	@Dado("^que eu esteja na página$")
	public void acessar_automation_practice() {
		getDriver(RunBase.Browser.Chrome);
		busca.acessarPagina();
	}

	@E("^busque por um produto$")
	public void busca_produto() {
		busca.busca_produto();
		busca.clica_busca_produto();
	}

	@Quando("^os resultados retornarem$")
	public void resultados_retornados() {
		busca.resultados_retornados();
	}

	@Então("^confirmo que a busca foi realizada$")
	public void confirma_busca() {
		busca.confirma_busca();
	}

}

