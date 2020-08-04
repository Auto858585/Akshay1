import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Readdata {
	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		
	

	FileInputStream fis = new FileInputStream("‪H:\\AKSHAY\\seleniumdata.xlsx");
	
	Workbook w = WorkbookFactory.create(fis);
	Sheet s = w.getSheet("Sheet1");
	Row firstrow = s.getRow(0);

	int rowcount = s.getPhysicalNumberOfRows();
	for (int i = 0; i < rowcount; i++) {
		for (int j = 0; j < firstrow.getFirstCellNum(); j++) {
			Cell cl = s.getRow(i).getCell(j);
			System.out.println(cl+"  ");

		}
		System.out.println();
}
}}