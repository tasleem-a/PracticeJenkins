package Nisha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyCuteBaby {
	@Test
	public void test()
	{
		///for friend purpose
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		String Name="TasleemNisha";
		driver.get("https://mycutebaby.in/contest/participant/639023b83ece9?utm_source=wsapp_share&utm_campaign=December_2022&utm_medium=shared&utm_term=wsapp_shared_639023b83ece9&utm_content=participant");
		driver.findElement(By.xpath("//input[@id='v']")).sendKeys(Name);
		driver.findElement(By.xpath("//a[@id='vote_btn']")).click();
		driver.quit();	
	}
}
