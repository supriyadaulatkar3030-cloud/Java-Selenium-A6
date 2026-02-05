package Org.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Entering_intoapplication_bygetmethod 
{
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.yamaha-motor-india.com/");
		
		driver.get("https://www.ferrerorocher.com/");
		//driver.get("www.zomato.com");
		String title=driver.getTitle();
		System.out.println(title);
		String URL = driver.getCurrentUrl();
		System.out.println(URL);
		
	}

}
