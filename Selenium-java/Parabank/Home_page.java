package Parabank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Home_page {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\OneDrive\\Desktop\\Automation\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"headerPanel\"]/ul[2]/li[1]/a")).click();
		Thread.sleep(2000);
		
		
		//ATM services
		driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/ul[1]/li[2]/a")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/ul[1]/li[3]/a")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/ul[1]/li[4]/a")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/ul[1]/li[5]/a")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		
		//online services
		
		driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/ul[2]/li[2]/a")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/ul[2]/li[3]/a")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/ul[2]/li[4]/a")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		
		//Latest news
		
		driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/ul[3]/li[2]/a")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/ul[3]/li[3]/a")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/ul[3]/li[4]/a")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/ul[3]/li[4]/a")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		
		//
		
		driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/p[1]/a")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/p[2]/a")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"footerPanel\"]/ul[1]/li[1]/a")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"footerPanel\"]/ul[1]/li[6]/a")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"footerPanel\"]/ul[1]/li[7]/a")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"footerPanel\"]/ul[1]/li[8]/a")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		
		// Solutions 
		
		driver.findElement(By.xpath("//*[@id=\"headerPanel\"]/ul[1]/li[2]/a")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"headerPanel\"]/ul[1]/li[3]/a")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"headerPanel\"]/ul[1]/li[4]/a")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"headerPanel\"]/ul[1]/li[5]/a")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"headerPanel\"]/ul[1]/li[6]/a")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		
		//  link below home page login
		
		driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/p[1]/a")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/p[2]/a")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		

		//   Home page Customer care 
		
		
		driver.findElement(By.xpath("//*[@id=\"headerPanel\"]/ul[2]/li[3]/a")).click();
		Thread.sleep(2000);
		
				
		driver.findElement(By.name("name")).sendKeys("Fayiz pv");
		Thread.sleep(2000);
	
		driver.findElement(By.name("email")).sendKeys("fayzpv098@gmail.com");
		Thread.sleep(2000);
		
		driver.findElement(By.name("phone")).sendKeys("9874563210");
		Thread.sleep(2000);
		
		driver.findElement(By.name("message")).sendKeys("A message is a communication or statement conveyed from one person or group to another");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"contactForm\"]/table/tbody/tr[5]/td[2]/input")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		
		
		
		
		
		
		
		
		driver.quit();
		
	}

}
