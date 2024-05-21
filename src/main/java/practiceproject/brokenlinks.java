package practiceproject;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class brokenlinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String url="";
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoqa.com/broken");
	List <WebElement> count= driver.findElements(By.tagName("a"));
	System.out.println("no of links "+count.size());
   Iterator <WebElement> it= count.iterator();
   while(it.hasNext())
   {
	     url =it.next().getText();
	   System.out.println("print all urls" +url);
	   
   }
	driver.quit();
	}

}
