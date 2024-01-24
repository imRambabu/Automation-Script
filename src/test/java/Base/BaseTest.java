package Base;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	public static WebDriver driver;
	public static Properties prop = new Properties();
	public static Properties loc = new Properties();
	public static FileReader fr;
	public static FileReader f1;

	@BeforeTest
	public void setup() throws IOException {

		if (driver == null) {

			FileReader fr = new FileReader(
					System.getProperty("user.dir") + "\\src\\test\\resources\\configFiles\\Config.properties");
			FileReader fr1 = new FileReader(
					System.getProperty("user.dir") + "\\src\\test\\resources\\configFiles\\locators.properties");
			prop.load(fr);
			loc.load(fr1);
		}
		if (prop.getProperty("browser").equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();// base
			WebDriver driver = new ChromeDriver();// base
			driver.get("https://proschool.ai");// properties
		} else if (prop.getProperty("browser").equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.get("https://proschool.ai");// properties
		}

	}

	@AfterTest
	public void teardown() {
		driver.close();
		System.out.println("tear down successfull");

	}
}
