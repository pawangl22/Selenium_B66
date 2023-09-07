package practice.pawan;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PracticeDemoSelenium {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("http://demo.seleniumeasy.com/table-search-filter-demo.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		List<WebElement> statusList = driver.findElements(By.xpath("//table[@id='task-table'] //tr/td[4]"));
		
		int count=0;
		//int size = statusList.size();
		//System.out.println(size);
		for (WebElement status : statusList)
		{
			String name = status.getText();
			if(name.equalsIgnoreCase("failed qa"))
			{
				count++;
			}		
		}
		System.out.println("The status In Progress is occurred " + count + " times");
		driver.quit();
	}

}
