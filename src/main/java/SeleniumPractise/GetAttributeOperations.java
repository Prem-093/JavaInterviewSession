package SeleniumPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeOperations {
	
	static WebDriver driver;
	
	public static String doGetAttribute(By locator,String value)
	{
		return driver.findElement(locator).getAttribute(value);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 driver=new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/30-day-free-trial/");
		
		By loc=By.xpath("//input[@id='Form_getForm_subdomain']");
		
		String placehoderValue=doGetAttribute(loc,"placeholder");
		System.out.println(placehoderValue);
		driver.quit();
		
		
		
		
	}

}
