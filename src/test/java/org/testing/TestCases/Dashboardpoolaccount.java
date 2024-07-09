package org.testing.TestCases;
   import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testing.Base.Baseclass;
import org.testng.Assert;
import org.testng.annotations.Test;



	public class Dashboardpoolaccount extends Baseclass {
//		WebDriver driver;
		Properties prop;
		public Dashboardpoolaccount() {
			super();
		}

		public Dashboardpoolaccount(ChromeDriver driver, Properties prop) {
			this.driver = driver;
			{
			this.prop= setBaseVariable();
			}


		}
		public Properties setBaseVariable() {
			Baseclass b = new Baseclass();
			return b.returnProp();
		}

		@Test
		public void poolaccountlick() {
//			this.prop = returnProp();
	     String poolaccountname = driver.findElement(By.xpath("(//li[normalize-space()='Pool Account'])[1]")).getText();
	     Assert.assertEquals("Pool Account", poolaccountname);
	     driver.findElement(By.xpath("(//li[normalize-space()='Pool Account'])[1]")).click();
		}

		@Test
		public void accountstatement() {
			 String accountstatement = driver.findElement(By.xpath("(//div[@class='heading-detail'])[1]")).getText();
		     Assert.assertEquals("Account Statement", accountstatement);
		     String date  = driver.findElement(By.xpath("(//th[normalize-space()='Date'])[1]")).getText();
             Assert.assertEquals("Date",date);
             String description = driver.findElement(By.xpath("(//th[normalize-space()='Description'])[1]")).getText();
             Assert.assertEquals("Description", description);
             String debit = driver.findElement(By.xpath("(//th[normalize-space()='Debit'])[1]")).getText();
             Assert.assertEquals("Debit", debit);
             String credit = driver.findElement(By.xpath("(//th[normalize-space()='Credit'])[1]")).getText();
             Assert.assertEquals("Credit", credit);
             String balance = driver.findElement(By.xpath("(//th[normalize-space()='Balance'])[1]")).getText();
             Assert.assertEquals("Balance", balance);
             String remarks = driver.findElement(By.xpath("(//th[normalize-space()='Remarks'])[1]")).getText();
             Assert.assertEquals("Remarks", remarks);
             }



}
