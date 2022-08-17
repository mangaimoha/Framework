package org.dd;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreateNewFile {

	public static void main(String[] args) throws IOException {
		
		//file location
		File f = new File("C:\\Users\\HP\\eclipse_SeleniumFramework\\MavenProject\\ExternalFiles\\CreateFile.xlsx");
		
		//create a workbook
		Workbook  wb = new XSSFWorkbook();
		
		//create a sheet
		Sheet sheet = wb.createSheet("LoginDetails"); 
		
		//create a row
		Row row0 = sheet.createRow(0);// creating 2 rows
		Row row1 = sheet.createRow(1);
		
		//create a cell
		Cell cell00 = row0.createCell(0);
		Cell cell01 = row0.createCell(1);
		Cell cell10 = row1.createCell(0);
		Cell cell11 = row1.createCell(1);
		
		//setting a value
		cell00.setCellValue("username");
		cell01.setCellValue("password");
		cell10.setCellValue("mangaimanivel");
		cell11.setCellValue("Hermione123");
		
		//to write a file
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
		System.out.println("done");
		
		
	}

}
