package SeleniumPractise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WebTableHandle {
	
	static WebDriver driver;
	
	public static WebElement selectUser(String userName )
	{
		By checkBox=By.xpath("//a[text()='"+userName+"']/parent::td/preceding-sibling::td/input[@type='checkbox']");
		
		return driver.findElement(checkBox);
	}
	
	
    public static List<WebElement> webTableDetails(String username)
    
    {
    	By weTableInformation=By.xpath("//a[text()='"+username+"']/parent::td/following-sibling::td");
    	
    	return driver.findElements(weTableInformation);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			//By checkBox=By.xpath("//a[text()='Jasmine.Morgan']/parent::td/preceding-sibling::td/input[@type='checkbox']");
		 driver=new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Actions action=new Actions(driver);
		
		action.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).build().perform();
		
		//WebElement user=selectUser("Jasmine.Morgan");
		//user.click();
		
		String text="";
		List<WebElement> webtableDetails=webTableDetails("Jasmine.Morgan");
		
		for(WebElement e:webtableDetails)
		{
			text=text+e.getText()+ ":";
		}
		System.out.println(text);
		

	}

}
