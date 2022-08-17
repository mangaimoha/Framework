package org.ng.testng;

import java.time.Duration;
import java.util.Date;

import org.demo.LibGlobalClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNgDataProvider extends LibGlobalClass {

	@BeforeClass
	private void start() {
		System.out.println("-----------Started-----------");
	}

	@BeforeMethod
	private void launch() {
		openChrome();		
		launchUrl("https://www.flipkart.com/account/login");
		maxWindow();
		Date date = new Date();
		System.out.println(date);
	}

	@Test (dataProvider="login")
	private void login_tc1(String uName, String pass) throws InterruptedException {		
		WebElement email = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
		toFillTextBox(email, uName);
		WebElement pwd = driver.findElement(By.xpath("//input[@type='password']"));
		toFillTextBox(pwd, pass);
		WebElement login = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		toClick(login);
	}

	@AfterMethod
	private void close() {
		closeBrowser();
		Date date = new Date();
		System.out.println(date);
	}

	@AfterClass
	private void end() {
		System.out.println("-----------Started-----------");
	}

	@DataProvider(name = "login")
	private String[][] dp1() {

		return new String[][] {
			//{}, -- method mismatch exception
				{ "abc@gmail.com", "1234" },
				{ "9597803319", "Perumal@Murugan123" }, 
				{ "mangaimanivel", "12345666" },
				{"",""}
				};
	}

}