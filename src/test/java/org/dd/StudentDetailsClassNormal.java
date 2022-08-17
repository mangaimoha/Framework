package org.dd;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class StudentDetailsClassNormal {

	public static void main(String[] args) throws IOException {
		
		File f = new File
				("C:\\Users\\HP\\eclipse_SeleniumFramework\\MavenProject\\ExternalFiles\\StudentDetails.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheet = wb.getSheet("Sheet1");
		for(int i=0; i<sheet.getPhysicalNumberOfRows(); i++) {
			Row row = sheet.getRow(i);
			for(int j=0; j<row.getPhysicalNumberOfCells(); j++ ) {
				Cell cell = row.getCell(j);
				System.out.print(cell+" ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*int rowCount = sheet.getPhysicalNumberOfRows();
		int cellCount = 0;
		for(int i=0; i<rowCount; i++) {
			Row row = sheet.getRow(i);
			int cellCountPerRow = row.getPhysicalNumberOfCells();
			cellCount= cellCount+cellCountPerRow;
		}
		System.out.println("Total Number Of Rows = "+rowCount);
		System.out.println("Total Number of Cells = "+cellCount);*/
	}

}
