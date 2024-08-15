package test;

import java.io.File;
import java.util.UUID;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class EBay {
	WebDriver driver;
	String search = "java";
	String category = "wor";

	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\dinhh\\OneDrive\\Desktop\\ktnc\\advance_test\\edgedriver_win64\\msedgedriver.exe");

		driver = new EdgeDriver();
		driver.manage().window().maximize();

	}

	@BeforeMethod
	public void before() {
		driver.get("https://www.ebay.com/");
	}

	@AfterMethod
	public void afterMethod() {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String uuid = UUID.randomUUID().toString();
		File destFile = new File("./images/" + uuid + ".png");

		try {
			FileUtils.copyFile(scrFile, destFile);
			System.out.println("Screenshot taken: " + destFile.getAbsolutePath());
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	@Test
	public void testSearch() {

		WebElement search = driver.findElement(By.id("gh-ac"));
		WebElement category = driver.findElement(By.id("gh-cat"));
		WebElement searchButton = driver.findElement(By.id("gh-btn"));

		search.sendKeys("java");
		Select categorySelect = new Select(category);
		categorySelect.selectByValue("267");
		searchButton.click();

	}
}
