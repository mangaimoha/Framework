package org.framework.junit;

import java.io.IOException;

import org.demo.LibGlobalClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.pom.locators.BookHotelPojoClass;
import org.pom.locators.ConfirmBookingHotelPojoClass;
import org.pom.locators.HotelConfirmationPojoClass;

public class BookHotelTC extends LibGlobalClass {

	@Test
	public void tc4() throws IOException, InterruptedException {
		HotelConfirmationPojoClass confHotel = new HotelConfirmationPojoClass();
		WebElement select = confHotel.getRadioBtn();
		toClick(select);
		WebElement go = confHotel.getContBtn();
		toClick(go);
		ConfirmBookingHotelPojoClass confBook = new ConfirmBookingHotelPojoClass();
		WebElement fName = confBook.getFirstName();
		toFillTextBox(fName, readDataFromExcel("AdactInHotel", "BookHotel", 1, 0));
		WebElement lName = confBook.getLastName();
		toFillTextBox(lName, readDataFromExcel("AdactInHotel", "BookHotel", 1, 1));
		WebElement address = confBook.getAddress();
		toFillTextBox(address, readDataFromExcel("AdactInHotel", "BookHotel", 1, 2));
		WebElement ccNum = confBook.getCcNum();
		toFillTextBox(ccNum, readDataFromExcel("AdactInHotel", "BookHotel", 1, 3));
		WebElement ccType = confBook.getCcType();
		selectByText(ccType, readDataFromExcel("AdactInHotel", "BookHotel", 2, 4));
		WebElement expMonth = confBook.getCcExPMonth();
		selectByText(expMonth, readDataFromExcel("AdactInHotel", "BookHotel", 10, 5));
		WebElement expYear = confBook.getCcExpYear();
		selectByText(expYear, readDataFromExcel("AdactInHotel", "BookHotel", 12, 6));
		WebElement cc_cvv = confBook.getCcCVV();
		toFillTextBox(cc_cvv, readDataFromExcel("AdactInHotel", "BookHotel", 1, 7));
		WebElement book = confBook.getBtnBookNow();
		toClick(book);
		Thread.sleep(5000);
		BookHotelPojoClass bookHotel = new BookHotelPojoClass();
		WebElement orderNo = bookHotel.getOrderNo();
		System.out.println(orderNo.getAttribute("value"));

	}

}
