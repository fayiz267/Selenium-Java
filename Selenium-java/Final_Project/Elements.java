package Final_Project;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Elements {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		  driver.get("https://demoqa.com/elements");
		  driver.manage().window().maximize();
		  Thread.sleep(2000);
		  
		  
		  driver.findElement(By.xpath("//*[@id=\"item-0\"]/span")).click();
		  Thread.sleep(2000);
		  
		  driver.findElement(By.id("userName")).sendKeys("mohammed fayiz");
		  Thread.sleep(2000);
		  
		  driver.findElement(By.id("userEmail")).sendKeys("mohammedfayiz@gmail.com");
		  Thread.sleep(2000);
		  
		  driver.findElement(By.id("currentAddress")).sendKeys("thrissur");
		  Thread.sleep(2000);
		  
		  driver.findElement(By.id("permanentAddress")).sendKeys("chavakkad");
		  Thread.sleep(2000);
		  
		  driver.findElement(By.id("submit")).click();
		  Thread.sleep(2000);
		  
		  driver.findElement(By.xpath("//*[@id=\"item-1\"]")).click();
		  Thread.sleep(2000);
		  
		  driver.findElement(By.xpath("//*[@id=\"tree-node\"]/div/button[1]")).click();
		  Thread.sleep(2000);
		  
		  driver.findElement(By.className("rct-checkbox")).click();
		  Thread.sleep(2000);
		  
          driver.findElement(By.xpath("//*[@id=\"tree-node\"]/div/button[2]")).click();
		  Thread.sleep(2000);
		  
		  driver.findElement(By.xpath("//*[@id=\"item-3\"]")).click();
		  Thread.sleep(2000);
		  
		  driver.findElement(By.id("addNewRecordButton")).click();
		  Thread.sleep(2000);

		  driver.findElement(By.id("firstName")).sendKeys("Noel");
		  Thread.sleep(2000);
		  
		  driver.findElement(By.id("lastName")).sendKeys("babu");
		  Thread.sleep(2000);
		  
		  driver.findElement(By.id("userEmail")).sendKeys("noelbabu12@gmail.com");
		  Thread.sleep(2000);
		  
		  driver.findElement(By.id("age")).sendKeys("20");
		  Thread.sleep(2000);
		  
		  driver.findElement(By.id("salary")).sendKeys("100000");
		  Thread.sleep(2000);
		  
		  driver.findElement(By.id("department")).sendKeys("IT");
		  Thread.sleep(2000);
		  
		  driver.findElement(By.id("submit")).click();
		  Thread.sleep(2000);
		 	
		  driver.findElement(By.xpath("//*[@id=\"searchBox\"]")).sendKeys("noel");
		  Thread.sleep(2000);
		  
		  driver.findElement(By.xpath("//*[@id=\"item-4\"]")).click();
		  Thread.sleep(2000);
		  
		  driver.findElement(By.id("doubleClickBtn")).click();
		  Thread.sleep(2000);
		  
		  driver.findElement(By.id("rightClickBtn")).click();
		  Thread.sleep(2000);
		
		  driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div[2]/div[3]")).click();
		  Thread.sleep(2000);
		  
		  driver.findElement(By.xpath("//*[@id=\"item-5\"]")).click();
		  Thread.sleep(2000);
		
		  driver.findElement(By.xpath("//*[@id=\"simpleLink\"]")).click();
		  Thread.sleep(2000);
	
		  driver.findElement(By.xpath("//*[@id=\"dynamicLink\"]")).click();
		  Thread.sleep(2000);
		  
		  driver.findElement(By.id("created")).click();
		  Thread.sleep(2000);
		  
		  driver.findElement(By.xpath("//*[@id=\"no-content\"]")).click();
		  Thread.sleep(2000);
		  
		  driver.findElement(By.xpath("//*[@id=\"moved\"]")).click();
		  Thread.sleep(2000);
		  
		  driver.findElement(By.xpath("//*[@id=\"bad-request\"]")).click();
		  Thread.sleep(2000);
		  
		  driver.findElement(By.xpath("//*[@id=\"unauthorized\"]")).click();
		  Thread.sleep(2000);
		  
		  driver.findElement(By.xpath("//*[@id=\"forbidden\"]")).click();
		  Thread.sleep(2000);
		  
		  driver.findElement(By.xpath("//*[@id=\"invalid-url\"]")).click();
		  Thread.sleep(2000);
		
		  driver.findElement(By.xpath("//*[@id=\"item-6\"]")).click();
		  Thread.sleep(2000);
		  
		  driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div[2]/a[1]")).click();
		  Thread.sleep(2000);
		  driver.navigate().back();
		  Thread.sleep(2000);
		  
		  driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div[2]/a[2]")).click();
		  Thread.sleep(2000);
		  driver.navigate().back();
		  Thread.sleep(2000);

		  driver.findElement(By.xpath("//*[@id=\"item-7\"]")).click();
		  Thread.sleep(2000);
		  
		  driver.findElement(By.xpath("//*[@id=\"downloadButton\"]")).click();
		  Thread.sleep(2000);
		  
		  //driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div[2]/div[2]/form/div/label")).click();
		  //Thread.sleep(2000);
		
		  driver.findElement(By.xpath("//*[@id=\"item-8\"]")).click();
		  Thread.sleep(2000);
		  
		  driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/button[2]")).click();
		  Thread.sleep(2000);
		  
		  driver.findElement(By.xpath("//*[@id=\"enableAfter\"]")).click();
		  Thread.sleep(2000);
		  
		  driver.findElement(By.xpath("//*[@id=\"visibleAfter\"]")).click();
		  Thread.sleep(2000);
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		driver.close();  
		  
	}

}
