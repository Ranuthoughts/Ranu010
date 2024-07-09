package org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testing.Base.Baseclass;
import org.testng.annotations.Test;


public class MIS extends Baseclass {
//	WebDriver driver;
	Properties prop;
	public MIS() {
		super();
	}

	public MIS(ChromeDriver driver, Properties prop) {
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
	public void misclick() throws InterruptedException {
		this.prop = returnProp();
		@SuppressWarnings("unused")
		MIS teamspends = new MIS();
//		this.driver = initializedriver();
		Thread.sleep(2000);

	    driver.findElement(By.xpath("(//div[@routerlinkactive='active'])[10]")).click();// clicking on MIS


	}




}