package day2.jan10;

import org.openqa.selenium.edge.EdgeDriver;

public class DemoEdgeBrowser {

	public static void main(String[] args) {
		EdgeDriver driver = new EdgeDriver();
		driver.get("http://google.com");
		System.out.println(driver.getCurrentUrl());
		System.out.println("Loading success");
		driver.quit();
	}

}
