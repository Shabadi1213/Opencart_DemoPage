package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedIframeHandle {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://selectorshub.com/iframe-scenario/");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe#pact1")));
		driver.findElement(By.cssSelector("input#inp_val")).sendKeys("Testing");
		
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe#pact2")));
		driver.findElement(By.cssSelector("input#jex")).sendKeys("With Selenium");
		
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe#pact3")));
		driver.findElement(By.cssSelector("input#glaf")).sendKeys("Good Package");
		
		Thread.sleep(1500);
		
		driver.switchTo().parentFrame();
		driver.findElement(By.cssSelector("input#jex")).sendKeys(" With AWS");
		
		driver.switchTo().parentFrame();
		driver.findElement(By.cssSelector("input#inp_val")).sendKeys(" Java ");
		
		driver.switchTo().defaultContent();
		String text = driver.findElement(By.tagName("h3")).getText();
		System.out.println(text);
		
		Thread.sleep(2000);
		
		driver.quit();
	}

}
