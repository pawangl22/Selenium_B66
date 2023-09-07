package day14.jan26;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeScrollAndScreenShot {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://news.google.com/home?hl=en-IN&gl=IN&ceid=IN:en");
		JavascriptExecutor j = (JavascriptExecutor) driver;
		TakesScreenshot s = (TakesScreenshot) driver;
		
		for (int i = 1; i < 5; i++) {
			File srcImage = s.getScreenshotAs(OutputType.FILE);
			File dstImage = new File("./image/googlenews" +i+ ".png");
			FileUtils.copyFile(srcImage, dstImage);
			j.executeScript("window.scrollBy(0, 200)");
			Thread.sleep(2000);
		}

	}

}
