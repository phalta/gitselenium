package practiceproject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class extentreports1 {

	public static void main(String[] args) {
		
 ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extentReports.html");

	ExtentReports extent= new ExtentReports();
	extent.attachReporter(htmlReporter);
	ExtentTest test=extent.createTest("googlesearchtest");
	System.setProperty("webdriver.chrome.driver", "C:/chromedriver/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	test.log(Status.INFO,"starting test case");
	
	driver.get("https://www.google.com/");
	test.pass("go to google page");
	
	driver.manage().window().maximize();
	driver.findElement(By.name("q")).sendKeys("automation",Keys.ENTER);
	test.pass("enter text in searchbox");
	driver.findElement(By.name("btnk")).click();
	
	test.pass("press keyboard enter key");
	driver.close();
	driver.quit();
	test.pass("close browser");
	test.info("test completed");
	extent.flush();
	}
	
}