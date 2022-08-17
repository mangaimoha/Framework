package org.ng.testng.grouping;

import org.testng.annotations.Test;

public class A {
	
	@Test(groups="sanity")
	private void tc1() {
		long id = Thread.currentThread().getId();
		System.out.println("Test1 "+id);
	}
	
	
	@Test(groups= {"sanity","reg"})
	private void tc2() {
		long id = Thread.currentThread().getId();
		System.out.println("Test2 "+id);
	}
	
	
	@Test(groups="sanity")
	private void tc3() {
		long id = Thread.currentThread().getId();
		System.out.println("Test3 "+id);
	}
			
		
	}
	
	


