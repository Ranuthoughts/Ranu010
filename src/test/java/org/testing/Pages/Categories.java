package org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testing.Base.Baseclass;
import org.testng.annotations.Test;


public class Categories extends Baseclass {
//	WebDriver driver;
	Properties prop;
	public Categories() {
		super();
	}

	public Categories(ChromeDriver driver, Properties prop) {
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
	public void categories() {
		this.prop = returnProp();
		@SuppressWarnings("unused")
		Categories teamspends = new Categories();
//		this.driver = initializedriver();
//		Thread.sleep(2000);
	    driver.findElement(By.xpath("(//div[@routerlinkactive='active'])[8]")).click();// clicking on categories




	}




}