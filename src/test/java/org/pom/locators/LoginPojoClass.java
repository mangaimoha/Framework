package org.pom.locators;

import org.demo.LibGlobalClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LoginPojoClass extends LibGlobalClass  {
	//non - parameterized constructor	
	public LoginPojoClass() {
		PageFactory.initElements(driver, this);
	}
	
	//private webElements
	//annotation  - findByElement == @FindBy
	
	@FindBys({
		@FindBy(id="email"),
		@FindBy(xpath="//input[@placeholder='Email address or phone number']")
	})	
	private WebElement txtEmail;
	
	@FindAll({
		@FindBy(id="pass"),
		@FindBy(xpath="//input[@placeholder='Password']"),
		@FindBy(name="password")
	})	
	private WebElement txtPassword; //to restrict others to access this element from other class - use private
	
	@CacheLookup
	@FindBy(xpath="//button[@type='submit']")
	private WebElement login;

	public WebElement getTxtEmail() {
		return txtEmail;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getLogin() {
		return login;
	}

	

	
	

	
	
}
