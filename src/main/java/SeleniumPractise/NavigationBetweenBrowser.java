package SeleniumPractise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationBetweenBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://selectorshub.com/iframe-and-nested-iframe/");
		
		driver.navigate().to("https://www.orangehrm.com/30-day-free-trial/");
		
		driver.navigate().back();
				;
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		//driver.navigate().
		
      driver.quit();
	}

}
