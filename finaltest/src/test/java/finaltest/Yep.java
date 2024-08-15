package finaltest;

import java.io.File;
import java.util.Scanner;
import java.util.UUID;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Yep {
	WebDriver driver;
	String search = "alibaba";
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
		driver.get("https://yep.com/");
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

//	@Test
//	public void testSearch() {
////		System.out.println("Check validate...");
////		new Scanner(System.in).nextLine();
//		WebElement searchButton = driver.findElement(By.cssSelector(".css-1sxo2su-button.css-19wvgy0-buttonSearch.css-h3j9zi-buttonHiddenOnMobile"));
//	
//		WebElement search = driver.findElement(By.cssSelector(".css-x7xrm3-input.css-1r021wo-inputSize.css-1nmnf16"));
//		search.sendKeys("Viet Nam");
//		searchButton.click();
//
//	} 
	@Test
	public void testSearch() {
	    // Locate the search input field using the CSS selector
	    WebElement search = driver.findElement(By.cssSelector(".css-x7xrm3-input.css-1r021wo-inputSize.css-1nmnf16"));
	    search.sendKeys("Viet Nam");

	    // Locate the search button using the correct CSS selector
	    WebElement searchButton = driver.findElement(By.cssSelector(".css-1sxo2su-button.css-19wvgy0-buttonSearch.css-h3j9zi-buttonHiddenOnMobile"));
	    searchButton.click();

	    // Optionally, add assertions to verify that the search results are correct
	}


	@Test
	@Ignore
	public void testCheckbox () {
		
		WebElement checkbox = driver.findElement(By.cssSelector("input[name='s-ref-checkbox-419158031']")); // Thay đổi selector cho phù hợp với checkbox cụ thể
	    if (!checkbox.isSelected()) {
	        checkbox.click();
	    }
	    
	    // Chọn radio button (Ví dụ: Condition 'New')
	    WebElement radioButton = driver.findElement(By.cssSelector("input[name='s-ref-checkbox-419153031']")); // Thay đổi selector cho phù hợp với radio button cụ thể
	    if (!radioButton.isSelected()) {
	        radioButton.click();
	    }
	    
	    // Chọn file (Ví dụ: khi có input kiểu file)
	    WebElement fileInput = driver.findElement(By.id("uploadElementId")); // Thay đổi ID thành ID của input file
	    fileInput.sendKeys("C:\\path\\to\\your\\file.txt"); // Thay đổi đường dẫn file phù hợp
	}
//	
//
//	@AfterClass
//	@Ignore
//	public void tearDown() {
//		if (driver != null) {
//			driver.quit();
//		}
//	}
//	
}
