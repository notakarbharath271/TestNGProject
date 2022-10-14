package dataprovidertest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderDemo1 {
	@Test(dataProvider = "getData",dataProviderClass = ReadDataFromExcel.class)
	public void orangeHRMLogin(String username, String password) throws Throwable {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();

		boolean profilepic = driver.findElement(By.xpath("//*[@alt='profile picture']")).isDisplayed();
		SoftAssert sfa = new SoftAssert();
		sfa.assertTrue(profilepic);
		driver.quit();
		Thread.sleep(2000);
		sfa.assertAll();

	}

	

}
