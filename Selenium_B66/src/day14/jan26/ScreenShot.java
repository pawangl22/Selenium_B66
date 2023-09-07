package day14.jan26;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class ScreenShot {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.facebook.com");
		
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("alert('Hello Pawan')");
		Thread.sleep(3000);
	
		TakesScreenshot sShot = (TakesScreenshot) driver;
		File source= sShot.getScreenshotAs(OutputType.FILE);
		File dest = new File("./image/fbuser.png");
		FileUtils.copyFile(source, dest);
		driver.quit();
		

	}

}
