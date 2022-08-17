package org.framework.junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class DemoJunit {
	
@Test
public void tc1() {
	System.out.println("Test Case 1");
	
}
@Test
public void tc2() {
	System.out.println("Test Case 2");
	
}

@Test
public void tc3() {
	System.out.println("Test Case 3");
	
}

@Before
public void beforeMet() {
System.out.println("before");

}

@After
public void afterMet() {
System.out.println("after");

}

@BeforeClass
public static void beforeClassMet() {
System.out.println("beforeClass");
}

@AfterClass
public static void afterClassMet() {
System.out.println("afterClass");
}


}
