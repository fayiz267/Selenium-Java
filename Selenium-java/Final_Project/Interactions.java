package Final_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Interactions {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		  driver.get("https://demoqa.com/interaction");
		  driver.manage().window().maximize();
		  Thread.sleep(2000);

		  driver.findElement(By.className("btn btn-light active")).click();
		  Thread.sleep(2000);
		
		
		
		  driver.findElement(By.xpath("//*[@id=\"item-1\"]")).click();
		  Thread.sleep(2000);
	
		
		
		
		
		
		
		
		
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		driver.close();
	}

}
