package com.browser1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_login {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\harin\\\\eclipse-workspace\\\\seleniumjava\\\\driver\\\\chromedriver.exe");
		
		WebDriver driver1 = new ChromeDriver();
		
		driver1.get("https://www.amazon.in/");
		driver1.get("\"https://www.facebook.com/\"");
	    
	}

}
