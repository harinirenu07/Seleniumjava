package org.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_Mouse {
	public static void main(String[] args) throws InterruptedException  {
		 System.setProperty("webdriver.chrome.driver",
				 "C:\\Users\\harin\\eclipse-workspace\\seleniumjava\\driver\\chromedriver.exe");
		 WebDriver driver1 = new ChromeDriver();
		 driver1.get("https://www.leafground.com/drag.xhtml;jsessionid=node05kg9nb5gol9t9qi2qfgvyhz2109953.node0");
		 driver1.manage().window().maximize();
		 
		 Actions ac = new Actions(driver1);
		 Thread.sleep(3000);
		 
		 WebElement drag = driver1.findElement(By.xpath("//div[@id='form:drag_content']"));
	     WebElement drop = driver1.findElement(By.xpath("//span[text()='Droppable Target']"));
	     ac.dragAndDrop(drag, drop).build().perform();
	     
	     WebElement dd = driver1.findElement(By.xpath("//span[text()='Drag and Drop']"));
	     ac.clickAndHold(dd).build().perform();
	     ac.moveToElement(dd,500,0).build().perform();
	     
	     
	     
	     
	}
	
}