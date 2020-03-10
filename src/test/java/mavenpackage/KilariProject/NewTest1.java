package mavenpackage.KilariProject;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest1 
{
  @Test
  public void f() 
  
  {
	  
	System.out.println("f");
  }
  @BeforeMethod
  public void beforeMethod() 
  {
	  System.out.println("f");
  } 
  

  @AfterMethod
  public void afterMethod() 
  {
	  System.out.println("f");
  }
  

  @BeforeTest
  public void beforeTest() 
  {
	  System.out.println("f");
  }
  

  @AfterTest
  public void afterTest() 
  {
	  System.out.println("f");
  }
  }


