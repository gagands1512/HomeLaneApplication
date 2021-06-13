package com.cyient.utilites;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	public static Object[][] sheetIntObjectArray(String filePath,String sheetname) throws IOException{
		FileInputStream file = new FileInputStream(filePath);
		XSSFWorkbook book = new XSSFWorkbook(file);
		XSSFSheet sheet = book.getSheet(sheetname);
		
        int rowCount = sheet.getPhysicalNumberOfRows();		
		int cellCount = sheet.getRow(0).getPhysicalNumberOfCells();
		
		Object[][] main = new Object[rowCount-1][cellCount];
		DataFormatter format = new DataFormatter();
		
		for(int i=1;i<rowCount;i++) {
			for(int j=0;j<cellCount;j++) {
				XSSFRow row = sheet.getRow(i);
				XSSFCell cell = row.getCell(j);
				
				main[i-1][j] = format.formatCellValue(cell);
			}
		}
		
		return main;
	}

}
