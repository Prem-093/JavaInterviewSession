package SeleniumPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextValue {
	
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.orangehrm.com/30-day-free-trial/");
		
		By loc=By.xpath("//input[@id='Form_getForm_subdomain']");
		
		
		 WebElement element=driver.findElement(loc);
		 element.sendKeys("Hi");
		String text= element.getAttribute("value");
		System.out.println(text);
	}

}
