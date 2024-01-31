package Homepage;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class Login {
	static{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\yadav\\OneDrive\\Desktop\\Drivers\\chromedriver-win64\\chromedriver.exe");
	
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		//driver.close();

	}

}
