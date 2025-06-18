package Final_Project;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Bookstore_Application {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/books");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		
		driver.findElement(By.id("searchBox")).sendKeys("under");
		Thread.sleep(2000);
		
		driver.findElement(By.id("login")).click();
		Thread.sleep(2000);
	
		
		//driver.findElement(By.id("newUser")).click();
		//Thread.sleep(2000);
		//driver.navigate().back();
		//Thread.sleep(2000);
	
		driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys("Fayiz19");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Zxcvbnm@123");
		Thread.sleep(2000);
		
		driver.findElement(By.id("login")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"see-book-Git Pocket Guide\"]/a")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		
		driver.findElement(By.xpath("//*[@id=\"see-book-Learning JavaScript Design Patterns\"]/a")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		
		driver.findElement(By.xpath("//*[@id=\"see-book-Designing Evolvable Web APIs with ASP.NET\"]/a")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		
		//driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div[2]/div[2]/div[1]/div[2]/div[4]/div/div[2]/div")).click();
		//Thread.sleep(2000);
		//driver.navigate().back();
		
		//driver.findElement(By.xpath("//*[@id=\"see-book-You Don't Know JS\"]/a")).click();
		//Thread.sleep(2000);
		//driver.navigate().back();
		
		//driver.findElement(By.xpath("//*[@id=\"see-book-Programming JavaScript Applications\"]/a")).click();
		//Thread.sleep(2000);
		//driver.navigate().back();
		
		//driver.findElement(By.xpath("//*[@id=\"see-book-Eloquent JavaScript, Second Edition\"]/a")).click();
		//Thread.sleep(2000);
		//driver.navigate().back();
		
		//driver.findElement(By.xpath("//*[@id=\"see-book-Understanding ECMAScript 6\"]/a")).click();
		//Thread.sleep(2000);
		//driver.navigate().back();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		driver.close();
	}

}
