package org.pom.locators;

import org.demo.LibGlobalClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotelPojoClass extends LibGlobalClass {

	public BookHotelPojoClass() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@name='order_no']")
	private WebElement orderNo;
	
	public WebElement getOrderNo() {
		return orderNo;
	}
}
