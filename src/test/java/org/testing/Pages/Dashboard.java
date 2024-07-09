package org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testing.Base.Baseclass;
import org.testng.annotations.Test;


public class Dashboard extends Baseclass {
//	WebDriver driver;
	Properties prop;
	public Dashboard() {
		super();
	}

	public Dashboard(ChromeDriver driver, Properties prop) {
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
	public void dashbaord() {
//		this.prop = returnProp();
		}
}