package org.task;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Mini_project {
	 public static void main(String[] args) throws InterruptedException, IOException {
		 System.setProperty("webdriver.chrome.driver",
				 "C:\\Users\\harin\\eclipse-workspace\\seleniumjava\\driver\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://adactinhotelapp.com/");
		 driver.manage().window().maximize();
		 WebElement user = driver.findElement(By.xpath("//input[@type='text']"));
		 user.sendKeys("Harinirenga79");
		 Thread.sleep(9000);
		 WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
		 pass.sendKeys("Harini@12");
		 WebElement log = driver.findElement(By.xpath("//input[@type='Submit']"));
		 log.click();
		 Thread.sleep(3000);
		 WebElement loc = driver.findElement(By.name("location"));
		 Select S = new Select(loc);
		 S.selectByVisibleText("London");
		 WebElement hotels = driver.findElement(By.id("hotels"));
		 Select H = new Select(hotels);
		 H.selectByVisibleText("Hotel Hervey");
		 WebElement room = driver.findElement(By.id("room_type"));
		 Select R = new Select(room);
		 R.selectByValue("Deluxe");
		 WebElement num = driver.findElement(By.id("room_nos"));
		 Select N = new Select(num);
		 N.selectByValue("4");
		 WebElement pickin = driver.findElement(By.name("datepick_in"));
		 pickin.sendKeys("25/8/2022");
		 WebElement pickout = driver.findElement(By.name("datepick_out"));
		 pickout.sendKeys("26/8/2022");
		 WebElement ad = driver.findElement(By.id("adult_room"));
		 Select A = new Select(ad);
		 A.selectByValue("1");
		 WebElement child = driver.findElement(By.id("child_room"));
		 Select c = new Select(child);
		 A.selectByValue("1");
		 WebElement sub = driver.findElement(By.name("Submit"));
		 sub.click();
		 WebElement radio = driver.findElement(By.name("radiobutton_0"));
		 radio.click();
		 WebElement con = driver.findElement(By.name("continue"));
		 con.click();
		 Thread.sleep(3000);
		 
		 driver.findElement(By.name("first_name")).sendKeys("Thivya");
		 driver.findElement(By.name("last_name")).sendKeys("Shankar");
		 WebElement address = driver.findElement(By.xpath("//textarea[@name='address']"));
		 address.sendKeys("NO.15,Anna nagar, Madurai,Tamilnadu");
		 WebElement credit = driver.findElement(By.name("cc_num"));
		 credit.sendKeys("1234567890456201");
		 WebElement cardtype = driver.findElement(By.id("cc_type"));
		 Select ct = new Select(cardtype);
		 ct.selectByVisibleText("VISA");
		 WebElement exp = driver.findElement(By.id("cc_exp_month"));
		 Select E = new Select(exp);
		 E.selectByVisibleText("December");
		 WebElement year = driver.findElement(By.id("cc_exp_year"));
		 Select y = new Select(year);
		 y.selectByVisibleText("2022");
		 WebElement cv = driver.findElement(By.name("cc_cvv"));
		 cv.sendKeys("0457");
		 Thread.sleep(3000);
		 WebElement book = driver.findElement(By.name("book_now"));
		 book.click();
		 Thread.sleep(5000);
		 
		 TakesScreenshot ht = (TakesScreenshot)driver;
		 File Wd = ht.getScreenshotAs(OutputType.FILE);
		 File f = new File("C:\\Users\\harin\\eclipse-workspace\\seleniumjava\\Screenshot\\Hotel.png");
		 FileUtils.copyFile(Wd, f);
		 
		 WebElement logout = driver.findElement(By.xpath("//input[@name='logout']"));
		 logout.click();
		 
		 
		 
		 
		 
		 
		 
		 


}
}
