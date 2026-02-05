package Org.locating_Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locating_img 
{
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.amazon.in/");
		//driver.findElement(By.partialLinkText("Mobiles")).click();
		//driver.findElement(By.cssSelector("img[alt='poco']")).click();
		//driver.findElement(By.cssSelector("img[alt='Neo 10 R']")).click();
		//driver.findElement(By.cssSelector("img[alt='LAVA Storm Play 5G']")).click();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.partialLinkText("ELECTRONICS")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("img[title='Show products in category Cell phones']")).click();
	}

}
