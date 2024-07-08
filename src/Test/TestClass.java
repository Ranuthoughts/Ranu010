package Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.WebDriver;
//	//import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class TestClass {
	
	public static void main(String[] args) throws InterruptedException {
		//@SuppressWarnings("unused")
		String name = "Ranu";
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); 
		//String Password = getPassword(driver);
		// implicit wait function to wait for error message
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Ranu Tiwari\\Downloads\\msedgedriver.exe");
		// Firefox Launch
	    //WebDriver driver = new EdgeDriver();
		// Initiating the URL in Chrome Browser
		driver.get("https://fleetpreprod.taisys.in/");	
		driver.findElement(By.id("mat-input-0")).sendKeys("ranu.tiwari@eroute.in");
		driver.findElement(By.id("mat-input-1")).sendKeys("Fleet@123");
		driver.findElement(By.className("rounded-pill")).click();
		//System.out.println(driver.findElement(By.cssSelector("p.invalText")).getText());  // to print error message
		System.out.println(driver.findElement(By.cssSelector("a.link-color")).getText());    // to print forgot password text
//		driver.findElement(By.className("loginBtn")).click(); // Clicking on Submit Button
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("p[class='mb-0']")).getText();  // Getting text for the fleet enterprise
		Assert.assertEquals(driver.findElement(By.className("name")).getText(), "Hi "+name+",");  // verifying Data
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("//h6[text()='Total Budget']")).getText());
		
		driver.findElement(By.xpath("(//div[@class='collapse-expand'])[1]")).click();    // Clicking on Driver section
		
		System.out.println("Printing all coloumn name in Driver Section");
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.xpath("(//th[normalize-space()='Name'])[1]")).getText());// printing coloumn name
	    System.out.println(driver.findElement(By.xpath("(//th[normalize-space()='DL No./DOB'])[1]")).getText());// printing coloumn name
	    System.out.println(driver.findElement(By.xpath("(//th[normalize-space()='Fleet'])[1]")).getText());  //printing coloumn name
	    System.out.println(driver.findElement(By.xpath("(//th[normalize-space()='Status'])[1]")).getText());
	    System.out.println(driver.findElement(By.xpath("(//th[normalize-space()='Created By'])[1]")).getText());
	    System.out.println(driver.findElement(By.xpath("(//th[normalize-space()='Created By'])[1]")).getText());
	    System.out.println(driver.findElement(By.xpath("(//th[normalize-space()='Checker'])[1]")).getText());
	    System.out.println(driver.findElement(By.xpath("(//th[normalize-space()='Cards'])[1]")).getText());
	    System.out.println(driver.findElement(By.xpath("(//th[normalize-space()='Action'])[1]")).getText());
	    driver.findElement(By.xpath("//input[@placeholder='Name / Mobile No.']")).sendKeys("7838777434");  // Search Mobile no in Driver section
	    Thread.sleep(4000);
	    driver.findElement(By.cssSelector("tr[class = 'ng-star-inserted']:nth-child(1)")).click();
	    Thread.sleep(4000);
	    driver.findElement(By.cssSelector("span[style$='cursor: pointer;']")).click();
	    driver.findElement(By.xpath("//input[@placeholder='Name / Mobile No.']")).sendKeys("8291829128");  // Searching wrong number
	    driver.findElement(By.className("fa-times")).click();  
	    Thread.sleep(200);   // Clearing the data in a search bar
	  
	    WebElement staticdropdown = driver.findElement(By.className("fleet-panel"));
	    Select dropdown = new Select(staticdropdown);
	    dropdown.selectByIndex(2);
	    System.out.println(dropdown.getFirstSelectedOption().getText());
	    dropdown.notifyAll();
	    
	    
	    
	    
        	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
//	    driver.findElement(By.className("name-heading")).click();
//	    System.out.println( driver.findElement(By.className("pt-4")).getText());    // Printing the error message
	    
		System.out.println(driver.getTitle());      // Checking the title of page and print it in the output
		System.out.println(driver.getCurrentUrl());

		
//		 	driver.close();
		
	}

//public static String getPassword(ChromeDriver driver) {
	
	      driver.get("https://fleetpreprod.taisys.in/");
	    String passwordText =driver.findElement(By.className("forgetTxt")).getText();
	    String[] passwordArray = passwordText.split("Forgot Password?");
	    String Password  = passwordArray[1].split("'")[0];
	    return Password;
	 }
}
		


		
		
		
	
