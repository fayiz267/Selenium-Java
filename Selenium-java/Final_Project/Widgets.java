package Final_Project;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Widgets {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		  driver.get("https://demoqa.com/widgets");
		  driver.manage().window().maximize();
		  Thread.sleep(2000);
		  
		  
		 driver.findElement(By.xpath("//*[@id=\"item-0\"]/svg/path")).click();
		 Thread.sleep(2000);
		 
		 
		
		

		
		  
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		driver.close();
	}

}
