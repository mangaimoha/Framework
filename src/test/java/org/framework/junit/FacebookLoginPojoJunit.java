package org.framework.junit;

import org.demo.LibGlobalClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookLoginPojoJunit extends LibGlobalClass {

	public FacebookLoginPojoJunit() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "email")
	private WebElement userName;

	@FindBy(id = "pass")
	private WebElement password;
	
	@FindBy(name="login")
	private WebElement login;
	
	@FindAll({
		@FindBy(xpath="//div[@class='_9kq2']")	,
		@FindBy(xpath="//div[contains(text(),'you entered')]")
	})		
	private WebElement message;
	
	public WebElement getUserName() {
		return userName;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getLogin() {
		return login;
	}
	public WebElement getMessage() {
		return message;
	}
	
}
