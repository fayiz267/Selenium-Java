package Slenium_02_Facebook_login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Invalid_Credential {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\OneDrive\\Desktop\\Automation\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		
	driver.get("https://demo.guru99.com/test/newtours/");
	driver.manage().window().maximize();
	Thread.sleep(5000);
	
	
	WebElement  Username=driver.findElement(By.name("userName"));
	Username.sendKeys("Fadil");
	Thread.sleep(5000);

	
	
	WebElement Password=driver.findElement(By.name("password"));
	Password.sendKeys("Fadil321@");
	Thread.sleep(5000);
	
	
	
	WebElement Login=driver.findElement(By.name("submit"));
	Login.click();
	Thread.sleep(5000);
	
	
	driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
