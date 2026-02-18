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
		//select.selectByIndex(5);
		//select.selectByValue("Australia");
		
		List<WebElement> getOptions=select.getOptions();
		boolean flag = false;
		if(getOptions.size()>0)
		{
			for(WebElement e:getOptions)
			{ 
			  String text=e.getText();
			 // System.out.println(text);
			  if(text.length()>0)
			  {
				  if(text.equalsIgnoreCase("India"))
				  {
					  e.click();
					  flag=true;
					  System.out.println("Element is found :"+flag);
					  break;
					 
				  }
				  
				  else
				  {
					  System.out.println("Option is not available in Drop down ,Searching fo expected value :"+flag);
				  }
			  }
			  else
			  {
				  System.out.println("Blank text ");
			  }
			  
			}
			
			
		}
		else {
			System.out.println("DropDown List should be grater thet zero it should not be blank");
		}
		
		
		
		
		
		
		
		
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
