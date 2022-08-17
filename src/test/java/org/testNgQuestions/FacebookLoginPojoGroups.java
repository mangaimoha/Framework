package org.testNgQuestions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class FacebookLoginPojoGroups extends LibGlobalClassRef{
	
	public FacebookLoginPojoGroups() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "email")
	private WebElement email;

	@FindBy(id = "pass")
	private WebElement password;

	@FindBy(name = "login")
	private WebElement login;

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}
	


}
