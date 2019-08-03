package Test;

import org.junit.runners.Parameterized.UseParametersRunnerFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class verification{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//drivers//chromedriver.exe");
	WebDriver driver;
	driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	String str1 = driver.findElement(By.xpath("(.//a[@class=\"nav-a\"])[7]")).getText();
	System.out.println(str1);
	/*tring str2="Your";
	if(str1.equalsIgnoreCase(str2))
	{
		System.out.println("both strings are eqaul");b   
		
	}
	else
	{
		System.out.println("not");
	}*/
	}

}
