package TestNGPackage;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static org.testng.AssertJUnit.assertEquals;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

public class DpMethod2 {
	@DataProvider(name="Data-Provider")
	public Object[][] dpMethod()
	{
		return new Object[][] {{2,3,5},{2,5,6}};
	}
    @Test(dataProvider = "Data-Provider")
    public void sum(int a,int b,int result)
    {
    	int sum=a+b;
    	AssertJUnit.assertEquals(sum,result);
    }
}
