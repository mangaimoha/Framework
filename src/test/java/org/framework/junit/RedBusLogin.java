package org.framework.junit;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.List;
import org.demo.LibGlobalClass;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;
 
public class RedBusLogin extends LibGlobalClass {

	RedBusLoginPojoClass bus = new RedBusLoginPojoClass();

	@BeforeClass
	public static void stepOne() {
		openChrome();
		launchUrl("https://www.redbus.in/");
		maxWindow();
	}

	@Before
	public void snapBefore() throws IOException {
		toTakeSnap("Redbus_Before");
	}

	@Test
	public void aSignin() throws InterruptedException {
		System.out.println(1);
		toClick(bus.getIcon());
		toClick(bus.getSignIn());
		Thread.sleep(2000);
	}

	@Test
	public void bLogin() {
		System.out.println(2);
		List<WebElement> frames = bus.getFrames();
		int n = frames.size();
		for (int i = 0; i < n; i++) {
			if ((frames.get(i).getAttribute("class")).equals("modalIframe")) {
				driver.switchTo().frame(i);
				toFillTextBox(bus.getuName(), "9597803319");
			}	
			
		}

	}
	
	@Test
	public void cCaptcha() throws AWTException, InterruptedException {
		System.out.println(3);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(500);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		System.out.println(4);
		Thread.sleep(3000);
	}
	
	@Test
	public void dOtp() throws InterruptedException {
		toElementClick(bus.getGenerateOtp());
		Thread.sleep(30000);
		toElementClick(bus.getVerify());
	}
	

	@After
	public void snapAfter() throws IOException {
		toTakeSnap("Redbus_Before");
	}

	@AfterClass
	public static void stepLast() {
		closeBrowser();
	}

}
