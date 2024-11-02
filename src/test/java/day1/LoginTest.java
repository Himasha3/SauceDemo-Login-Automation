package day1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("");
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("");
		
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		

	}

}
