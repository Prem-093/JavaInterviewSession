package SeleniumPractise;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();

		driver.get("https://www.orangehrm.com/30-day-free-trial/");
		driver.manage().window().setSize(new Dimension(1080,780));
		driver.close();
	}

}
