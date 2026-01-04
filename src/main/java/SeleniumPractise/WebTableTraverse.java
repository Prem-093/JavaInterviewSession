package SeleniumPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableTraverse {
	
	static WebDriver driver;
	public static int getRowCount()
	{
		return driver.findElements(By.xpath("//table[@id='customers']//tr")).size();
	}
	
	public static void companyColumn()
	{
		String BeforeXpath= "//table[@id=\"customers\"]/tbody/tr[ ";
		String AfterXpath="]/td[1]";
		//String TotalXpath="";
		for(int row=2;  row<=getRowCount();row++)
		{
			String TotalXpath=BeforeXpath + row  + AfterXpath ;
			
			String text=driver.findElement(By.xpath(TotalXpath)).getText();
			
			System.out.println("--------------------------Company---------------------");
			
			System.out.println(text);
		}
		
		
	}
	public static void contactColumn()
	{
		String BeforeXpath= "//table[@id=\"customers\"]/tbody/tr[ ";
		String AfterXpath="]/td[2]";
		//String TotalXpath="";
		for(int row=2;  row<=getRowCount();row++)
		{
			String TotalXpath=BeforeXpath + row  + AfterXpath ;
			
			String text=driver.findElement(By.xpath(TotalXpath)).getText();
			
			System.out.println("--------------------------Conatct---------------------");
			
			System.out.println(text);
		}
		
		
	}
	
	public static void countryColumn()
	{
		String BeforeXpath= "//table[@id=\"customers\"]/tbody/tr[ ";
		String AfterXpath="]/td[3]";
		//String TotalXpath="";
		for(int row=2;  row<=getRowCount();row++)
		{
			String TotalXpath=BeforeXpath + row  + AfterXpath ;
			
			String text=driver.findElement(By.xpath(TotalXpath)).getText();
			
			System.out.println("--------------------------Country---------------------");
			
			System.out.println(text);
		}
		
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		System.out.println(getRowCount());
		companyColumn();
		contactColumn();
		countryColumn();
		
		
	}

}
