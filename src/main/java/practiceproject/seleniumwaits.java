package practiceproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class seleniumwaits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  System.setProperty("WebDriver.Chrome.Driver", "C:/chromedriver/chromedriver.exe");
  
  WebDriver driver = new ChromeDriver();
  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  
  driver.get("https://www.google.com/");
  driver.findElement(By.name("abcd")).click();
 // WebDriverWait wait= new WebDriverWait(driver, 20);
  
  
  
  driver.findElement(By.name("q")).sendKeys("automation",Keys.ENTER);
  driver.findElement(By.name("btnk")).click();	
  driver.close();
  driver.quit();
  }

}
