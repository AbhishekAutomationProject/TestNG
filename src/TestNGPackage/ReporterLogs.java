package TestNGPackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ReporterLogs {
	@Test(priority = 1)
	public void closeBrowser()
	{
		Reporter.log("Report1");
		Reporter.log("Close Browser");
		System.out.println("Broswer is Closed");
		Reporter.log("Report2");
		Reporter.log("Close Browser");
	}
    @Test(priority = 0)
    public void openBrowser()
	{
    	Reporter.log("Report3");
		Reporter.log("open Browser");
		System.out.println("Broswer is opened");
		Reporter.log("Report4");
		Reporter.log("open Browser");
	}
}
