package SeleniumPractise;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowHandle {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/30-day-free-trial/");
		
		Actions action=new Actions(driver);
		
		action.sendKeys(Keys.END).build().perform();
		
		driver.findElement(By.xpath(("//button[text()='Allow all']"))).click();
		
		String ParentWindoeID=driver.getWindowHandle();
	
		//System.out.println(ParentWindoeID);
		
		//div[contains(@class,'social-link')]/ul/li
		
		By socialLink=By.xpath("//div[contains(@class,'social-link')]/ul/li");
		
		List<WebElement> elementList=driver.findElements(socialLink);
		
		for(WebElement e:elementList)
		{
			e.click();
			
		}
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		Set<String>  set=driver.getWindowHandles();
		
		Iterator<String> it=set.iterator();
		
		while(it.hasNext())
		{
			String WindoiwIDtext=it.next();
			System.out.println("Window Id:"+WindoiwIDtext);
			driver.switchTo().window(WindoiwIDtext);
			System.out.println(WindoiwIDtext);
			System.out.println(driver.getTitle());
			
			
			  if(!WindoiwIDtext.equalsIgnoreCase(ParentWindoeID)) {
			  
			  driver.close(); }
			 
			
			
				
			
				  
				 
			
			
			
			
			
			
			  
			 
	    }
		
		
		
		  driver.switchTo().window(ParentWindoeID);
		  
		  String parentWindowTitle=driver.getTitle();
		  
		  System.out.println(parentWindowTitle);
		  
		  
		 
		  driver.findElement(By.xpath(
		  "//a[@href='https://www.youtube.com/user/orangehrm']")).click();
		  
		 Set<String> handels= driver.getWindowHandles();
		 
		 ArrayList<String> list=new ArrayList<String>(handels);
		 
		String PrenWindow=list.get(0);
		String child=list.get(1);
	
		
		driver.switchTo().window(child);
		
		System.out.println(driver.getTitle());
		  
			/*
			 * String ChildWindow="C2F10E30AE68B00007B8E64A76E077F7";
			 * 
			 * driver.switchTo().window(ChildWindow);
			 * 
			 * System.out.println(driver.getCurrentUrl());
			 * 
			 * driver.quit();
			 */
		 
		
		
		
		
		

	}

}
