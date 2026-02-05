package Org.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Combination_all_methods
{
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		String title = driver.getTitle();
		System.out.println("The title of automated browser:"+ title);
		String Url = driver.getCurrentUrl();
		System.out.println(Url);
		//String sourcecode = driver.getPageSource();
		//System.out.println("The sourcecode of automated browser:" +sourcecode);
		String windowid = driver.getWindowHandle();
		System.out.println("The window id of current automated browser is:"+windowid);
	}

}
