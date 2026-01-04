package SeleniumPractise;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class EspnWebtable {
	
	static WebDriver driver;
	
	public static List<WebElement> espnWebTableHandle(String playerName)
	{
		
		By playerDetails=By.xpath("(//span[text()='"+playerName+"'])[1]/ancestor::td/following-sibling::td");
		
		return driver.findElements(playerDetails);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//(//span[text()='Hazratullah Zazai'])[1]/ancestor::td/following-sibling::td
		
		 driver=new ChromeDriver();
		 
		 driver.get("https://www.espncricinfo.com/series/bangladesh-premier-league-2025-26-1516530/sylhet-titans-vs-chattogram-royals-11th-match-1516543/full-scorecard");
		 try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 Actions action=new Actions(driver);
		 
		 action.sendKeys(Keys.PAGE_DOWN).build().perform();
		 
		List<WebElement> espnPlayerDetails= espnWebTableHandle("Hazratullah Zazai");
		String text="";
	
		for(WebElement e:espnPlayerDetails)
		{
		String playerDetail= e.getText();
		
		text=text + playerDetail +":";
		
		}
		System.out.println(text);
		 
		 //driver.close();
		
	
		
		
		
	}

}
