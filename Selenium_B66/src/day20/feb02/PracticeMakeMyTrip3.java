package day20.feb02;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PracticeMakeMyTrip3 {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.makemytrip.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		driver.findElement(By.xpath("//span[@data-cy='handleSnackbarClose']")).click();
		driver.findElement(By.xpath("//p[@data-cy='departureDate']")).click();
		
		String month="February";
		String year="2024";
		String date="2";
		
		String xp = "//div[text()='"+month+" "+year+"']/../..//p[.='"+date+"']";
		String next = "//span[@aria-label='Next Month']";
		
		for(int i=0; i<12; i++) {
			try {
					driver.findElement(By.xpath(xp)).click();
					break;
			}
			catch (Exception e) {
					System.out.println("Date not found hence clicked next -> "+i);
					driver.findElement(By.xpath(next)).click();
			}
			
		}
		driver.quit();
		

	}

}
