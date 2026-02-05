package Org.basics;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate_Enter_Gettitle
{
	public static void main(String[] args) throws InterruptedException, MalformedURLException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.myntra.com/");
	Thread.sleep(3000);
	driver.navigate().refresh();
	Thread.sleep(3000);
	driver.navigate().to("https://in.puma.com/");
	Thread.sleep(3000);
	driver.navigate().forward();
	driver.navigate().to(new URL("https://www.hp.com/"));
	
	}

}
