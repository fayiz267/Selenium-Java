package Parabank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Forgot_Login_Info {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("driver.chrome.driver", "C:\\Users\\hp\\OneDrive\\Desktop\\Automation\\chromedriver-win64\\chromedriver.exe");
		WebDriver  driver=new ChromeDriver();
		
		driver.get("https://parabank.parasoft.com/parabank/lookup.htm");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		
		driver.findElement(By.name("firstName")).sendKeys("Mohammed");
		Thread.sleep(2000);
		
		driver.findElement(By.name("lastName")).sendKeys("Fayiz pv");
		Thread.sleep(2000);
		
		driver.findElement(By.name("address.street")).sendKeys("Parattu Veettil");
		Thread.sleep(2000);
		
		driver.findElement(By.name("address.city")).sendKeys("Thrissur");
		Thread.sleep(2000);
		
		driver.findElement(By.name("address.state")).sendKeys("Kerala");
		Thread.sleep(2000);
		
		driver.findElement(By.name("address.zipCode")).sendKeys("680011");
		Thread.sleep(2000);
		
		driver.findElement(By.name("ssn")).sendKeys("852963");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"lookupForm\"]/table/tbody/tr[8]/td[2]/input")).click();
		Thread.sleep(2000);
		
		
		
		
		
		
		
		
		
		
		
		
		
		driver.quit();
	}

}
