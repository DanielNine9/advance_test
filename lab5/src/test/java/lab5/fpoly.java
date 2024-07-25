package lab5;

import static org.testng.Assert.fail;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class fpoly {
	@Test
	public void verifyHomepageTitle() {
// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "C:\\Users\\dinhh\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		String url = "http://lms.poly.edu.vn/";
		String title_website = "Hệ thống quản lý trị học tập Fpt Polytechnic";
		String title_expected = "";
		driver.get(url);
		title_expected = driver.getTitle();
		System.out.println(title_expected);
		if (title_expected.contentEquals(title_website)) {
			System.out.println("test pass");
		} else {
			System.out.println("test fail");
			fail("Title website is " + title_expected + ", and your title expected website is " + title_website);
		}
		driver.close();
		
	}
}