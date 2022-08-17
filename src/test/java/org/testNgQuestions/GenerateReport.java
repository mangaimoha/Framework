package org.testNgQuestions;

import java.util.Date;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GenerateReport extends LibGlobalClassRef {
	
	@BeforeMethod
	private void start() {
		openChrome();
		Date date = new Date();
		System.out.println(date);
	}
	
	@Test
	private void tc1() {
		launchUrl("http://www.greenstechnologys.com/");
		maxWindow();
		System.out.println("success");
	}
	
	@AfterMethod
	private void end() {
		closeBrowser();
	}

}
