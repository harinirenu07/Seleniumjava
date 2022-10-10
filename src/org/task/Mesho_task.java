package org.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mesho_task {
	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\harin\\eclipse-workspace\\seleniumjava\\driver\\chromedriver.exe");
           WebDriver  driver = new ChromeDriver();
           driver.get("https://www.meesho.com/");
           driver.manage().window().maximize();
           
           Actions ac = new Actions(driver);
		   WebElement foot = driver.findElement(By.xpath("//span[text()='Bags & Footwear']"));
			 ac.moveToElement(foot).build().perform();

	}

}
