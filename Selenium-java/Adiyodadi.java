package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Adiyodadi {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("file:///G:/My%20Drive/www.Adiyodadi.com/index.html#");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		 
		 
		driver.findElement(By.xpath("//*[@id=\"closePopup\"]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[1]/a")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[2]/a")).click();
		Thread.sleep(1000);
		Actions actions = new Actions(driver);
		WebElement offers= driver.findElement(By.xpath("/html/body/section[1]/div[3]/div[4]/div/div[1]/a[2]"));
		actions.moveToElement(offers).perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/section[1]/div[3]/div[4]/div/div[1]/a[2]")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"locationLink\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/button")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"closeModals\"]")).click();
		Thread.sleep(1000);
		    
		driver.findElement(By.xpath("//*[@id=\"signInLink\"]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.id("exampleInputnumbers")).sendKeys("8592860971");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/input[2]")).sendKeys("Fayizpv");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/button")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"toSignUp\"]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/input[1]")).sendKeys("1478523698");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"signUpForm\"]/div/input[2]")).sendKeys("fayizpv267@gmail");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"signUpForm\"]/div/input[3]")).sendKeys("123654987");
		Thread.sleep(3000);
		
				
		driver.findElement(By.xpath("//*[@id=\"myModal\"]/div/span")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[5]/a")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"cart-items\"]/div[1]/button")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"cart-items\"]/div[2]/button")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"address\"]")).sendKeys("123654987");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"checkout-button\"]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("	//*[@id=\"continue-shopping\"]")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"carouselExampleRide\"]/button[2]/span[1]"));
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/form/input")).sendKeys("brandy");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/form/button")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"moblie\"]/img")).click();
		Thread.sleep(3000);
		
		
		actions.sendKeys(org.openqa.selenium.Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"download-app-section\"]/div/div[2]/div/a[1]/img")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"download-app-section\"]/div/div[2]/div/a[2]/img")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"closePopup\"]")).click();
	    Thread.sleep(1000);
		
        actions.sendKeys(org.openqa.selenium.Keys.PAGE_DOWN).build().perform();
        Thread.sleep(2000);
        actions.sendKeys(org.openqa.selenium.Keys.PAGE_DOWN).build().perform();
        Thread.sleep(2000);
		
        driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[1]/rect/p[2]/a")).click();
        Thread.sleep(3000);
        actions.sendKeys(org.openqa.selenium.Keys.PAGE_DOWN).build().perform();
        Thread.sleep(2000);
        actions.sendKeys(org.openqa.selenium.Keys.PAGE_DOWN).build().perform();
        Thread.sleep(2000);
       
              
        driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[2]/rect/p[2]/a")).click();
        Thread.sleep(3000);
        actions.sendKeys(org.openqa.selenium.Keys.PAGE_DOWN).build().perform();
        Thread.sleep(2000);
        actions.sendKeys(org.openqa.selenium.Keys.PAGE_DOWN).build().perform();
        Thread.sleep(2000);
       
        driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[3]/rect/p[2]/a")).click();
        Thread.sleep(3000);
        actions.sendKeys(org.openqa.selenium.Keys.PAGE_DOWN).build().perform();
        Thread.sleep(2000);
        actions.sendKeys(org.openqa.selenium.Keys.PAGE_DOWN).build().perform();
        Thread.sleep(2000);
        
        actions.sendKeys(org.openqa.selenium.Keys.PAGE_DOWN).build().perform();
        Thread.sleep(2000);
	       
	   driver.findElement(By.xpath("/html/body/div[3]/section[1]/div/div[2]/div[7]/div/div[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[3]/section[1]/div/div[2]/div[7]/div/div[1]/ul/li[1]/a/i")).click();
        Thread.sleep(1000);
        actions.sendKeys(org.openqa.selenium.Keys.PAGE_DOWN).build().perform();
        Thread.sleep(2000);
        actions.sendKeys(org.openqa.selenium.Keys.PAGE_DOWN).build().perform();
        Thread.sleep(2000);
        actions.sendKeys(org.openqa.selenium.Keys.PAGE_DOWN).build().perform();
        Thread.sleep(2000);
       
        driver.findElement(By.xpath("/html/body/div[3]/section[1]/div/div[2]/div[7]/div/div[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[3]/section[1]/div/div[2]/div[7]/div/div[1]/ul/li[2]/a")).click();
        Thread.sleep(3000);
        actions.sendKeys(org.openqa.selenium.Keys.PAGE_DOWN).build().perform();
        Thread.sleep(2000);
        actions.sendKeys(org.openqa.selenium.Keys.PAGE_DOWN).build().perform();
        Thread.sleep(2000);
        actions.sendKeys(org.openqa.selenium.Keys.PAGE_DOWN).build().perform();
        Thread.sleep(2000);
       
       
        driver.findElement(By.xpath("/html/body/div[3]/section[1]/div/div[2]/div[7]/div/div[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[3]/section[1]/div/div[2]/div[7]/div/div[1]/ul/li[3]/a")).click();
        Thread.sleep(3000);
        actions.sendKeys(org.openqa.selenium.Keys.PAGE_DOWN).build().perform();
        Thread.sleep(2000);
        actions.sendKeys(org.openqa.selenium.Keys.PAGE_DOWN).build().perform();
        Thread.sleep(2000);
        actions.sendKeys(org.openqa.selenium.Keys.PAGE_DOWN).build().perform();
        Thread.sleep(2000);
       
       
        driver.findElement(By.xpath("/html/body/div[3]/section[1]/div/div[2]/div[7]/div/div[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[3]/section[1]/div/div[2]/div[7]/div/div[1]/ul/li[4]/a")).click();
        Thread.sleep(3000);
        actions.sendKeys(org.openqa.selenium.Keys.PAGE_DOWN).build().perform();
        Thread.sleep(2000);
        actions.sendKeys(org.openqa.selenium.Keys.PAGE_DOWN).build().perform();
        Thread.sleep(2000);
        actions.sendKeys(org.openqa.selenium.Keys.PAGE_DOWN).build().perform();
        Thread.sleep(2000);
       
       actions.sendKeys(org.openqa.selenium.Keys.PAGE_DOWN).build().perform(); 
       Thread.sleep(2000);
       
       WebElement tequila = driver.findElement(By.xpath("/html/body/div[3]/section[2]/div/div[3]/div[2]/div/div/a/img"));
       actions.moveToElement(tequila).perform();
       Thread.sleep(1000);
       driver.findElement(By.xpath("/html/body/div[3]/section[2]/div/div[3]/div[2]/div/div/a/h6")).click();
       Thread.sleep(3000);
       
       actions.sendKeys(org.openqa.selenium.Keys.PAGE_DOWN).build().perform();
       Thread.sleep(2000);
       actions.sendKeys(org.openqa.selenium.Keys.PAGE_DOWN).build().perform();
       Thread.sleep(2000);
       actions.sendKeys(org.openqa.selenium.Keys.PAGE_DOWN).build().perform();
       Thread.sleep(2000);
       actions.sendKeys(org.openqa.selenium.Keys.PAGE_DOWN).build().perform(); 
       Thread.sleep(2000);
       actions.sendKeys(org.openqa.selenium.Keys.PAGE_DOWN).build().perform();
       Thread.sleep(2000);
       
       driver.findElement(By.xpath("/html/body/div[3]/section[3]/div/div[2]/div[1]/div")).click();
       Thread.sleep(3000);
       driver.navigate().back();
       Thread.sleep(2000);
       
       actions.sendKeys(org.openqa.selenium.Keys.PAGE_DOWN).build().perform();
       Thread.sleep(2000);
       actions.sendKeys(org.openqa.selenium.Keys.PAGE_DOWN).build().perform();
       Thread.sleep(2000);
       driver.findElement(By.xpath("/html/body/div[4]/div[1]/h2/button")).click();
       Thread.sleep(3000);
       driver.findElement(By.xpath("//*[@id=\"accordionExample\"]/div[3]/h2/button")).click();
       Thread.sleep(3000);
      
       driver.findElement(By.xpath("/html/body/footer/div/div[1]/div[1]/div/div/div/a[4]")).click();
       Thread.sleep(3000);
       driver.findElement(By.xpath("//*[@id=\"closePopup\"]")).click();
       Thread.sleep(1000);
       actions.sendKeys(org.openqa.selenium.Keys.PAGE_DOWN).build().perform();
       Thread.sleep(2000);
       actions.sendKeys(org.openqa.selenium.Keys.PAGE_DOWN).build().perform();
       Thread.sleep(2000);
       actions.sendKeys(org.openqa.selenium.Keys.PAGE_DOWN).build().perform();
       Thread.sleep(2000);
       actions.sendKeys(org.openqa.selenium.Keys.PAGE_DOWN).build().perform();
       Thread.sleep(2000);
       actions.sendKeys(org.openqa.selenium.Keys.PAGE_DOWN).build().perform();
       Thread.sleep(2000);
       actions.sendKeys(org.openqa.selenium.Keys.PAGE_DOWN).build().perform();
       Thread.sleep(2000);
       actions.sendKeys(org.openqa.selenium.Keys.PAGE_DOWN).build().perform();
       Thread.sleep(2000);
       actions.sendKeys(org.openqa.selenium.Keys.PAGE_DOWN).build().perform();
       Thread.sleep(2000);
     
       driver.findElement(By.xpath("  /html/body/footer/div/div[1]/div[2]/div/ul/li[2]/a")).click();
       Thread.sleep(3000);
      
       actions.sendKeys(org.openqa.selenium.Keys.PAGE_DOWN).build().perform();
       Thread.sleep(2000);
       actions.sendKeys(org.openqa.selenium.Keys.PAGE_DOWN).build().perform();
       Thread.sleep(2000);
       actions.sendKeys(org.openqa.selenium.Keys.PAGE_DOWN).build().perform();
       Thread.sleep(2000);
       actions.sendKeys(org.openqa.selenium.Keys.PAGE_DOWN).build().perform();
       Thread.sleep(2000);
       actions.sendKeys(org.openqa.selenium.Keys.PAGE_DOWN).build().perform();
       Thread.sleep(2000);
       actions.sendKeys(org.openqa.selenium.Keys.PAGE_DOWN).build().perform();
       Thread.sleep(2000);
       actions.sendKeys(org.openqa.selenium.Keys.PAGE_DOWN).build().perform();
       Thread.sleep(2000);
       actions.sendKeys(org.openqa.selenium.Keys.PAGE_DOWN).build().perform();
       Thread.sleep(2000);
       
       driver.findElement(By.xpath(" /html/body/footer/div/div[1]/div[3]/div/ul/li[3]/a")).click();
       Thread.sleep(3000);
      
       actions.sendKeys(org.openqa.selenium.Keys.PAGE_DOWN).build().perform();
       Thread.sleep(2000);
       actions.sendKeys(org.openqa.selenium.Keys.PAGE_DOWN).build().perform();
       Thread.sleep(2000);
       actions.sendKeys(org.openqa.selenium.Keys.PAGE_DOWN).build().perform();
       Thread.sleep(2000);
       actions.sendKeys(org.openqa.selenium.Keys.PAGE_DOWN).build().perform();
       Thread.sleep(2000);
       actions.sendKeys(org.openqa.selenium.Keys.PAGE_DOWN).build().perform();
       Thread.sleep(2000);
       actions.sendKeys(org.openqa.selenium.Keys.PAGE_DOWN).build().perform();
       Thread.sleep(2000);
       actions.sendKeys(org.openqa.selenium.Keys.PAGE_DOWN).build().perform();
       Thread.sleep(2000);
       actions.sendKeys(org.openqa.selenium.Keys.PAGE_DOWN).build().perform();
       Thread.sleep(2000);
       
       driver.findElement(By.xpath(" /html/body/footer/div/div[1]/div[4]/div/div/a[1]/img")).click();
       Thread.sleep(3000);
       driver.navigate().back();
       Thread.sleep(2000);
       
       driver.findElement(By.xpath("/html/body/footer/div/div[1]/div[4]/div/div/a[2]/img")).click();
       Thread.sleep(3000);
       driver.navigate().back();
       Thread.sleep(2000);
       actions.sendKeys(org.openqa.selenium.Keys.PAGE_DOWN).build().perform();
       Thread.sleep(2000);
       
       driver.findElement(By.xpath("/html/body/footer/div/div[2]/div[1]/div/div[2]/nav/a[3]")).click();
       Thread.sleep(3000);
       driver.findElement(By.xpath("//*[@id=\"closePopup\"]")).click();
       Thread.sleep(1000);
       
       actions.sendKeys(org.openqa.selenium.Keys.PAGE_DOWN).build().perform();
       Thread.sleep(2000);
       actions.sendKeys(org.openqa.selenium.Keys.PAGE_DOWN).build().perform();
       Thread.sleep(2000);
       actions.sendKeys(org.openqa.selenium.Keys.PAGE_DOWN).build().perform();
       Thread.sleep(2000);
       actions.sendKeys(org.openqa.selenium.Keys.PAGE_DOWN).build().perform();
       Thread.sleep(2000);
       actions.sendKeys(org.openqa.selenium.Keys.PAGE_DOWN).build().perform();
       Thread.sleep(2000);
       actions.sendKeys(org.openqa.selenium.Keys.PAGE_DOWN).build().perform();
       Thread.sleep(2000);
       actions.sendKeys(org.openqa.selenium.Keys.PAGE_DOWN).build().perform();
       Thread.sleep(2000);
       actions.sendKeys(org.openqa.selenium.Keys.PAGE_DOWN).build().perform();
       Thread.sleep(2000);
       
       
       driver.findElement(By.xpath("/html/body/footer/div/div[2]/div[2]/div/a")).click();
       Thread.sleep(2000);
       driver.findElement(By.xpath("/html/body/footer/div/div[2]/div[2]/div/ul/li[3]/a")).click();
       Thread.sleep(3000);
  
       driver.quit();
		
	}

}
