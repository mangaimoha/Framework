package org.ng.testng;

import org.demo.LibGlobalClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestSuite3 extends LibGlobalClass {
	
	@Test
	private void login() throws InterruptedException {
		 
	System.out.println(driver.getCurrentUrl());
	WebElement email = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
	email.sendKeys("9597803319");
	WebElement pwd = driver.findElement(By.xpath("//input[@type='password']"));
	pwd.sendKeys("Perumal@Murugan123");
	Thread.sleep(1000);
	}

}
