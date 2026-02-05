package Org.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fetching_URL_Title
{
	public static void main(String[] args) {
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.ferrerorocher.com/");
	String title = driver.getTitle();
	System.out.println(title);
	String URL = driver.getCurrentUrl();
	System.out.println(URL);
	driver.get("https://www.zomato.com/");
	String tl2 = driver.getTitle();
	System.out.println(tl2);
	String url2 = driver.getCurrentUrl();
	System.out.println(url2);
	
	
	
	}

}
