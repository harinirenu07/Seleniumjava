package org.iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Single_multiple {
	public static void main(String[] args) throws InterruptedException {
		   System.setProperty("webdriver.chrome.driver",
				   "C:\\Users\\harin\\eclipse-workspace\\seleniumjava\\driver\\chromedriver.exe");
		   
		   WebDriver driver = new ChromeDriver();
		   
		   driver.get("https://demo.automationtesting.in/Frames.html");
		   
		   driver.manage().window().maximize();
           
		   Thread.sleep(3000);
		   
		   //driver.switchTo().frame(0);
		   
		   WebElement single = driver.findElement(By.xpath("//iframe[@id='singleframe']"));
		   driver.switchTo().frame(single);
		   
		   WebElement value = driver.findElement(By.xpath("//input[@type='text']"));
		   value.sendKeys("Single Frame ");
		   
		   driver.switchTo().defaultContent();
		   
		   driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']")).click();
		   
		   driver.switchTo().frame(1);
		   driver.switchTo().frame(0);
		   
		   driver.findElement(By.xpath("// input[@type='text']")).sendKeys("Multiple frame");
		   driver.switchTo().parentFrame();
		   driver.switchTo().defaultContent();
		   
		   
		   
		   
		   
		   
		   
	}
	
}
	
