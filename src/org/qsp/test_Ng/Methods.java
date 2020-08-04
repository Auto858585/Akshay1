package org.qsp.test_Ng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Methods 
{
  /*@Test(dependsOnMethods={"m2,m3"})
  public void m1()
  {
	  System.out.println("hi....1");
  }
  @Test
  public void m2()
  {
	  System.out.println("hi....2");
  }
  @Test
  public void m3()
  {
	  System.out.println("hi....3");
  }*/
	

	  @Test(dependsOnMethods="m2")
	  public void m1()
	  {
		  System.out.println("hi....1");
	  }
	  @Test
	  public void m2()
	  {
		  System.out.println("hi...2");
		  Assert.fail();
		  System.out.println("after asssert sop not will run");
	  }
	  @Test
	  public void m3()
	  {
		  System.out.println("hi....3");
	  }
}
