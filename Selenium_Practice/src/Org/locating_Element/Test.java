package Org.locating_Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test 
{
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.linkText("Prime")).click();
		driver.findElement(By.linkText("Sell")).click();
		driver.findElement(By.linkText("Bestsellers")).click();
		driver.findElement(By.linkText("Today's Deals")).click();
		driver.findElement(By.linkText("Mobiles")).click();
		driver.findElement(By.linkText("Fresh")).click();
		driver.findElement(By.linkText("MX Player")).click();
		driver.findElement(By.linkText(" Electronics")).click();
	}

}
