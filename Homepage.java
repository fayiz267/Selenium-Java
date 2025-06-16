package Hexashop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homepage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("https://hexaclothes.netlify.app/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/nav/div[1]/a[2]")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[1]/ul/li[1]/a")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[1]/ul/li[2]/a")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
				
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[1]/ul/li[3]/a")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[1]/ul/li[4]/a")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[1]/ul/li[5]/a")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[1]/ul/li[6]/a")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/nav/div[2]/a[1]")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/nav/div[2]/a[2]")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Login")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Explore Now")).click();
		Thread.sleep(2000);
		driver.navigate().back();
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
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[4]/div[2]/div[1]/div[2]/button")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[4]/div[2]/div[2]/div[2]/button")).click();
		Thread.sleep(2000);
				
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[4]/div[2]/div[3]/div[2]/button")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[6]/div/div/input")).sendKeys("fayiz098@gmail.com");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[6]/div/div/button")).click();
		Thread.sleep(2000);
	
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/footer/div/div[3]/form/input")).sendKeys("fayiz098@gmail.com");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/footer/div/div[3]/form/button")).click();
		Thread.sleep(2000);
		
		
		
		// Customer Service is not directing just Refreshing the site //
		
		// driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/footer/div/div[2]/ul/li[1]/a")).click();
		// Thread.sleep(2000);
		
		// driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/footer/div/div[2]/ul/li[2]/a")).click();
		// Thread.sleep(2000);
		
		// driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/footer/div/div[2]/ul/li[3]/a")).click();
		// Thread.sleep(2000);
		
		// driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/footer/div/div[2]/ul/li[4]/a")).click();
		// Thread.sleep(2000);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		driver.close();
	}

}
