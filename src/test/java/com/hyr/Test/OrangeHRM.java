package com.hyr.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRM {
ChromeDriver driver;

@Test
public void LaunchApp() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
  @Test
    public void EnterLoginDetails() {
	  WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
    	driver.findElement(By.name("username")).sendKeys("Admin");
    	driver.findElement(By.name("password")).sendKeys("admin");
    	driver.findElement(By.cssSelector("[type=\"submit\"]")).click();
    	
    	
    	
    }





}
