package org.testNgQuestions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GmailLoginPojo extends LibGlobalClassRef {
	
	public GmailLoginPojo() {
		PageFactory.initElements(driver, this);
		}
	
	@FindBy(xpath="//input[@id='identifierId']")
	private WebElement email;
	
	@FindBy(xpath="//span[text()='Next']")
	private WebElement nextBtn;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement password;

	public WebElement getEmail() {
		return email;
	}

	public void setEmail(WebElement email) {
		this.email = email;
	}

	public WebElement getNextBtn() {
		return nextBtn;
	}

	public void setNextBtn(WebElement nextBtn) {
		this.nextBtn = nextBtn;
	}

	public WebElement getPassword() {
		return password;
	}

	public void setPassword(WebElement password) {
		this.password = password;
	}	

}
