package org.testing.Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
    public WebDriver driver;

	public WebDriver initializedriver() throws IOException {

		// properties class
		Properties prop = new Properties();
//		WebDriver driver = null;
		FileInputStream fis = new FileInputStream("C:\\sampleFile\\GlobalData.properties");
		prop.load(fis);
		String browsername = prop.getProperty("browser");
		if (browsername.equalsIgnoreCase("chrome")) {

//			WebDriverManager.chromedriver().setup();
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
//		elseif(browsername.equalsIgnoreCase("firefox"));
//		{
//			// Firefox
//		}
//		elseif(browsername.equalsIgnoreCase("edge"));
//		{
//			// else
//		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		return driver;
}
	
	
	

	public Properties returnProp() {
		Properties prop = new Properties();
		try {
			FileInputStream fis = new FileInputStream("C:\\sampleFile\\GlobalData.properties");
			prop.load(fis);
			return prop;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	@BeforeMethod
	public WebDriver launchapplication() throws IOException, InterruptedException {
		driver = initializedriver();
		Properties prop = returnProp();
		driver.get("http://demoecms.s3-website.ap-south-1.amazonaws.com/#/login");
		Thread.sleep(2000);
		driver.findElement(By.className(prop.getProperty("EmailID"))).sendKeys("ranutiwari200@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.className(prop.getProperty("Password"))).sendKeys("Eroute@123");
		Thread.sleep(2000);
        driver.findElement(By.className("auth-btn")).click();
	    return driver;
	}

	public String getscreenshot(String testcasename , WebDriver driver) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File file = new File(System.getProperty("user.dir") + "\\screenshots" + testcasename + ".png");
		FileUtils.copyFile(source, file);
		return System.getProperty("user.dir") + "\\screenshots" + testcasename + ".png";
	}

	@AfterMethod
	public void teardown() {
		driver.close();
	}

}
