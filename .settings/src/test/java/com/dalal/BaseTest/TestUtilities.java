package com.dalal.BaseTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

public class TestUtilities extends BaseTest {

	public void writeData(int sheetIndex,String email, String password, String fn, String ln) throws IOException {
		String path = System.getProperty("user.dir") + "\\resources\\DalalStreetSheet.xlsx";
		FileInputStream fis = new FileInputStream(path);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheetAt(sheetIndex);

		int numberOfRows = sh.getPhysicalNumberOfRows();
		int i = 0;

		Iterator<Row> rowit = wb.getSheetAt(0).iterator();

		while (rowit.hasNext()) {
			rowit.next();
			if (sh.getRow(i).getCell(1) == null) {
				wb.getSheetAt(sheetIndex).getRow(i).createCell(1).setCellValue(email);
				wb.getSheetAt(sheetIndex).getRow(i).createCell(2).setCellValue(password);
				wb.getSheetAt(sheetIndex).getRow(i).createCell(3).setCellValue(fn);
				wb.getSheetAt(sheetIndex).getRow(i).createCell(4).setCellValue(ln);

				FileOutputStream fos = new FileOutputStream(path);
				wb.write(fos);
				System.out.println("Data andar write ho gaya");
				break;

			}
			i++;
		}
		System.out.println("Data write ho gaya");

	}

	public void writeData2(String email, String password, String fn, String ln, String email1, String password1,
			String fn1, String ln1, String pm) throws IOException {
		String path = System.getProperty("user.dir") + "\\resources\\DalalStreetSheet.xlsx";
		FileInputStream fis = new FileInputStream(path);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheetAt(1);

		int numberOfRows = sh.getPhysicalNumberOfRows();
		int i = 0;

		Iterator<Row> rowit = wb.getSheetAt(0).iterator();

		while (rowit.hasNext()) {
			rowit.next();
			if (sh.getRow(i).getCell(1) == null) {
				wb.getSheetAt(1).getRow(i).createCell(1).setCellValue(email);
				wb.getSheetAt(1).getRow(i).createCell(2).setCellValue(password);
				wb.getSheetAt(1).getRow(i).createCell(3).setCellValue(fn);
				wb.getSheetAt(1).getRow(i).createCell(4).setCellValue(ln);
				wb.getSheetAt(1).getRow(i).createCell(1).setCellValue(email1);
				wb.getSheetAt(1).getRow(i).createCell(2).setCellValue(password1);
				wb.getSheetAt(1).getRow(i).createCell(3).setCellValue(fn1);
				wb.getSheetAt(1).getRow(i).createCell(4).setCellValue(ln1);
				wb.getSheetAt(1).getRow(i).createCell(4).setCellValue(pm);

				FileOutputStream fos = new FileOutputStream(path);
				wb.write(fos);
				System.out.println("Data andar write ho gaya");
				break;

			}
			i++;
		}
		System.out.println("Data write ho gaya");

	}

      public static void takeSS(String fileName) {
		
		String path =System.getProperty("user.dir")+"\\MyTestOutPut\\"+fileName; 
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		File src = ts.getScreenshotAs(OutputType.FILE);
	    File des = new File(path);
	    try {
			FileHandler.copy(src, des);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	
	
}
}