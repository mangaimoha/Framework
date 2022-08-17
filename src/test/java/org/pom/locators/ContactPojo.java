package org.pom.locators;

import org.demo.LibGlobalClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPojo extends LibGlobalClass{

	public ContactPojo() {
		PageFactory.initElements(driver,this);
		
	}	
	@FindBy(xpath="//a[text()='CONTACT US']")
	private WebElement contacts;
	
	@FindBy(xpath="//div[@class='col-sm-12']")
	private WebElement branch;
	
	@FindBy(xpath="//div[@class='col-md-6 col-sm-6 left-side']")
	private WebElement copyRights;

	public WebElement getContacts() {
		return contacts;
	}

	public WebElement getBranch() {
		return branch;
	}

	public WebElement getCopyRights() {
		return copyRights;
	}
	
	
}
