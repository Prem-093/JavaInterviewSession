package SeleniumPractise;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=155259815513&hvpone=&hvptwo=&hvadid=676742245123&hvpos=&hvnetw=g&hvrand=3103034161397558844&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9303169&hvtargid=kwd-10573980&hydadcr=14453_2367553");
		
		
		
		List<WebElement> totalLinks=driver.findElements(By.tagName("a"));
		ArrayList<String> list=new ArrayList<String>();
		
		
		for(WebElement e:totalLinks)
		{
			String linkURL=e.getAttribute("href");
			System.out.println(linkURL.length());
			//list.add(linkURL);
			checkBrokenLinks(linkURL);
		}
		
	}
	
	public static void checkBrokenLinks(String linskURL) 
	{
		try {
			URL url=new URL(linskURL);
			
			
	HttpURLConnection httpURLConnection;
	try {
		httpURLConnection = (HttpURLConnection)url.openConnection();
		httpURLConnection.setConnectTimeout(5000);
		httpURLConnection.connect();
		
		if(httpURLConnection.getResponseCode()>=400)
		{
			System.out.println(linskURL +": is aBroken Link");
		}
		else
		{
			System.out.println(linskURL +"Is not broken");
		}
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
