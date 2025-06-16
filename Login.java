package Hexashop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login {
	
	WebDriver driver=new ChromeDriver();
  @Test
  public void a() throws InterruptedException {
	  
	  //Register Button//
	  driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/p/a")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
	  
	  driver.findElement(By.id("email")).sendKeys("mohdfayiz23@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("Fayiz@0987");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/form/button")).click();
		Thread.sleep(2000);	      
  }
  @Test
  public void b() throws InterruptedException {
	  
	   
	    driver.findElement(By.id("email")).sendKeys("invalid@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("invalid");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/form/button")).click();
		Thread.sleep(2000);
		
  }
  
  
  
  
  
  @BeforeMethod
  public void beforeMethod() throws InterruptedException {
	  driver.get("https://hexaclothes.netlify.app/");
	  driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Login")).click();
		Thread.sleep(2000);
	  
  }

  @AfterMethod
  public void afterMethod() throws InterruptedException {
	  
  }
  

  @BeforeTest
  public void beforeTest() throws InterruptedException {

  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
