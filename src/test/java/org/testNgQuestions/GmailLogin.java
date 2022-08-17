package org.testNgQuestions;

import java.util.Date;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GmailLogin extends LibGlobalClassRef{
	
	@BeforeMethod
	private void start() {
		openChrome();
		launchUrl("https://mail.google.com/");
		maxWindow();
		Date date = new Date();
		System.out.println(date);
	}
	
	@Parameters({"email2","password"})
	@Test
	private void login_tc1(@Optional("abc@gmail.com")String email, @Optional("123")String password) 
			throws InterruptedException {
		GmailLoginPojo login = new GmailLoginPojo();
		toFillTextBox(login.getEmail(),email);
		toClick(login.getNextBtn());
		Thread.sleep(1000);
		toFillTextBox(login.getPassword(),password);
	}
	
	@AfterMethod
	private void end() {
		closeBrowser();
		Date date = new Date();
		System.out.println(date);
	}

}
