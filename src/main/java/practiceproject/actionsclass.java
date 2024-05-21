package practiceproject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionsclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
        driver.get("https://demoqa.com/menu/");	
        driver.manage().window().maximize();
        driver.getTitle();
        System.out.println();
    
	   Actions act= new Actions(driver); 
	   WebElement element= driver.findElement(By.xpath("//*[text()=\"Main Item 2\"]"));
	   act.moveToElement(element).build().perform();
	   System.out.println("mouseover done on main item2");
	  WebElement elment1= driver.findElement(By.xpath("//*[@id=\"nav\"]/li[2]/ul/li[3]/a"));
	  act.moveToElement(elment1).build().perform();
	  WebElement element3 = driver.findElement(By.xpath("//*[text()=\"Sub Sub Item 1\"]"));
	  act.moveToElement(element3).build().perform();
	}

}
