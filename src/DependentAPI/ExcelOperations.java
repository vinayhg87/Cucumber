package DependentAPI;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import DependentInterfaces.ProjectConstants;

public class ExcelOperations implements ProjectConstants 
{
	
	public String excelDataRead(String sheetname,int rownum, int cellnum)
	{
		String result=null;
		try {
				Workbook wb = WorkbookFactory.create(new FileInputStream(ExcelFile));
				Sheet sh = wb.getSheet(sheetname);
				Row rw = sh.getRow(rownum);
				Cell ce = rw.getCell(cellnum);
				result=ce.getStringCellValue();			
			}
		
		catch 
		(Exception e) 
		{
			e.printStackTrace();
			System.out.println(e);
		}
		
		return result;	
	}
	
	
	
	
	public int excelDataReadint(String sheetname,int rownum, int cellnum)
	{
		int result=0;
		try {
				Workbook wb = WorkbookFactory.create(new FileInputStream(ExcelFile));
				Sheet sh = wb.getSheet(sheetname);
				Row rw = sh.getRow(rownum);
				Cell ce = rw.getCell(cellnum);
				result=(int) ce.getNumericCellValue();			
			}
		
		catch 
		(Exception e) 
		{
			e.printStackTrace();
			System.out.println(e);
		}
		
		return result;	
	}
	
	
	
	
	
	public void excelDataWrite(String sheetname,int rownum, int cellnum, String data)
	{
		try {
				Workbook wb = WorkbookFactory.create(new FileInputStream(ExcelFile));
				Sheet sh = wb.getSheet(sheetname);
				Row rw = sh.createRow(rownum);
				Cell ce = rw.createCell(cellnum);
				ce.setCellValue(data);
				FileOutputStream fs = new FileOutputStream(ExcelFile);
				wb.write(fs);
				fs.close();
			}
		
		catch 
		(Exception e) 
		{
			e.printStackTrace();
			System.out.println(e);
		}
		
	}
}
