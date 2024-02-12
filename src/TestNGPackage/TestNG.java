package TestNGPackage;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

import java.sql.Driver;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class TestNG {
	
	@Test
	public void f() {
		    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abhirema\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		    String baseUrl = "https://www.toolsqa.com/";  
	        System.out.println("Launching Google Chrome browser"); 
	        WebDriver driver = new ChromeDriver();
	        driver.get(baseUrl);
	        String testTitle = "Free QA Automation Tools For Everyone";
	        String originalTitle = driver.getTitle();
	        System.out.print(originalTitle);
//	        Assert.assertEquals(originalTitle, testTitle);
  }
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Starting Test On Chrome Browser");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("Finished Test On Chrome Browser");
	}
}
