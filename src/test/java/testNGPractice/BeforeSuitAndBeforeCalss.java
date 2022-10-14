package testNGPractice;

import org.testng.annotations.*;


public class BeforeSuitAndBeforeCalss {
	@BeforeSuite
	public void openBroeswe() {
		System.out.println("Browser opened");
	}
	@BeforeClass
	public void Login() {
		System.out.println("Login method");
	}
	@Test
	public void Test() {
		System.out.println("Test method");
	}
	@AfterClass
	public void logout() {
		System.out.println("logout method");
	}
	@AfterSuite
	public void closeBroeswe() {
		System.out.println("close browser");
	}


}
