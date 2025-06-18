package Final_Project;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/forms");
		driver.manage().window().maximize();

		
		driver.findElement(By.id("item-0"));
		Thread.sleep(2000);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("")));
		
	driver.findElements(By.id("draggable"));
	driver.findElements(By.id("droppable"));
	
	//* Task 1: Get the title of the webpage. 
	//* Steps to implement:
    //*1. Open the URL: "https://projects.hackerearth.com/p1/index.html".
	//* 2. WAIT for 2 seconds to ensure the page is fully loaded.
	//* 3. Retrieve the page title using `driver.getTitle()`.
	//* 4. Return the page title.
	//* @return Page title as a String */
	
	
	
driver.get("https://projects.hackerearth.com/p1/index.html");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
String f = driver.getTitle();

return f;
	


	    //* Task 2: Get List page details. 
	    //* Steps to implement: 
		//* 1. Click on the 'List' link. 
		//* 2. WAIT for 2 seconds for the page to load. 
		//* 3. Extract the current URL, header text, and first item text. 
		//* 4. Return the extracted details as a List of Strings [Header, URL, First * Item]. 
		//* * @param driver WebDriver instance 
	    //* @return List of Strings [Header, URL, First Item] */}

		
	driver.get("https://projects.hackerearth.com/p1/index.html");
	
	driver.findElements(By.xpath("xpath(\"/div/nav/ul/li[4]/a"));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	
	driver.getCurrentUrl();
	driver.findElements(By.tagName("Home - Ghostly Kisses music"));
	driver.findElements(By.linkText("Brush my lips with ghostly kisses."));
	
	String f = driver.getCurrentUrl();
	
	return f;
	
	
	
	
	
	
	
	      //* Task 3: Get Article page details.
	     //* Steps to implement:
		//* 1. Click on the 'List' link. 
		//* 2. WAIT for 2 seconds for the page to load.
	   //* 3. Click on the fi rst article link.
	  //* 4. WAIT for 1 second. 
	 //* 5. Return the current URL of the article.
	
	driver.get("https://projects.hackerearth.com/p1/index.html");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	
	driver.findElements("xpath(\\\"/div/nav/ul/li[4]/a");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	
	driver.findElements(By.xpath(""));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
	
	String r = driver.getCurrentUrl();
	return r;
	
	
	
	/** * Task 4: Get Status Codes page details.
	/* Steps to implement: 
		/* 1. Click on the 'Status Codes' link. 
		/* 2. WAIT for 2 seconds for the page to load.
	   /* 3. Extract the current URL, header text, and fi rst link text. 
	   /* 4. Return the details as a List of Strings [Header, URL, First Link Text]. 
	/* @return List of Strings [Header, URL, First Link Text] */
	
	driver.get("https://projects.hackerearth.com/p1/index.html");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	
	driver.findElements(By.xpath(""));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	
	driver.findElements(By.xpath(""));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	
	driver.getCurrentUrl();
	driver.findElements(By.tagName(""));
	driver.findElements(By.linkText(""));
	
	String p = driver.getCurrentUrl();
	return p;
	
	
	
	//* Task 5: Get Second Status Link details./ 
	//* Steps to implement: 
		//* 1. Click on the 'Status Codes' link.
		//* 2. WAIT for 2 seconds for the page to load. 
		//* 3. Click on the '301' link.
		//* 4. WAIT for 2 seconds for the page to load. 
		//* 5. Extract the current URL and the first paragraph text. 
	//* 6. Return the details as a List of Strings [URL, Paragraph Text]. * *
	
	
	driver.get("");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	
	driver.findElements(By.xpath(""));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	
	driver.findElements(By.xpath(""));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	
	driver.getCurrentUrl();
	driver.findElements(By.linkText(""));
	
	String m = driver.getCurrentUrl();
	
	return m;
	}
	
}
	
	

