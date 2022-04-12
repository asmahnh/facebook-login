package facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Myfacebook {

public static void main(String[] args) {
		
	System.setProperty("webdriver.gecko.driver","C:\\selenium-java-4.1.3\\geckodriver-v0.31.0-win64\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	

	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	
	
	
	driver.quit();

}
}
