//package lab8;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.edge.EdgeOptions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import java.time.Duration;
//import java.util.List;
//import java.util.Random;
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        // Thiết lập đường dẫn đến WebDriver Edge
//        System.setProperty("webdriver.edge.driver",
//                "C:\\Users\\tiend\\OneDrive\\Desktop\\kiemthunangcao\\msedgedriver.exe");
//        // Khởi tạo EdgeDriver
//        EdgeOptions options = new EdgeOptions();
//        WebDriver driver = new EdgeDriver(options);
//
//        try {
//            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//
//            driver.get("https://accounts.google.com/");
//
//            WebElement emailField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("identifierId")));
//            emailField.sendKeys("tiendinh171203@gmail.com");
//            WebElement nextButton = driver.findElement(By.id("identifierNext"));
//            nextButton.click();
//
//            if ((new Scanner(System.in)).nextLine().isEmpty()) {
//                WebElement passwordField = wait
//                        .until(ExpectedConditions.visibilityOfElementLocated(By.name("Passwd")));
//                passwordField.sendKeys("17112003TIEN");
//
//                WebElement passwordNextButton = driver.findElement(By.id("passwordNext"));
//                passwordNextButton.click();
//                (new Scanner(System.in)).nextLine().isEmpty();
//                wait.until(ExpectedConditions.urlContains("myaccount.google.com"));
//
//                driver.get("https://www.youtube.com");
//
//                WebElement searchBox = wait
//                        .until(ExpectedConditions.visibilityOfElementLocated(By.name("search_query")));
//                searchBox.sendKeys("kiểm thử nâng cao package lab7");
//
//                WebElement searchButton = driver.findElement(By.id("search-icon-legacy"));
//                searchButton.click();
//
//                wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("contents")));
//
//                WebElement results = driver.findElement(By.id("contents"));
//                if (results.isDisplayed()) {
//                    System.out.println("Tìm kiếm thành công, đã có kết quả hiển thị.");
//
//                    // Lấy danh sách các video kết quả
//                    List<WebElement> videos = results.findElements(By.tagName("ytd-video-renderer"));
//
//                    if (!videos.isEmpty()) {
//                        // Chọn ngẫu nhiên một video từ kết quả
//                        Random rand = new Random();
//                        WebElement randomVideo = videos.get(rand.nextInt(videos.size()));
//randomVideo.click();
//
//                        // Chờ đến khi video được tải và trang chứa nút like
//                        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[aria-label='I like this']")));
//
//                        WebElement likeButton = driver.findElement(By.cssSelector("button[aria-label='I like this']"));
//                        likeButton.click();
//
//                        System.out.println("Đã like video thành công.");
//                    } else {
//                        System.out.println("Không có video nào trong kết quả tìm kiếm.");
//                    }
//                } else {
//                    System.out.println("Không có kết quả tìm kiếm nào hiển thị.");
//                }
//            }
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            driver.quit();
//        }
//    }
//}
