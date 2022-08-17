package org.testNgQuestions;

import java.time.Duration;
import java.util.Date;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class RedBusLoginTC extends LibGlobalClassRef{	
	SoftAssert s;
	@BeforeClass
	private void start() {
		System.out.println("Started");
	}
	@BeforeMethod
	private void launch() {
		openChrome();
		launchUrl("https://www.redbus.in/");
		maxWindow();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Date date = new Date();
		System.out.println(date);
	}	
	@Test 
	private void login_bus( ) throws InterruptedException {
		s=new SoftAssert();
		RedBusLoginPojo busLogin = new RedBusLoginPojo();
		toClick(busLogin.getiIcon());
		toClick(busLogin.getSignIn());
		driver.switchTo().frame(busLogin.getFrame1());
		toFillTextBox(busLogin.getMobNum(),"9597803319");
		driver.switchTo().frame(busLogin.getFrame2());
		toClick(busLogin.getCaptcha());
		driver.switchTo().parentFrame();
		toClick(busLogin.getGenOtp());		
		Thread.sleep(30000);
		toClick(busLogin.getVerify());	
		Thread.sleep(1000);
		String url=driver.getCurrentUrl();
		s.assertTrue(url.equals("https://www.redbus.in/"), "check TC1");				
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
