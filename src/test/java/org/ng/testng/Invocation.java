package org.ng.testng;

import org.testng.annotations.Test;

public class Invocation {

	@Test
	private void tc1() {
		System.out.println("-----TC1------");
	}
	
	@Test(enabled=false)
	private void tc2() {
		System.out.println("-----TC2------");
	}
	
	@Test(enabled=true)
	private void tc3() {
		System.out.println("-----TC3------");
	}
	
	@Test(invocationCount=5)
	private void tc4() {
		System.out.println("-----TC4------");
	}
	
	@Test
	private void tc5() {
		System.out.println("-----TC5------");
	}
	
}
