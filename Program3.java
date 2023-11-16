package task16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program3 {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.wikipedia.org/");
		driver.manage().window().maximize();
		driver.findElement(By.id("searchInput")).sendKeys("Artificial Intelligence");  // Entering text in search field
		driver.findElement(By.xpath("//*[@id=\"search-form\"]/fieldset/button/i")).click();
		
		driver.findElement(By.xpath("//*[@id=\"toc-History\"]/a/div")).click();
		System.out.println(driver.getTitle());
		
	}

}
