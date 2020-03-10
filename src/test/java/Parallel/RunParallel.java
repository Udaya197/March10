package Parallel;

import java.util.Arrays;

import org.testng.TestNG;

public class RunParallel {

	public static void main(String[] args) 
	{
		String[] s=new String[10];
		String[] s1=new String[] {"udaya" ,"kilari"};
				
		TestNG testng =new TestNG();
		testng.setTestSuites(Arrays.asList(new String[] { System.getProperty("user.dir")+"//megasuite.xml"}));
		testng.setSuiteThreadPoolSize(2);
		testng.run();
		
		

	}

}
