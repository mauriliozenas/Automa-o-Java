package br.com.aprendendoautomatiza.funcionalidade;

import com.github.javafaker.Faker;

import br.com.aprendendoautomatizar.pages.AuthenticationPage;

public class AuthenticationFuncionalidade {
	
	private AuthenticationPage authentication;
	Faker faker = new Faker();
	
	public AuthenticationFuncionalidade() {
		authentication = new AuthenticationPage();
	}
	
	public void preencherCampoEmailAddress() {
		authentication.getCaixaDeTextoEmailAdress().sendKeys(faker.internet().emailAddress());
	}
	
	public void clicarBotaoCreateAccount() {
		authentication.getBotaoCreateAAccount().click();
	}

}
