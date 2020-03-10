package mavenpackage.KilariProject;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import junit.framework.Assert;

public class LinkText extends BaseTest

{
  @BeforeMethod
  
  public void beforeMethod () throws Exception
		  {
	  init();
		test = report.startTest("LinkText");
		test.log(LogStatus.INFO,"initializing the property files(data,or,environments,log4j.config)........");
		launchBrowser("chromebrowser");
		test.log(LogStatus.INFO, "openend the browser:-"+p.getProperty("chromebrowser"));
		launchUrl("linktexturl");
		test.log(LogStatus.INFO, "openend the browser:-"+p.getProperty("linktexturl"));
		
		  }
  
  @Test()
	public void linkText()
	{
		String expval ="Google Images";
		  driver.findElement(By.linkText("Images")).click();
		Reporter.log("clicked on Image link") ;
		String actval = driver.getTitle();
		Assert.assertEquals(expval, actval);
		
	}
	
		
		@AfterMethod
		  public void aftermethod() 
		  {
			  System.out.println("after Test");
			 driver.quit();
			  
			 	  
			  
	  
		
  }
}
