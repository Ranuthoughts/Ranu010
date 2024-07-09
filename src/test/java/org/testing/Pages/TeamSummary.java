package org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testing.Base.Baseclass;
import org.testng.annotations.Test;


public class TeamSummary extends Baseclass {
//	WebDriver driver;
	Properties prop;
	public TeamSummary() {
		super();
	}

	public TeamSummary(ChromeDriver driver, Properties prop) {
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
	public void teamsummaryclick() throws InterruptedException {
		this.prop = returnProp();
		@SuppressWarnings("unused")
		TeamSummary teamspends = new TeamSummary();
//		this.driver = initializedriver();
		Thread.sleep(2000);

	    driver.findElement(By.xpath("(//li[@class='list ng-star-inserted'])[2]")).click();// clicking on teamsSummary


	}




}