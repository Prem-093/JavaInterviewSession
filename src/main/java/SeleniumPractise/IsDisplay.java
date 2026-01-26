package SeleniumPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplay {
	static WebDriver driver;
	

	
	public static boolean fuctionalityOfIsDisplayedMethod(By locator)
	{
		boolean flagstatus=driver.findElement(locator).isDisplayed();
		return flagstatus;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 driver=new ChromeDriver();

		driver.get("https://www.orangehrm.com/30-day-free-trial/");
		
       By imgLogo=By.xpath("//img[@alt='OrangeHRM Logo']");
       Boolean flagStatus=fuctionalityOfIsDisplayedMethod(imgLogo);
       
       if(flagStatus)
       {
    	   System.out.println("CRM image is getting on display page :"+flagStatus);
       }
       else
       {
    	   System.out.println("CRM image is not getting on page :"+flagStatus);
       }
       
       driver.quit();
	}

}
