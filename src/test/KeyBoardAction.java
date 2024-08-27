package learnSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardAction {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/Deekshith/eclipse-workspace/vedhandh_api/src/test/resources/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://learn.aigyan.in/login/");
		
		WebElement name= driver.findElement(By.xpath("//input[@name=\"log\"]"));
		
		WebElement pwd = driver.findElement(By.xpath("//input[@name=\"pwd\"]"));
		
		
		
		name.sendKeys("Deekshith");
		
		Actions ac=new Actions(driver);
		
		ac.keyDown(Keys.CONTROL)
        .sendKeys("a")
        .keyUp(Keys.CONTROL)
        .perform();
		
		ac.keyDown(Keys.CONTROL)
        .sendKeys("c")
        .keyUp(Keys.CONTROL)
        .perform();
		
		
		ac.click(pwd).keyDown(Keys.CONTROL)
        .sendKeys("v")
        .keyUp(Keys.CONTROL)
        .perform();
		
		ac.click(driver.findElement(By.xpath("//div[@class=\"ult-form-password-wrapper-eye-toggle\"]"))).build().perform();

}

}
