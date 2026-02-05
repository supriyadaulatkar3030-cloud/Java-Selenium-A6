package Org.locating_Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locating_DWS 
{
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/register");
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("gender-female")).click();
		driver.findElement(By.id("FirstName")).sendKeys("SupriyaD");
		driver.findElement(By.id("LastName")).sendKeys("D");
		driver.findElement(By.id("Email")).sendKeys("JBS@gmail.com");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("12345");
		driver.findElement(By.id("Password")).sendKeys("12345");
		
	}

}
