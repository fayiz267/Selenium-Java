package Hexashop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("https://hexaclothes.netlify.app/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Login")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Register here")).click();
		Thread.sleep(2000);
		//Login Button//
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/p/a")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.findElement(By.id("email")).sendKeys("mohdfayiz23@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("name")).sendKeys("Mohammed Fayiz PV");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("Fayiz@0987");
		Thread.sleep(2000);
		driver.findElement(By.id("confirmPassword")).sendKeys("Fayiz@0987");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/form/button")).click();
		Thread.sleep(2000);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		driver.close();
		
		
		
	}

}
