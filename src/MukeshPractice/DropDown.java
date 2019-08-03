package MukeshPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//drivers//chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        Thread.sleep(3000);
        driver.get("https://seleniumpractise.blogspot.com/2019/01/dropdown-demo-for-selenium.html");
	    driver.manage().window().maximize();
	    WebElement d=driver.findElement(By.xpath(".//select[@id='tools']"));
	    Select s=new Select(d);
	    List act=new ArrayList();
	    List<WebElement> tools=s.getOptions();
	    for(WebElement ele:tools)
	    {
	    	String data=ele.getText();
	    	act.add(data);
	    }
	    List temp=new ArrayList();
	    temp.addAll(act); 
	    //Sort the List
	    Collections.sort(temp);
	    Assert.assertTrue(act.equals(temp));
	    driver.quit();
	    
	}

}
