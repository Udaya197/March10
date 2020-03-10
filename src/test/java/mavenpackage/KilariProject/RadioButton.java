package mavenpackage.KilariProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

public class RadioButton extends BaseTest

{
	
	
  @BeforeMethod
  public void beforeMethod () throws Exception
  {
	  init();
		test = report.startTest("RadioButton");
		test.log(LogStatus.INFO,"initializing the property files(data,or,environments,log4j.config)........");
		launchBrowser("chromebrowser");
		test.log(LogStatus.INFO, "openend the browser:-"+p.getProperty("chromebrowser"));
		launchUrl("radiourl");
		test.log(LogStatus.INFO, "openend the browser:-"+p.getProperty("radiourl"));
		
  }
   
  @Test(groups= {"regression","sanity"})
	public void radiobuttonTest()
	{
		WebElement radio =driver.findElement(By.xpath("//td[@class='table5'])[2]"));
		List<WebElement>rbutton = radio.findElements(By.name("group1"));
		for (int i=0 ;i<rbutton.size();i++)
		{
		System.out.println(rbutton.get(i).getAttribute("value")+"--"+rbutton.get(i).getAttribute("checked"));
	}
	}
		
		@AfterMethod
		  public void aftermethod() 
		  {
			  System.out.println("after Test");
			 driver.quit();
			  
			 	  
			  report.endTest(test);
		      report.flush();
	  
}

		
  }

