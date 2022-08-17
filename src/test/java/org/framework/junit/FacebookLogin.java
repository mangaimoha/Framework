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

public class FacebookLogin extends LibGlobalClass {		
	@BeforeClass 
	public static void stepOne() {
		System.out.println("Started");
	}	
	@Test
	public  void testCase1() throws IOException, InterruptedException{		
		FacebookLoginPojoJunit  login=new FacebookLoginPojoJunit();
		toFillTextBox(login.getUserName(), readDataFromExcel("FacebookLogin", "junit", 1, 0));
		toFillTextBox(login.getPassword(), readDataFromExcel("FacebookLogin", "junit", 1, 1));	
		toClick(login.getLogin());
		Thread.sleep(1000);
		String url=toFetchCurrentUrl();
		Assert.assertTrue("Invalid password",url.contains("privacy_mutation_token"));
	}		
	@Test
	public void testCase2() throws InterruptedException, IOException  {
		FacebookLoginPojoJunit  login=new FacebookLoginPojoJunit();
		toFillTextBox(login.getUserName(), readDataFromExcel("FacebookLogin", "junit", 2, 0));
		toFillTextBox(login.getPassword(), readDataFromExcel("FacebookLogin", "junit", 2, 1));	
		toClick(login.getLogin());
		Thread.sleep(1000);
		String url=toFetchCurrentUrl();
		Assert.assertTrue("Invalid username", url.contains("privacy_mutation_token"));
		
	}	
	@Test
	public void testCase3 () throws InterruptedException, IOException  {
		FacebookLoginPojoJunit  login=new FacebookLoginPojoJunit();
		toFillTextBox(login.getUserName(), readDataFromExcel("FacebookLogin", "junit", 3, 0));
		toFillTextBox(login.getPassword(), readDataFromExcel("FacebookLogin", "junit", 3, 1));	
		toClick(login.getLogin());
		Thread.sleep(1000);
		String url=toFetchCurrentUrl();
		Assert.assertTrue("Blank username/password", url.contains("privacy_mutation_token"));		
	}
	
	@Test
	public void testCase4 () throws InterruptedException, IOException  {
		FacebookLoginPojoJunit  login=new FacebookLoginPojoJunit();
		toClick(login.getLogin());
		Thread.sleep(1000);
		String url=toFetchCurrentUrl();
		Assert.assertTrue("Blank username/password", url.contains("privacy_mutation_token"));		
	}
	@Test
	public void testCase5 () throws InterruptedException, IOException  {
		FacebookLoginPojoJunit  login=new FacebookLoginPojoJunit();
		toFillTextBox(login.getUserName(), readDataFromExcel("FacebookLogin", "junit", 1, 0));
		toFillTextBox(login.getPassword(), readDataFromExcel("FacebookLogin", "junit", 1, 1));	
		toClick(login.getLogin());
		Thread.sleep(1000);
		String url=toFetchCurrentUrl();
		Assert.assertFalse("Blank username/password", url.contains("privacy_mutation_token"));		
	}
	@Before
	public void fetchDateBefore() {
		openChrome();
		launchUrl("https://www.facebook.com/");
		maxWindow();
		Date date = new Date();
		System.out.println(date);
	}
	@After
	public void fetchDateAfter() throws InterruptedException {
		Date date = new Date();
		System.out.println(date);
		Thread.sleep(1000);
		closeBrowser();
	}
	@AfterClass
	public static void stepLast() {
		System.out.println("Ended");
	}
}
