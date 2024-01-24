package TestCase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Base.BaseTest;
import Utilities.ReadXLSdata;

public class TeacherLogin extends BaseTest {
	
	@Test(dataProviderClass = ReadXLSdata.class, dataProvider = "bvtdata")
	public static void LoginTest(String Username, String password) throws InterruptedException {
     	System.out.println("click successfull");
		 driver.findElement(By.linkText(loc.getProperty("signin_link"))).click();
		 driver.findElement(By.linkText(loc.getProperty("//button[@class='active']"))).click();
	     driver.findElement(By.id(loc.getProperty("email_field"))).sendKeys(Username);
	     Thread.sleep(4000);
	     driver.findElement(By.xpath(loc.getProperty("pwd_filed"))).sendKeys(password);
	     Thread.sleep(4000);
	     driver.findElement(By.xpath(loc.getProperty("login_next_button"))).click();
	     Thread.sleep(4000);;
	
	}
}
