package seleniumexamples;

import org.testng.annotations.*;

//set property file -> launch browser -> enter url -> login to app ->perform search ->click on home  -> logout from app ->
//close the webpage -> delete cookies ->Quit browser
public class TestNGexample1 {

    @BeforeSuite 
	public void setprop()
    {
	System.out.println("set property file --beforesuite");
    }
   
    @BeforeClass 
   	public void url()
       {
   	System.out.println("enter URL  --beforeclass");
       }
    @BeforeMethod 
   	public void login()
       {
   	System.out.println("login to app  --beforemethod");
       }
    @BeforeTest 
   	public void launchbrowser()
       {
   	System.out.println("launch browser   --beforetest");
       }
    @Test
   	public void search()
       {
   	System.out.println("TC1 -perform search  --test");
       }
    @Test//it will be executed alphabetically
   	public void home()
       {
   	System.out.println("TC2-click on homepage  --test");
       }
    @AfterMethod
   	public void logout()
       {
   	System.out.println("logout from app  --aftermethod");
       }
    @AfterClass
   	public void close()
       {
   	System.out.println("close webpage  --afterclass");
       }
    @AfterTest
   	public void deleteC()
       {
   	System.out.println("Delete cookies   --aftertest");
       }
    @AfterSuite
   	public void quit()
       {
   	System.out.println("quit from browser  --aftersuite");
       }
}
