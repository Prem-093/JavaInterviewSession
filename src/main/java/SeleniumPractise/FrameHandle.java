package SeleniumPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//input[@title='Enter your first crush name']
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://selectorshub.com/iframe-and-nested-iframe/");
		By firstCrush=By.xpath("//input[@title='Enter your first crush name']");
		
		driver.findElement(firstCrush).sendKeys("Prem");
		
		By pact2=By.xpath("//iframe[@id='pact2']");
		WebElement element=driver.findElement(pact2);
		
		driver.switchTo().frame(element);
		
		By jex=By.xpath("//input[@id='jex']");
		
		driver.findElement(jex).sendKeys("Tripathi");
		
		driver.switchTo().frame("pact3");
		
		By glaf=By.xpath("//input[@id='glaf']");
		
		driver.findElement(glaf).sendKeys("kartikey");
		
		driver.switchTo().parentFrame();
		
		driver.findElement(jex).clear();
		
		driver.findElement(jex).sendKeys("Pranshi");
		
		driver.switchTo().defaultContent();
		
		driver.findElement(firstCrush).clear();
		driver.findElement(firstCrush).sendKeys("Nidhi");
		

	}

}
