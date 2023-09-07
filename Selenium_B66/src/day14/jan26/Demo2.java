package day14.jan26;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://news.google.com/home?hl=en-IN&gl=IN&ceid=IN:en");
		TakesScreenshot t = (TakesScreenshot) driver;
		File srcImgFile = t.getScreenshotAs(OutputType.FILE);
		File dstImgFile = new File("./image/googlenews.png");
		FileUtils.copyFile(srcImgFile, dstImgFile);
		driver.quit();
	}

}
