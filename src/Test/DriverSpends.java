package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverSpends {

	public static void main(String[] args) throws InterruptedException{
		ChromeDriver driver = login();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='collapse-expand'])[2]")).click();
		Thread.sleep(2000);
		 String Heading = driver.findElement(By.xpath("(//h4[@class='web-hide'])[1]")).getText();
		 System.out.println(Heading);
	     driver.findElement(By.xpath("//input[@placeholder='Name / Mobile No.']")).sendKeys("7838777434"); // Searching the data in Driver spends
//		 if(Heading == "No data found") {
//			System.out.println("No data found");
//		}
//		else {
//			System.out.println("result");
//		}
		
		
		
		
		
		
				 
	     
		

	}

	// Login Method
	public static ChromeDriver login() {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://fleetpreprod.taisys.in/");
		driver.findElement(By.id("mat-input-0")).sendKeys("ranu.tiwari@eroute.in");
		driver.findElement(By.id("mat-input-1")).sendKeys("Fleet@123");
		driver.findElement(By.className("loginBtn")).click();
		return driver;
           
	}

}
