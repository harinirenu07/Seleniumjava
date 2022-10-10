package org.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Myntra_task {
	 public static void main(String[] args) {
	
	 System.setProperty("webdriver.chrome.driver",
			 "C:\\Users\\harin\\eclipse-workspace\\seleniumjava\\driver\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://www.myntra.com/");
	 driver.manage().window().maximize();
	 
	 Actions ac = new Actions(driver);
	 WebElement hl = driver.findElement(By.xpath("(//a[text()='Home & Living'])[1]"));
	 ac.moveToElement(hl).build().perform();
	 
	 WebElement towels = driver.findElement(By.xpath("//a[text()='Bath Towels']"));
	 towels.click();
	 

}
}
