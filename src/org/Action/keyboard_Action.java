package org.Action;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyboard_Action {
	public static void main(String[] args) throws InterruptedException, AWTException  {
		 System.setProperty("webdriver.chrome.driver",
				 "C:\\Users\\harin\\eclipse-workspace\\seleniumjava\\driver\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.amazon.in/");
		 driver.manage().window().maximize();
		 
		 Actions ac = new Actions(driver);
		 WebElement mob = driver.findElement(By.xpath("//a[text()='Mobiles']"));
		 ac.contextClick(mob).build().perform();
		 
		 Robot r = new Robot();
		 
		 r.keyPress(KeyEvent.VK_DOWN);
		 r.keyRelease(KeyEvent.VK_DOWN);
		 Thread.sleep(3000);
		 
		 r.keyPress(KeyEvent.VK_ENTER);
		 r.keyRelease(KeyEvent.VK_ENTER);
		 
		 r.keyPress(KeyEvent.VK_CONTROL);
		 r.keyPress(KeyEvent.VK_T);
		 r.keyRelease(KeyEvent.VK_CONTROL);
		 r.keyRelease(KeyEvent.VK_T);
		 
		 r.keyPress(KeyEvent.VK_WINDOWS);
		 r.keyPress(KeyEvent.VK_PRINTSCREEN);
		 r.keyRelease(KeyEvent.VK_WINDOWS);
		 r.keyRelease(KeyEvent.VK_PRINTSCREEN);
	}
}