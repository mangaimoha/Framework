package org.demo;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class DemoClass1 extends LibGlobalClass {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		openChrome();
		launchUrl("https://wwww.facebook.com");
		maxWindow();
		toFetchTitle();
		toFetchCurrentUrl();
		toRefresh(); // again load
		WebElement email = driver.findElement(By.id("email"));
		//toFillTextBox(email,"mangai");	
		setAttribute(email,"mangai");
		toTakeSnap("img1");
		WebElement pwd = driver.findElement(By.id("pass"));
		setAttribute(pwd,"123456");
		//toFillTextBox(pwd,"123456");
		getAttribute(email);
		getAttribute(pwd);
		Thread.sleep(1000);
		WebElement btnLogin = driver.findElement(By.name("login"));
		toClick(btnLogin);
		toElementClick(btnLogin);
		
		

}
}
