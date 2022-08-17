package org.dd;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExistingFile {

	public static void main(String[] args) throws IOException {
		//existing file named createfile
		File f = new File("C:\\Users\\HP\\eclipse_SeleniumFramework\\MavenProject\\ExternalFiles\\CreateFile.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		//get a workbook
		Workbook  wb = new XSSFWorkbook(fis);
		
		//get a sheet
		Sheet sheet = wb.getSheet("LoginDetails"); 
		
		//create 2nd row
		Row row2 = sheet.createRow(2);
		
		//create cell
		Cell cell0 = row2.createCell(0);
		Cell cell1 = row2.createCell(1);
		
		//setcell value
		cell0.setCellValue("mohank");
		cell1.setCellValue("lmohan");
		
		//write into a file
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
		System.out.println("done");
		
		
		
		
	}

}
