package com.automation.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.nio.file.Files;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;


public class ExcelDataProvidery2y {
	
	XSSFWorkbook wb;
	
	public ExcelDataProvidery2y() {
	
	File  src=new File ("./Testdata/data.xlsx");
try
{
	FileInputStream ab=new FileInputStream(src);
	
	wb=new XSSFWorkbook(ab);
}

	
catch(Exception e){
	

System.out.println(" data");
}
	}

	
	public String getStringData1 (String Sheetname,int Row,int Cell) {
		
	
return wb.getSheet(Sheetname).getRow(Row).getCell(Cell).getStringCellValue();
		
	}
	
	
	public String getStringData(String SheetIndex,int Row,int Cell) {
		 
	
return wb.getSheet(SheetIndex).getRow(Row).getCell(Cell).getStringCellValue();
		
	}
	
	public double getNumericData(String Sheetname,int Row,int Cell) {
		
	
return wb.getSheet(Sheetname).getRow(Row).getCell(Cell).getNumericCellValue();
	}
}