package br.com.aprendendoautomatizar.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import br.com.aprendendoautomatizar.core.BasePage;
import br.com.aprendendoautomatizar.core.Driver;

public class AuthenticationPage extends BasePage {
	
	
	@FindBy(css = "#email_create")
	WebElement caixaDeTextoEmailAdress;

	@FindBy(name = "SubmitCreate")
	WebElement botaoCreateAAccount;

	public AuthenticationPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	
	public WebElement getCaixaDeTextoEmailAdress() {
		return caixaDeTextoEmailAdress;
	}

	public void setCaixaDeTextoEmailAdress(WebElement caixaDeTextoEmailAdress) {
		this.caixaDeTextoEmailAdress = caixaDeTextoEmailAdress;
	}

	public WebElement getBotaoCreateAAccount() {
		return botaoCreateAAccount;
	}

	public void setBotaoCreateAAccount(WebElement botaoCreateAAccount) {
		this.botaoCreateAAccount = botaoCreateAAccount;
	}

}
