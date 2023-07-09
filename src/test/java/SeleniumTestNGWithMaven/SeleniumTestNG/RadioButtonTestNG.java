package SeleniumTestNGWithMaven.SeleniumTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RadioButtonTestNG {
	public WebDriver driver =null;
	@BeforeClass
	public void launchChromeBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver(); 
	}
	@BeforeMethod
	public void launchAirIndia() {
		 String baseUrl = "https://www.airindia.com/";
		 driver.get(baseUrl);
		
	}
	@Test
	public void clickRadioButton() throws InterruptedException {
		//driver.findElement(By.id("c-p-bn")).click();
		driver.manage().window().maximize();
		// driver.findElement(By.xpath("//*[@id=\"mat-radio-2\"]")).click();
		Thread.sleep(3000);
		 driver.findElement(By.id("mat-radio-2")).click();
		 Thread.sleep(5000);
		 driver.findElement(By.id("mat-radio-3")).click();
		 Thread.sleep(4000);
		 driver.findElement(By.linkText("Multicity")).click();
	}

	@AfterMethod
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(5000);
		driver.close();
	}
}
