package testCase;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import BasicAutomation.Bongo.DriverSetup;

public class TC_001 {

	public static class TestClass extends DriverSetup {
		public static String baseUrl = "https://bongobd.com/";
		
		
		@Test
		public static void testNavbar() throws InterruptedException 
		{
			driver.get(baseUrl);
			new WebDriverWait(driver, Duration.ofSeconds(10));
			driver.manage().window().maximize();
			Thread.sleep(10000);
			
			driver.findElement(By.xpath("//*[@id='root']/ div/div/div/div[2]/header/div/div/div[2]/div[2]/div[1]/div[2]/input")).sendKeys("Panther");
            Thread.sleep(5000);
            driver.findElement(By.xpath("//*[@id='root']/ div/div/div/div[2]/header/div/div/div[2]/div[2]/div[1]/div[2]/input")).sendKeys(Keys.RETURN);
            Thread.sleep(10000);
            driver.findElement(By.xpath("//*[@id='root']/div/div/div/div[3]/div/div/div/div[1]/div/div[2]/div/a/div/div/div/div[1]/div/img")).click();
            Thread.sleep(60000);
         
		}

	}
}
