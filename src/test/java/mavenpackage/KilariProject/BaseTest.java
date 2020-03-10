package mavenpackage.KilariProject;


	import java.io.FileInputStream;
import java.util.Properties;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

	public class BaseTest 

	{

		public static  WebDriver driver;
		public static String projectPath = System.getProperty("user.dir");
		public static FileInputStream fis;
		public static Properties p;
		public static Properties prop;
		public static Properties envprop;
		public static Properties or;
		public static ExtentReports report;
		public static ExtentTest test;
		
		@BeforeTest
		  public void init() throws Exception
		  {
			 
			  
			  fis = new FileInputStream(projectPath +"//data.properties");
				 p = new Properties ();
				p.load(fis); 
				
				fis = new FileInputStream(projectPath +"//or.properties");
				 or= new Properties ();
				or.load(fis);
				
				fis = new FileInputStream(projectPath +"//environment.properties");
				 prop = new Properties ();
				 prop.load(fis);
				 String e = prop.getProperty("env");
				System.out.println(e);
				
				fis = new FileInputStream(projectPath+"//"+e+".properties");
				envprop = new Properties();
				envprop.load(fis);
				String val = envprop.getProperty("amazonurl");
				System.out.println(val);
				
				fis = new FileInputStream(projectPath+"//log4j.config.properties");
							PropertyConfigurator.configure(fis);
							
				report = ExtentManager.getInstance();
		  }
		
		@AfterTest
		  public void afterTest() 
		  {
			  report.endTest(test);
			  report.flush();
			  
		  }
		
		
				
		
		
		
		
		
		public static void  launchBrowser (String browser)
		
		{
			if (p.getProperty(browser).equals("chrome"))
			{
				System.setProperty("webdriver.chrome.driver",projectPath+"//Drivers//chromedriver.exe");
				driver=new ChromeDriver ();
			} 
			else if (p.getProperty(browser).equals("firefox")) 
			{
				System.setProperty("webdriver.gecko.driver",projectPath+"//Drivers//geckodriver.exe");
				driver=new FirefoxDriver ();
			}
			
	  }

		public static void launchUrl(String url)
		{
			//driver.get(p.getProperty(url));
			//driver.navigate().to(p.getProperty(url));
			driver.navigate().to(envprop.getProperty(url));
			driver.manage().window().maximize();
			
				
		}
		
		public static void selectDropItem (String locatorKey,String item)
		{
			getElement(locatorKey).sendKeys(or.getProperty(item));
			
		}
			public static void clickElement(String locatorKey)
			{
				getElement(locatorKey).click();
				//driver.findElement(By.xpath(locatorKey)) .click();
			}

			public static void typeValue(String locatorKey, String value) 
			
			{
				getElement(locatorKey).sendKeys(or.getProperty(value));
				//				driver.findElement(By.id(locatorKey)).sendKeys(value);
			}
			
			

			public  static  WebElement  getElement(String locatorKey) 
			{
				 WebElement element = null;
				 
				 if(locatorKey. endsWith("_id")) {
				element = driver.findElement(By.id(or.getProperty(locatorKey)));}
				 
				 else if (locatorKey. endsWith("_name")) {
						element = driver.findElement(By.name(or.getProperty(locatorKey)));}
				 else if (locatorKey. endsWith("_classname")) {
						element = driver.findElement(By.className(or.getProperty(locatorKey)));}
				 else if (locatorKey. endsWith("_xpath")) {
						element = driver.findElement(By.xpath(or.getProperty(locatorKey)));}
				 else if (locatorKey. endsWith("_css")) {
						element = driver.findElement(By.cssSelector(or.getProperty(locatorKey)));}
				 else if (locatorKey. endsWith("_linktext")) {
						element = driver.findElement(By.linkText(or.getProperty(locatorKey)));}
				 else if (locatorKey. endsWith("_partiallinktext")) {
						element = driver.findElement(By.partialLinkText(or.getProperty(locatorKey)));}
				 
				 
				 
				 
				 
				 
				return element;
				
			}
			//public static void selectDropItem(String locatorKey, String item)
			//{
			//	 getElement(locatorKey).sendKeys(or.getProperty(item));
				
				//driver.findElement(By.id(locatorKey)).sendKeys(value);	
			}

			
		
	

	
