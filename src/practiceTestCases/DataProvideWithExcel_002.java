package practiceTestCases;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Utility.ExcelUtilsNew;

public class DataProvideWithExcel_002 {
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("BeforeMethod");
	}
	@Test(dataProvider = "Auth")
	public void register(String sUserName,String sPassword)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abhirema\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.get("https://shop.demoqa.com/");
	    WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='My Account']")));
	    driver.findElement(By.xpath("//*[text()='My Account']")).click();
	    driver.findElement(By.id("username")).sendKeys(sUserName);
	    driver.findElement(By.id("password")).sendKeys(sPassword);
	    driver.findElement(By.name("login")).click();
	    driver.findElement(By.xpath("(//a[text()='Log out'])[1]")).click();
	    driver.quit();
	}
	@DataProvider
	public Object[][] Auth(){
		Object[][] bojObjects=ExcelUtilsNew.data("C://Users//Abhirema//eclipse-workspace//TestNGProject1//src//testData//TestData.xlsx","Sheet1");
		return (bojObjects);
	}
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("After Method");
	}

}
