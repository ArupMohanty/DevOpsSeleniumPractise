package DevOpsSeleniumPractise.DevOpsSeleniumPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Spicejet {
	
		@Test
		public static void spicejetLoginPage() throws InterruptedException {
			
			//Below 2 lines code are to click on the Webpage notification (Push notifications)
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-notifications");
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver(options);
			driver.get("https://www.spicejet.com/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			String expectedTitel = "SpiceJet - Flight Booking for Domestic and International, Cheap Air Tickets";
			String originalTitel = driver.getTitle();
			Assert.assertEquals(expectedTitel, originalTitel);
			driver.findElement(By.xpath("//div[contains(text(),'round trip')]")).click();
			driver.findElement(By.xpath("//div[@data-testid='to-testID-origin']//input[@type='text']")).click();
			driver.findElement(By.xpath("//div[@data-testid='to-testID-origin']//input[@type='text']")).sendKeys("Mum");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@data-testid='to-testID-destination']//input[@type='text']")).sendKeys("MAA");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1euycsn']//div[3]//div[1]//div[3]//div[2]//div[3]//div[1]//div[1]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//body[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[2]/div[4]/div[1]/div[2]/div[2]/div[3]/div[2]/div[1]/div[4]/div[1]/div[3]/div[2]/div[3]/div[1]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-1awozwy r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-1g94qm0 r-1w50u8q r-ah5dr5 r-1otgn73'])[1]")).click();
			Thread.sleep(3000);
//			WebElement expectedText = driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-1awozwy r-1xfd6ze r-1loqt21 r-18u37iz r-1777fci r-1j3t67a r-1w50u8q r-ah5dr5 r-1otgn73 r-1wn9b5e'])[1]"));
//			String actualText = "Modify Search";
//			Assert.assertEquals(expectedText, actualText);
			driver.quit();
			
		}
		
		

	

}
