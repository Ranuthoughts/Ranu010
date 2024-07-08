package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;



public class TeamSpends {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
//	     Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='name'])[2]")).getText();
	}

}
