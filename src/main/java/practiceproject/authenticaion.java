package practiceproject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class authenticaion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver","C:/chromedriver/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	
driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
	String message=driver.findElement(By.cssSelector("p")).getText();	
			
	System.out.println(message);
	}

}
