package SeleniumPractise;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropHandleWithoutSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.orangehrm.com/30-day-free-trial/");
		
		driver.manage().window().maximize();
	
		
		driver.findElement(By.xpath(("//button[text()='Allow all']"))).click();
		
	List<WebElement> elementList=driver.findElements(By.xpath("//select[@name='Country']/option"));
	
	List<String> dropdownName=new ArrayList<String>();
	
	for(WebElement e:elementList)
	{
		String text=e.getText();
		dropdownName.add(text);
		
		if(text.equalsIgnoreCase("India"))
		{
			e.click();
			break;
		}
	}
	
	
		
		

	}

}
