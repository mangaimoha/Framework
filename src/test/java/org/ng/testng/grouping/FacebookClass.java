package org.ng.testng.grouping;

import org.testng.annotations.Test;

public class FacebookClass {

	@Test(groups = { "login", "register" })
	private void email() {
		System.out.println("Get Email");
	}

	@Test(groups = "login")
	private void password() {
		System.out.println("Get Password");
	}

	@Test
	private void sign() {
		System.out.println("signup");
	}

	@Test(groups = "login")
	private void loginBtn() {
		System.out.println("Get loginbtn");
	}

	@Test(groups = "register")
	private void fName() {
		System.out.println("Get fname");
	}

	@Test(groups = "register")
	private void lName() {
		System.out.println("Get lname");
	}

	@Test(groups = { "login", "register" })
	private void phone() {
		System.out.println("Get phone");
	}

	@Test(groups = "register")
	private void regBtn() {
		System.out.println("Get regbtn");
	}

}
