package com.web_navigate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate_web {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\harin\\eclipse-workspace\\seleniumjava\\driver1\\chromedriver.exe");
		
		WebDriver driver1 = new ChromeDriver();
		
		//Parentclass refname = new Childclass();
		
		driver1.get("https://www.flipkart.com/");
		driver1.manage().window().maximize();
		driver1.navigate().to("https://www.facebook.com/");
		String Title = driver1.getTitle();
		System.out.println(Title);
		String Url = driver1.getCurrentUrl();
		System.out.println(Url);
		
		driver1.navigate().to("https://www.amazon.in/");
		 driver1.navigate().back();
		 Thread.sleep(5000);
		 
		 driver1.navigate().forward();
			String title2 = driver1.getTitle();
			System.out.println(title2);
			String currentUrl2 = driver1.getCurrentUrl();
			System.out.println(currentUrl2);
			
			driver1.close();
			
		}	 
		
}		


