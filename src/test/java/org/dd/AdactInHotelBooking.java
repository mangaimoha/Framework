package org.dd;

import java.io.IOException;
import java.util.List;

import org.demo.LibGlobalClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AdactInHotelBooking extends LibGlobalClass {

	public static void main(String[] args) throws IOException, InterruptedException {
		openChrome();
		launchUrl("https://adactinhotelapp.com/");
		WebElement uName = driver.findElement(By.id("username"));
		WebElement pwd = driver.findElement(By.id("password"));
		WebElement login = driver.findElement(By.id("login"));
		String nameInput = readDataFromExcel("AdactInHotel","login",1,0);
		String pwdInput = readDataFromExcel("AdactInHotel","login",1,1);		
		toFillTextBox(uName, nameInput);
		toFillTextBox(pwd, pwdInput);
		toClick(login);

		WebElement location = driver.findElement(By.id("location"));
		String locName = readDataFromExcel("AdactInHotel","SearchHotel",5,0);
		selectByText(location, locName);		
		
		WebElement hotel = driver.findElement(By.id("hotels"));
		String hotelName = readDataFromExcel("AdactInHotel","SearchHotel",2,1);
		selectByText(hotel, hotelName);		

		WebElement roomType = driver.findElement(By.id("room_type"));
		String room = readDataFromExcel("AdactInHotel","SearchHotel",2,2);
		selectByText(roomType, room);
				
		WebElement noOfRooms = driver.findElement(By.id("room_nos"));
		String number = readDataFromExcel("AdactInHotel","SearchHotel",2,3);
		selectByText(noOfRooms, number);
		
		WebElement checkIn = driver.findElement(By.id("datepick_in"));
		String dateIn = readDataFromExcel("AdactInHotel","SearchHotel",3,4);
		toFillTextBox(checkIn, dateIn);
		
		WebElement checkOut = driver.findElement(By.id("datepick_out"));
		String dateOut = readDataFromExcel("AdactInHotel","SearchHotel",3,5);
		toFillTextBox(checkOut, dateOut);
		
		WebElement adultRoom = driver.findElement(By.id("adult_room"));
		String adult = readDataFromExcel("AdactInHotel","SearchHotel",2,6);
		selectByText(adultRoom, adult);
		
		WebElement childRoom = driver.findElement(By.id("child_room"));
		String child = readDataFromExcel("AdactInHotel","SearchHotel",2,7);
		selectByText(childRoom, child);		
		
		WebElement submit = driver.findElement(By.id("Submit"));
		toClick(submit);
		
		WebElement select = driver.findElement(By.id("radiobutton_0"));
		toClick(select);
		
		WebElement go = driver.findElement(By.id("continue"));
		toClick(go);
		
		WebElement fName = driver.findElement(By.id("first_name"));
		String first = readDataFromExcel("AdactInHotel","BookHotel",1,0);
		toFillTextBox(fName, first);
		
		WebElement lName = driver.findElement(By.id("last_name"));
		String last = readDataFromExcel("AdactInHotel","BookHotel",1,1);
		toFillTextBox(lName, last);
		
		WebElement address = driver.findElement(By.id("address"));
		String addr = readDataFromExcel("AdactInHotel","BookHotel",1,2);
		toFillTextBox(address, addr);
		
		WebElement ccNum = driver.findElement(By.id("cc_num"));
		String ccN = readDataFromExcel("AdactInHotel","BookHotel",1,3);
		toFillTextBox(ccNum, ccN);
		
		WebElement ccType = driver.findElement(By.id("cc_type"));
		String ccT = readDataFromExcel("AdactInHotel","BookHotel",2,4);
		selectByText(ccType, ccT);
		
		WebElement expMonth = driver.findElement(By.id("cc_exp_month"));
		String mon = readDataFromExcel("AdactInHotel","BookHotel",10,5);
		selectByText(expMonth, mon);
		
		WebElement expYear = driver.findElement(By.id("cc_exp_year"));
		String year = readDataFromExcel("AdactInHotel","BookHotel",12,6);
		selectByText(expYear, year);
		
		WebElement cc_cvv = driver.findElement(By.id("cc_cvv"));
		String cvv = readDataFromExcel("AdactInHotel","BookHotel",1,7);
		toFillTextBox(cc_cvv, cvv);
		
		WebElement book = driver.findElement(By.id("book_now"));
		toClick(book);
		
		Thread.sleep(5000);
		WebElement orderNo = driver.findElement(By.xpath("//input[@name='order_no']"));
		String text = orderNo.getAttribute("value");
		addSheetToExcel("AdactInHotel","Order",0,0,text);
	}

}
