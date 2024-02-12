package TestNGPackage;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class PrallelExecution {
	@Test
	public void methodDemo1()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abhirema\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.get("https://shop.demoqa.com/");
	    WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='My Account']")));
	    driver.findElement(By.xpath("//*[text()='My Account']")).click();
	    driver.findElement(By.id("username")).sendKeys("abv");
	    driver.findElement(By.id("password")).sendKeys("abc");
	    driver.findElement(By.name("login")).click();
	    driver.findElement(By.xpath("(//a[text()='Log out'])[1]")).click();
	    driver.quit();
	}
	@Test
	public void methodDemo2()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abhirema\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.get("https://shop.demoqa.com/");
	    WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='My Account']")));
	    driver.findElement(By.xpath("//*[text()='My Account']")).click();
	    driver.findElement(By.id("username")).sendKeys("abv");
	    driver.findElement(By.id("password")).sendKeys("abc");
	    driver.findElement(By.name("login")).click();
	    driver.findElement(By.xpath("(//a[text()='Log out'])[1]")).click();
	    driver.quit();
	}

}
