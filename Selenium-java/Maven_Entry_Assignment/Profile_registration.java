package Maven_Entry_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Profile_registration {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\OneDrive\\Desktop\\Automation\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://demo.wpeverest.com/user-registration/profile-registration-form/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
				
		driver.findElement(By.name("first_name")).sendKeys("Mohammed");
		Thread.sleep(2000);
		
		driver.findElement(By.name("last_name")).sendKeys("Fayiz PV");
		Thread.sleep(2000);
		
		driver.findElement(By.name("display_name")).sendKeys("fayizpv");
		Thread.sleep(2000);
		
		driver.findElement(By.name("user_email")).sendKeys("fayizpv123@gmail.com");
		Thread.sleep(2000);
		
		driver.findElement(By.name("user_login")).sendKeys("fayizpv123");
		Thread.sleep(2000);
		
		driver.findElement(By.name("user_pass")).sendKeys("fayiz@098");
		Thread.sleep(2000);
					
		driver.findElement(By.xpath("//*[@id=\"user-registration-form-329\"]/form/div[3]/button")).click();
		Thread.sleep(2000);
	
		driver.quit();
		
	}

}
