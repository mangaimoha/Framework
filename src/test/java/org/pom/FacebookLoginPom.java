package org.pom;

import java.io.IOException;

import org.demo.LibGlobalClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.pom.locators.LoginPojoClass;
import org.pom.locators.PojoClass;

public class FacebookLoginPom extends LibGlobalClass {

	public static void main(String[] args) throws IOException {
		openChrome();
		launchUrl("https://www.facebook.com/");
		maxWindow();
				
		PojoClass pojo= new PojoClass();
		WebElement uN = pojo.getTxtEmail();
		toFillTextBox(uN,readDataFromExcel("FacebookLogin","login",2,0));
		
		WebElement pass = pojo.getTxtPassword();
		toFillTextBox(pass, readDataFromExcel("FacebookLogin","login",2,1));
	
		driver.navigate().refresh();	
	
		toFillTextBox(uN,readDataFromExcel("FacebookLogin","login",2,0));
		
		toFillTextBox(pass, readDataFromExcel("FacebookLogin","login",2,1));
		
	
	}

}
