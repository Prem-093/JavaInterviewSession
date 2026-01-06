package SeleniumPractise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTotalLink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/30-day-free-trial/");

		List<WebElement> allLinks = driver.findElements(By.tagName("a"));

		int count = 0;
		for (WebElement w : allLinks) {
			String text = w.getText();
			String hrefText = w.getAttribute("href");

			if (text.length() > 0) {
				System.out.println(count + ":" + text + ":" + "AND href::" + hrefText);

			}

			count++;
		}

		driver.quit();

	}

}
