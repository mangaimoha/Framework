package org.framework.junit;

import java.io.IOException;
import java.util.Date;

import org.demo.LibGlobalClass;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class FlipkartLogin extends LibGlobalClass {
	
	@BeforeClass
	public static  void start() {
		System.out.println("Started");
	}
	@Before
	public void loginPage() {
		openChrome();
		launchUrl("https://www.flipkart.com/account/login");
		maxWindow();
		Date date = new Date();
		System.out.println(date);		
	}
	@Test
	public void testCase1() throws IOException, InterruptedException {
		FlipkartLoginPojo login = new FlipkartLoginPojo();
		toFillTextBox(login.getEmail(),readDataFromExcel("FlipkartLogin","login",1,0));
		toFillTextBox(login.getPswd(),readDataFromExcel("FlipkartLogin","login",1,1));
		toClick(login.getLogin());
		Thread.sleep(1000);
		String url = toFetchCurrentUrl();
		System.out.println(url);
		Assert.assertTrue("Invalid Username, Password",url.equals("https://www.flipkart.com/account/login"));	
	}
	@Test
	public void testCase2() throws IOException, InterruptedException {
		FlipkartLoginPojo login = new FlipkartLoginPojo();
		toFillTextBox(login.getEmail(),readDataFromExcel("FlipkartLogin","login",2,0));
		toFillTextBox(login.getPswd(),readDataFromExcel("FlipkartLogin","login",2,1));
		toClick(login.getLogin());
		Thread.sleep(1000);
		String url = toFetchCurrentUrl();
		System.out.println(url);
		Assert.assertFalse("Valid uName,PWD",url.equals("https://www.flipkart.com/account/login"));

	}
	@Test
	public void testCase3() throws IOException, InterruptedException {
		FlipkartLoginPojo login = new FlipkartLoginPojo();
		toFillTextBox(login.getPswd(),readDataFromExcel("FlipkartLogin","login",2,1));
		toClick(login.getLogin());
		Thread.sleep(1000);
		String url = toFetchCurrentUrl();
		System.out.println(url);
		Assert.assertTrue("Invalid uName,PWD",url.equals("https://www.flipkart.com/account/login"));		
	}
	
	@After
	public void close() throws InterruptedException {
		Thread.sleep(500);
		closeBrowser();
		Date date = new Date();
		System.out.println(date );
	}
	@AfterClass
	public static  void end() {
		System.out.println("Ended");
	}


}
