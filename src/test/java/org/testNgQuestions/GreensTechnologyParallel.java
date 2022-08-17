package org.testNgQuestions;

import java.util.Date;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GreensTechnologyParallel {	
	WebDriver driver;
	
	@BeforeMethod
	private void start() {
		System.out.println("Started");
		Date date = new Date();
		System.out.println("Started at: " + date);
	}
	
	@Parameters({"browser"})
	@Test
	private void launch(String browserName) {

		if (browserName.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			System.out.println("Chrome Successfull");
		}
		if (browserName.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			System.out.println("Firefox Successfull");
		}
		driver.get("http://www.greenstechnologys.com/");
		driver.manage().window().maximize();
	}
	
	@AfterMethod
	private void end() {
		System.out.println("Ended");
		Date date = new Date();
		System.out.println("Ended at: " + date);
		driver.quit();
	}

}
