package org.dd;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FormatDDClass {

	public static void main(String[] args) throws IOException {

		File f = new File(
				"C:\\Users\\HP\\eclipse_SeleniumFramework\\MavenProject\\ExternalFiles\\EmployeeDetails.xlsx");
		FileInputStream fs = new FileInputStream(f); //throws FileNotFoundException
		Workbook wb = new XSSFWorkbook(fs); // throws IO Exception
		Sheet sheet = wb.getSheet("Sheet1");
		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			Row row = sheet.getRow(i);
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				Cell cell = row.getCell(j);
				int cellType = cell.getCellType();

				// if cell type is string then getCellType returns 1 else 0 (0 for number/date
				// format)
				// if cell type is String

				if (cellType == 1) {
					String value1 = cell.getStringCellValue();
					System.out.print(value1 + " ");
				}

				// if cell type is in date format.
				else if (DateUtil.isCellDateFormatted(cell)) {
					Date date = cell.getDateCellValue();
					SimpleDateFormat sdf = new SimpleDateFormat("dd-MMMMM-yyyy");
					String value2 = sdf.format(date);
					System.out.print(value2 + " ");
				}

				// if cell type is in numeric format
				else {
					double decimal = cell.getNumericCellValue();

					// convert double to numeric then to string
					long number = (long) decimal;
					String value3 = String.valueOf(number);
					System.out.print(value3 + " ");
				}
			}

			System.out.println();
		}

	}

}
