package demoproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Booking {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://blazedemo.com/");
		
		Select Sbox = new Select(driver.findElement(By.name("fromPort")));
		Sbox.selectByVisibleText("Boston");
		
		Select Dbox = new Select(driver.findElement(By.name("toPort")));
		Dbox.selectByVisibleText("Berlin");
		
		driver.findElement(By.xpath("/html/body/div[3]/form/div/input")).click();
		
		driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr[2]/td[1]/input")).click();
		
		driver.findElement(By.id("inputName")).sendKeys("Raptor");
		driver.findElement(By.id("address")).sendKeys("123,second street,Tranqbar,Coramendal coast");
		driver.findElement(By.id("city")).sendKeys("chennai");
		driver.findElement(By.id("state")).sendKeys("Tamil Nadu");
		driver.findElement(By.id("zipCode")).sendKeys("600106");
		
		Select card = new Select(driver.findElement(By.id("cardType")));
		card.selectByVisibleText("American Express");
		
		driver.findElement(By.id("creditCardNumber")).sendKeys("12366589654325641452");
		driver.findElement(By.id("creditCardMonth")).sendKeys("11");
		driver.findElement(By.id("creditCardYear")).sendKeys("2025");
		driver.findElement(By.id("nameOnCard")).sendKeys("Karupu vella");
		
		driver.findElement(By.id("rememberMe")).click();
		
		driver.findElement(By.xpath("/html/body/div[2]/form/div[11]/div/input")).click();
		
		WebElement result = driver.findElement(By.xpath("/html/body/div[2]/div/h1"));
		System.out.println(result.getText());
		
		
		
	}

}
