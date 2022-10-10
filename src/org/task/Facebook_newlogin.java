package org.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook_newlogin {
	public static void main(String[] args) throws InterruptedException {
		   System.setProperty("webdriver.chrome.driver",
				   "C:\\Users\\harin\\eclipse-workspace\\seleniumjava\\driver\\chromedriver.exe");
		   
		   WebDriver driver = new ChromeDriver();
		   
		   driver.get("https://www.facebook.com/");
		   
		   driver.manage().window().maximize();
		   
		   
		   Thread.sleep(3000);
		  
		   WebElement newaccount = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
			newaccount.click();
			Thread.sleep(3000);

			WebElement fristname = driver.findElement(By.xpath("//input[@name='firstname']"));
			fristname.sendKeys("dharshini");
			Thread.sleep(3000);
			
			WebElement Lastname = driver.findElement(By.xpath("//input[@name='lastname']"));
			Lastname.sendKeys("S.P");
			Thread.sleep(3000);
		
			WebElement mobile = driver.findElement(By.xpath("(//input[@type='text'])[4]"));
			mobile.sendKeys("9924456901");
			Thread.sleep(3000);

			WebElement password = driver.findElement(By.xpath("//input[contains(@id,'password_step_input')]"));
			password.sendKeys("123467898");
			
			WebElement day = driver.findElement(By.xpath("//select[@title='Day']"));
			Select s = new Select(day);
			s.selectByValue("12");
			
			WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
			Select d = new Select(month);
			d.selectByValue("5");
			
			WebElement year = driver.findElement(By.xpath("//select[@title='Year']"));
			Select y = new Select(year);
			y.selectByVisibleText("2000");
			
			WebElement female = driver.findElement(By.xpath("//input[@value='1']"));
			female.click();
			
			WebElement male = driver.findElement(By.xpath("//input[@value='2']"));
			male.click();
			
			WebElement custom = driver.findElement(By.xpath("//input[@value='-1']"));
			custom.click();
			
			WebElement pronoun = driver.findElement(By.xpath("//select[@aria-label='Select your pronoun']"));
			Select p = new Select(pronoun);
			p.selectByIndex(2);
			
			WebElement gender = driver.findElement(By.xpath("(//input[@type='text'])[7]"));
			gender.sendKeys("male");
			
			WebElement signup = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
			signup.click();
			
	      }
	
}
	
			
			
			
			
			
			
			
			
			
	
	
	
	
	
			
	
		 

		   
		   

		   

		   
	     
		   
	
	
		   
		   


