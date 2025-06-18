package Maven_Entry_Assignment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Profile_reg {
	
	WebDriver driver=new ChromeDriver();
  
	@Test
  public void f() throws InterruptedException {
	  
	  driver.findElement(By.name("first_name")).sendKeys("Mohammed");
		Thread.sleep(2000);
		
		driver.findElement(By.name("last_name")).sendKeys("Fayiz PV");
		Thread.sleep(2000);
		
		driver.findElement(By.name("display_name")).sendKeys("fayizpv");
		Thread.sleep(2000);
		
		driver.findElement(By.name("user_email")).sendKeys("fayizpv123@gmail.com");
		Thread.sleep(2000);
		
		driver.findElement(By.name("user_login")).sendKeys("fayizpv123");
		Thread.sleep(2000);
		
		driver.findElement(By.name("user_pass")).sendKeys("fayiz@098");
	  
	  
  }
	
	
	 @Test
	 public void e() throws InterruptedException {
		 
		  driver.findElement(By.name("first_name")).sendKeys("Sana");
			Thread.sleep(2000);
			
			driver.findElement(By.name("last_name")).sendKeys("Fathima");
			Thread.sleep(2000);
			
			driver.findElement(By.name("display_name")).sendKeys("Sana321");
			Thread.sleep(2000);
			
			driver.findElement(By.name("user_email")).sendKeys("Sana098@gmail.com");
			Thread.sleep(2000);
			
			driver.findElement(By.name("user_login")).sendKeys("Sana123");
			Thread.sleep(2000);
			
			driver.findElement(By.name("user_pass")).sendKeys("Sana@098");
	 }
	 

  @BeforeMethod
  public void beforeMethod() throws InterruptedException {
	
			 
		  driver.get("https://demo.wpeverest.com/user-registration/profile-registration-form/");
		  driver.manage().window().maximize();
		  Thread.sleep(2000);
	  
	  
  }

  @AfterMethod
  public void afterMethod() throws InterruptedException {
	  
	  driver.findElement(By.xpath("//*[@id=\"user-registration-form-329\"]/form/div[3]/button")).click();
		Thread.sleep(2000); 
	  
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
	  
	  driver.quit();
  }

}
