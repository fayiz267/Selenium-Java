package Parabank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_page {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\OneDrive\\Desktop\\Automation\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		
		// Valid Credentials 
		driver.findElement(By.name("username")).sendKeys("fayizpv963");
		Thread.sleep(2000);
		
		driver.findElement(By.name("password")).sendKeys("c");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[3]/input")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		
	
		
		// Invalid Credentials 
		
		driver.findElement(By.name("username")).sendKeys("fayizpv963");
		Thread.sleep(2000);
		
		driver.findElement(By.name("password")).sendKeys("Invalid");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[3]/input")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		
		
		driver.findElement(By.name("username")).sendKeys("Invalid");
		Thread.sleep(2000);
		
		driver.findElement(By.name("password")).sendKeys("Fayiz963@");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[3]/input")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		
		
		driver.findElement(By.name("username")).sendKeys("Invalid");
		Thread.sleep(2000);
		
		driver.findElement(By.name("password")).sendKeys("Invalid");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[3]/input")).click();
		Thread.sleep(2000);
		
		
		
		
		
		
		
		driver.quit();		
	}

}
