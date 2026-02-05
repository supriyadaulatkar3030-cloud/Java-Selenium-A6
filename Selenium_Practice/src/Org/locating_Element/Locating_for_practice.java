package Org.locating_Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locating_for_practice 
{
	public static void main(String[] args) 
	{
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.jawamotor");
	driver.findElement(By.linkText("Motorcycles")).click();
	driver.findElement(By.linkText("DEALERS")).click();
	driver.findElement(By.linkText("TESTRIDE")).click();
	}

}
