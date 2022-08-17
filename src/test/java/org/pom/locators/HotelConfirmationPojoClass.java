package org.pom.locators;

import org.demo.LibGlobalClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelConfirmationPojoClass extends LibGlobalClass {

	public HotelConfirmationPojoClass() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="radiobutton_0")
	private WebElement radioBtn;
	
	@FindBy(id="continue")
	private WebElement contBtn;

	public WebElement getRadioBtn() {
		return radioBtn;
	}

	public WebElement getContBtn() {
		return contBtn;
	}	
	
}
