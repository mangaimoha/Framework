package org.parallel.testng;

import org.testng.annotations.Test;

public class B {

	@Test(groups= {"classB"}, dependsOnGroups= {"classA"},priority=1)
	private void tc4() {
		long id = Thread.currentThread().getId();
		System.out.println("Test4 "+id);
	}
	
	
	@Test(groups= {"classB"}, dependsOnGroups= {"classA"}, priority=2)
	private void tc6() {
		long id = Thread.currentThread().getId();
		System.out.println("Test6 "+id);
	}
	
	
	@Test(groups= {"classB"}, dependsOnGroups= {"classA"}, priority=3)
	private void tc5() {
		long id = Thread.currentThread().getId();
		System.out.println("Test5 "+id);
	}
}
