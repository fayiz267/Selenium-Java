package Final_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Forms {

	public static void main(String[] args) throws InterruptedException {

		
		WebDriver driver=new ChromeDriver();
		  driver.get("https://demoqa.com/automation-practice-form");
		  driver.manage().window().maximize();
		  Thread.sleep(2000);
		
		
		  driver.findElement(By.id("firstName")).sendKeys("mohammed");
		  Thread.sleep(2000);
		  
		  driver.findElement(By.id("lastName")).sendKeys("fayiz");
		  Thread.sleep(2000);
		  
		  driver.findElement(By.id("userEmail")).sendKeys("mohammedfayiz123@gmail.com");
		  Thread.sleep(2000);
		  
		  driver.findElement(By.className("custom-control-label")).click();
		  Thread.sleep(2000);
		  
		  driver.findElement(By.xpath("//*[@id=\"userNumber\"]")).sendKeys("8529637410");
		  Thread.sleep(2000);
		  
		  driver.findElement(By.xpath("//*[@id=\"dateOfBirthInput\"]")).click();
		  Thread.sleep(2000);
		  
		  //driver.findElement(By.xpath("//*[@id=\"subjectsContainer\"]/div")).sendKeys("poiuyt");
		  //Thread.sleep(2000);
		 
		  //driver.findElement(By.xpath("//*[@id=\"hobbies-checkbox-2\"]")).click();
		  //Thread.sleep(2000);
		  driver.findElement(By.xpath("//*[@id=\"userForm\"]/div[8]/div[2]/div")).click();
		  Thread.sleep(2000);
		  
		  driver.findElement(By.id("currentAddress")).sendKeys("poiuytrewq");
		  Thread.sleep(2000);
		  
		  driver.findElement(By.xpath("//*[@id=\"stateCity-wrapper\"]/div[2]")).click();
		  Thread.sleep(2000);
		  
		  driver.findElement(By.xpath("//*[@id=\"stateCity-wrapper\"]/div[3]")).click();
		  Thread.sleep(2000);
		  
		  driver.findElement(By.id("submit")).click();
		  Thread.sleep(10000);
	
		 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	driver.close();
	}

}
