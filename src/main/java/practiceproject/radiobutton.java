package practiceproject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radiobutton {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.driver", "C:/chromedriver/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://omayo.blogspot.com/");
	  JavascriptExecutor jse=(JavascriptExecutor) driver;
	  jse.executeScript("window.scrollBy(0,1300)");
	//driver.findElement(By.id("radio2")).click();
	Thread.sleep(2000);
	  WebElement bikeselect= driver.findElement(By.xpath("//input[@value='Bike']"));
	if(bikeselect.isSelected())
	{
		
		System.out.println("bike is selected");
	}
	else
	{
		System.out.println("bike not selected");
	}
	Thread.sleep(2000);
	jse.executeScript("window.scrollBy(0,-400)");
	driver.quit();
	}

}
