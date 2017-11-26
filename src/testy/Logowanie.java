package testy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Logowanie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		
		
		WebDriver chrome = new ChromeDriver();
		chrome.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		chrome.manage().window().maximize();
		chrome.get("https://www.google.pl/");
		System.out.println(chrome.getCurrentUrl());
		WebElement linkDoGmail = chrome.findElement(By.xpath("//*[@id='gbw']/div/div/div[1]/div[1]/a"));
		linkDoGmail.click();
		WebElement signIn = chrome.findElement(By.xpath("//a[text()='Sign In']"));
		signIn.click();
		WebElement login = chrome.findElement(By.id("identifierId"));
		login.click();
		login.sendKeys("");
		WebElement nextButton = chrome.findElement(By.id("identifierNext"));
		nextButton.click();
		//WebElement password = chrome.findElement(By.xpath("//*[@name='password']"));
		WebElement password = chrome.findElement(By.name("password"));
		//password.click();
		password.sendKeys("");
	//	chrome.findElement(By.xpath("//*[@id='gbw']/div/div/div[1]/div[1]/a")).click();
		WebElement nextPassword = chrome.findElement(By.id("passwordNext"));
		nextPassword.click();
		
	}

}
