package org.ng.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNGClass {

	@BeforeClass
	private void start() {
		System.out.println("Start before class");
	}
	@Test
	private void tc1() {
    System.out.println("TC1");
	}
	
	@Test
	private void tc2() {
		System.out.println("TC2");
	}
	@AfterClass
	private void end() {
		System.out.println("Start before class");
	}

}
