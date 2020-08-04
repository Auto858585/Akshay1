package popous;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Filewrteexcel
{
   public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
	   
	     FileInputStream fis = new FileInputStream("D:\\Book1.xlsx");
	    
	     Workbook w = WorkbookFactory.create(fis);
	     Sheet sh = w.getSheet("Sheet1");
	     Row row=sh.createRow(1);
	     Cell cell = row.createCell(3);
	     cell.setCellValue("java");
         FileOutputStream fio= new FileOutputStream("D\\Book1.xlsx");
         w.write(fio);
         System.out.println("run");
         fio.close();
         fis.close();
   }
}
