package SeleniumPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptConcept {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.lambdatest.com/selenium-playground/select-dropdown-demo");
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");//Scroll to end of page
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
		Thread.sleep(2000);
		//js.executeScript("window.scrollTo(0,document.body.scrollHeight/2)");
		//Thread.sleep(5000);
		
	By loc=	By.xpath("//div[text()='Multi Select Option']");
		
		WebElement element=driver.findElement(loc);
		//js.executeScript("arguments[0].scrollIntoView(true);", element);
		
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		
		Thread.sleep(5000);
		
		
		
		System.out.println(element.getText());
		
		driver.close();
	}

}
