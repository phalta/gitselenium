package practiceproject;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandles2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
        driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows");
      driver.findElement(By.id("windowButton")).click();
      driver.findElement(By.id("messageWindowButtion")).click();
      String parentwindow = driver.getWindowHandle();
      System.out.println("main windoe handle:+"  +parentwindow);
      Set<String> allwindow = driver.getWindowHandles();
      Iterator<String> it= allwindow.iterator();
      while (it.hasNext()){
    	  String childwindow=it.next();
    	  if(!parentwindow.equalsIgnoreCase(childwindow)) {
    			  driver.switchTo().window(childwindow);
    	 WebElement message = driver.findElement(By.id("samplEHeading"));
    	 System.out.println("Heading of childwindow+ " +message.getText());
    	  
    	  }
      }
	}

}
