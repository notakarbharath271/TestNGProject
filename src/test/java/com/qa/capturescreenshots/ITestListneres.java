package com.qa.capturescreenshots;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ITestListneres extends BaseClass implements ITestListener{

	@Override
	public void onTestFailure(ITestResult result) {
		captureScreenshot(result.getTestContext().getName()+"_"+result.getMethod().getMethodName()+".png");
	}
	

}
