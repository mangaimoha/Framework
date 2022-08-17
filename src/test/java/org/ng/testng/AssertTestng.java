package org.ng.testng;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertTestng {
	
	SoftAssert s;
/*	//HardAssert
	@Test
	private void tc1() {
		Assert.assertTrue(true, "Check TC1 ");
		System.out.println("TC1");
	}
	
	@Test
	private void tc2() {
		Assert.assertTrue(false, "Check TC2 ");
		System.out.println("TC2");
		
		Assert.assertTrue(true, "Check TC2...1 ");
		System.out.println("TC2");
	}
	
	@Test
	private void tc3() {
		Assert.assertTrue(true, "Check TC3 ");
		System.out.println("TC1");
	}*/
	
	@Test
	private void tc1() {
		s=new SoftAssert();
		s.assertTrue(true, "Check TC1 ");
		System.out.println("TC1");
	}
	
	@Test
	private void tc2() {
		s=new SoftAssert();
		s.assertTrue(false, "Check TC2 ");
		System.out.println("TC2");
		
		s.assertTrue(true, "Check TC2...1 ");
		System.out.println("TC2");
		
		s.assertAll();
	}
	
	@Test
	private void tc3() {
		s=new SoftAssert();
		s.assertTrue(true, "Check TC3 ");
		System.out.println("TC1");
	}

}
