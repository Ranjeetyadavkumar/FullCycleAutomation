package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Lunchwebap {

	
	 WebDriver driver;
	   
	 @BeforeMethod
	    public void LunchURL() {
	    	 
	    	System.setProperty("webdriver.chrome.driver", "./exefiles/chromedriver.exe");
	        driver = new ChromeDriver();

	        
	        // creating a script for implicit wait for 20 seconds.
	        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	      
	        //To maximize the browser window		
	        driver.manage().window().maximize();
	        
	        // Launch the application		
	        driver.get("http://automationpractice.com/index.php");
	 }
	        
	 // Creating Script for login
	 
	         @Test (priority=1)
	         public void Login()
	        
	         {
	        	 
	     // click on the Sign in button
	        
	        WebElement SignInButton = driver.findElement(By.xpath("//a[@class='login']"));
	        SignInButton.click();
	        
	        // Enter Valid email id.
	        
	         WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
	        
           email.sendKeys("ranjeetkumaryadav08@gmail.com");
           
           // Enter Valid Password
           
           WebElement pass = driver.findElement(By.xpath("//input[@id='passwd']"));
           pass.sendKeys("Ranjeet123@");
           
        // click on the Sign In BUtton.
           
           WebElement Sign = driver.findElement(By.xpath("//p[@class='submit']//span[1]"));
	       
	         Sign.click();
	         
	     // verify valid login.
	         
	         String actualUrl="http://automationpractice.com/index.php";
	         String expectedUrl= driver.getCurrentUrl();
	         
	         if(actualUrl.equalsIgnoreCase(expectedUrl))
	         {
	             System.out.println("Script passed");
	         }
	         else
	         {
	             System.out.println("Script failed");
	         
	         }
}
	}    