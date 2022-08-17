package org.ng.cross;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testNgQuestions.FacebookLoginPojo;
import org.testNgQuestions.LibGlobalClassRef;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrow {

	WebDriver driver;

	@Parameters({ "browser" })
	@Test
	private void tc1(String browserName) {

		if (browserName.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			System.out.println(Thread.currentThread().getId());

		}
		if (browserName.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			System.out.println(Thread.currentThread().getId());
		}

		if (browserName.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			System.out.println(Thread.currentThread().getId());
		}
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.quit();

	}

}
