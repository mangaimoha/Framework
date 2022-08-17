package org.testNgQuestions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RedBusLoginPojo extends LibGlobalClassRef {
	
	public RedBusLoginPojo() {
		PageFactory.initElements(driver, this);
	}
	@CacheLookup
	@FindBy(id = "i-icon-profile")
	private WebElement iIcon;

	@CacheLookup
	@FindBy(xpath = "//li[text()='Sign In/Sign Up']")
	private WebElement signIn;

	@CacheLookup
	@FindBy(xpath = "//iframe[@class='modalIframe']")
	private WebElement frame1;

	@CacheLookup
	@FindBy(id = "mobileNoInp")
	private WebElement mobNum;

	@CacheLookup
	@FindBy(xpath = "//iframe[@title='reCAPTCHA']")
	private WebElement frame2;

	@CacheLookup
	@FindBy(xpath = "//div[@class='recaptcha-checkbox-border']")
	private WebElement captcha;

	@CacheLookup
	@FindBy(id = "verifyUser")
	private WebElement verify;

	@CacheLookup
	@FindBy(xpath = "//span[text()='GENERATE OTP ']")
	private WebElement genOtp;

	public WebElement getCaptcha() {
		return captcha;
	}

	public WebElement getiIcon() {
		return iIcon;
	}

	public WebElement getSignIn() {
		return signIn;
	}

	public WebElement getFrame1() {
		return frame1;
	}

	public WebElement getMobNum() {
		return mobNum;
	}

	public WebElement getFrame2() {
		return frame2;
	}

	public WebElement getVerify() {
		return verify;
	}

	public WebElement getGenOtp() {
		return genOtp;
	}

}
