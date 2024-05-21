package practiceproject;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alerts {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

	
	System.setProperty("webdriver.chrome.driver", "C:/chromedriver/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	
	driver.manage().window().maximize();
	//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	driver.get("https://demoqa.com/alerts");
	//driver.findElement(By.xpath("//button[@id='alertButton']")).click();
	//Thread.sleep(2000);
	//driver.switchTo().alert().accept();
	//Thread.sleep(2000);
	//driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
	//driver.switchTo().alert().accept();
	//driver.switchTo().alert().dismiss();
	driver.findElement(By.xpath("//button[@id='promtButton']")).click();
	driver.switchTo().alert().sendKeys("piouy");
	driver.switchTo().alert().accept();
	
	}

}
