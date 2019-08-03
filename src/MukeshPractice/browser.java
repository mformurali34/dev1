package MukeshPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browser {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//drivers//chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        Thread.sleep(3000);
        driver.get("https://seleniumpractise.blogspot.com/2019/01/dropdown-demo-for-selenium.html");
	    driver.manage().window().maximize();

	}

}
