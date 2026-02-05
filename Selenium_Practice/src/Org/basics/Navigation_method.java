package Org.basics;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation_method 
{
	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.yamaha-motor-india.com/");
		Thread.sleep(3000);
		driver.get("https://www.jawamotorcycles.com/");
		Thread.sleep(3000);
		driver.navigate().back();// back to yamha motor
		Thread.sleep(3000);
		driver.navigate().forward();//jawa motors
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.navigate().to("https://in.bookmyshow.com/");
		Thread.sleep(3000);
		//driver.navigate().to("https://www.ferrerorocher.com/");
		Thread.sleep(5000);
		driver.navigate().to(new URL("https://www.irctc.com"));
		
		
	}

}
