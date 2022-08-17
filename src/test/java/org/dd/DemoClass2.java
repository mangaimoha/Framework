package org.dd;

import java.io.IOException;

import org.demo.LibGlobalClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DemoClass2 extends LibGlobalClass {

	public static void main(String[] args) throws InterruptedException, IOException {
		openChrome();
		launchUrl("https://wwww.facebook.com");
		maxWindow();
		WebElement email = driver.findElement(By.id("email"));
		String emailVal = readDataFromExcel("EmployeeDetails","Sheet1",2,1);
		setAttribute(email,emailVal);
		
		WebElement pwd = driver.findElement(By.id("pass"));
		String pwdVal = readDataFromExcel("EmployeeDetails","Sheet1",2,3);
		setAttribute(pwd,pwdVal);
		
		/*Thread.sleep(1000);
		WebElement btnLogin = driver.findElement(By.name("login"));
		toClick(btnLogin);*/
	}

}
