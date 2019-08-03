package Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Browserlaunch {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver;
System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//drivers//chromedriver.exe");
	 driver=new ChromeDriver();
	 driver.get("https://www.amazon.in/");
	
	 WebElement title = driver.findElement(By.xpath(".//*[@id='twotabsearchtextbox']"));
	 System.out.println(title);
	//driver.get("https://www.hdfcbank.com/");
	/*driver.manage().window().maximize();
	String title=driver.getTitle();
	System.out.println(title);
	String url=driver.getCurrentUrl();
	System.out.println(url);
	driver.manage().deleteAllCookies();
	driver.navigate().back();
	Thread.sleep(4000);
	
	driver.navigate().forward();
	Thread.sleep(5000);
	driver.navigate().refresh();*/
	/*String ps=driver.getPageSource();
	System.out.println(ps);*/
	/*driver.navigate().to("https://www.hdfcbank.com/");
	driver.findElement(By.id("loginsubmit")).click();*/
/*	 driver.get("https://www.amazon.in/");
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("samsung");
	driver.findElement(By.id("twotabsearchtextbox")).clear();
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("sony");
	driver.findElement(By.id("twotabsearchtextbox")).clear();
	
	driver.findElement(By.name("field-keywords")).sendKeys("laptop");
	driver.findElement(By.id("twotabsearchtextbox")).clear();
	Thread.sleep(4000);
	driver.findElement(By.className("nav-input")).sendKeys("fridge");
	*/
	/*//System.setProperty("webdriver.gecko.driver", "E:\\selenium\\geckodriver.exe");
	FirefoxDriver driver1=new FirefoxDriver();
	driver1.get("https://www.flipkart.com");*/
/*	 driver.get("https://www.amazon.in/");
	 driver.findElement(By.xpath(".//*[@id='twotabsearchtextbox']")).sendKeys("samsung");*/
	 /*driver.navigate().refresh(
	 driver.findElement(By.partialLinkText("Customer")).click();*/
	/* List<WebElement> links = driver.findElements(By.tagName("a"));
	 for(int i=0;i<links.size();i++)
	 {
		 if(!links.get(i).getText().isEmpty())
		 {
		 System.out.println(links.get(i).getText());
		 }
	 }*/
/*	WebElement link = driver.findElement(By.id("searchDropdownBox"));
	List<WebElement> options = link.findElements(By.tagName("option"));
	for(int j=0;j<options.size();j++)
	{
		System.out.println(options.get(j).getText());
	}*/
	/*System.setProperty("webd
	 * river.ie.driver", "C:\\Users\\Murali\\Downloads\\IEDriverServer_x64_3.14.0\\IEDriverServer.exe");
	InternetExplorerDriver driver3=new InternetExplorerDriver();
	driver3.get("https://www.flipkart.com");*/
	
	}

}
