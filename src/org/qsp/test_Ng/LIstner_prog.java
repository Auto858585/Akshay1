package org.qsp.test_Ng;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Litner_2prog.class)

   public class LIstner_prog {
	@Test
	public void demo() {
		Reporter.log("hi", true);

	}

}
