package day14.jan26;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Demo8 {
//Scrolling and taking screenshots
	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.actimind.com/");
		JavascriptExecutor j = (JavascriptExecutor) driver;
		TakesScreenshot t = (TakesScreenshot) driver;

		for (int i = 1; i <= 5; i++) {
			File srcImgFile = t.getScreenshotAs(OutputType.FILE);
			File dstImgFile = new File("./image/actitime" + i + ".png");
			FileUtils.copyFile(srcImgFile, dstImgFile);
			j.executeScript("window.scrollBy(0, 200)");
			Thread.sleep(2000);
		}
		driver.quit();

	}

}
