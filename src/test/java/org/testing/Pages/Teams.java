package org.testing.Pages;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testing.Base.Baseclass;
import org.testng.annotations.Test;



public class Teams  extends Baseclass {
//	WebDriver driver;
//	ExtentReports  extent;
	Properties prop;
//	Listeners.getReportObject();
	public Teams() {
		super();
	}

	public Teams (ChromeDriver driver, Properties prop) {
		this.driver = driver;
		{
		this.prop= setBaseVariable();
		}


	}
	public Properties setBaseVariable() {
		Baseclass b = new Baseclass();
		return b.returnProp();
	}

//	(retryAnalyzer = org.testing.Base.Retry.class) to retry the test case



    
	
@Test
	public void teamsclick() throws IOException, InterruptedException {
		this.prop = returnProp();
		Teams teams = new Teams();
        Thread.sleep(3000);
	    driver.findElement(By.xpath(prop.getProperty("Teams"))).click();// clicking on teams
	    
	}
}




