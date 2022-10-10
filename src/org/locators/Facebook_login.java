package org.locators;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Facebook_login {
		public static void main(String[] args) {
		   System.setProperty("webdriver.chrome.driver",
				   "C:\\Users\\harin\\eclipse-workspace\\seleniumjava\\driver\\chromedriver.exe");
		   
		   WebDriver driver = new ChromeDriver();
		   
		   driver.get("https://www.facebook.com/");
		   
		   driver.manage().window().maximize();
		   
		   WebElement mailid = driver.findElement(By.id("email"));
		   mailid.sendKeys("hari@gmai.com");
		   
		   WebElement password = driver.findElement(By.name("pass"));
		   password.sendKeys("12345678");
		   
		   WebElement log = driver.findElement(By.name("login"));
		   log.click();
		   
		   
		   
		   
				   
		   		
		}

	}


