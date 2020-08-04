package org.qsp.test_Ng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testingft_it
{
	 @Test(groups="functional")
	  public void ml()
	  {
		  
		  Reporter.log("hiiiii...1", true);
	  }
	
	 @Test(groups="intrigation",dependsOnGroups="functional")
	  public void m2()
	  {
		  
		  Reporter.log("hiiiii.....2", true);
	  }
	 @Test(groups="functional")
	  public void m3()
	  {
		  
		  Reporter.log("hiiiii...3", true);
	  }
	 @Test(groups="itrigation",dependsOnGroups="functional")
	  public void m4()
	  {
		  
		  Reporter.log("hiiiii...4", true);
	  }
	 @Test(groups="functional")
	  public void m5()
	  {
		  
		  Reporter.log("hiiiii....5", true);
	  }
	 @Test(groups="unit")
	  public void m6()
	  {
		  
		  Reporter.log("hiiiii....6", true);
	  }

}
