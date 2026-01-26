package TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class retry {
	
	static WebDriver driver;
	
	public static WebElement getElemnt(By locattor)
	{
		return driver.findElement(locattor);
	}
	
	public static void retryElement(By locator,int timeout)
	{
		int attemp=0;
		WebElement	element=null;
		while(attemp<timeout)
		{
		try {
		element=getElemnt(locator);
		System.out.println("Element is found");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		attemp++;
		}
		
		if(element==null)
		{
			System.out.println("Element not found");
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
