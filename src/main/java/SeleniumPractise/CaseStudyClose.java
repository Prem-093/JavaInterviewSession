package SeleniumPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaseStudyClose {
	
static WebDriver driver;
	
	public static String doGetAttribute(By locator,String value)
	{
		return driver.findElement(locator).getAttribute(value);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/30-day-free-trial/");
		By loc=By.xpath("//input[@id='Form_getForm_subdomain']");
		doGetAttribute(loc,"class");
		//driver" is null
		//driver.close();
		driver.close();//Invalid session id
		doGetAttribute(loc,"class");
		
	
		//Same Session id will get invalid (or expired)in case of close()

	}

}
