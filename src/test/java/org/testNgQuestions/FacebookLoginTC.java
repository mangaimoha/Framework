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

public class FacebookLoginTC extends LibGlobalClassRef {
	SoftAssert s;

	@BeforeClass
	private void start() {
		System.out.println("Started");
	}

	@BeforeMethod
	private void launch() {
		openChrome();
		launchUrl("https://www.facebook.com/");
		maxWindow();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Date date = new Date();
		System.out.println(date);
	}

	@DataProvider(name = "login_data")
	private String[][] data_tc() {
		return new String[][] { 
			    { "abc@gmail.com", "12345" }, 
			    { "mangaimanivel", "" }, 
			    { "", "78960" },
				{ "mangai", "mohan" } 
			    };
	}

	@Test(dataProvider = "login_data")
	private void tc1(String email, String pass) throws InterruptedException {
		s = new SoftAssert();
		FacebookLoginPojo fb = new FacebookLoginPojo();
		toFillTextBox(fb.getEmail(), email);
		toFillTextBox(fb.getPassword(), pass);
		toClick(fb.getLogin());
		Thread.sleep(1000);
		String url = driver.getCurrentUrl();
		s.assertTrue(url.contains("?privacy_mutation_token="), "check TC1");
		s.assertAll();
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
