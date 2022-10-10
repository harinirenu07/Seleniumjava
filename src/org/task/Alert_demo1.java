package org.task;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_demo1 {
 public static void main(String[] args) throws InterruptedException  {
	 System.setProperty("webdriver.chrome.driver",
			 "C:\\Users\\harin\\eclipse-workspace\\seleniumjava\\driver\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://demoqa.com/alerts");
	 driver.manage().window().maximize();
	 
	 driver.findElement(By.xpath("//button[@id='alertButton']")).click();
	 Thread.sleep(3000);
	 driver.switchTo().alert().accept();
	 
	 driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
	 Thread.sleep(3000);
	 driver.switchTo().alert().dismiss();
	 
	 driver.findElement(By.xpath("(//button[text()='Click me'])[2]")).click();
	 Thread.sleep(5000);
	 driver.switchTo().alert().accept();
	 
	 driver.findElement(By.xpath("(//button[@type='button'])[5]")).click();
	 driver.switchTo().alert().sendKeys("hello alert");
	 Thread.sleep(3000);
	 driver.switchTo().alert().accept();
	 

}
 
}


