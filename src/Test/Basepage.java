
package Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basepage {
	
	public static WebDriver driver;
	public static String path="./data.properties";
	public static String loadData(String key) throws IOException
	{
		File f=new File("path");
		FileInputStream fis=new FileInputStream(f);
		Properties p=new Properties();
		p.load(fis);
		
		return p.getProperty(key);
		
	}
	
	public static void launch(String browser,String url)
	{
		
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//drivers//chromedriver.exe");
			 driver=new ChromeDriver();
		}
		driver.get(url);
	}
	

}
