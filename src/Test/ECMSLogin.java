package Test;

import org.openqa.selenium.By;import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ECMSLogin {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = login();
		driver.manage().window().maximize();
		
		String URL = "http://demoecms.s3-website.ap-south-1.amazonaws.com/#/login";
		String Email = "ranutiwari200@gmail.com";
		String Password = "Eroute@123";
		String Store = "catSelection";
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("(//div[@class='name'])[1]")).getText());
	    System.out.println(driver.findElement(By.className("cardheadTxt")).getText());	
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("(//div[@class='collapse-expand'])[1]")).click();
	    Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class='filterSelect'] //*[text()=' Add Member ']")).click();
        Thread.sleep(2000);
        driver.findElement(By.className("cy-DialMobNum")).sendKeys("8493849384");
        Thread.sleep(2000);
        driver.findElement(By.className("cy-DialFName")).sendKeys("Test");
        Thread.sleep(2000);
        driver.findElement(By.className("cy-DialLName")).sendKeys("User");
        Thread.sleep(2000);
        driver.findElement(By.className("cy-DialEmpId")).sendKeys("EMP12");
        Thread.sleep(2000);
        driver.findElement(By.className("cy-multiStoreName")).click();
        Thread.sleep(2000);
        driver.findElement(By.className("item2")).click();
        Thread.sleep(2000);
        driver.findElement(By.className("cy-diaEmpCat")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//mat-option[@id='mat-option-11']")).click();
        Thread.sleep(2000);
        driver.findElement(By.className("modal-btm")).click();
        Thread.sleep(2000);
        System.out.println(driver.findElement(By.className("errTexts")).getText());
        Thread.sleep(2000);
        driver.findElement(By.className("webClose")).click();
        Thread.sleep(2000);
	    driver.findElement(By.className("empCat")).click();	
	    Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id='mat-select-0-panel'] //*[text()='TEST STORE']")).click();
        Thread.sleep(1000);
        driver.findElement(By.className("cy-teamNameMob")).sendKeys("8493849384");
        Thread.sleep(100);
        driver.findElement(By.className("fa-times")).click();
        Thread.sleep(2000);
        driver.findElement(By.className("dltIcon")).click();
        Thread.sleep(2000);
        driver.findElement(By.className("btn-login2")).click();
        Thread.sleep(1000);
        

	    
	
		

	}
	
	public static ChromeDriver login() {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demoecms.s3-website.ap-south-1.amazonaws.com/#/login");
		driver.findElement(By.className("email-id")).sendKeys("ranutiwari200@gmail.com");
		driver.findElement(By.className("passowrd-id")).sendKeys("Eroute@123");
		driver.findElement(By.className("loginBtn")).click();
		return driver;

}}
        