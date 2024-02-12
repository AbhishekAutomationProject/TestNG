package TestNGPackage;


import org.testng.annotations.Test;

public class Priority1 {
	@Test(priority = 1)
	public void first()
	{
		System.out.println("first");
	}
	@Test(priority = 0)
	public void second()
	{
		System.out.println("second");
	}

}
