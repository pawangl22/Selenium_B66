package day14.jan26;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeScreenShot {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(1000);
		TakesScreenshot shot = (TakesScreenshot) driver;
		File srcImage = shot.getScreenshotAs(OutputType.FILE);
		File dstImage = new File("./image/orangeLoginPage.png");
		System.out.println(dstImage.getAbsoluteFile());
		FileUtils.copyFile(srcImage, dstImage);
		driver.close();
	}

}
