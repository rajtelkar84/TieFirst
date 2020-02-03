package testNGMaven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SecondTestNGProject {
	
	WebDriver driver;
  @Test
  public void test() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\telkaraj\\Desktop\\appium\\exeFiles\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://in.mail.yahoo.com/d/folders/1");
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  System.out.println(driver.getTitle());
	  driver.close();
  }
}
