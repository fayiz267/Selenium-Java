package Final_Project;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		  driver.get("https://demoqa.com/alertsWindows");
		  driver.manage().window().maximize();
		  Thread.sleep(2000);
		
								

	
		  driver.findElement(By.xpath("//*[@id=\"item-4\"]")).click();
		  Thread.sleep(2000);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		driver.close();
		
	}

}
