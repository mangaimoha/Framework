package org.ng.testng;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGPriority {

	WebDriver driver;

	@BeforeClass
	private void start() {
		System.out.println("======Started========");
	}

	@BeforeMethod
	private void launch() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/account/login");
		driver.manage().window().maximize();
		Date date = new Date();
		System.out.println(date);
	}
	@Test(priority=-3)
	private void tc3() {
		WebElement email = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
		email.sendKeys("abcdefg");
		WebElement pwd = driver.findElement(By.xpath("//input[@type='password']"));
		pwd.sendKeys("123456");
		//WebElement login = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		//login.click();
	}
	
	@Test(priority=-2)
	private void tc2() {
		WebElement email = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
		email.sendKeys("mangaimanivel");
		WebElement pwd = driver.findElement(By.xpath("//input[@type='password']"));
		pwd.sendKeys("123456");
	//	WebElement login = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		//login.click();
	}	

	@Test(priority=-3)
	private void tc1() {
		WebElement email = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
		email.sendKeys("9597803319");
		WebElement pwd = driver.findElement(By.xpath("//input[@type='password']"));
		pwd.sendKeys("Perumal@Murugan123");
		//WebElement login = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		//login.click();
	}
	@AfterMethod
	private void close() {
		driver.quit();
	}
	@AfterClass
	private void end() {
		System.out.println("=======Ended========");
	}
}
