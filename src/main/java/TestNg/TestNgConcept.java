package TestNg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgConcept {
	
	
	@BeforeSuite
	public void connectDB()
	{
		System.out.println("DB----Connected");
	}
	@BeforeTest
	public void openBrowser()
	{
		System.out.println("DB----OpenBrowser");
	}
	@BeforeClass
	public void cretaeUser()
	{
		System.out.println("DB----createUser");
	}
	@BeforeMethod
	public void loginAPP()
	{
		System.out.println("DB----loginAPP");
	}
	
	@Test (priority=1)
	public void searchobject()
	{
		System.out.println("Object is searched");
	}
	@Test  (priority=2,dependsOnMethods="searchobject")
	public void addToCart()
	{
		System.out.println("Object added to catrt");
	}
	@Test (priority=3, dependsOnMethods="searchobject")
	public void doPayment()
	{
		System.out.println("Object Payment Done");
	}
	@AfterMethod
	public void logOutAPP()
	{
		System.out.println("DB----loginAPP");
	}
	
	@AfterClass
	public void deletedUser()
	{
		System.out.println("User Deleted");
	}
	@AfterTest
	public void closedBrowser()
	{
		System.out.println("Closed Browser");
	}
	@AfterSuite
	public void  dbConnectionReleased()
	{
		System.out.println("db-----------Released");
	}
	
	

}
