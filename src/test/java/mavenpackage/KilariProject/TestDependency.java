package mavenpackage.KilariProject;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class TestDependency {
	
  @Test(priority=1)
  public void orange() 
  {
	  System.out.println("orange");
	  
  }
  
  @Test(priority=2,dependsOnMethods= {"white"})
  public void white ()
  {
	  System.out.println("white");
	  
	  
  }
  
  

@Test(priority=3,dependsOnMethods= {"orange"})
  public void blue() 
  {
	  
	  System.out.println("blue");
	  Assert.fail("blue test is failed");
  }
  
  @Test(priority=4,dependsOnMethods= {"white"})
  public void green() 
  {
	  System.out.println("green");
	  
  }
  
  
}
