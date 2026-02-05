package Org.locating_Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locating_id 
{
	public static void main(String[] args) throws InterruptedException  {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("ssss@gmail.com");
		WebElement element = driver.findElement(By.id("pass"));
		element.sendKeys("1357");
		Thread.sleep(3000);
		element.clear();
		element.sendKeys("asss");
		Thread.sleep(2000);
		
		
		

	}

}
