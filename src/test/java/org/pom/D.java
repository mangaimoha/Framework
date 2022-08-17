package org.pom;

import org.testng.annotations.Test;

public class D {

	@Test(groups= "sanity")
	private void tc10() {
		long id = Thread.currentThread().getId();
		System.out.println("Test10 "+id);
	}
}
