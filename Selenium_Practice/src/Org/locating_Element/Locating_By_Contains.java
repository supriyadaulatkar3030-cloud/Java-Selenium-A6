package Org.locating_Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locating_By_Contains 
{
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.browserstack.com/");
	Thread.sleep(4000);
	driver.findElement(By.xpath("//a[contains(text(),'Get started free')]")).click();
	//Thread.sleep(2000);
	//driver.findElement(By.xpath("(//button[contains(text(),'Talk to ')])[1]")).click();
	}
	

}
