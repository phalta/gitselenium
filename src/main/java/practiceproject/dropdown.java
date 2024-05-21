package practiceproject;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.driver", "C:/chromedriver/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.get("https://qa-automation-practice.netlify.app/dropdowns");
	
	 WebElement el= driver.findElement(By.id("dropdown-menu"));
	//List <WebElement> all=dri
	 System.out.println(el.getSize());
	 Select dropdown =new  Select(el);
	 dropdown.selectByVisibleText("Aruba");
	 dropdown.selectByIndex(3);
	 dropdown.selectByValue("Benin");
	
	
	
	}

}
