package org.pom.locators;

import org.demo.LibGlobalClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageGreensPojo extends LibGlobalClass {
	public HomePageGreensPojo() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//p[contains(text(),'All Rights Reserved')]")
	private WebElement copyRights;
	
	
	@FindBy(xpath="//h1[contains(text(),'No 1 Software Training')]")
	private WebElement instDet;


	public WebElement getCopyRights() {
		return copyRights;
	}


	public WebElement getInstDet() {
		return instDet;
	}	

}
