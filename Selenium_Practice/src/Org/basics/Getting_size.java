package Org.basics;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getting_size 
{
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Dimension size = driver.manage().window().getSize();
		//return type is diamension
		System.out.println("The size of automated browser:" +size);
		Thread.sleep(3000);
		System.out.println(size.getHeight());
		System.out.println(size.getWidth());
	    Dimension targetsize = new Dimension(688,600);
	    driver.manage().window().setSize(targetsize);
	    System.out.println(targetsize);
	    driver.quit();
	}

}
