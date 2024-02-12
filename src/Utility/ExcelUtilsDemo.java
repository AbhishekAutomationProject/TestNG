package Utility;

import static org.testng.Assert.assertNotNull;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openxmlformats.schemas.drawingml.x2006.main.CTRegularTextRun;
import org.testng.annotations.DataProvider;

public class ExcelUtilsDemo {
	private static XSSFWorkbook excelWorkbook;
	private static XSSFSheet eSheet;
	private static XSSFRow rXssfRow;
	private static XSSFCell xssfCell;
	
	public static  Object[][] DataMethod(String FPath,String SName) throws IOException
	{
		String data[][]=null;
		FileInputStream fis = new FileInputStream(FPath);
		excelWorkbook=new XSSFWorkbook(fis);
		eSheet=excelWorkbook.getSheet(SName);
		int startRow=1;
		int startCol=1;
		int ci,cj;
		int lastRow=eSheet.getLastRowNum();
		int lastCol=2;
		data=new String[lastRow][lastCol];
		ci=0;
		for(int i=startRow;i<=lastRow;i++,ci++)
		{
			cj=0;
		      for(int j=startCol;j<=lastCol;j++,cj++)
		    {
			   data[ci][cj]=getCellData(i,j);
			   System.out.println(data[ci][cj]);
		    }
	   }
		return(data);
	}
	
    public static String getCellData(int Row,int Col)
    {
    	xssfCell=eSheet.getRow(Row).getCell(Col);
    	String valueString=xssfCell.getStringCellValue();
    	return(valueString);
    }
    
}
