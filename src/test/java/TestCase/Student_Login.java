package TestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Base.BaseTest;
import Utilities.ReadXLSdata;

public class Student_Login extends BaseTest {

	@Test(dataProviderClass = ReadXLSdata.class, dataProvider = "bvtdata")
	public static void LoginTest(String Username, String password) throws InterruptedException {
     	System.out.println("click successfull");
		 driver.findElement(By.cssSelector(loc.getProperty("signin_link"))).click();
		 driver.findElement(By.cssSelector(loc.getProperty("Student_button"))).click();
	     driver.findElement(By.xpath(loc.getProperty("email_field"))).sendKeys(Username);
	     Thread.sleep(4000);
	     driver.findElement(By.xpath(loc.getProperty("pwd_filed"))).sendKeys(password);
	     Thread.sleep(4000);
	     driver.findElement(By.xpath(loc.getProperty("login_next_button"))).click();
	     Thread.sleep(4000);;
		

	}

}
