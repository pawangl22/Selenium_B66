package day14.jan26;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;
import ru.yandex.qatools.ashot.shooting.ShootingStrategy;

public class Demo9 {
//Scrolling and taking screenshots
	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.actimind.com/");
		AShot a = new AShot();
		Screenshot s = a.shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
		BufferedImage image = s.getImage();
		File dstImageFile = new File("./image/actimnd.png");
		ImageIO.write(image, "png", dstImageFile);
		driver.quit();

	}

}
