package org.task;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Java_script1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\harin\\eclipse-workspace\\seleniumjava\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Thread.sleep(3000);
		
		WebElement help = driver.findElement(By.xpath("//a[text()='Help']"));
		Thread.sleep(3000);
		
		js.executeScript("arguments[0].scrollIntoView();",help);
		
		Thread.sleep(3000);
		
		js.executeScript("window.scrollBy(0,-3000);");
		
		js.executeScript("window.scrollBy(0,2000);");
		
        
		
	}
}


