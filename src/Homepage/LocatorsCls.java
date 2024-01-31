package Homepage;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class LocatorsCls {
static{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\yadav\\OneDrive\\Desktop\\Drivers\\chromedriver-win64\\chromedriver.exe");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.google.com/");
    WebElement e=driver.findElement(By.tagName("a"));
    e.click();
	}

}
