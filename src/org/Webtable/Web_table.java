package org.Webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_table {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\harin\\eclipse-workspace\\seleniumjava\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		
   List<WebElement> web = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[5]/td"));
		for (WebElement webElement : web) {
			System.out.print(webElement.getText());
			
			List<WebElement> f = driver.findElements(By.tagName("th"));
			for (WebElement webElement2 : f) {
				System.out.println(webElement.getText());
				
			}
				
			}
		}
		

}
