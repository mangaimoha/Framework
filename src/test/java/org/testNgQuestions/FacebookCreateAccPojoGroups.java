package org.testNgQuestions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookCreateAccPojoGroups extends LibGlobalClassRef {

	public FacebookCreateAccPojoGroups() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@data-testid='open-registration-form-button']")
	private WebElement createAccount;

	@FindBy(xpath = "//input[@placeholder='First name']")
	private WebElement fName;
	
	@FindBy(xpath = "//input[@name='lastname']")
	private WebElement lName;
	
	@FindBy(xpath = "//input[@name='reg_email__']")
	private WebElement regEmail;
	
	@FindBy(xpath = "//input[@name='reg_passwd__']")
	private WebElement regPassword;
	
	@FindBy(xpath = "//select[@name='birthday_day']")
	private WebElement bDay;
	
	@FindBy(xpath = "//select[@name='birthday_month']")
	private WebElement bMonth;
	
	@FindBy(xpath = "//select[@name='birthday_year']")
	private WebElement bYear;
	
	@FindBy(xpath = "(//input[@type='radio'])[2]")
	private WebElement bGender;
	
	@FindBy(xpath = "//button[text()='Sign Up']")
	private WebElement signUp;

	public WebElement getCreateAccount() {
		return createAccount;
	}

	public WebElement getfName() {
		return fName;
	}

	public WebElement getlName() {
		return lName;
	}

	public WebElement getRegEmail() {
		return regEmail;
	}

	public WebElement getRegPassword() {
		return regPassword;
	}

	public WebElement getbDay() {
		return bDay;
	}

	public WebElement getbMonth() {
		return bMonth;
	}

	public WebElement getbYear() {
		return bYear;
	}

	public WebElement getbGender() {
		return bGender;
	}

	public WebElement getSignUp() {
		return signUp;
	}
	
	
}
