package org.ng.testng;

import org.demo.LibGlobalClass;
import org.testng.annotations.Test;

public class TestSuite1 extends LibGlobalClass {
	
	@Test
	private void launchBrowser() {
		openChrome();
		driver.get("https://www.flipkart.com/account/login");
		driver.manage().window().maximize();
	}

}
