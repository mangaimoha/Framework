package org.ng.testng.rerun;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoClass {
	
	@Test(retryAnalyzer=Rerun.class)
	private void tc1() {
		System.out.println("Test 1");
	}
	
	@Test
	private void tc2() {	
		System.out.println("Test 2");
		System.out.println(2/0);
	}
	
	
	@Test(retryAnalyzer=Rerun.class)
	private void tc3() {
		System.out.println("Test 3");
		Assert.assertTrue(false,"check tc3");
	}

}
