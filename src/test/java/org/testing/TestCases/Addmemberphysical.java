package org.testing.TestCases;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testing.Base.Baseclass;
import org.testing.Pages.Teams;
import org.testng.annotations.Test;

public class Addmemberphysical extends Baseclass{

 private Properties prop;
 public Properties setBaseVariable() {
	Baseclass b = new Baseclass();
	return b.returnProp();
	}

    @Test
	public void memberaddphysical() throws InterruptedException, IOException {

	      Teams addmember = new Teams((ChromeDriver) driver, prop);
	       addmember.teamsclick();
          this.prop = returnProp();
          Thread.sleep(5000);
  	      driver.findElement(By.xpath("//div[@class='filterSelect'] //*[text()=' Add Member ']")).click();// clicking on addmember
  	      Thread.sleep(1000);
  	      driver.findElement(By.xpath("(//span[@class='dropdown-btn'])[2]")).click();
  	      Thread.sleep(1000);
  	      driver.findElement(By.xpath("(//div[normalize-space()='Physical'])[1]")).click();
  	      Thread.sleep(2000);
            driver.findElement(By.className("cy-DialMobNum")).sendKeys("9090900002");
          Thread.sleep(2000);
          driver.findElement(By.className("cy-DialFName")).sendKeys("Test");
          Thread.sleep(2000);
          driver.findElement(By.className("cy-DialLName")).sendKeys("User");
          Thread.sleep(2000);
          driver.findElement(By.className("cy-DialEmpId")).sendKeys("EMP12");
          Thread.sleep(2000);
//          driver.findElement(By.xpath("storeSty")).click();
//          Thread.sleep(2000);
//          driver.findElement(By.className("item2")).click();
//          Thread.sleep(2000);
          driver.findElement(By.xpath("(//span[@class='dropdown-btn'])[4]")).click();
          Thread.sleep(2000);
          driver.findElement(By.xpath("(//li[@class='multiselect-item-checkbox ng-star-inserted'])[6]")).click();
          Thread.sleep(2000);
          driver.findElement(By.className("rounded-pill")).click();
          Thread.sleep(2000);
          System.out.println(driver.findElement(By.className("errTexts")).getText());
          Thread.sleep(2000);
          driver.findElement(By.className("webClose")).click();



	}}





