package demoproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fpassword {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
        driver.get("https://blazedemo.com/");
		
		driver.findElement(By.linkText("home")).click();
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div/div[2]/form/div[4]/div/a")).click();
		
		driver.findElement(By.id("email")).sendKeys("raj@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div/div[2]/form/div[2]/div/button")).click();
		
		WebElement rslt = driver.findElement(By.xpath("/html/body/div/div[2]"));
		System.out.println(rslt.getText());

	}

}
