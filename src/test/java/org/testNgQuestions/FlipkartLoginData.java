package org.testNgQuestions;

import java.util.Date;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class FlipkartLoginData extends LibGlobalClassRef {
	
	SoftAssert s;
	@BeforeMethod
	private void start() {
		openChrome();
		launchUrl("https://www.flipkart.com/account/login");
		maxWindow();
		Date date = new Date();
		System.out.println(date);
	}	
	@DataProvider(name="Authentication")
	private String[][] credentials() {
		return new String[][] {
			{"mangaimanivel","123456"},
			{"9597803319","Hermone"},
			{"mangai","78945"}};
	}	
	@Test(dataProvider="Authentication")
	private void login_tc1(String email, String pass) throws InterruptedException {
		FlipkartLoginPojo login = new FlipkartLoginPojo();
		toFillTextBox(login.getEmail(),email);
		toFillTextBox(login.getPassword(),pass);
		toClick(login.getLogin());
		Thread.sleep(2000);
		String url= driver.getCurrentUrl();
		System.out.println(url);
		s=new SoftAssert();
		s.assertTrue(url.equals("https://www.flipkart.com/account/login"),"check tc1");
		s.assertAll();
	}	
	@AfterMethod
	private void end() {
		closeBrowser();
		Date date = new Date();
		System.out.println(date);
	}

}
