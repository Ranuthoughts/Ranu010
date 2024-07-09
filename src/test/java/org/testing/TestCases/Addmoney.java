package org.testing.TestCases;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testing.Base.Baseclass;
import org.testing.Pages.Teams;
import org.testng.annotations.Test;

public class Addmoney extends Baseclass{

 private Properties prop;
 public Properties setBaseVariable() {
	Baseclass b = new Baseclass();
	return b.returnProp();
	}


          @Test
          public void cardclick(WebDriver driver) throws InterruptedException, IOException {
        	 Teams addmember = new Teams((ChromeDriver) driver, prop);
   	         addmember.teamsclick();
   	         Thread.sleep(2000);
//             this.prop = returnProp();
             driver.findElement(By.className("cy-teamNameMob")).sendKeys("9876598765");
             Thread.sleep(1000);
   	         driver.findElement(By.className("names")).click();

          }


          @Test
          public void addmoney(ChromeDriver driver) throws InterruptedException, IOException {
    	      Addmoney addmoney = new Addmoney();
    	      addmoney.cardclick(driver);
        	  driver.findElement(By.className("addMoneyBtn")).click();
        	  System.out.println( driver.findElement(By.className("modal-title")).getText());
        	  driver.findElement(By.className("cy-dialAmount")).sendKeys("10");
        	  driver.findElement(By.className("cy-textRemark")).sendKeys("AddMoneyTest");
        	  driver.findElement(By.className("dwnl-btn")).click();
         	 System.out.println( driver.findElement(By.className("text-center")).getText());
        	 driver.findElement(By.className("dwnl-btn")).click();
        	 Thread.sleep(2000);
          	 System.out.println( driver.findElement(By.className("mb-0")).getText());
          	 }

          @Test
          public void noaddmoney() throws InterruptedException, IOException {
        	  Addmoney addmoney = new Addmoney();
    	      addmoney.cardclick(driver);
        	  driver.findElement(By.className("addMoneyBtn")).click();
        	  System.out.println( driver.findElement(By.className("modal-title")).getText());
        	  driver.findElement(By.className("cy-dialAmount")).sendKeys("10");
        	  driver.findElement(By.className("cy-textRemark")).sendKeys("AddMoneyTest");
        	  driver.findElement(By.className("dwnl-btn")).click();
        	  System.out.println( driver.findElement(By.className("text-center")).getText());
        	  driver.findElement(By.className("white-btn")).click();
        	 }



}






