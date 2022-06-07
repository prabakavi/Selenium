package selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Buttons {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Parthiban\\eclipse-workspace\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Button.html");
		
		
		WebElement getPosition = driver.findElement(By.id("position"));
		Point point  = getPosition.getLocation();
		int x = point.getX();
		int y = point.getY();
		System.out.println(x);
		System.out.println(y);
		
		WebElement getColor = driver.findElement(By.id("color"));
		String s = getColor.getCssValue("background-color");
		System.out.println(s);
		
		WebElement getSize = driver.findElement(By.id("size"));
		int height = getSize.getSize().getHeight();
		int weight = getSize.getSize().getWidth();
		System.out.println(height);
		System.out.println(weight);
		
		
	}

}
