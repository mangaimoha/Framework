package org.framework.junit;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

public class RunAllAdactInApp {
	
	@Test
	public void tcResult() {
//TestSuite
		Result run = JUnitCore.runClasses(SearchHotelTC.class, BookHotelTC.class);
		System.out.println("Run count: "+run.getRunCount());
		System.out.println("Ignore count: "+ run.getIgnoreCount());
		System.out.println("Failure Count: "+run.getFailureCount());
		System.out.println(run.getRunCount());
		
	}

}
