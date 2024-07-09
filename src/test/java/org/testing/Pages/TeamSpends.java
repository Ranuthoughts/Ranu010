package org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testing.Base.Baseclass;
import org.testng.annotations.Test;


public class TeamSpends extends Baseclass {
//	WebDriver driver;
	Properties prop;
	public TeamSpends() {
		super();
	}

	public TeamSpends(ChromeDriver driver, Properties prop) {
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

	public void teamspendsclick() throws InterruptedException {
		this.prop = returnProp();
		@SuppressWarnings("unused")
		TeamSpends teamspends = new TeamSpends();
//		this.driver = initializedriver();
		Thread.sleep(2000);

	    driver.findElement(By.xpath("(//div[@routerlinkactive='active'])[5]")).click();// clicking on teamsclick



	}




}