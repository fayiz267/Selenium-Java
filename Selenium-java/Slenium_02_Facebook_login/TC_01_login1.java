package Slenium_02_Facebook_login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_01_login1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\OneDrive\\Desktop\\Automation\\chromedriver-win64\\chromedriver.exe" );
		 WebDriver driver=new ChromeDriver();
		 
		 
		 driver.get("https://www.facebook.com/");
		 driver.manage().window().maximize();
		 Thread.sleep(5000);
		 
		 
		 
		 
		 WebElement  Username=driver.findElement(By.name("email"));
		 Username.sendKeys("Fadil");
		 Thread.sleep(6000);
		 
		 
		 WebElement Password=driver.findElement(By.name("pass"));
		 Password.sendKeys("Fadil123");
		 Thread.sleep(6000);
		 
		WebElement Login=driver.findElement(By.name("login"));
		Login.click();
		Thread.sleep(6000);
		
		
		
		
		
		
		
		
		driver.close();
		 
	}

}
