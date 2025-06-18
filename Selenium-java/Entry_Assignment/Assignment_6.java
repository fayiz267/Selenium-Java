package Entry_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment_6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\OneDrive\\Desktop\\Automation\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://demo.wpeverest.com/user-registration/form-3/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		
		
		WebElement Firstname=driver.findElement(By.name("first_name"));
		Firstname.sendKeys("Mohammed");
		Thread.sleep(2000);

		WebElement Lastname=driver.findElement(By.name("last_name"));
		Lastname.sendKeys("Fayizpv");
		Thread.sleep(2000);
		
		WebElement  Email=driver.findElement(By.name("user_email"));
		Email.sendKeys("fayizpv267@gmail.com");
		Thread.sleep(2000);
		
		WebElement Website=driver.findElement(By.name("user_url"));
		Website.sendKeys("https://www.youtube.com/");
		Thread.sleep(2000);

		WebElement Userpassword=driver.findElement(By.name("user_pass"));
		Userpassword.sendKeys("Fayiz@0987");
		Thread.sleep(2000);

		WebElement Confirmpassword=driver.findElement(By.name("user_confirm_password"));
		Confirmpassword.sendKeys("Fayiz@0987");
		Thread.sleep(2000);
										
		WebElement Selectgender=driver.findElement(By.cssSelector("#radio_1530100861_Male"));
		Selectgender.click();
		Thread.sleep(2000);
		
		WebElement Checkbox=driver.findElement(By.cssSelector("#check_box_1530100860_Choice2"));
		Checkbox.click();
		Thread.sleep(2000);
		
		WebElement Dropdownmenu=driver.findElement(By.xpath("//*[@id=\"country_1507714747\"]"));
		Select Country=new Select(Dropdownmenu);
		Country.selectByValue("IN");
		Thread.sleep(2000);
		
		WebElement Textarea=driver.findElement(By.name("textarea_1507714757"));
		Textarea.sendKeys("Text messages are used for personal, family, business, and social purposes. Governmental and non-governmental organizations use text messaging for communication between colleagues.");
		Thread.sleep(2000);
		
		WebElement Dropdownmenu2=driver.findElement(By.name("number_box_1507716030"));
		Dropdownmenu2.sendKeys("3");
		Thread.sleep(2000);
		
		WebElement Dropdownmenu3=driver.findElement(By.xpath("//*[@id=\"select_1507714760\"]"));
	    Select Option=new Select(Dropdownmenu3);
		Option.selectByIndex(2);
		Thread.sleep(2000);
		
		WebElement Inputfield=driver.findElement(By.name("input_box_1507714764"));
		Inputfield.sendKeys("The University using ALOH SMS in 1984 while working for Deutsche Telekom.");
		Thread.sleep(2000);
		
		
		System.out.println("Page title: " + driver.getTitle());
		System.out.println("Page URL: " + driver.getCurrentUrl());
		
		
		
		WebElement submitButton1=driver.findElement(By.xpath("//*[@id=\"user-registration-form-20\"]/form/div[6]/button"));
		System.out.println("Submit Button Text: " + submitButton1.getText());
		
		submitButton1.click();
		Thread.sleep(2000);
		
		
		driver.get(" https://demo.wpeverest.com/user-registration/column-1/");
		Thread.sleep(2000);
		
		WebElement Username=driver.findElement(By.name("user_login"));
		Username.sendKeys("fayizpv");
		Thread.sleep(2000);
		
		WebElement Useremail=driver.findElement(By.name("user_email"));
		Useremail.sendKeys("fayiz654pv@gmail.com");
		Thread.sleep(2000);
		
		WebElement Userpassword2=driver.findElement(By.name("user_pass"));
		Userpassword2.sendKeys("Fayiz0987@pv");
		Thread.sleep(2000);
		
		WebElement Confirmpassword2=driver.findElement(By.name("user_confirm_password"));
		Confirmpassword2.sendKeys("Fayiz0987@pv");
		Thread.sleep(2000);
		
	
		
		
		
		System.out.println("Page title: " + driver.getTitle());
		System.out.println("Page URL: " + driver.getCurrentUrl());
		
		
		
		WebElement submitButton2=driver.findElement(By.xpath("//*[@id=\"user-registration-form-47\"]/form/div[2]/button"));
		System.out.println("Submit Button Text: " + submitButton2.getText());		
		
		submitButton2.click();
		Thread.sleep(2000);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		driver.close();
	}

}
