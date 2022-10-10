package org.task;

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
		   
		   WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
		   username.sendKeys("sowmya");
		   
		   WebElement password = driver.findElement(By.xpath("//input[contains(@type,'password')]"));
		   password.sendKeys("12345678");
		   
		   Thread.sleep(3000);
		   
		   
		   
		   		

	}

}
