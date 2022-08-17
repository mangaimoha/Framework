package org.ng.testng.grouping;

import org.testng.annotations.Test;

public class C {

	@Test(groups= {"sanity","smoke"})
	private void tc7() {
		long id = Thread.currentThread().getId();
		System.out.println("Test7 "+id);
	}
	
	
	@Test(groups="smoke")
	private void tc8() {
		long id = Thread.currentThread().getId();
		System.out.println("Test8 "+id);
	}
	
	
	@Test(groups= {"sanity","smoke"})
	private void tc9() {
		long id = Thread.currentThread().getId();
		System.out.println("Test9 "+id);
	}
}
