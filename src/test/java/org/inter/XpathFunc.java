package org.inter;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathFunc {

	public static void main(String[] args) throws AWTException, InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\eclipse_SeleniumWebdriver\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("(//input[@placeholder])[1]")).sendKeys("Mobile");
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(5000);
		//====================Task 1==================================
		System.out.println("===============Total number of products==================================================");
		List<WebElement> product = driver.findElements(By.xpath("//div[@class='_1YokD2 _3Mn1Gg']//div[@class='_4rR01T']"));
		for (WebElement prod : product) {
			System.out.println(prod.getText());		
			
		}
		
		List<WebElement> fAssured = driver.findElements(By.xpath("//div[@class='_13J9qT']"));
		System.out.println(fAssured.size());
		
		System.out.println("=============== Product list based on Price (Ascending order)===========================");
		//=======================Task 2=================================
		List<WebElement> prices = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
		List<Integer> l = new LinkedList<Integer>();
		List<Integer> l2 = new LinkedList<Integer>();
		Map<String,Integer> map = new LinkedHashMap<String,Integer>();
		Map<String,Integer> mp = new LinkedHashMap<String,Integer>();

		for(int i=0;i<product.size();i++) {
			String name = product.get(i).getText();
			 String price=prices.get(i).getText();
			 map.put(name,  (Integer.parseInt(price.replace(",", "").substring(1))));
		}
		l.addAll( map.values());
		Collections.sort(l);
		Set<Entry<String, Integer>> e = map.entrySet();
		
			for (Integer num : l) {
				for (Entry<String, Integer> entry : e) {
				if(num==entry.getValue()) {
					mp.put(entry.getKey() , num);
				}
			}
		}
		Set<Entry<String, Integer>> entry = mp.entrySet();	
			for (Entry<String, Integer> entry2 : entry) {
				System.out.println(entry2);
			}
		}
	}	
//	
	