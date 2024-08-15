package lab7_;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Main {
    public static void main(String[] args) {
        // Đặt đường dẫn đến EdgeDriver
        System.setProperty("webdriver.edge.driver", "C:\\Users\\dinhh\\OneDrive\\Desktop\\ktnc\\advance_test\\edgedriver_win64\\msedgedriver.exe");
        
        // Tạo một instance của WebDriver
        WebDriver driver = new EdgeDriver();
        
        try {
            // Mở trang YouTube
            driver.get("https://www.youtube.com");

            // Tìm thanh tìm kiếm
            WebElement searchBox = driver.findElement(By.name("search_query"));
            
            // Nhập từ khóa vào thanh tìm kiếm
            searchBox.sendKeys("kiểm thử nâng cao package lab7");
            
            // Tìm nút tìm kiếm và bấm vào nó
            WebElement searchButton = driver.findElement(By.id("search-icon-legacy"));
            searchButton.click();
            
            // Thêm thời gian chờ để quan sát kết quả (tùy chọn)
            Thread.sleep(5000); // chờ 5 giây
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Đóng trình duyệt
            driver.quit();
        }
    }
}
