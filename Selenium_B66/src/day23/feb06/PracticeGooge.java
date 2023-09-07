package day23.feb06;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

class google1 {

	// Declaration
	@FindBy(xpath = "//a")
	private WebElement link;

	@FindBy(xpath = "//a")
	private List<WebElement> allLinks;

	// Initialization
	google1(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// Utilization
	void countLink() {
		int count = allLinks.size();
		System.out.println(count);
	}

	void printLink() {
		for (WebElement link : allLinks) {
			System.out.println(link.getText());
		}
	}

}

public class PracticeGooge {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		google1 g = new google1(driver);
		g.countLink();
		g.printLink();
		driver.close();

	}
}