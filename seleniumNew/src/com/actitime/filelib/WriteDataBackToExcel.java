package com.actitime.filelib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDataBackToExcel {
public static void main(String[] args) throws Throwable {
	String filePath="C:\\Users\\Bothers\\eclipse-workspace\\seleniumNew\\TestData\\TestData.xls.xlsx";
	
	/* get the java Read object of the physical file */
	FileInputStream fiobj=new FileInputStream(filePath);
	
	Workbook wb=WorkbookFactory.create(fiobj);
	
	org.apache.poi.ss.usermodel.Sheet sh=wb.getSheet("Sheet2");
	
	Row row=((org.apache.poi.ss.usermodel.Sheet) sh).getRow(7);
	
	Cell cell=row.createCell(3);
	cell.setCellValue("abcd");
	/* get the java write object of the physical file */

	FileOutputStream foObj=new FileOutputStream(filePath);
	wb.write(foObj); /* save the workbook */
	wb.close();
}
}
