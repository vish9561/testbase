package selenium;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Date;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class popup {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vishal_PC\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		Thread.sleep(1000);
//		String path = "C:\\Users\\Vishal_PC\\Desktop\\new.xlsx";
//    	FileInputStream file =new FileInputStream(path);
//    	String value = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
//		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys(value);
		
		//driver.findElement(By.xpath("(//input[@type='button'])[2]")).click();
		
//		ArrayList<String> obj=new ArrayList<String>(driver.getWindowHandles());
//		
//		driver.switchTo().window(obj.get(1));
//		driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
//		System.out.println(obj.get(1));
//		driver.switchTo().window(obj.get(0));
//		
		Date d = new Date();
        String FileName = d.toString().replace(":", "_").replace(" ", "_") + ".jpg";
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileHandler.copy(screenshot, new File("C:\\Users\\Vishal_PC\\Desktop\\screenshot\\xyz " + FileName));
		
        String path = "C:\\Users\\Vishal_PC\\Desktop\\new.xlsx";
    	FileInputStream file =new FileInputStream(path);
     WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		
		
		
		
		
	}

}
