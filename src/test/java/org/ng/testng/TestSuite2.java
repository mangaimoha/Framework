package org.ng.testng;

import org.demo.LibGlobalClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSuite2 extends LibGlobalClass {
	
	@Test
	private void end() throws InterruptedException {
		System.out.println(driver.getTitle());
		WebElement login = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		login.click();
		Thread.sleep(1000);
		driver.quit();} 

}
