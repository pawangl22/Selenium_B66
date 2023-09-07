package day13.jan25;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice2Image {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(1000);
		WebElement orangeLogin = driver.findElement(By.xpath("//div[@class='orangehrm-login-error']"));
	
		 File srcFile = orangeLogin.getScreenshotAs(OutputType.FILE);
		 File dstFile = new File("./image/orange.png");
		 
		 System.out.println(dstFile.getAbsolutePath());
		 FileUtils.copyFile(srcFile, dstFile);
	}

}
