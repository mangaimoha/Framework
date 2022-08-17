package org.ng.testng.grouping;

import org.testng.annotations.Test;

public class B {

	@Test(groups= {"sanity","reg"})
	private void tc4() {
		long id = Thread.currentThread().getId();
		System.out.println("Test4 "+id);
	}
	
	
	@Test(groups="reg")
	private void tc6() {
		long id = Thread.currentThread().getId();
		System.out.println("Test6 "+id);
	}
	
	
	@Test(groups= {"sanity","reg"})
	private void tc5() {
		long id = Thread.currentThread().getId();
		System.out.println("Test5 "+id);
	}
}
