package org.testNgQuestions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.PageFactory;

public class FacebookLoginPojo extends LibGlobalClassRef {

	public FacebookLoginPojo() {
		PageFactory.initElements(driver, this);
	}
	@CacheLookup
	@FindBy(id = "email")
	private WebElement email;

	@CacheLookup
	@FindBys({ @FindBy(id = "pass"), @FindBy(xpath = "//input[@placeholder='Password']") })
	private WebElement password;

	@CacheLookup
	@FindAll({ @FindBy(name = "login"), @FindBy(id = "u_0_5_0E") })
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
