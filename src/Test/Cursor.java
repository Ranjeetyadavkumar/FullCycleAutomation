package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class Cursor {

	public static void main(String[] args) throws InterruptedException {
	
		 WebDriver driver;
		   
		
		    	System.setProperty("webdriver.chrome.driver", "./exefiles/chromedriver.exe");
		        driver = new ChromeDriver();
		
		        // creating a script for implicit wait for 20 seconds.
		        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		      
		        //To maximize the browser window		
		        driver.manage().window().maximize();
		        
		        // Launch the application		
		        driver.get("http://automationpractice.com/index.php");
		        
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
		         
		         //Move cursor over Women's link.
		         
		         Actions actions = new Actions(driver);
		         
		         WebElement WMN = driver.findElement(By.xpath("//a[@class='sf-with-ul'][contains(text(),'Women')]"));
		         actions.moveToElement(WMN).perform();
		         System.out.println("Mouse hover done in the women");
		         
		         //Click on sub-menu 'T-shirts'
		         
		         WebElement subminueOptions = driver.findElement(By.linkText("T-shirts"));
		         
		         subminueOptions.click();
		         System.out.println("Mouse operation done in submenu");
		        
		         //Mouse hover on the second product.
		         
		         Actions actions1 = new Actions(driver);
		         
		         WebElement Tshrt = driver.findElement(By.xpath("//a[@class='product_img_link']//img[@class='replace-2x img-responsive']"));
		         actions1.moveToElement(Tshrt).perform();
		         
		         // creating script for sleep
		         Thread.sleep(3000);
		         System.out.println("Second product Displyed");
		         
		         //to perform Scroll on application using Selenium
		            JavascriptExecutor js = (JavascriptExecutor) driver;
		            js.executeScript("window.scrollBy(0,250)", "");
		          
		        // click on the more button 
		            
		            WebElement MOR = driver.findElement(By.xpath("//span[contains(text(),'More')]"));
		            
		            MOR.click();
		            
		            // increase the quantity
		            
		            WebElement QTY = driver.findElement(By.xpath("//i[@class='icon-plus']"));
		            QTY.click();
		            
		            //again perform Scroll action to scroll page up to see the details contains
		            JavascriptExecutor js1 = (JavascriptExecutor) driver;
		            js1.executeScript("window.scrollBy(0,250)", "");
		            
		        // select the size large using dropdown method.
		            
	           Select select = new Select(driver.findElement(By.tagName("select")));
               select.selectByIndex(2); 
	           Thread.sleep(2000);
            
	           // select the color 
	           WebElement chbx = driver.findElement(By.name("Orange"));
	           WebElement chbx1 = driver.findElement(By.name("Blue"));
	           
	           if(!chbx1.isSelected()){
	        	   chbx1.click();
	        	   System.out.println("blue color selected");
	        	}

	        	//chbox is selected by default
	        	//if(chbx.isSelected()){
		            System.out.println("Blue color not selected");
		   
		            // click to  add to cart.
	        		
	    
		    WebElement cart1 = driver.findElement(By.xpath("//span[contains(text(),'Add to cart')]"));
		    cart1.click();
		    Thread.sleep(3000);
		    System.out.println("add to cart");
		   
		    //WebElement cart = driver.findElement(By.xpath("//button[@name='Submit']"));
			//cart.click();
		            
		            
		 // driver.findElement(By.cssSelector("#add_to_cart")).click();
		 //driver.findElement(By.name("Submit")).click();
		 //Thread.sleep(3000);
		  //driver.findElement(By.className("exclusive")).click();
		            
		 // Click the 'Proceed to checkout' button.
		    
		    WebElement checkout = driver.findElement(By.xpath("//span[contains(text(),'Proceed to checkout')]"));
		     checkout.click();
		     System.out.println("processed successfully");
		     
		     
		    // processed for checkout.
		     
		     WebElement chekout = driver.findElement(By.xpath("//a[@class='button btn btn-default standard-checkout button-medium']//span[contains(text(),'Proceed to checkout')]"));
		            chekout.click();
		            
		           System.out.println("processed for checkout");
		        
		           WebElement chekut = driver.findElement(By.xpath("//button[@name='processAddress']//span[contains(text(),'Proceed to checkout')]"));
		        chekut.click();   
		      
		      System.out.println("click on the checkout button successfully");
		      
		      // check out the TC button
		      WebElement tc = driver.findElement(By.xpath("//input[@id='cgv']"));
		      tc.click();
		      System.out.println("click on the TC button");
		      
		     WebElement processcareer = driver.findElement(By.xpath("//button[@name='processCarrier']//span[contains(text(),'Proceed to checkout')]"));
		     processcareer.click();
		     System.out.println("click on the processcareerbutton");
		     
		     //Complete the buy order process for payment.
		     
		     //script for pay by bank wire
		     
		     WebElement paymethod = driver.findElement(By.className("bankwire"));
		     paymethod.click();
		     System.out.println("first methods selcted");
		   // click on the confirm my order button
		     WebElement conmydr = driver.findElement(By.xpath("//span[contains(text(),'I confirm my order')]"));
		     conmydr.click();
		     System.out.println("order has placed successfully");
		     
		 /*   // click on the back to payment methods.
		     
		     WebElement nvg = driver.findElement(By.xpath("//p[@id='cart_navigation']"));
		     nvg.click();
		     System.out.println("Back to the payments methods");*/
		     
		     // Back to order
		     
		     WebElement bckorder = driver.findElement(By.xpath("//a[@class='button-exclusive btn btn-default']"));
		     bckorder.click();
		     System.out.println("Back to order page");
		     
		     
	 }            
	}

//}
