package org.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	public static void main(String[] args) throws InterruptedException {
    	System.setProperty("webdriver.chrome.driver",
    			"C:\\Users\\harin\\eclipse-workspace\\seleniumjava\\driver\\chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
    	
    	driver.get("https://www.amazon.in/");
    	
		   driver.manage().window().maximize();
		   Thread.sleep(3000);
		   
		   WebElement mobile = driver.findElement(By.xpath("//a[text()='Mobiles']"));
		   mobile.click();
		   
		 
		   
		   //driver.findElement(By.xpath("//a[text()='Mobiles']")).click();
		   
		   
	}
		   
		   
}
