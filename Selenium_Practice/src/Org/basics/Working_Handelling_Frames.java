package Org.basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_Handelling_Frames
{
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.dream11.com/fantasy-sports");
		//driver.switchTo().frame(0);//Entering in frame by index but not working
		//driver.switchTo().frame("send-sms-iframe"); //by id we have located but facing problem 
		
		 WebElement frameelement = driver.findElement(By.id("send-sms-iframe")); //working
		 //by webelement method of frame, only this is working
		
		
		driver.switchTo().frame(frameelement);//Switching inside frame by locating webelement and giving reference
		driver.findElement(By.id("regEmail")).sendKeys("9970345490");
		driver.findElement(By.id("regUser")).click();
		
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Industry Overview")).click();
		 
	}

}
