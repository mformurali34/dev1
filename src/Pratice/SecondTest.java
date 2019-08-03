package Pratice;

import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SecondTest {
		
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver d;
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//drivers//chromedriver.exe");
		//d=new FirefoxDriver();
		d=new ChromeDriver();
		//System.setProperty("webdriver.ie.driver", "E:\\Selenium_Scripts_May16\\Lib\\IEDriverServer.exe");
		//d=new InternetExplorerDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		/*d.get("http://www.policybazaar.com/");
		//assertEquals("Compare Insurance Quotes Online: Life | Car | Health | Travel",d.getTitle());
		Actions a=new Actions(d);
		a.moveToElement(d.findElement(By.linkText("Life Insurance"))).perform();
		a.moveToElement(d.findElement(By.linkText("Life Insurance"))).click(d.findElement(By.linkText("Investment Plans"))).build().perform();
		Thread.sleep(4000);
		d.quit();*/
		d.get("https://www.google.co.in/");
		assertEquals("Google",d.getTitle());
		//Reading data from excel (.xlsx)
		FileInputStream fis=new FileInputStream("E:\\Prokarma HR info.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet s=wb.getSheetAt(0);
		for(int i=0;i<s.getLastRowNum()+1;i++)
		{
			d.findElement(By.xpath("//*[@id=\'tsf\']/div[2]/div/div[1]/div/div[1]/input")).clear();
			d.findElement(By.xpath("//*[@id=\'tsf\']/div[2]/div/div[1]/div/div[1]/input")).sendKeys(s.getRow(i).getCell(0).getStringCellValue());
			//d.findElement(By.name("btnG")).click();
			Thread.sleep(2000);
		}
		
		
	}

}
