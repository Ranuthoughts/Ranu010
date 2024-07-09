package org.testing.TestCases;
   import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testing.Base.Baseclass;
import org.testng.Assert;
import org.testng.annotations.Test;


	public class Dashboardhome extends Baseclass {
//		WebDriver driver;
		Properties prop;
		public Dashboardhome() {
			super();
		}

		public Dashboardhome(ChromeDriver driver, Properties prop) {
			this.driver = driver;
			{
			this.prop= setBaseVariable();
			}


		}
		public Properties setBaseVariable() {
			Baseclass b = new Baseclass();
			return b.returnProp();
		}

		@Test(groups = {"message assertions"})
		public void enterprisename() {
//			this.prop = returnProp();
	     String Enterprisename = driver.findElement(By.className("p-0")).getText();
	     Assert.assertEquals("newenterprise", Enterprisename);
	     }

		@Test
		public void poolacountbalance() {
			String poolbalance = driver.findElement(By.xpath("(//h3[contains(text(),'₹79,010')])[1]")).getText();
			Assert.assertEquals("₹79,010", poolbalance);
		}

		@Test
		public void activemember() {
		    String activemember = driver.findElement(By.xpath("(//p[normalize-space()='ACTIVE MEMBERS'])[1]")).getText();
			Assert.assertEquals("ACTIVE MEMBERS", activemember);
			}

		@Test
		public void activecards() {
			String activecards = driver.findElement(By.xpath("(//p[normalize-space()='ACTIVE CARDS'])[1]")).getText();
			Assert.assertEquals("ACTIVE CARDS", activecards);
		}

		@Test
		public void pendinginvite() {
			String pendinginvite = driver.findElement(By.xpath("(//p[normalize-space()='PENDING INVITES(MEMBERS)'])[1]")).getText();
			Assert.assertEquals("PENDING INVITES(MEMBERS)", pendinginvite);
		}

		@Test
		public void totalusers() {
			String totalusers = driver.findElement(By.xpath("(//p[normalize-space()='TOTAL USERS'])[1]")).getText();
			Assert.assertEquals("TOTAL USERS", totalusers);
		}

		@Test
		public void poolanalysis() {
			String poolanalysis = driver.findElement(By.xpath("(//h2[normalize-space()='MONTH - WISE ANALYSIS OF POOL A/C'])[1]")).getText();
			Assert.assertEquals("MONTH - WISE ANALYSIS OF POOL A/C", poolanalysis);
		}

		@Test
		public void totalspends() {
			String totalspends = driver.findElement(By.xpath("(//h2[contains(text(),'Total Spends : ₹371')])[1]")).getText();
			Assert.assertEquals("Total Spends : ₹371", totalspends);
		}

		@Test
		public void spends() {
			driver.findElement(By.className("linkButton")).click();
		}









	}


