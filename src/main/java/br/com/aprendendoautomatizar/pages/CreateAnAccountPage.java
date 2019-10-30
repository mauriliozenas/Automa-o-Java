package br.com.aprendendoautomatizar.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import br.com.aprendendoautomatizar.core.BasePage;

public class CreateAnAccountPage extends BasePage {

	@FindBy(id = "id_gender1")
	WebElement botaoGender;

	@FindBy(id = "customer_firstname")
	WebElement campoFirstName;

	@FindBy(id = "customer_lastname")
	WebElement campoLastName;

	@FindBy(id = "passwd")
	WebElement campoPassword;

	@FindBy(id = "days")
	WebElement campoDate;

	@FindBy(id = "months")
	WebElement campoMonths;

	@FindBy(id = "years")
	WebElement campoYears;

	@FindBy(id = "firstname")
	WebElement campoFirtsNameAddress;

	@FindBy(id = "lastname")
	WebElement campoLastNameAddress;

	@FindBy(id = "address1")
	WebElement campoAddress;

	@FindBy(id = "city")
	WebElement campoCity;

	@FindBy(id = "id_state")
	WebElement campoState;

	@FindBy(id = "id_country")
	WebElement campoCountry;

	@FindBy(id = "phone_mobile")
	WebElement campoPhone;

	@FindBy(id = "alias")
	WebElement campoMyAddress;

}
