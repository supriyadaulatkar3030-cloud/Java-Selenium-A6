package Org.basics;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Launching_all_browser 
{
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the browser name");
		String browsername = s.next();
		WebDriver driver;
		if(browsername.equalsIgnoreCase("Chrome"))
		{
			driver = new ChromeDriver();
		}
		else if(browsername.equalsIgnoreCase("Safari"))
		{
			driver = new SafariDriver();
		}
		else
		{
			System.out.println("Invalid");
		}
		

	}

}
