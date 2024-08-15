package finaltest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TuoiTre {
    WebDriver driver;

    @BeforeTest
    public void setup() {
    	System.setProperty("webdriver.edge.driver",
				"C:\\Users\\dinhh\\OneDrive\\Desktop\\ktnc\\advance_test\\edgedriver_win64\\msedgedriver.exe");

		driver = new EdgeDriver();
        
        driver.get("https://tuoitre.vn");
        
        driver.manage().window().maximize();
    }

    @Test
    public void testSearch() {
       
  
        
        WebElement searchButton = driver.findElement(By.cssSelector(".header__search"));
       
//        https://tuoitre.vn/tim-kiem.htm?keywords=hello
        searchButton.click();
        WebElement searchInput = driver.findElement(By.cssSelector(".input-search.txt-search"));
        searchInput.sendKeys("Alibaba");
//        searchButton = driver.findElement(By.cssSelector(".header__search"));
//        searchButton.click();
        searchInput.submit();
//        driver.get("https://tuoitre.vn/tim-kiem.htm?keywords=alibaba");
    }
//
//    @AfterTest
//    public void tearDown() {
//        // Đóng trình duyệt sau khi hoàn thành kiểm tra
//        if (driver != null) {
//            driver.quit();
//        }
//    }
}
