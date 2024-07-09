package org.testing.TestCases;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testing.Base.Baseclass;
import org.testing.Pages.Teams;
import org.testng.annotations.Test;

public class Cardsettings extends Baseclass{

 private Properties prop;
 public Properties setBaseVariable() {
	Baseclass b = new Baseclass();
	return b.returnProp();
	}

          @Test
          public void carddetails() throws InterruptedException, IOException {
        	 Teams addmember = new Teams((ChromeDriver) driver, prop);
   	         addmember.teamsclick();
//             this.prop = returnProp();
   	       Addmoney addmoney = new Addmoney();
	       addmoney.cardclick(driver);
	      System.out.println(driver.findElement(By.className("cardNo")).getText());
	      System.out.println(driver.findElement(By.className("amountDetails")).getText());
          }

          @Test
          public void cardactivate() throws IOException, InterruptedException {
        	  Teams addmember = new Teams((ChromeDriver) driver, prop);
    	         addmember.teamsclick();
    	         Addmoney addmoney = new Addmoney();
    		       addmoney.cardclick(driver);
    		       driver.findElement(By.className("activeInactive")).click();
    		       System.out.println(driver.findElement(By.className("col-12")).getText());
    		       driver.findElement(By.className("white-btn")).click();
                  }

          @Test
          public void addcard() throws IOException, InterruptedException {
        	  Teams addmember = new Teams((ChromeDriver) driver, prop);
 	         addmember.teamsclick();
 	         Addmoney addmoney = new Addmoney();
 		       addmoney.cardclick(driver);
 		       Thread.sleep(2000);
 		      driver.findElement(By.xpath("(//button[@class='addCardBtn web-hide ng-star-inserted'])[1]")).click();
              Thread.sleep(2000);
 		      driver.findElement(By.className("cy-dialCardName")).sendKeys("Testing Card");
 		      System.out.println(driver.findElement(By.className("")).getText());
 		      System.out.println(driver.findElement(By.className("cy-cardPhy2")).getText());




          }
}