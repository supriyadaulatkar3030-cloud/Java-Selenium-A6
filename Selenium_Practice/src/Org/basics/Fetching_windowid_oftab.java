package Org.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fetching_windowid_oftab
{
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.facebook.com/");
	String windowid = driver.getWindowHandle();
	//driver.get("https://www.zomato.com/");
	System.out.println("The window id or windowhandle of automated browser:" +windowid);
	}

}
