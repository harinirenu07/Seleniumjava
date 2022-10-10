package org.dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	public static void main(String[] args) {
		   System.setProperty("webdriver.chrome.driver",
				   "C:\\Users\\harin\\eclipse-workspace\\seleniumjava\\driver\\chromedriver.exe");
		   
		   WebDriver driver = new ChromeDriver();
		   driver.get("https://demoqa.com/select-menu");
		   driver.manage().window().maximize();

		   WebElement drop = driver.findElement(By.xpath("//select[@id='oldSelectMenu']"));
		   
		   Select s= new Select(drop);
		   
		  // s.selectByIndex(1);
		   
		  // s.selectByValue("7");
		   
		   s.selectByVisibleText("Black");
		   
		   WebElement f = driver.findElement(By.xpath("//select[@id='cars']"));
		   Select a = new Select(f);
		   
		   a.selectByIndex(0);
		   a.selectByValue("volvo");
		   a.selectByVisibleText("Audi");
		 
		   
		   
	}
		   
		   

}
