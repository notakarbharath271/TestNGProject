package com.qa.ilisteners;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(IlistenersDemo.class)
public class TestListeners {
	@Test(priority = 0)
	public void method1() {
		System.out.println("Method m1");
	}
	@Test(priority = 1,timeOut = 1000)
	public void method2() throws Exception {
		Thread.sleep(2000);
		System.out.println("Method m2");
	}
	@Test(priority = 2,dependsOnMethods = "method2")
	public void method3() {
		System.out.println("Method m3");
	}
	@Test(priority = 3)
	public void method4() {
		Assert.assertTrue(false);
		System.out.println("Method m4");
	}
	@Test(priority = 4)
	public void method5() {
		System.out.println("Method m5");
	}
	
	

}
