package com.Utility;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {
	XSSFWorkbook wb;

	public ExcelDataProvider() throws Exception {
		String path = "C:\\Users\\Windows 10\\eclipse-workspace\\WebAutomation\\TestData\\Test.xlsx";
		FileInputStream fis1 = new FileInputStream(path);
		wb = new XSSFWorkbook(fis1);
	}

	public String getStringData(String sheetname, int row, int cell) {
		return wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();

	}

}
