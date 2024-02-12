package TestNGPackage;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Params {
	@Test
    @Parameters({"val1","val2"})
	public void sum(int a,int b)
	{
		int sum=a+b;
		System.out.println("Sum is : "+sum);
	}
	
	@Test
	@Parameters({"val1","val2"})
	public void Dif(int a,int b)
	{
		int sum=a-b;
		System.out.println("Dif is : "+sum);
	}

}
