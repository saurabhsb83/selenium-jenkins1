package com.springdemo.Selenium1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Selenium1Application {

	public static void main(String[] args) {
		SpringApplication.run(Selenium1Application.class, args);
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.get("https://www.apache.org/");
		
		String title1 = "title: " +driver.getTitle() + "  "  +driver.toString();
		
		System.out.println("Navigated to Apache !!");
		
		
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath("//a[contains(text(),'About')]")).click();
		
		String title2 = "title: " +driver.getTitle() + "  "  +driver.toString();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath("//a[contains(text(),'Process')]")).click();
		
		String title3 = "title: " +driver.getTitle() + "  "  +driver.toString();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.close();
		System.out.println("printing: " +title1 + "  "  +title2 + " " +title3);
		System.out.println("Closing browser and destroying driver object !");
		
	}

}
