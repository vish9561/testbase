package selenium;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dropdown {
public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Vishal_PC\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.flipkart.com/");
			driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
			
			Thread.sleep(2000);
			
			WebElement more = driver.findElement(By.xpath("//a[@class='_1_3w1N']"));
			
			Actions a = new Actions(driver);
			
			a.moveToElement(more).perform();
			
		a.moveToElement(driver.findElement(By.xpath("(//a[@class='_2kxeIr _1pY_1Z'])[3]"))).click().build().perform();
		}}
