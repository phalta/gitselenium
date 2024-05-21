package practiceproject;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autosugestion {

	private static final boolean WebElement = false;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   System.setProperty("webdriver.chrome.driver", "C:/chromedriver/chromedriver.exe");
   WebDriver driver=new ChromeDriver();
   driver.get("https://www.google.com/");
   driver.findElement(By.name("q")).sendKeys("priyanka");
   List<WebElement> listofelements=driver.findElements(By.xpath("//*[@role=\"listbox\"]"));
    for(WebElement element :listofelements)
    {
    	if(element.getText().trim().equals("Priyanka Mohan"))
    	{
    	   element.click();	
            break;
	     }
    }
  }
 }