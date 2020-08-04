package org.qsp.test_Ng;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_provider_demo {

	@DataProvider
	public String[][] getdata() {
		String st[][] = new String[3][2];

		st[0][0] = "admin";
		st[0][1] = "manager";

		st[1][0] = "admin1";
		st[1][1] = "manager1";

		st[2][0] = "admoin2";
		st[2][2] = "manager2";
		return st;

	}

	@Test(dataProvider = "getdata")
	public void m1(String un, String pw)

	{
		Reporter.log(un + "  " + pw, true);
	}
}