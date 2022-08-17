package org.testNgQuestions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LibGlobalClassRef {
	
	static WebDriver driver;
	public static void openChrome() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
	}
	public static void openFirefox() {
	WebDriverManager.firefoxdriver().setup();
	driver = new FirefoxDriver();}

	public static void launchUrl(String url) {
		driver.get(url);
	}
	
	public static void closeBrowser() {
		driver.quit();
	}
	
	public static void maxWindow() {
		driver.manage().window().maximize();
	}
	
	public void toFillTextBox(WebElement element, String text) {
		element.sendKeys(text);
	}
	
	public void toClick(WebElement element) {
		element.click();
	}
	
	public static void toFetchCurrentUrl(){
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
	}

}
