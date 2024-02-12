package Utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.security.PublicKey;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.google.common.collect.Table.Cell;

public class ExcelUtilsNew {
	private static XSSFWorkbook excelWBook;
	private static XSSFSheet exceWsheet;
	private static XSSFRow rowValue;
	private static XSSFCell colValue;
	
	public static Object[][] data(String FileName,String Sheet)
	{
		String value[][]=null;
		try {
			FileInputStream ExceStream=new FileInputStream(FileName);
			excelWBook=new XSSFWorkbook(ExceStream);
			exceWsheet=excelWBook.getSheet(Sheet);
			int ci,cj;
			int startrow=1;
			int startcol=1;
			int lastRow=exceWsheet.getLastRowNum();
			int lastCol=2;
			value=new String[lastRow][lastCol];
			ci=0;
			for(int i=startrow;i<=lastRow;i++,ci++)
			{
				cj=0;
				for(int j=startcol;j<=lastCol;j++,cj++)
				{
					value[ci][cj]=getCellData(i,j);
					System.out.println(value[ci][cj]);
				}
			}
				
		
		} catch (IOException ie) {
			 System.out.println(ie.getStackTrace());
			// TODO: handle exception
		}
		return(value);
	}
	public static String getCellData(int rvalue,int cvalue)
	{
		colValue=exceWsheet.getRow(rvalue).getCell(cvalue);
		String celldate=colValue.getStringCellValue();
		return celldate;	
	}

}

