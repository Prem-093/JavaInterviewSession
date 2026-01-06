package SeleniumPractise;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelectConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.orangehrm.com/30-day-free-trial/");
		
		driver.manage().window().maximize();
	
		
		driver.findElement(By.xpath(("//button[text()='Allow all']"))).click();
		
		WebElement element=driver.findElement(By.xpath("//select[@name='Country']"));
		
		Select select=new Select(element);
		//select.selectByVisibleText("India");
		List<WebElement> getOptions=select.getOptions();
		
		
		/*  for(WebElement e:getOptions) {
			  String text=e.getText();
			  if(text.equalsIgnoreCase("Australia"))
			  {
				  System.out.println(text);
				  e.click();
				  break;
			  }*/
		  
		  }
		 
		
		
		
		
		  
		  
		 
	}

}
