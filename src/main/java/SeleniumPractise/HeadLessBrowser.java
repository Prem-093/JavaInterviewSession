package SeleniumPractise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadLessBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		
		ChromeOptions co= ChromeOptions();
		co.addArguments("--headless");
		WebDriver driver=new ChromeDriver(co);
	}

	private static ChromeOptions ChromeOptions() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
