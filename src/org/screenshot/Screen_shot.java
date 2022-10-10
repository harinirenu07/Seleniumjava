package org.screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screen_shot {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\harin\\eclipse-workspace\\seleniumjava\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		   
		   driver.manage().window().maximize();
		   
		   TakesScreenshot screen =(TakesScreenshot)driver;//narrow typecasting = big to small
		    File s = screen.getScreenshotAs(OutputType.FILE);
		    File f = new File("C:\\Users\\harin\\eclipse-workspace\\seleniumjava\\Screenshot\\Face.png");
		    FileHandler.copy(s, f);
		    FileUtils.copyFile(s, f);
         
	}

}
