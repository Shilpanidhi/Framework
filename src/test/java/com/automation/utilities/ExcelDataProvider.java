package com.automation.utilities;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {
	XSSFWorkbook wb;
	
	public  ExcelDataProvider() {
			
		
	File src=new File("./Testdata/data.xlsx");
		try {
		
			

		FileInputStream   abcd=new FileInputStream(src);
		wb=new XSSFWorkbook(abcd);
	
		}
		
		
		catch(Exception e){
			
			System.out.println("could not read excel data");
			
		}
		
		
		}
	
	public String getStringData(String sheetName,int Row,int Cell) {
		
		
	return	wb.getSheet(sheetName).getRow(Row).getCell(Cell).getStringCellValue();
	
		
		
	}
	public String getStringData(int sheetIndex,int Row,int Cell) {
		
		
		return	wb.getSheetAt(sheetIndex).getRow(Row).getCell(Cell).getStringCellValue();
		
			
			
		}
	public double getNumericData(String sheetName,int Row,int Cell) {
		
		
		return	wb.getSheet(sheetName).getRow(Row).getCell(Cell).getNumericCellValue();
		
			
			
		}
	
	
	
	
	
	
	
	
	
		
}	
		
	
	


