package Homepage;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Title {
	static{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\yadav\\OneDrive\\Desktop\\Drivers\\chromedriver-win64\\chromedriver.exe");
	
	}
	public static void main(String[] args) throws InterruptedException {
		//ChromeDriver driver=new ChromeDriver();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		String title=driver.getTitle();
		System.out.println(title);
		Thread.sleep(10000);
		driver.close();

	}

}
