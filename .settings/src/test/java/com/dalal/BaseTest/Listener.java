package com.dalal.BaseTest;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener extends BaseTest implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
      
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {

	}

	@Override
	public void onTestFailure(ITestResult result) {
      
		TestUtilities.takeSS(result.getName()+"-"+System.currentTimeMillis()+".png");
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	}

	

	@Override
	public void onFinish(ITestContext context) {
		
		
	}

}
