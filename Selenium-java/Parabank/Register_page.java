package Parabank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register_page {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\OneDrive\\Desktop\\Automation\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://parabank.parasoft.com/parabank/register.htm");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.name("customer.firstName")).sendKeys("Mohammed");
		Thread.sleep(2000);
		
		driver.findElement(By.name("customer.lastName")).sendKeys("Fayiz pv");
		Thread.sleep(2000);
		
		driver.findElement(By.name("customer.address.street")).sendKeys("Parattu Veettil");
		Thread.sleep(2000);
		
		driver.findElement(By.name("customer.address.city")).sendKeys("Thrissur");
		Thread.sleep(2000);
		
		driver.findElement(By.name("customer.address.state")).sendKeys("Kerala");
		Thread.sleep(2000);
		
		driver.findElement(By.name("customer.address.zipCode")).sendKeys("680011");
		Thread.sleep(2000);
		
		driver.findElement(By.name("customer.phoneNumber")).sendKeys("9876543210");
		Thread.sleep(2000);
		
		driver.findElement(By.name("customer.ssn")).sendKeys("852963");
		Thread.sleep(2000);
		
		driver.findElement(By.name("customer.username")).sendKeys("fayizpv963");
		Thread.sleep(2000);
		
		driver.findElement(By.name("customer.password")).sendKeys("Fayiz963@");
		Thread.sleep(2000);
		
		driver.findElement(By.name("repeatedPassword")).sendKeys("Fayiz963@");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"customerForm\"]/table/tbody/tr[13]/td[2]/input")).click();
		Thread.sleep(2000);
					
						
								
	
		driver.quit();
		
	}

}
