package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditBox {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Parthiban\\eclipse-workspace\\chromedriver.exe");
		

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Edit.html");
		
		WebElement mailbox = driver.findElement(By.id("email"));
		mailbox.sendKeys("prabakavi1918@gmai.com");
		
		WebElement append = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/input"));
		append.clear();
		append.sendKeys("add");
		
		WebElement getText = driver.findElement(By.name("username"));
		String x =getText.getAttribute("value");
		System.out.println(x);
		
		driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/div/div/input")).clear();

	}

}
