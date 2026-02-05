package Org.dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selecting_alloption_Indopdown 
{
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/reg");
		WebElement monthdropdown = driver.findElement(By.id("month"));
		Select select = new Select(monthdropdown);
		List<WebElement> alloption = select.getOptions();
		System.out.println(alloption);
		
	}

}
