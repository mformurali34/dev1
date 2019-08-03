package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxDriver.SystemProperty;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.setProperty("webdriver.firefox.marionette","C:\\Users\\Murali\\Downloads\\geckodriver-v0.23.0-win64\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	/*String baseUrl="http://demo.guru99.com/test/newtours/";
	String expopt="welcome";
	String actopt="";
	driver.get(baseUrl);
	actopt=driver.getTitle();
	if(actopt.contentEquals(expopt))
	{
	System.out.println("pass");	
	}
	else
	{
		System.out.println("fail");
	}*/
	driver.close();
	}

}
                                                                                     