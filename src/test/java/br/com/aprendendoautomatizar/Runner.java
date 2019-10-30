package br.com.aprendendoautomatizar;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import br.com.aprendendoautomatizar.core.Driver;

@RunWith(Cucumber.class)
@CucumberOptions(glue = { "br.com.aprendendoautomatizar.steps" }, features = {
		"src/main/java/br/com/aprendendoautomatizar/feature" }, plugin = { "pretty",
				"html:Reports/cucumber" }, tags = { "~@ignore", "@geral" })

public class Runner {
	
	@AfterClass
	public static void encerraTeste() {
	  //Driver.encerraDriver();
	}
	
	

}
