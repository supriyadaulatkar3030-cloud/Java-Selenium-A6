package Org.basics;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practicing_Frame 
{
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.switchTo().frame("iframeResult");//SWitching in frame by name attribute
		
		driver.findElement(By.xpath("//button[text()='Try it']")).click();//locating simple try it button
		Alert alert = driver.switchTo().alert();//switching control in alert
		alert.sendKeys("supriya");//using reference we are sending data in alert pop up
		//Facing issue, on UI it is on display supriya but at backend it works
		alert.accept();
		
	}

}
