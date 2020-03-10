package mavenpackage.KilariProject;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

public class NewTest2 extends BaseTest

{
	
  @Test
  public void f() {
	  
	  selectDropItem("amazondropbox_id","amazondropvalue");
		test.log(LogStatus.INFO, "Selected the option:-"+or.getProperty("amazondropvalue")+" by using the locator:-"+or.getProperty("amazondropbox_id"));
		typeValue("amazonsearchtext_id","amazonsearchtext");
		test.log(LogStatus.INFO,"Entered the text:-"+or.getProperty("amazonsearchtext")+" by using the locator:-"+or.getProperty("amazonsearchtext_id") );
		clickElement("amazonsearchbutton_xpath");
		test.log(LogStatus.INFO, "click on element by using the locator:-"+or.getProperty("amazonsearchbutton_xpath"));
		
  }
  @BeforeMethod
  public void beforeMethod()
  
  {
	  test = report.startTest("NewTest2");
		
		launchBrowser("chromebrowser");
		test.log(LogStatus.INFO, "openend the browser:-"+p.getProperty("chromebrowser"));
		launchUrl("amazonurl");
		test.log(LogStatus.INFO, "openend the browser:-"+p.getProperty("amazonurl"));
		
	  
  }

  @AfterMethod
  public void afterMethod()
  
    {
	  driver.quit();
  }

  

  

}
