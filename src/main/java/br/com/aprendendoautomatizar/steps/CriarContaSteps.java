package br.com.aprendendoautomatizar.steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import static br.com.aprendendoautomatizar.core.Driver.getDriver;

import br.com.aprendendoautomatiza.funcionalidade.AuthenticationFuncionalidade;
import br.com.aprendendoautomatiza.funcionalidade.HomeFuncionalidade;

public class CriarContaSteps {

	String url = "http://automationpractice.com/index.php";
	HomeFuncionalidade home = new HomeFuncionalidade();
	AuthenticationFuncionalidade authentication = new AuthenticationFuncionalidade();

	@Dado("^que o usuario preenche os dados$")
	public void que_o_usuario_preenche_os_dados() throws Throwable {
		getDriver().get(url);
		home.clicarBotaoSignIn();
		authentication.preencherCampoEmailAddress();
		authentication.clicarBotaoCreateAccount();
    }

	@Quando("^os dados estao corretos$")
	public void os_dados_estao_corretos() throws Throwable {

	}

	@Entao("^o usuario e cadastrado com sucesso$")
	public void o_usuario_e_cadastrado_com_sucesso() throws Throwable {

	}

}
