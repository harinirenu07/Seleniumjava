package org.task;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Java_script2 {

public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\harin\\eclipse-workspace\\seleniumjava\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	
	JavascriptExecutor js = (JavascriptExecutor)driver;
	WebElement Email = driver.findElement(By.xpath("//input[@id='email']"));
    js.executeScript("arguments[0].value='selenium@gmail.com'",Email);
    Thread.sleep(3000);
    
    WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
    js.executeScript("arguments[0].value='12345678'", password);
    Thread.sleep(3000);
    
    WebElement login = driver.findElement(By.xpath("//button[@name='login']"));
    js.executeScript("arguments[0].click();", login);
    Thread.sleep(3000);
    
    js.executeScript("window.location='https://www.amazon.in/'");
    js.executeScript("history.go(0)");
    js.executeScript("alert('hello amazon');");
   
    
}

}
    
    
   
   
    
    
    
    
	



