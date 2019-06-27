package com.actitime.filelib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcel {

	public static void main(String[] args) throws Throwable {
		/* get java object of the physical file */
		
		FileInputStream fiobj=new FileInputStream("C:\\Users\\Bothers\\eclipse-workspace\\seleniumNew\\TestData\\TestData.xls.xlsx");

		/* Step-1:Open workbook in read mode */
		
		Workbook wb=WorkbookFactory.create(fiobj);
		
		/*Step-2: get the control of the "Sheet2" */
		
		org.apache.poi.ss.usermodel.Sheet sh=wb.getSheet("Sheet2");
		
		/*Step-3: get the control of the "3dr Row" (row and column index start from 0 */
		
		Row row= sh.getRow(7);
		
		/*step-4: Read data from the 3dr column */
		
		
		String data1=row.getCell(2).getStringCellValue();
		String data2=row.getCell(3).getStringCellValue();
		
		System.out.println(data1);
		System.out.println(data2);
		/* Step-5: Close the workBook */
		wb.close();

	}

}
