package org.dd;

import java.io.IOException;

import org.demo.LibGlobalClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FacebookLogin extends LibGlobalClass {

	public static void main(String[] args) throws IOException {
		openChrome();
		launchUrl("https://www.facebook.com//");
		
		WebElement uName = driver.findElement(By.id("email"));
		WebElement pwd = driver.findElement(By.id("pass"));
		
		String nameInput= readDataFromExcel("FacebookLogin","login",1,0);
		String passwordInput = readDataFromExcel("FacebookLogin","login",1,1);
		
		toFillTextBox(uName, nameInput);
		toFillTextBox(pwd,passwordInput);
		
		WebElement login = driver.findElement(By.name("login"));	
		toClick(login);	
	
		//to add text to file
		WebElement message = driver.findElement(By.xpath("//div[@class='_9kq2']"));
		String text = message.getText();
		addRowToExcel("FacebookLogin","message",0,0,text);
		
	}

}
