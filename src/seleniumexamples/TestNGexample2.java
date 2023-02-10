package seleniumexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class TestNGexample2 {
	    WebDriver driver;
	    @BeforeMethod 
	   	public void browserlaunch()
	       {
	   	System.out.println("login to app  --beforemethod");
	   	System.setProperty("webdriver.chrome.driver", "C:\\Selenium webdriver\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
	   	
	       }
	    @Test
	   	public void search()
	       {
	   	System.out.println("TC1 -perform search  --test");
	    driver.findElement(By.linkText("Gmail")).click();
	    System.out.println(driver.getTitle());
	    
	   	  }
	    @Test//it will be executed alphabetically
	   	public void home()
	       {
	   	System.out.println("TC2-click on homepage  --test");
	   	System.out.println(driver.getTitle());
	       }
	    @AfterMethod
	   	public void logout()
	       {
	   	System.out.println("logout from app  --aftermethod");
	   	driver.quit();
	       }
}
