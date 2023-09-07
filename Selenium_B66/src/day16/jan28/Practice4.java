package day16.jan28;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice4 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("q")).sendKeys("JAVA");
		
		List<WebElement> allSearch = driver.findElements(By.xpath("//span[contains(text(),'java')]"));
		for (WebElement search : allSearch) {
			System.out.println(search.getText());
		}
	
		String exText = "java download";
		for(int i=0; i<allSearch.size(); i++) {
			String acText = allSearch.get(i).getText();
			if(exText.equals(acText)) {
				allSearch.get(i).click();
				break;
			}
		}
		
	}

}
