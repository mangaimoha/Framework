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
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization extends LibGlobalClass{

	@BeforeClass
	private void start() {
		System.out.println("-----------Started-----------");
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
	
	@Parameters({"phno","password"})
	@Test
	private void login_tc1(@Optional("abcdef") String uName, @Optional("123456")String pass) {
		WebElement email = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
		toFillTextBox(email,uName);
		WebElement pwd = driver.findElement(By.xpath("//input[@type='password']"));
		toFillTextBox(pwd,pass);
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
	
}
