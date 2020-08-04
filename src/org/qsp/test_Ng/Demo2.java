package org.qsp.test_Ng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo2 
{
	

  @Test(priority=3)
  public void ml()
  {
	  
	  Reporter.log("hiiiii1", true);
  }
  @Test(enabled=false)
  public void m2()
  {
	  
	  Reporter.log("hiiiii2", true);
  }
  @Test(priority=2)
  public void m3()
  {
	  
	  Reporter.log("hiiiii3", true);
  }

}
