package org.dd;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class UpdateInAFile {

	public static void main(String[] args) throws IOException {
		
				//existing file named createfile
				File f = new File("C:\\Users\\HP\\eclipse_SeleniumFramework\\MavenProject\\ExternalFiles\\CreateFile.xlsx");
				
				FileInputStream fis = new FileInputStream(f);
				//get a workbook
				Workbook  wb = new XSSFWorkbook(fis);
				
				//get a sheet
				Sheet sheet = wb.getSheet("LoginDetails"); 
				
				Row row = sheet.getRow(1);
				Cell cell = row.getCell(0);
				String name = cell.getStringCellValue();
				
				if(name.startsWith("M")) {
					cell.setCellValue("Mythili");
				}
				else {
					cell.setCellValue("Manivel");
				}
				
				FileOutputStream fos = new FileOutputStream(f);
				wb.write(fos);
				System.out.println("done");
	}

}
