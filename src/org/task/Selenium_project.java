package org.task;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Selenium_project {
	 public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		 System.setProperty("webdriver.chrome.driver",
				 "C:\\Users\\harin\\eclipse-workspace\\seleniumjava\\driver\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://demo.automationtesting.in/Index.html");//browser lanuch
		 driver.manage().window().maximize();
		 //locators
		 WebElement emailid = driver.findElement(By.xpath("//input[@type='text']"));
		 emailid.sendKeys("haripriya@gmail.com");
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("(//img[@alt='logo'])[2]")).click();
		 
		 WebElement firstname = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		 firstname.sendKeys("hari");
		 driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("priya");
		 driver.findElement(By.xpath("//textarea[@rows='3']")).sendKeys("1/4 anna nagar");
		 driver.findElement(By.xpath("//input[@type='email']")).sendKeys("haripriya@gmail.com");
		 WebElement tel = driver.findElement(By.xpath("//input[@type='tel']"));
		 tel.sendKeys("1234567892");
		 driver.findElement(By.xpath("//input[@value='FeMale']")).click();
		 driver.findElement(By.xpath("//input[@value='Cricket']")).click();
		 driver.findElement(By.xpath("//input[@value='Movies']")).click();
		 WebElement hockey = driver.findElement(By.xpath("//input[@value='Hockey']"));
		 hockey.click();
		 //dropdown
         WebElement skills = driver.findElement(By.xpath("(//select[@type='text'])[1]"));
         Select s = new Select(skills);
         s.selectByValue("Art Design");
         WebElement country = driver.findElement(By.xpath("//select[@id='country']"));
         Select c = new Select(country);
         c.selectByVisibleText("India");
         WebElement year = driver.findElement(By.xpath("//select[@id='yearbox']"));
         Select y = new Select(year);
         y.selectByVisibleText("2000");
         WebElement month = driver.findElement(By.xpath("//select[@placeholder='Month']"));
         Select m = new Select(month);
         m.selectByVisibleText("May");
         WebElement day = driver.findElement(By.xpath("(//select[@type='text'])[5]"));
         Select d = new Select(day);
         d.selectByValue("7");
         driver.findElement(By.xpath("//input[@id='firstpassword']")).sendKeys("14560");
         driver.findElement(By.xpath("//input[@id='secondpassword']")).sendKeys("14560");
         driver.findElement(By.xpath("//button[@id='submitbtn']")).click();
         //screenshot
         TakesScreenshot screen = (TakesScreenshot)driver;
         File g = screen.getScreenshotAs(OutputType.FILE);
         File f = new File("C:\\Users\\harin\\eclipse-workspace\\seleniumjava\\Screenshot\\ register.png");
         FileUtils.copyFile(g, f);
         //mouse action
         Actions ac = new Actions(driver);
         WebElement h = driver.findElement(By.xpath("//a[text()='SwitchTo']"));
         h.click();
         //keyboard Actions
         Robot r = new Robot();
         r.keyPress(KeyEvent.VK_DOWN);
         r.keyRelease(KeyEvent.VK_DOWN);
         
         r.keyPress(KeyEvent.VK_ENTER);
         r.keyRelease(KeyEvent.VK_ENTER);
         r.keyPress(KeyEvent.VK_ENTER);
         r.keyRelease(KeyEvent.VK_ENTER);
         
         //Alert
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
    		
     		//mouse Action
    	    	Actions ac1 = new Actions(driver);
    	    	WebElement click1 = driver.findElement(By.xpath("//a[text()='SwitchTo']"));
    	    	ac1.click(click1).build().perform();
    	    	
    	    	//keyboard action
    	    	Robot r1=new Robot();
    	    	r1.keyPress(KeyEvent.VK_DOWN);
    	    	r1.keyRelease(KeyEvent.VK_DOWN);
    	    	r1.keyPress(KeyEvent.VK_DOWN);
    	    	r1.keyRelease(KeyEvent.VK_DOWN);
    	    	r1.keyPress(KeyEvent.VK_DOWN);
    	    	r1.keyRelease(KeyEvent.VK_DOWN);
    	    	
    	        r.keyPress(KeyEvent.VK_ENTER);
    	        r.keyRelease(KeyEvent.VK_ENTER);
    	        r.keyPress(KeyEvent.VK_ENTER);
    	        r.keyRelease(KeyEvent.VK_ENTER);
    	        
    	        //frames
    	        
    	        WebElement single = driver.findElement(By.xpath("//iframe[@id='singleframe']"));
    			driver.switchTo().frame(single);
    			
    			WebElement value = driver.findElement(By.xpath("//input[@type='text']"));
    			value.sendKeys("Single Frame");  			
     	        
//    			driver.switchTo().defaultContent();
//    			   
//    			   driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']")).click();
//    			   
//    			   driver.switchTo().frame(1);
//    			   driver.switchTo().frame(0);
//    			   
//    			   driver.findElement(By.xpath("// input[@type='text']")).sendKeys("Multiple frame");
//    			   driver.switchTo().parentFrame();
//    			   driver.switchTo().defaultContent();
    			   
    			
    			//WebDriver Methods
    	        driver.navigate().to("https://www.amazon.in/");
    			
    			String title = driver.getTitle();
    			System.out.println(title);
    			
    			String currentUrl = driver.getCurrentUrl();
    			System.out.println(currentUrl);
    			
    			//JavaScript Executor
    	        JavascriptExecutor js=(JavascriptExecutor)driver;
    			
    			Thread.sleep(3000);
    			
    			WebElement help = driver.findElement(By.xpath("//a[text()='Help']"));
    			
    			Thread.sleep(3000);
    			
    			js.executeScript("arguments[0].scrollIntoView();",help);
    			
    			Thread.sleep(3000);
    			
    			js.executeScript("window.scrollBy(0,-3000);");
    			
    	        Thread.sleep(3000);
    			
    			js.executeScript("window.scrollBy(0,1000);");
    			
    	        js.executeScript("history.go(0)");
    			
    			js.executeScript("alert('Hello Amazon');");
    					
    			Thread.sleep(5000);
    			
    			driver.navigate().to("https://www.w3schools.com/html/html_tables.asp");
    			 Thread.sleep(3000);
    			 List<WebElement> web = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[5]/td"));
    				for (WebElement webElement : web) {
						
					
    					System.out.print(webElement.getText());
    					
    					List<WebElement> i = driver.findElements(By.tagName("th"));
    					for (WebElement webElement1 : i) {
	                       System.out.println(webElement.getText());
    						
    					
    				}
    			 }
    			

    	       
    	       
    		
    		

    	
	
}
}

	 


	 




    	
         
         
		   

		   
		   
		   
		   
		   
		   
    		
         
         
     
         
         	
         

