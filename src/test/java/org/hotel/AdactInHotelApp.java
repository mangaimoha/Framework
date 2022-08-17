package org.hotel;

import java.util.List;

import org.demo.LibGlobalClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AdactInHotelApp extends LibGlobalClass {

	public static void main(String[] args) throws InterruptedException {
		openChrome();
		launchUrl("https://adactinhotelapp.com/");
		WebElement uName = driver.findElement(By.id("username"));
		WebElement pwd = driver.findElement(By.id("password"));
		WebElement login = driver.findElement(By.id("login"));
		toFillTextBox(uName, "mangaimanivel");
		toFillTextBox(pwd, "Hermione201095");
		toClick(login);

		WebElement location = driver.findElement(By.id("location"));
		
		List<WebElement> options = getOptions(location);
		for (WebElement option : options) {
			 getText(option);
		}
		selectByText(location, "London");
		
		List<WebElement> selectedOptions = getSelectedOptions(location);
		for (WebElement element : selectedOptions) {
			getText(element);
		}
		
		WebElement noOfRooms = driver.findElement(By.id("room_nos"));
		selectByText(noOfRooms, "2 - Two");
		
		WebElement roomType = driver.findElement(By.id("room_type"));
		selectByText(roomType, "Double");
		
		WebElement hotel = driver.findElement(By.id("hotels"));
		selectByText(hotel, "Hotel Sunshine");
		
		WebElement submit = driver.findElement(By.id("Submit"));
		toClick(submit);
		
		WebElement select = driver.findElement(By.id("radiobutton_0"));
		toClick(select);
		
		WebElement go = driver.findElement(By.id("continue"));
		toClick(go);
		
		WebElement fName = driver.findElement(By.id("first_name"));
		toFillTextBox(fName, "mangai");
		
		WebElement lName = driver.findElement(By.id("last_name"));
		toFillTextBox(lName, "manivel");
		
		WebElement address = driver.findElement(By.id("address"));
		toFillTextBox(address, "Chennai");
		
		WebElement ccNum = driver.findElement(By.id("cc_num"));
		toFillTextBox(ccNum, "1234567890123456");
		
		WebElement ccType = driver.findElement(By.id("cc_type"));
		selectByText(ccType, "Master Card");
		
		WebElement expMonth = driver.findElement(By.id("cc_exp_month"));
		selectByText(expMonth, "October");
		
		WebElement expYear = driver.findElement(By.id("cc_exp_year"));
		selectByText(expYear, "2022");
		
		WebElement cc_cvv = driver.findElement(By.id("cc_cvv"));
		toFillTextBox(cc_cvv, "111");
		
		WebElement book = driver.findElement(By.id("book_now"));
		toClick(book);
		
		Thread.sleep(6000);
		WebElement orderNo = driver.findElement(By.id("order_no"));
		getAttribute(orderNo);
	}

}
