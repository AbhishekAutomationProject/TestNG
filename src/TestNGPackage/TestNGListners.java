package TestNGPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenersTestNG.class)
public class TestNGListners {
	
	
	@Test  //Success Test
	public void CloseBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abhirema\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.close();
		Reporter.log("Driver Closed After Testing");
	}
	
	@Test //Failed Test
	public void OpenBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abhirema\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	        
	        driver.get("https://www.demoqa.com");
	        String expectedTitle = "Free QA Automation Tools For Everyone";
	        String originalTitle = driver.getTitle();
	        Assert.assertEquals(originalTitle, expectedTitle, "Titles of the website do not match");
  }
	private int i = 1;

	@Test (successPercentage = 60, invocationCount = 3) //Failing Within Success
	public void AccountTest() {
			if(i < 2)
				Assert.assertEquals(i , i);
		i++;
	}
	
	@Test  // Skip Test
	public void SkipTest() {
		throw new SkipException("Skipping The Test Method ");
	}

}
