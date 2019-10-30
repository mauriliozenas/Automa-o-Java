package br.com.aprendendoautomatizar.core;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public final class Driver {

	private static WebDriver driver;

	private Driver() {

	}

	public static WebDriver getDriver() {

		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "/src/main/resources/chromedriver.exe");
		if (driver == null) {
			driver = new ChromeDriver();
			driver.manage().window().maximize();

		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
		

	}
	
	public static WebDriver encerraDriver() {
		if(driver!=null) {
			driver.quit();
		}
		return driver;
		
	}

}
