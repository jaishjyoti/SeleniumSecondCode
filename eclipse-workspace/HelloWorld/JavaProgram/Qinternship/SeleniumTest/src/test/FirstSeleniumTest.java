package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstSeleniumTest {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\lenovo\\eclipse-workspace\\HelloWorld\\JavaProgram\\Qinternship\\SeleniumTest\\drivers\\geckodriver\\geckodriver");
		WebDriver d = new FirefoxDriver();
		d.get("http://seleniumhq.org/");
		d.quit();
		
	}

}
