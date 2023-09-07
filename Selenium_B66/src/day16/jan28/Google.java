package day16.jan28;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Google {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("Java");
		
		List<WebElement> searchList = driver.findElements(By.xpath("(//ul[@role='listbox'])[1]"));
		int count = searchList.size();
		
		for(WebElement searchBox : searchList) {
			System.out.println(searchBox.getText());
		}
		
		Thread.sleep(5000);
		String expName = "javatpoint";
		for(int i=0; i < count; i++) {
			String name = searchList.get(i).getText();
			if (name.equalsIgnoreCase(expName)) {
				searchList.get(i).click();
				break;
			}		
		}

	}

}
