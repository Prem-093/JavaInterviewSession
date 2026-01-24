package TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserConcept {
	
	static WebDriver driver;
	
	static boolean flag=false;
	
	public static boolean lunchBrowser(String browserName)
	{
		if(browserName.equalsIgnoreCase("Chrome"))
		{
			driver=new ChromeDriver();	
			
	
			flag=true;
			driver.get("https://www.orangehrm.com/30-day-free-trial/");
		}
		else if(browserName.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
			flag=true;
		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
			flag=true;
		}
		else
		{
			System.out.println("Please check browser details :"+flag);
		}
		return flag;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		lunchBrowser("gsfuywrfhwr");

	}

}
