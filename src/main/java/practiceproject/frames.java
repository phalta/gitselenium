package practiceproject;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 System.setProperty("webdriver.chrome.driver", "C:/chromedriver/chromedriver.exe");
 WebDriver driver = new ChromeDriver();
 driver.manage().window().maximize();
 driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/#google_vignette");
 driver.findElement(By.id("s")).sendKeys("priya");
 driver.close();
 
 
	}

}
