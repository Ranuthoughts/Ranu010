package Test;

import org.openqa.selenium.chrome.ChromeDriver;

public class Browseractivities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com");
		
		 driver.navigate().to("https://fleetpreprod.taisys.in/");
         driver.navigate().back();    // Going back to the browser
         driver.navigate().forward();  // forwarding from the browser
         
         
		
		
	}

}
