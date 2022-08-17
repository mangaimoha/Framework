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
import org.pom.locators.HotelLoginPojoClass;

public class AdactInJunit extends LibGlobalClass{
	@BeforeClass
	public static void start() {
		System.out.println("Starts");
	}
	@Before
	public void launchBrowser() {
		openChrome();
		launchUrl("https://adactinhotelapp.com/");
		maxWindow();
		Date date= new Date();
		System.out.println(date);
	}
	@Test
	public void login_tc1() throws IOException, InterruptedException {
		HotelLoginPojoClass login = new HotelLoginPojoClass();
		toFillTextBox(login.getUserName(),readDataFromExcel("AdactInHotel","login",1,0));
		toFillTextBox(login.getPassword(),readDataFromExcel("AdactInHotel","login",1,1));
		toClick(login.getBtnLogin());	
		Thread.sleep(1000);
		String url = toFetchCurrentUrl();
		Assert.assertFalse("Check for valid UserName Password",url.equals("https://adactinhotelapp.com") );
		RunAllAdactInApp runAll = new RunAllAdactInApp();
		runAll.tcResult();
		
	}
	
	@Test
	public void login_tc2() throws IOException, InterruptedException {
		HotelLoginPojoClass login = new HotelLoginPojoClass();
		toFillTextBox(login.getUserName(),readDataFromExcel("AdactInHotel","login",2,0));
		toFillTextBox(login.getPassword(),readDataFromExcel("AdactInHotel","login",2,1));
		toClick(login.getBtnLogin());	
		Thread.sleep(1000);
		String url = toFetchCurrentUrl();
		Assert.assertEquals("Check for Invalid UserName Password","https://adactinhotelapp.com/",url );
	}
	@After
	public void quit() throws InterruptedException {
		Thread.sleep(500);
		closeBrowser();
		Date date= new Date();
		System.out.println(date);		
	}
	@AfterClass
	public static void end() {
		System.out.println("ends");
	}
}
