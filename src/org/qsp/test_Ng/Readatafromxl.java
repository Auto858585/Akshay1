package org.qsp.test_Ng;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Readatafromxl {
	@DataProvider
	public String[][] getdata() throws EncryptedDocumentException, InvalidFormatException, IOException {
		String st[][];
		FileInputStream fis = new FileInputStream(".\\data\\Readdata.xlsx");
		Workbook w = WorkbookFactory.create(fis);
		Sheet sh = w.getSheet("sheet1");
		st = new String[sh.getLastRowNum()][sh.getRow(0).getLastCellNum()];
		for (int i = 1; i < sh.getPhysicalNumberOfRows(); i++) {
			for (int j = 0; j < sh.getRow(i).getLastCellNum(); j++) {
				st[i - 1][j] = sh.getRow(i).getCell(j).toString();

			}

		}
		return st;
	}

	@Test(dataProvider = "getdata")

	public void m1(String un, String pw)

	{
		Reporter.log(un + "  " + pw, true);
	}

}
