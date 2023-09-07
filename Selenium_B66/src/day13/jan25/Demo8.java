package day13.jan25;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo8 {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		WebElement unTB = driver.findElement(By.id("username"));
		
		File srcImageFile = unTB.getScreenshotAs(OutputType.FILE);
		File dstImageFile = new File("./image/un.png");
		FileUtils.copyFile(srcImageFile, dstImageFile);
		driver.quit();
		
	}
}
