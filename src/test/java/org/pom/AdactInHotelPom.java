package org.pom;

import java.io.IOException;

import org.demo.LibGlobalClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.pom.locators.BookHotelPojoClass;
import org.pom.locators.ConfirmBookingHotelPojoClass;
import org.pom.locators.HotelConfirmationPojoClass;
import org.pom.locators.HotelLoginPojoClass;
import org.pom.locators.SearchHotelPojoClass;

public class AdactInHotelPom extends LibGlobalClass {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		openChrome();
		launchUrl("https://adactinhotelapp.com/");
		
		HotelLoginPojoClass loginPage = new HotelLoginPojoClass();
		WebElement uName = loginPage.getUserName();
		toFillTextBox(uName,readDataFromExcel("AdactInHotel","login",1,0));
		
		WebElement pwd = loginPage.getPassword();
		toFillTextBox(pwd,readDataFromExcel("AdactInHotel","login",1,1));
		
		WebElement login = loginPage.getBtnLogin();
		toClick(login);	
		
		SearchHotelPojoClass searchHotel = new SearchHotelPojoClass();
		
		WebElement location = searchHotel.getLocation();
		selectByText(location, readDataFromExcel("AdactInHotel","SearchHotel",5,0));		
		
		WebElement hotel = searchHotel.getHotelName();
		selectByText(hotel, readDataFromExcel("AdactInHotel","SearchHotel",2,1));		

		WebElement roomType = searchHotel.getRoomType();
		selectByText(roomType, readDataFromExcel("AdactInHotel","SearchHotel",2,2));
				
		WebElement noOfRooms = searchHotel.getRoomNo();
		selectByText(noOfRooms, readDataFromExcel("AdactInHotel","SearchHotel",2,3));
		
		WebElement checkIn = searchHotel.getCheckInDate();
		toFillTextBox(checkIn, readDataFromExcel("AdactInHotel","SearchHotel",3,4));
		
		WebElement checkOut = searchHotel.getCheckOutDate();
		toFillTextBox(checkOut, readDataFromExcel("AdactInHotel","SearchHotel",3,5));
		
		WebElement adultRoom = searchHotel.getAdultRoom();
		selectByText(adultRoom, readDataFromExcel("AdactInHotel","SearchHotel",2,6));
		
		WebElement childRoom = searchHotel.getChildRoom();
		selectByText(childRoom, readDataFromExcel("AdactInHotel","SearchHotel",2,7));		
		
		WebElement submit = searchHotel.getBtnSubmit();
		toClick(submit);
		
		HotelConfirmationPojoClass confHotel = new HotelConfirmationPojoClass();
		
		WebElement select = confHotel.getRadioBtn();
		toClick(select);
		
		WebElement go = confHotel.getContBtn();
		toClick(go);
		
		ConfirmBookingHotelPojoClass confBook = new ConfirmBookingHotelPojoClass();
		
		WebElement fName = confBook.getFirstName();
		toFillTextBox(fName, readDataFromExcel("AdactInHotel","BookHotel",1,0));
		
		WebElement lName = confBook.getLastName();
		toFillTextBox(lName, readDataFromExcel("AdactInHotel","BookHotel",1,1));
		
		WebElement address = confBook.getAddress();
		toFillTextBox(address, readDataFromExcel("AdactInHotel","BookHotel",1,2));
		
		WebElement ccNum = confBook.getCcNum();
		toFillTextBox(ccNum, readDataFromExcel("AdactInHotel","BookHotel",1,3));
		
		WebElement ccType = confBook.getCcType();
		selectByText(ccType, readDataFromExcel("AdactInHotel","BookHotel",2,4));
		
		WebElement expMonth = confBook.getCcExPMonth();
		selectByText(expMonth, readDataFromExcel("AdactInHotel","BookHotel",10,5));
		
		WebElement expYear = confBook.getCcExpYear();
		selectByText(expYear, readDataFromExcel("AdactInHotel","BookHotel",12,6));
		
		WebElement cc_cvv = confBook.getCcCVV();
		toFillTextBox(cc_cvv, readDataFromExcel("AdactInHotel","BookHotel",1,7));
		
		WebElement book = confBook.getBtnBookNow();
		toClick(book);
		
		Thread.sleep(5000);
		BookHotelPojoClass bookHotel = new BookHotelPojoClass();
		
		WebElement orderNo =bookHotel.getOrderNo();
		System.out.println(orderNo.getAttribute("value"));
		
				
	}

}
