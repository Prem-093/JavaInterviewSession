package SeleniumPractise;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		
		//driver.findElement(By.xpath("//input[@name='upfile']")).sendKeys("Users\admin\Downloads\www.orangehrm.com_30-day-free-trial");
		//type= file--->if its not there then we can not use send keys for upload file

	}

}
