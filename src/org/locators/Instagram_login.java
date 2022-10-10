package org.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram_login {
    public static void main(String[] args) throws InterruptedException {
    	System.setProperty("webdriver.chrome.driver",
    			"C:\\Users\\harin\\eclipse-workspace\\seleniumjava\\driver\\chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
    	
    	driver.get("https://www.instagram.com/?hl=en");
    	
		   driver.manage().window().maximize();
		   Thread.sleep(3000);

		   WebElement username = driver.findElement(By.name("username"));
		   username.sendKeys("sowmy");
		   
		   WebElement pass = driver.findElement(By.name("password"));
		   pass.sendKeys("12345678");
		   
		   
		   
		   
		   
    }
}
