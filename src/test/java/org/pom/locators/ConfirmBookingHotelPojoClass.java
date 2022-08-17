package org.pom.locators;

import org.demo.LibGlobalClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfirmBookingHotelPojoClass extends LibGlobalClass {

	public ConfirmBookingHotelPojoClass() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "first_name")
	private WebElement firstName;

	@FindBy(id = "last_name")
	private WebElement lastName;

	@FindBy(id = "address")
	private WebElement address;
	
	@FindBy(id = "cc_num")
	private WebElement ccNum;
	
	@FindBy(id = "cc_type")
	private WebElement ccType;
	
	@FindBy(id = "cc_exp_month")
	private WebElement ccExPMonth;
	
	@FindBy(id = "cc_exp_year")
	private WebElement ccExpYear;
	
	@FindBy(id = "cc_cvv")
	private WebElement ccCVV;
	
	@FindBy(id = "book_now")
	private WebElement btnBookNow;

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCcNum() {
		return ccNum;
	}

	public WebElement getCcType() {
		return ccType;
	}

	public WebElement getCcExPMonth() {
		return ccExPMonth;
	}

	public WebElement getCcExpYear() {
		return ccExpYear;
	}

	public WebElement getCcCVV() {
		return ccCVV;
	}

	public WebElement getBtnBookNow() {
		return btnBookNow;
	}
	
	

}
