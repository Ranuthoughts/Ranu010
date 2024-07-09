package org.testing.TestCases;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testing.Base.Baseclass;
import org.testing.Pages.Teams;
import org.testng.annotations.Test;

public class Teamsfilter extends Baseclass{

 private Properties prop;
 public Properties setBaseVariable() {
	Baseclass b = new Baseclass();
	return b.returnProp();
	}

          @Test
          public void teamfilter() throws InterruptedException, IOException {
        	 Teams addmember = new Teams((ChromeDriver) driver, prop);
   	         addmember.teamsclick();
             this.prop = returnProp();

          driver.findElement(By.className("cy-teamNameMob")).sendKeys("8493849384");
          Thread.sleep(2000);
          driver.findElement(By.className("fa-times")).click();
          Thread.sleep(2000);
          driver.findElement(By.className("dltIcon")).click();
          Thread.sleep(2000);
          driver.findElement(By.className("btn-login2")).click();
          Thread.sleep(1000);
	      driver.findElement(By.xpath("//input[@id='mat-input-3']")).sendKeys("EMP12");
          Thread.sleep(1000);
          driver.findElement(By.className("fa-times")).click();
          Thread.sleep(2000);
          driver.findElement(By.className("cy-multiStoreName")).click();
          Thread.sleep(2000);
           driver.findElement(By.xpath("(//li[@class='multiselect-item-checkbox ng-star-inserted'])[2]")).click();
           Thread.sleep(2000);
          }

	}





