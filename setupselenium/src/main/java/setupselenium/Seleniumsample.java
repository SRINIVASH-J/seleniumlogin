package setupselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumsample {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		
	
		driver.get("https://login.salesforce.com/?locale=in"); //to open url
		driver.manage().window().maximize(); //to maximize
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.id("password")).sendKeys("Leaf$1234");
		driver.findElement(By.id("Login")).click();
	//	driver.findElement(By.id(null)).click();
 
		driver.close();
	}
}
