package org.ng.testng;

import java.io.IOException;
import java.util.Date;
import org.demo.LibGlobalClass;
import org.framework.junit.FlipkartLoginPojo;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FlipkartLogin extends LibGlobalClass {
	@BeforeClass
	private void start() {
		System.out.println("Flipkart page");
	}

	@BeforeMethod
	private void launch() {
		openChrome();
		launchUrl("https://www.flipkart.com/account/login");
		maxWindow();
		Date date = new Date();
		System.out.println("Started on : " + date);
	}

	@Test
	private void tc1() throws IOException, InterruptedException {
		FlipkartLoginPojo login = new FlipkartLoginPojo();
		toFillTextBox(login.getEmail(), readDataFromExcel("FlipkartLogin", "login", 1, 0));
		toFillTextBox(login.getPswd(), readDataFromExcel("FlipkartLogin", "login", 1, 1));
		toClick(login.getLogin());
		Thread.sleep(1000);
		String url = toFetchCurrentUrl();
		if(url.equals("https://www.flipkart.com/account/login")) {
			System.out.println("Incorrect credentials");
		}
		else {
			System.out.println("Logged in successfully !!!");
		}
	}

	@Test
	private void tc2() throws IOException, InterruptedException {
		FlipkartLoginPojo login = new FlipkartLoginPojo();
		toFillTextBox(login.getEmail(), readDataFromExcel("FlipkartLogin", "login", 2, 0));
		toFillTextBox(login.getPswd(), readDataFromExcel("FlipkartLogin", "login", 2, 1));
		toClick(login.getLogin());
		Thread.sleep(1000);
		String url = toFetchCurrentUrl();
		if(url.equals("https://www.flipkart.com/account/login")) {
			System.out.println("Incorrect credentials");
		}
		else {
			System.out.println("Logged in successfully !!!");
		}
	}

	@AfterMethod
	private void close() throws InterruptedException {
		Thread.sleep(1000);
		closeBrowser();
		Date date = new Date();
		System.out.println("Started on : " + date);
	}

	@AfterClass
	private void end() {
		System.out.println("End");
	}
}
