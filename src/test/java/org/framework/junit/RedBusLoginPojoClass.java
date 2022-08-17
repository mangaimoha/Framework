package org.framework.junit;

import java.util.List;

import org.demo.LibGlobalClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RedBusLoginPojoClass extends LibGlobalClass {

	public RedBusLoginPojoClass() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@class='fr signin-block  ']")
	private WebElement icon;

	@FindBy(xpath = "//li[text()='Sign In/Sign Up']")
	private WebElement signIn;

	@FindBy(tagName = "iframe")
	private List<WebElement> frames;

	@FindBy(xpath = "//input[@id='mobileNoInp']")
	private WebElement uName;

	@FindBy(xpath = "//iframe[@name='a-8tcoosh9yym8']")
	private WebElement reCaptchaFrame;

	@FindBy(xpath = "//div[@class='recaptcha-checkbox-checkmark']")
	private WebElement captcha;

	@FindBy(xpath = "//span[text()='GENERATE OTP ']")
	private WebElement generateOtp;

	@FindBy(id = "otp")
	private WebElement otp;
	
	@FindBy(id = "verifyUser")
	private WebElement verify;

	public WebElement getIcon() {
		return icon;
	}

	public WebElement getSignIn() {
		return signIn;
	}

	public List<WebElement> getFrames() {
		return frames;
	}

	public WebElement getuName() {
		return uName;
	}

	public WebElement getReCaptchaFrame() {
		return reCaptchaFrame;
	}

	public WebElement getCaptcha() {
		return captcha;
	}

	public WebElement getGenerateOtp() {
		return generateOtp;
	}

	public WebElement getOtp() {
		return otp;
	}

	public WebElement getVerify() {
		return verify;
	}

	
}
