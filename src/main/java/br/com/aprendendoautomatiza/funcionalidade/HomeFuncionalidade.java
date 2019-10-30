package br.com.aprendendoautomatiza.funcionalidade;

import br.com.aprendendoautomatizar.pages.HomePage;

public class HomeFuncionalidade {
	
	private HomePage home;
	
	public HomeFuncionalidade() {
		home = new HomePage();
	}
	
	public void clicarBotaoSignIn() {
		home.getBotaoSigIn().click();
	}

}
