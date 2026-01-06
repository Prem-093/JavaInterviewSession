package SeleniumPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Retrylogic {

	static WebDriver driver;

	public static WebElement getElemet(By locator) {
		return driver.findElement(locator);
	}

	public static void retryLogic(int timeOut, By locator) {
		int attempt = 0;
		WebElement element=null;

		while (attempt < timeOut) {
			try {
				 element = getElemet(locator);
				System.out.println("Element is found :"+element +":"+ +attempt);
				break;
			} catch (NoSuchElementException e) {
				e.printStackTrace();

				try {
					Thread.sleep(500);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			attempt++;

			
			if(element==null)
			{
				System.out.println("Element is not found :"+locator +":"+attempt);
			}
		}
		
		
	}

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 By loc=By.xpath("//input[@name='username123']");
		 retryLogic(20,loc);
	}

}
