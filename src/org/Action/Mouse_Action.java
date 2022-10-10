package org.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Action {
	public static void main(String[] args) throws InterruptedException  {
		 System.setProperty("webdriver.chrome.driver",
				 "C:\\Users\\harin\\eclipse-workspace\\seleniumjava\\driver\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://demoqa.com/buttons");
		 driver.manage().window().maximize();
		 
		 Actions ac = new  Actions(driver);
		 
		 WebElement dc = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
		 ac.doubleClick(dc).build().perform();
		 Thread.sleep(3000);
		 
		 WebElement rc = driver.findElement(By.xpath("//button[text()='Right Click Me']"));
		  ac.contextClick(rc).build().perform();
		  Thread.sleep(3000);
		  
		  WebElement cm = driver.findElement(By.xpath("//button[text()='Click Me']"));
		  ac.contextClick(cm).build().perform();
		  Thread.sleep(3000);
		 

}
}
