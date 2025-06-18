package Maven_Entry_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\OneDrive\\Desktop\\Automation\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://demo.wpeverest.com/user-registration/rounded-edge/");
		driver.manage().window().maximize();		
		Thread.sleep(2000);
		
		driver.findElement(By.name("user_login")).sendKeys("fayizpv123");
		Thread.sleep(2000);
		
		driver.findElement(By.name("user_email")).sendKeys("fayizpv678@gmail.com");
		Thread.sleep(2000);
		
		driver.findElement(By.name("user_pass")).sendKeys("fayizpv@123");
		Thread.sleep(2000);
		
		driver.findElement(By.name("user_confirm_password")).sendKeys("fayizpv@123");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"user-registration-form-46\"]/form/div[2]/button")).click();
		Thread.sleep(2000);
		
		
		
		
		
		
		
		
		
		
		
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
