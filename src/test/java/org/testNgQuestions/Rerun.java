package org.testNgQuestions;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Rerun implements IRetryAnalyzer{
int min=1, max=5;
	public boolean retry(ITestResult result) {
		if(min<max) {
			return true;
		}
		return false;
	}
	
}
