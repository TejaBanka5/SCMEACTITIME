package com.actitime.generics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib {
public String getpropertyvalue(String key) throws IOException {
	FileInputStream fis = new FileInputStream("./data/comondata.property");
	Properties p = new Properties();
	p.load(fis);
	String value = p.getProperty(key);
	return value;
}
public String getExcelvalue(String sheetname, int row, int cell) throws IOException {
	FileInputStream fex = new FileInputStream("./data/testscriptdata.xlsx");
	Workbook wb = WorkbookFactory.create(fex);
	String evalue = wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
	return evalue;
}
}
