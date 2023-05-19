package com.hyr.Test;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTest {
    @Test
	public void Navigatetomyinfo() throws InterruptedException {
    	WebDriverManager.chromedriver().setup();
    	ChromeDriver driver =new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.get("https://www.clarksstores.bh/");
    	driver.findElement(By.className("header-sticky-wrapper")).click();
    	Thread.sleep(5000);
    	driver.quit();
    }	
    	
    	
        @Test
    	public void navigatetomail () throws InterruptedException {
        	WebDriverManager.chromedriver().setup();
        	ChromeDriver driver =new ChromeDriver();
        	driver.manage().window().maximize();
        	driver.get("https://www.clarksstores.bh/");
        	driver.findElement(By.name("contact[email]")).sendKeys("vvikram828@gmail.com",Keys.ENTER);
        	System.out.println(driver.getTitle());
        	Thread.sleep(5000);
        	driver.quit();
        }
        @Test
    	public void storelocator () throws InterruptedException {
        	WebDriverManager.chromedriver().setup();
        	ChromeDriver driver =new ChromeDriver();
        	driver.manage().window().maximize();
        	driver.get("https://www.clarksstores.bh/");
        	driver.findElement(By.className("new-header__top-links-list-item")).click();
        	driver.quit();
        }
        @Test
        public void trackorder () throws InterruptedException {
        	WebDriverManager.chromedriver().setup();
        	ChromeDriver driver =new ChromeDriver();
        	driver.manage().window().maximize();
        	driver.get("https://www.clarksstores.bh/");
        	driver.findElement(By.className("new-header__top-links-list-item")).click();
        	driver.quit();
    	 
        }
        @Test
        public void shopnow () throws InterruptedException {
        	WebDriverManager.chromedriver().setup();
        	ChromeDriver driver =new ChromeDriver();
        	driver.manage().window().maximize();
        	driver.get("https://www.clarksstores.bh/");
        	driver.findElement(By.className("announcement-link-text")).click();
        	driver.quit();
        }
        
        @Test
        public void login () throws InterruptedException {
        	WebDriverManager.chromedriver().setup();
        	ChromeDriver driver =new ChromeDriver();
        	driver.manage().window().maximize();
        	driver.get("https://www.clarksstores.bh/account/login?return_url=%2Faccount");
        	driver.findElement(By.id("CustomerEmail")).sendKeys("vicky@gmail.com");
        	driver.findElement(By.id("CustomerPassword")).sendKeys("vicky12345",Keys.ENTER);
        	driver.quit();
	}
        @Test
        public void createaccount () throws InterruptedException {
        	WebDriverManager.chromedriver().setup();
        	ChromeDriver driver =new ChromeDriver();
        	driver.manage().window().maximize();
        	driver.get("https://www.clarksstores.bh/account/register");
        	driver.findElement(By.name("customer[first_name]")).sendKeys("vikram");
        	driver.findElement(By.name("customer[last_name]")).sendKeys("v");
        	driver.findElement(By.id("Email")).sendKeys("vvikram8282@gmail.com");
        	driver.findElement(By.id("CreatePassword")).sendKeys("Rockingalia@7");
        	driver.findElement(By.id("register-submit")).click();
        	Thread.sleep(5000);
        	driver.quit();
	}
        @Test
        public void launchapplication () throws InterruptedException {
        	WebDriverManager.chromedriver().setup();
        	ChromeDriver driver =new ChromeDriver();
        	driver.manage().window().maximize();
        	driver.get("https://www.clarksstores.bh/");
        	driver.quit();
}
        @Test
        public void verifyLogin () throws InterruptedException {
        	WebDriverManager.chromedriver().setup();
        	ChromeDriver driver =new ChromeDriver();
        	driver.manage().window().maximize();
        	driver.findElement(By.id("shopify-section-footer-promotions")).isDisplayed();
        }
        @Test
        public void verifyemail () throws InterruptedException {
        	WebDriverManager.chromedriver().setup();
        	ChromeDriver driver =new ChromeDriver();
        	driver.manage().window().maximize();
        	driver.get("https://www.clarksstores.bh/");
        	driver.findElement(By.id("shopify-section-footer-bottom")).isDisplayed();
}
        @Test
        public void verifyimage () throws InterruptedException {
        	WebDriverManager.chromedriver().setup();
        	ChromeDriver driver =new ChromeDriver();
        	driver.manage().window().maximize();
        	driver.get("https://www.clarksstores.bh/");
        	driver.findElement(By.id("shopify-section-template--18323041157417__8dc929b9-d918-405b-8add-39380082d1e5")).isDisplayed();
        	driver.quit();
}
        @Test
        public void verifycart () throws InterruptedException {
        	WebDriverManager.chromedriver().setup();
        	ChromeDriver driver =new ChromeDriver();
        	driver.manage().window().maximize();
        	driver.get("https://www.clarksstores.bh/");
        	driver.findElement(By.className("cart-link")).click();
        	driver.findElement(By.name("checkout")).isDisplayed();
        	driver.quit();        
}
        @Test
        public void verifycontact () throws InterruptedException {
        	WebDriverManager.chromedriver().setup();
        	ChromeDriver driver =new ChromeDriver();
        	driver.manage().window().maximize();
        	driver.get("https://www.clarksstores.bh/");   
        	driver.findElement(By.cssSelector("[type=\"hidden\"]  ")).click();
        	driver.quit();
}
     
        @Test
        public void search () throws InterruptedException {
        	WebDriverManager.chromedriver().setup();
        	ChromeDriver driver =new ChromeDriver();
        	driver.manage().window().maximize();
        	driver.get("https://www.clarksstores.bh/");   
        	driver.findElement(By.xpath("//button[@id='search-icon']")).click();
        	//driver.findElement(By.xpath("//*[@type='search']")).sendKeys("shoes",Keys.ENTER);
        	Thread.sleep(5000);
        	driver.quit();    	
        
}}
