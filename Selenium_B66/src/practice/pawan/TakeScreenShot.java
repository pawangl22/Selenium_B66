package practice.pawan;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TakeScreenShot {
	
	public static void main(String[] args) throws IOException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("http://facebook.com");
		WebElement about = driver.findElement(By.xpath("//a[text()='About']"));
		
		File srcFile = about.getScreenshotAs(OutputType.FILE);
		File dstFile = new File("./image/fb.png");
		
		FileUtils.copyFile(srcFile, dstFile);
	}

}
