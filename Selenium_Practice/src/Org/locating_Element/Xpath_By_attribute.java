package Org.locating_Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_By_attribute 
{
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.findElement(By.xpath("//div[text()='EN']")).click();
		driver.findElement(By.xpath("//span[text()='& Orders']"));
		driver.findElement(By.xpath("//a[text()='Gift Cards']"));
		driver.findElement(By.xpath("//span[text()='Cart']"));
		driver.findElement(By.xpath("//a[text()='Registry']"));
		driver.findElement(By.xpath("img[data-a-hires*='https://m.media-amazon.com/images/I/61jx']"));
		driver.findElement(By.xpath("//img[@alt='Jackets']"));
		driver.findElement(By.xpath("img[alt*=' Outdoor Propane Heater with Safety Tilt Switch an']"));
		driver.findElement(By.xpath("img[alt*='Casio MDV106 Series | Unisex Analog Watch']"));
		driver.findElement(By.xpath("//img[@data-a-hires='https://m.media-amazon.com/images/I/71qcoYgEhzL._SX3000_.jpg']"));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.xpath("//img[@alt='company-branding']"));
		driver.findElement(By.xpath("//button[@aria-label='Expand Account and Lists']"));
	
	}

}
