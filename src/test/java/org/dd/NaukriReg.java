package org.dd;

import java.io.IOException;

import org.demo.LibGlobalClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class NaukriReg extends LibGlobalClass {

	public static void main(String[] args) throws IOException, InterruptedException {
		openChrome();
		launchUrl("https://my.naukri.com/account/register/basicdetails");
		maxWindow();
		Thread.sleep(500);
		
		WebElement name = driver.findElement(By.xpath("//input[contains(@placeholder,'your name')]"));
		String uName = readDataFromExcel("NaukriReg","Registration",1,0);
		toFillTextBox(name,uName);
		
		WebElement email = driver.findElement(By.xpath("//input[contains(@placeholder,'your Email ID')]"));
		String emailTxt = readDataFromExcel("NaukriReg","Registration",1,1);
		toFillTextBox(email,emailTxt);
		
		WebElement pwd = driver.findElement(By.xpath("//input[@type='password']"));
		String password = readDataFromExcel("NaukriReg","Registration",1,2);
		toFillTextBox(pwd,password);
				
		WebElement phone = driver.findElement(By.xpath("//input[@placeholder='Mobile Number']"));
		String number = readDataFromExcel("NaukriReg","Registration",1,3);
		toFillTextBox(phone,number);				
		
		WebElement exp = driver.findElement(By.xpath("//h2[contains(text(),'Experienced')]"));
		WebElement fresher = driver.findElement(By.xpath("//h2[contains(text(),'Fresher')]"));
		
		toClick(exp);
		
		WebElement regBtn = driver.findElement(By.xpath("//button[contains(text(),'Register Now')]"));
		
		
		
		
	}

}
