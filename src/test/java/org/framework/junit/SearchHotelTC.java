package org.framework.junit;

import java.io.IOException;

import org.demo.LibGlobalClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.pom.locators.SearchHotelPojoClass;

public class SearchHotelTC extends LibGlobalClass {

	@Test
	public void tc3() throws IOException, InterruptedException {
		SearchHotelPojoClass searchHotel = new SearchHotelPojoClass();

		WebElement location = searchHotel.getLocation();
		selectByText(location, readDataFromExcel("AdactInHotel", "SearchHotel", 5, 0));
		WebElement hotel = searchHotel.getHotelName();
		selectByText(hotel, readDataFromExcel("AdactInHotel", "SearchHotel", 2, 1));
		WebElement roomType = searchHotel.getRoomType();
		selectByText(roomType, readDataFromExcel("AdactInHotel", "SearchHotel", 2, 2));
		WebElement noOfRooms = searchHotel.getRoomNo();
		selectByText(noOfRooms, readDataFromExcel("AdactInHotel", "SearchHotel", 2, 3));
		WebElement checkIn = searchHotel.getCheckInDate();
		toFillTextBox(checkIn, readDataFromExcel("AdactInHotel", "SearchHotel", 3, 4));
		WebElement checkOut = searchHotel.getCheckOutDate();
		toFillTextBox(checkOut, readDataFromExcel("AdactInHotel", "SearchHotel", 3, 5));
		WebElement adultRoom = searchHotel.getAdultRoom();
		selectByText(adultRoom, readDataFromExcel("AdactInHotel", "SearchHotel", 2, 6));
		WebElement childRoom = searchHotel.getChildRoom();
		selectByText(childRoom, readDataFromExcel("AdactInHotel", "SearchHotel", 2, 7));
		WebElement submit = searchHotel.getBtnSubmit();
		toClick(submit);
		Thread.sleep(1000);
	}

}
