package com.ExcelData;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelData {

	public static void main(String[] args) throws Exception 
	{
		
		
		FileInputStream fis = new FileInputStream("C:\\Users\\Akshara\\Desktop\\LoginTest.xlsx");
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("LoginTest");
		XSSFRow row = sheet.getRow(2);
		XSSFCell cell = row.getCell(1);
		String val = cell.getStringCellValue();
		System.out.println(val);
		wb.close();
		fis.close();
		
		
		
	}
	
	
	

}
