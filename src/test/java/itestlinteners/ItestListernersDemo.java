package itestlinteners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ItestListernersDemo implements ITestListener{
	// When Test case get Started, this method is called.
	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("onTestStart method is executed --- "+result.getName());
	}
	// When Test case get passed, this method is called.
	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("onTestSuccess method is executed --- "+result.getName());
	}

	// When Test case get failed, this method is called.
	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("onTestFailure method is executed --- "+result.getName());
	}
	// When Test case get Skipped, this method is called.
	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("onTestSkipped method is executed --- "+result.getName());
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("onStart method is executed --- "+context.getName());
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("onFinish method is executed --- "+context.getName());
	}
	

}
