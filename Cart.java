package Hexashop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("https://hexaclothes.netlify.app/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[3]/div[2]/div[1]/div/div[2]/button")).click();
		Thread.sleep(2000);
				
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[3]/div[2]/div[2]/div/div[2]/button")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[3]/div[2]/div[3]/div/div[2]/button")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[3]/div[2]/div[4]/div/div[2]/button")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[3]/div[2]/div[5]/div/div[2]/button")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/nav/div[2]/a[2]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[2]/button")).click();
		Thread.sleep(2000);
				
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/div[3]/form/input[1]")).sendKeys("Mohammed");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/div[3]/form/input[2]")).sendKeys("Fayiz PV");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/div[3]/form/input[3]")).sendKeys("Fayiz123@gmail.com");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/div[3]/form/input[4]")).sendKeys("Parattu Veettil");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/div[3]/form/input[5]")).sendKeys("Thrissur");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/div[3]/form/input[6]")).sendKeys("680011");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/div[3]/form/select/option[4]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/div[4]/form/input[1]")).sendKeys("369874125");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/div[4]/form/input[2]")).sendKeys("Fayiz PV");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/div[4]/form/input[3]")).sendKeys("12/28");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/div[4]/form/input[4]")).sendKeys("900");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/div[5]/button")).click();
		Thread.sleep(2000);
		
		
		
		
		
		driver.close();
		
	}

}
