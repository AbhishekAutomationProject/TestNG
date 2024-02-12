package TestNGPackage;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DpMethod {
   @DataProvider(name="data-provider")
   public Object[][] dpMethod()
   {
	   return new Object[][] {{"First"}};
   }
   @Test(dataProvider = "data-provider")
   public void test(String val)
   {
	   System.out.println("Value passed: "+val);
   }
}
