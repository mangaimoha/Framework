package org.testNgQuestions;

import java.time.Duration;
import java.util.Date;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class FlipkartLoginTCs extends LibGlobalClassRef {
	
	@BeforeClass
	private void start() {
		System.out.println("Started");
	}
	@BeforeMethod
	private void launch() {
		openChrome();
		launchUrl("https://www.flipkart.com/account/login");
		maxWindow();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Date date = new Date();
		System.out.println(date);
	}	
	
	@DataProvider (name = "login_data")
	private String[][] data() {
		return new String[][] {
			{"abc@gmail.com","900090000"},
			{"ghjiuy","8900000"}
		};
	}
	
	@Test (dataProvider = "login_data")
	private void tc1(String email, String pwd) {
		FlipkartLoginPojo login = new FlipkartLoginPojo();
		toFillTextBox(login.getEmail(),email);
		toFillTextBox(login.getPassword(),pwd);
		toClick(login.getLogin());
	}

	@Parameters({"phone","password"})
	@Test
	private void tc2(String phone, String password) {
		FlipkartLoginPojo login = new FlipkartLoginPojo();
		toFillTextBox(login.getEmail(),phone);
		toFillTextBox(login.getPassword(),password);
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
