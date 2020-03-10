package mavenpackage.KilariProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;




public class CheckBox extends BaseTest
{
	
	
	
  @BeforeMethod
  
  public void beforeMethod () throws Exception 
  
  {
	  		test = report.startTest("CheckBox");
		test.log(LogStatus.INFO,"initializing the property files(data,or,environments,log4j.config)........");
		launchBrowser("chromebrowser");
		test.log(LogStatus.INFO, "openend the browser:-"+p.getProperty("chromebrowser"));
		launchUrl("checkboxurl");
		test.log(LogStatus.INFO, "openend the browser:-"+p.getProperty("checkboxurl"));
  }
		@Test(groups= {"regression","smoke"})
		public void checkboxTest()
		{
			List<WebElement> check=driver.findElements(By.xpath("//td[@class='table5'])xpath)/input[@type='checkbox']"));
			for (int i=0 ;i<check.size();i++)
			{
			System.out.println(check.get(i).getAttribute("value")+"--"+check.get(i).getAttribute("checked"));
		}
		}
			
			@AfterMethod
			  public void aftermethod() 
			  {
				  System.out.println("after Test");
				 driver.quit();
				  
				 	  
				  
	  
  }
}
