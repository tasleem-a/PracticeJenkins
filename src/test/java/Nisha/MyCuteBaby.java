package Nisha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyCuteBaby {
	@Test
	public void test()
	{
		///for friend purpose
		WebDriverManager.firefoxdriver();
		WebDriver driver = new FirefoxDriver();
		String Name="TasleemNisha1234";
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@");
		//driver.get("https://www.google.com/");
		driver.get("https://mycutebaby.in/contest/participant/639023b83ece9?utm_source=wsapp_share&utm_campaign=December_2022&utm_medium=shared&utm_term=wsapp_shared_639023b83ece9&utm_content=participant");
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@");
		driver.findElement(By.xpath("//input[@id='v']")).sendKeys(Name);
		driver.findElement(By.xpath("//a[@id='vote_btn']")).click();
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@");

	}
}
