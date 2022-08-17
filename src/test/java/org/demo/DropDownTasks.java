package org.demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownTasks  extends LibGlobalClass{

	public static void main(String[] args) {
		
		openChrome();
		launchUrl("https://demoqa.com/automation-practice-form/");
		WebElement state = driver.findElement(By.xpath("(//div[@class=' css-2b097c-container'])[2]"));
		WebElement city = driver.findElement(By.xpath("(//div[@class=' css-1hwfws3'])[2]"));
/*
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", state);*/
		
		String text = state.getText();
		System.out.println(text);
		
		List<WebElement> options = state.findElements(By.tagName("div"));
		for (WebElement option : options) {
			System.out.println(option.getText());
		}
		
	}

}
