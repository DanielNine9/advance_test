package lab4_maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Main {
	public static void main(String[] args) {
		  System.setProperty("webdriver.edge.driver", "C:\\Users\\dinhh\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();

		driver.get("https://selenium.dev");
	}
}
