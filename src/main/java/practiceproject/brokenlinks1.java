package practiceproject;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class brokenlinks1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.driver", "C:/chromedriver/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.deadlinkcity.com/");
	List<WebElement> linkitem =driver.findElements(By.tagName("a"));
	for(WebElement link:linkitem)
	{
		 String url=link.getAttribute("href");
	}
	
	}

}
