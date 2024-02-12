import java.util.List;
import java.util.Map;

import org.testng.IReporter;
import org.testng.ISuite;
import org.testng.ISuiteResult;
import org.testng.ITestContext;
import org.testng.xml.XmlSuite;

public class ListenersReport implements IReporter {
	@Override
	public void generateReport(List<XmlSuite> xSuite,List<ISuite> suite,String outputDirectory)
	{
		for(ISuite suite1:suite)
		{
			String suiteName=suite1.getName();
			Map<String, ISuiteResult> isuiteResultMap=suite1.getResults();
			for(ISuiteResult sr:isuiteResultMap.values())
			{
				ITestContext tc=sr.getTestContext();
				System.out.println("Result: "+tc.getPassedTests().getAllResults().size());
			}
				
		}
		
	}			
}
