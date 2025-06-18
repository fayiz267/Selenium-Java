package Maven_Entry_Assignment;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

public class Submit_Details {
	
	WebDriver driver=new ChromeDriver();
	
  @Test
  public void a() throws InterruptedException {
	 
	
	  driver.findElement(By.name("user_login")).sendKeys("fayizpv098");
		Thread.sleep(2000);
		
		
		  driver.findElement(By.name("user_email")).sendKeys("fayizpv98@gmail.com");
			Thread.sleep(2000);
			
			
			  driver.findElement(By.name("user_pass")).sendKeys("Fayizpv098@");
				Thread.sleep(2000);
				
				
				  driver.findElement(By.name("user_confirm_password")).sendKeys("Fayizpv098@");
					Thread.sleep(2000);
	 
		
  }
  
  
  
  @Test
  public void f() throws InterruptedException {
  
	  
	  driver.findElement(By.name("user_login")).sendKeys("fadil123");
		Thread.sleep(2000);
		
		
		  driver.findElement(By.name("user_email")).sendKeys("fadil0987@gmail.com");
			Thread.sleep(2000);
			
			
			  driver.findElement(By.name("user_pass")).sendKeys("Fadil098@");
				Thread.sleep(2000);
				
				
				  driver.findElement(By.name("user_confirm_password")).sendKeys("Fadil098@");
					Thread.sleep(2000);
	 
	  
	  
	  
	  
  }
  
  
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	 

  }
  
  @BeforeMethod
  public void  beforeMethod() throws InterruptedException {
	  driver.get("https://demo.wpeverest.com/user-registration/rounded-edge/");
	  driver.manage().window().maximize();
	  Thread.sleep(2000);
  
	  
  }
  
  
  @AfterMethod
  public void afterMethod() throws InterruptedException {
	 
	  driver.findElement(By.xpath("//*[@id=\"user-registration-form-46\"]/form/div[2]/button")).click();
		Thread.sleep(2000);
		
	  
	  
  }
  
  
  
  
  
  

  @AfterTest
  public void afterTest() throws InterruptedException {
	 
	   driver.quit();
		  
		  
  }
 
}
