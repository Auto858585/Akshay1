package org.qsp.test_Ng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Invocationcout {
	@Test(invocationCount=15)
	  public void ml()
	  {
		  
		  Reporter.log("hiiiii", true);
	  }
}
