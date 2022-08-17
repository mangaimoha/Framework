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

public class DataDrivenClass {

	public static void main(String[] args) throws IOException {

		// Filelocation
		File f = new File(
				"C:\\Users\\HP\\eclipse_SeleniumFramework\\MavenProject\\ExternalFiles\\EmployeeDetails.xlsx");

		// Read a file
		FileInputStream input = new FileInputStream(f);

		// to fetch the entire excel
		Workbook wb = new XSSFWorkbook(input);

		// to fetch the particular sheet
		Sheet sheet = wb.getSheet("Sheet1");

		int rowsNo = sheet.getPhysicalNumberOfRows();

		// to fetch particular Row
		Row row = sheet.getRow(2);

		int cellsNo = row.getPhysicalNumberOfCells();// --> no of cells in 2 nd row

		// to fetch particular Cell
		Cell cell = row.getCell(2);

		System.out.println(cell);

		// to fetch all cells in particular row
		for (int i = 0; i < cellsNo; i++) {
			Cell cell2 = row.getCell(i);
			System.out.println(cell2); // -- output not in a given format
		}
		System.out.println("------------------");

		// to fetch all rows and cells
		for (int i = 0; i < rowsNo; i++) {
			Row row2 = sheet.getRow(i);
			for (int j = 0; j < row2.getPhysicalNumberOfCells(); j++) {
				Cell cell2 = row2.getCell(j);
				System.out.print(cell2 + " ");
			}
			System.out.println();
		}

		// to fetch all rows but 2nd cell
		for (int i = 0; i < rowsNo; i++) {
			Row row2 = sheet.getRow(i);
			Cell cell2 = row2.getCell(1);
			System.out.println(cell2 + " ");
		}
	}

}
