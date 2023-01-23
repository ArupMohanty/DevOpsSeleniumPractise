package DevOpsSeleniumPractise.DevOpsSeleniumPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Emirates {
	@Test
	public static void emiratesLoginPage() throws InterruptedException {
		
		//Below 2 lines code are to click on the Webpage notification (Push notifications)
		//ChromeOptions options = new ChromeOptions();
		//options.addArguments("--disable-notifications");
		//System.setProperty("webdriver.chrome.driver", "D:\\SeleniumWork\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.emirates.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']")).click();
		String expectedTitel = "Emirates | Fly Better";
		String originalTitel = driver.getTitle();
		Assert.assertEquals(expectedTitel, originalTitel);
		driver.quit();
	}
	
	

}
