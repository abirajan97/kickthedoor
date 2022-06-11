package demoproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://blazedemo.com/");
		
		driver.findElement(By.linkText("home")).click();
		driver.findElement(By.linkText("Register")).click();
		
		driver.findElement(By.id("name")).sendKeys("rajcraze");
		driver.findElement(By.id("company")).sendKeys("Pangea");
		driver.findElement(By.id("email")).sendKeys("raj@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Alexa021");
		driver.findElement(By.id("password-confirm")).sendKeys("Alexa021");
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div/div[2]/form/div[6]/div/button")).click();		
		WebElement result = driver.findElement(By.className("message"));		
		System.out.println(result.getText());

	}

}
