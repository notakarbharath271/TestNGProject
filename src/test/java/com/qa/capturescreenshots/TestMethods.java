package com.qa.capturescreenshots;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ITestListneres.class)
public class TestMethods extends BaseClass{
	
	@Test(testName ="googleTest" )
	public void googleTest() {
		driver.get("https://www.google.co.in/");
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Selenium Java");
		driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@name='btnK']")).click();
		String actual = driver.getTitle();
		//System.out.println(actual);
		Assert.assertEquals(actual, "Selenium Java - Google Searche");
	}

}
