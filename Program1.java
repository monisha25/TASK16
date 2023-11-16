package task16;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Program1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new FirefoxDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
		String curl=driver.getCurrentUrl();
		System.out.println(curl);
		driver.navigate().refresh();
		Thread.sleep(5000);
		driver.close();
	}
	

}
