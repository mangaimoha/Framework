package org.pom.locators;

import org.demo.LibGlobalClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class PojoClass extends LibGlobalClass{
	
	//non - parameterized constructor	
	public PojoClass() {
		System.out.println("pojo");
		PageFactory.initElements(driver, this);
		}		
		@FindBy(id="email")
		private WebElement txtEmail;
		
		@FindBy(id="pass")
		private WebElement txtPassword; //to restrict others to access this element from other class - use private
		
		@FindBy(xpath="//button[@type='submit']")
		private WebElement login;

		public WebElement getTxtEmail() {
			System.out.println("email");
			return txtEmail;
		}

		public WebElement getTxtPassword() {
			return txtPassword;
		}

		public WebElement getLogin() {
			return login;
		}

		

		
		


}
