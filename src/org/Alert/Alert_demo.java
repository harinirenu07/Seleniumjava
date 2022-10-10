package org.Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_demo {
 public static void main(String[] args) throws InterruptedException  {
	 System.setProperty("webdriver.chrome.driver",
			 "C:\\Users\\harin\\eclipse-workspace\\seleniumjava\\driver\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://demo.automationtesting.in/Alerts.html");
	 driver.manage().window().maximize();
	 
     
	 driver.findElement(By.xpath("(//button[contains(text(),'click the button')])[1]")).click();
	 Thread.sleep(3000);
	 driver.switchTo().alert().accept();
	 
	 driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
		
		driver.findElement(By.xpath("//button[@onclick='confirmbox()']")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
		
		driver.findElement(By.xpath("//a[text()='Alert with Textbox ']")).click();
		
		driver.findElement(By.xpath("//button[@onclick='promptbox()']")).click();
		driver.switchTo().alert().sendKeys("Hello Alert");
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		
	 


}
}