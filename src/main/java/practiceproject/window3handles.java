package practiceproject;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class window3handles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.driver", "C:/chromedriver/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.toolsqa.com/");
	//String parentwin=driver.getWindowHandle();
	//System.out.println("parent window is " +parentwin);
	driver.findElement(By.xpath("//*[text()=\"Demo Site\"]")).click();
	Set <String> windowh=driver.getWindowHandles();
	  Iterator<String> it =windowh.iterator();  
	  String parentwindow = it.next();
	  String childwindow = it.next();
	  System.out.println("parent window is " +parentwindow);
	  System.out.println("parent window is " +childwindow);
	  driver.switchTo().window(parentwindow);
	  System.out.println("parent window id is " +driver.getTitle());
	  System.out.println("Child window id is  "+driver.getTitle()); 
	}

}
