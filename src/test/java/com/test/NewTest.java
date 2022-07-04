package com.test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
  
	
	@Test
    public void f() {
	  
		System.out.println("Hello World...");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rohini.srivastava\\Desktop\\chromedriver.exe");
	  WebDriver driver;
	 driver = new ChromeDriver();
	 driver.get("https://www.google.com/");
	
  }
}
