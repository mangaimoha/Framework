package org.pom.locators;

import org.demo.LibGlobalClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CareerPojo extends LibGlobalClass {

	public CareerPojo() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[contains(text(),'CAREERS')]")
	private WebElement career;

	@FindBy(xpath = "(//a[contains(text(),'contact@greens')])")
	private WebElement email;

	@FindBy(xpath = "//DIV[@CLASS='copyright']")
	private WebElement copyRights;

	public WebElement getCareer() {
		return career;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getCopyRights() {
		return copyRights;
	}

}
