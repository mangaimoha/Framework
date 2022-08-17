package org.dd;

import java.io.IOException;
import org.demo.LibGlobalClass;

public class StudentDetailsClassLib extends LibGlobalClass {

	public static void main(String[] args) throws IOException {
		
		//getAllDataFromExcel("StudentDetails", "Sheet1");	
		
		int rowCount = getTotalNumberOfRows("StudentDetails", "Sheet1");
		System.out.println(rowCount);
		
		addRowToExcel("StudentDetails", "Sheet1",11,0,"Pravi");
		addCellToExcel("StudentDetails", "Sheet1",11,1,"CSE");		
		
	}
}
































		/*int rowCount = getTotalNumberOfRows("StudentDetails", "Sheet1");
		int cellCount = getTotalNumberOfCells("StudentDetails", "Sheet1");
		System.out.println("No. of rows = "+rowCount);
		System.out.println("No. of cells = "+cellCount);

	}

}*/
