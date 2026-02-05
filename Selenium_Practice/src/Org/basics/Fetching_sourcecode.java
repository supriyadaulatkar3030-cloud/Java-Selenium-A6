package Org.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fetching_sourcecode 
{
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.zomato.com/");
		driver.get("https://www.facebook.com/");
		String source = driver.getPageSource();
		System.out.println(source); 
	}

}
