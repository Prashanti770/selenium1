package seleniumexamples;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
public class TestNGexample3 {
	WebDriver driver;

    @BeforeMethod
    public void setUp() {
    	System.setProperty("webdriver.chrome.driver", "C:\\Selenium webdriver\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
    	driver= new ChromeDriver();
    	driver.manage().window().maximize();
    	//driver.manage().deleteAllCookies();
    	//driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
    	//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
    	driver.get("https://www.google.com");
    }

	@Test(priority=1)
	public void testingmethod() {
		String title=driver.getTitle();
		System.out.println(title);
	}
	@Test(priority=2)
	public void linkmethodtest() {
		driver.findElement(By.linkText("Gmail")).click();
		System.out.println(driver.getCurrentUrl());
	}
	@AfterMethod
	public void aftermethodtesting() {
		System.out.println("Quit from browser");
		driver.close();
		}
}