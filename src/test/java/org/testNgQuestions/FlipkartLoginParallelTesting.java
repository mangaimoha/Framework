package org.testNgQuestions;

import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.pom.locators.LoginPojoClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipkartLoginParallelTesting extends LibGlobalClassRef {
	WebDriver driver;
	@BeforeClass
	private void start() {
		System.out.println("Started");
	}
	
	@BeforeMethod
	@Parameters("browser")
	private void before(String browser) throws InterruptedException   {
		if (browser.equals("chrome")) {
			openChrome();
			System.out.println("Chrome browser");
		}
		if (browser.equals("firefox")) {
			openFirefox();
			System.out.println("Firefox browser");
		}
		launchUrl("https://www.flipkart.com/account/login");
		Date date = new Date();
		System.out.println(date);
		}
	
	@DataProvider(name = "login_data")
	private String[][] data() {
		return new String[][] { 
			{ "abc@gmail.com", "900090000" }, 
			{ "ghjiuy", "8900000" } };
	}

	@Test(dataProvider = "login_data")
	private void tc1(String email, String pwd) throws InterruptedException {
		System.out.println(Thread.currentThread().getId());
		FlipkartLoginPojo login = new FlipkartLoginPojo();
		toFillTextBox(login.getEmail(), email);	
		toFillTextBox(login.getPassword(), pwd);
		toClick(login.getLogin());
	}

	@AfterMethod
	private void close() {
		closeBrowser();
		Date date = new Date();
		System.out.println(date);
		
	}

	@AfterClass
	private void end() {
		System.out.println("Ended");
	}
}
