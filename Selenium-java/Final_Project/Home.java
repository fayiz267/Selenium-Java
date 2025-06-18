package Final_Project;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Home {

	public static void main(String[] args) throws InterruptedException {

  WebDriver driver=new ChromeDriver();
  driver.get("https://demoqa.com/");
  driver.manage().window().maximize();
  Thread.sleep(2000);
   
  driver.findElement(By.xpath("//*[@id=\"app\"]/header/a")).click();
  Thread.sleep(2000);
         
  driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div")).click();
  Thread.sleep(2000);
  driver.navigate().back();
  Thread.sleep(2000);
  
  driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div")).click();
  Thread.sleep(2000);
  driver.navigate().back();
  Thread.sleep(2000);
 
  driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[3]/div")).click();
  Thread.sleep(2000);
  driver.navigate().back();
  Thread.sleep(2000);
  
  driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[4]/div")).click();
  Thread.sleep(2000);
  driver.navigate().back();
  Thread.sleep(2000);
		
  driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[5]/div")).click();
  Thread.sleep(2000);
  driver.navigate().back();
  Thread.sleep(2000);
		
  driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[6]/div")).click();
  Thread.sleep(2000);
  driver.navigate().back();		
  Thread.sleep(2000);
		
		
		
		
		


		
	driver.close();	
	}

}
