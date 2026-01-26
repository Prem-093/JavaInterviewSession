package JavaPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PlindromNum {
	static WebDriver driver;
	
	public static WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}
	
	static int attemp=0;
	static WebElement element=null;
	public static void reltryLogic(By locator,int timeout)
	{
		while(attemp<timeout)
		{
			
			try {
			
			 element=getElement(locator);
			System.out.println("element is found : "+element +","+ attemp);
			break;
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
			System.out.println("Ekement is not found:"+element +","+attemp);
		}
		
		
		
	}
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		

	}

}
