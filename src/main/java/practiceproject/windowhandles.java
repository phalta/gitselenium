package practiceproject;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandles {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("WebDriver.chrome.driver", "C:/chromedriver/chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
		driver.get("http://www.salesforce.com");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//*[@id=\"1682325589592_4ma\"]/div[1]/article/div[2]/div/pbc-button[1]/a")).click();
		driver.findElement(By.xpath("//*[@href=\"/in/form/signup/freetrial-sales-starter/?d=jumbo1-btn-ft\"]")) .click();
		Thread.sleep(2000);
	   Set<String> windows=driver.getWindowHandles(); 
	  
	   Iterator <String> iterator=windows.iterator();
	   String parentwindow= iterator.next();
	   System.out.println("parentwindow is "   +parentwindow);
	  
	   
	   String childwindow=iterator.next();
	  System.out.println("childwindow  is "  +childwindow);
	   
	   driver.switchTo().window(childwindow);
	 //while(iterator.hasNext())
	  Thread.sleep(1000);
	   //System.out.println(iterator.next());
	   driver.findElement(By.name("UserFirstName")).sendKeys("priyanka");
		driver.findElement(By.name("UserLastName")).sendKeys("shinde");
	   driver.switchTo().window(parentwindow);
	   driver.close();
	}

}
