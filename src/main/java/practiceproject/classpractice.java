package practiceproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class classpractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.chrome.driver", "C:/chromedriver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		int slider=driver.findElements(By.className("_8S67Ib")).size();
		System.out.println(slider);
		int links = driver.findElements(By.tagName("a")).size();
		System.out.println(links );
		

	}

}
