package org.framework.junit;

import org.demo.LibGlobalClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipkartLoginPojo extends LibGlobalClass {

	public FlipkartLoginPojo() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//input[@class='_2IX_2- VJZDxU']")
	private WebElement email;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement pswd;
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement login;

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPswd() {
		return pswd;
	}

	public WebElement getLogin() {
		return login;
	}
	
	

}
