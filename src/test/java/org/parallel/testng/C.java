package org.parallel.testng;

import org.testng.annotations.Test;

public class C {

	@Test(groups= {"classC"}, dependsOnGroups= {"classB"}, priority=1)
	private void tc7() {
		long id = Thread.currentThread().getId();
		System.out.println("Test7 "+id);
	}
	
	
	@Test(groups= {"classC"}, dependsOnGroups= {"classB"}, priority=2)
	private void tc8() {
		long id = Thread.currentThread().getId();
		System.out.println("Test8 "+id);
	}
	
	
	@Test(groups= {"classC"}, dependsOnGroups= {"classB"}, priority=3)
	private void tc9() {
		long id = Thread.currentThread().getId();
		System.out.println("Test9 "+id);
	}
}
