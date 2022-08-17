package org.parallel.testng;

import org.testng.annotations.Test;

public class A {
	
	@Test(groups="classA", priority=1)
	private void tc1() {
		long id = Thread.currentThread().getId();
		System.out.println("Test1 "+id);
	}
	
	
	@Test(groups="classA", priority=2)
	private void tc2() {
		long id = Thread.currentThread().getId();
		System.out.println("Test2 "+id);
	}
	
	
	@Test(groups="classA", priority=3)
	private void tc3() {
		long id = Thread.currentThread().getId();
		System.out.println("Test3 "+id);
	}

}
