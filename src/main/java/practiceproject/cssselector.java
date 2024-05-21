package practiceproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssselector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   System.setProperty("Webdriver.crome.driver", "C:/chromedriver/chromedriver.exe");
   WebDriver driver= new ChromeDriver();
   driver.get("www.facebook.com/");
   driver.findElement(By.cssSelector("input.inputtext")).sendKeys("abc@gmail.com");
   driver.findElement(By.cssSelector("input[name=email]")).sendKeys("priyanka");
   
	}	

}
