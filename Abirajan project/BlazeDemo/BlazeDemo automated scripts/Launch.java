package demoproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://blazedemo.com/");
		
		String ttl = driver.getTitle();
		if(ttl.matches("BlazeDemo")) {
			
			System.out.println("Title matched!!! "+ttl);
		}
		
		driver.findElement(By.partialLinkText("destination")).click();
		String ttl1 = driver.getTitle();
		if(ttl1.contains("BlazeDemo - vacation")) {
			System.out.println("Title matched!!! "+ttl1);
		}
		
		WebElement dst = driver.findElement(By.xpath("/html/body/div[2]"));
		String dt = dst.getText();
		
		if(dt.matches("Destination of the week: Hawaii !")) {
			
			System.out.println("Text  matched!!! "+dt);
		}
		driver.quit();

	}
	

}
