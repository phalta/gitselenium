package practiceproject;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class seleniumdropdown {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver/chromedriver.exe");
		WebDriver  driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://trytestingthis.netlify.app/");
		WebElement dropdown= driver.findElement(By.id("owc")); 
		Select selectObject=new Select(dropdown);
		selectObject.selectByIndex(1);
		Thread.sleep(2000);
		
		selectObject.selectByValue("option 2");
		Thread.sleep(2000);
		selectObject.selectByVisibleText("Option 3");
		Thread.sleep(2000);
		selectObject.deselectByVisibleText("Option 3");
		driver.quit();
		

	}

}
