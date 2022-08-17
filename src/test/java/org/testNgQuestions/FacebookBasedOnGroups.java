package org.testNgQuestions;

import java.util.Date;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FacebookBasedOnGroups extends LibGlobalClassRef {
	@BeforeClass(groups= {"login","register"})
	private void start() {
		System.out.println("Started");
	}
	@BeforeMethod(groups= {"login","register"})
	private void before() {
		openChrome();
		launchUrl("https://www.facebook.com/");
		maxWindow();
		Date date = new Date();
		System.out.println(date);
	}	
	@DataProvider(name="login_data")
	private String[][] data() {
		return new String[][] {
			{"abc@gmail.com","ABCDEF"},
			{"manmo@gmail.com","123456"},
			{"95978033","Hermione"}};
	}	
	@Test(dataProvider="login_data",groups="login")
	private void login_tc1(String email, String password) {
		FacebookLoginPojoGroups login = new FacebookLoginPojoGroups();
		toFillTextBox(login.getEmail(),email);
		toFillTextBox(login.getPassword(),password);
		toClick(login.getLogin());
	}	
	@DataProvider(name="reg_data")
	private String[][] regD() {
		return new String[][] {
			{"man","moh","pass"},
			{"com","co","123456"},
			{"abc","def","Hermione"}};
	}	
	@Test(dataProvider="reg_data", groups= {"register"})
	private void register_tc2(String fName, String lName, String pass) throws InterruptedException {
		FacebookCreateAccPojoGroups reg = new FacebookCreateAccPojoGroups();
		toClick(reg.getCreateAccount());
		Thread.sleep(3000);
		toFillTextBox(reg.getfName(),fName);
		toFillTextBox(reg.getlName(),lName);
		toFillTextBox(reg.getRegPassword(),pass);
		toClick(reg.getSignUp());
		}
	
	@AfterMethod(groups= {"login","register"})
	private void after() {
		closeBrowser();
		Date date = new Date();
		System.out.println(date);
	}
	@AfterClass(groups= {"login","register"})
	private void end() {
		System.out.println("Ended");
	}

}
