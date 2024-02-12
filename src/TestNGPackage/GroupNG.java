package TestNGPackage;

		

import org.checkerframework.common.value.qual.StaticallyExecutable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.Assert;


public class GroupNG {	
//	 WebDriver driver;
	
	
    String title = "ToolsQA - Demo Website For Automation";
   
    @Test
    public void starting_point(){
//    	System.setProperty("webdriver.chrome.driver","C:\\Users\\Abhirema\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
    	System.out.println("This is the starting point of the test");
//    	 driver = new ChromeDriver();
//    	 driver.get("https://demoqa.com/");
    }
    
    
    @Test(groups = { "demo" })	
    public void checkTitle() {	
    	System.out.println("Check Title Method");
//    	System.setProperty("webdriver.chrome.driver","C:\\Users\\Abhirema\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
//       String testTitle = "Free QA Automation Tools For Everyone";
//       driver.get("https://demoqa.com/");
//       String originalTitle = driver.getTitle();
//      Assert.assertEquals(originalTitle, testTitle);
    }	
    
    @Test(groups = { "demo" })	
    public void click_element() {
//    	System.setProperty("webdriver.chrome.driver","C:\\Users\\Abhirema\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
//    	driver.get("https://demoqa.com/");
//       driver.findElement(By.xpath("//*[@id=\"sidebar\"]/aside[1]/ul/li[1]/a")).click();
        System.out.println("Home Page heading is displayed");	
    }
}