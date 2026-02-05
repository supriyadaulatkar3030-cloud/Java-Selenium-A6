package Org.locating_Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 
{
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.name("field-keywords")).sendKeys("Motorola edge 60");
		driver.findElement(By.id("nav-search-submit-button")).click();
		//driver.findElement(By.partialLinkText(""))
		
	}

}
