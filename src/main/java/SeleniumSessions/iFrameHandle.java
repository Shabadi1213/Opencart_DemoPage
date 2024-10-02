package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrameHandle {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("div#imageTemplateContainer img")).click();
		Thread.sleep(2000);
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'frame-one')]")));
		driver.findElement(By.cssSelector("input#RESULT_TextField-1")).sendKeys("Java Automation");
		driver.findElement(By.cssSelector("input#RESULT_TextField-3")).sendKeys("India");
		driver.findElement(By.cssSelector("input#RESULT_TextField-4")).sendKeys("08/24/2024");
		driver.findElement(By.cssSelector("textarea#RESULT_TextArea-5")).sendKeys("Java with selenium is good combination to Automate the Web Applications");
		driver.findElement(By.cssSelector("input#RESULT_FileUpload-6")).sendKeys("C:/Users/shwet/OneDrive/Desktop/tomcruse24@gmail.com.txt");
		driver.findElement(By.cssSelector("input#RESULT_TextField-8")).sendKeys("Java");
		driver.findElement(By.cssSelector("input#RESULT_TextField-9")).sendKeys("Selenium");
		driver.findElement(By.cssSelector("input#RESULT_TextField-10")).sendKeys("#17th A cross rd,JP nagar");
		driver.findElement(By.cssSelector("input#RESULT_TextField-11")).sendKeys("JP nagar 7th pahase,Bang");
		driver.findElement(By.cssSelector("input#RESULT_TextField-12")).sendKeys("Banglore");
		driver.findElement(By.cssSelector("div#q13")).click();
		Thread.sleep(1500);
		List<WebElement> eleList = driver.findElements(By.cssSelector("div#q13 select >option"));
		for(WebElement e : eleList) {
			String eleText = e.getText();
			if(eleText.equals("Florida")) {
				e.click();
				break;
			}
		}
		
		driver.findElement(By.cssSelector("input#RESULT_TextField-14")).sendKeys("560079");
		driver.findElement(By.cssSelector("input#RESULT_TextField-15")).sendKeys("1234567890");
		driver.findElement(By.cssSelector("input#RESULT_TextField-16")).sendKeys("test12345@gmail.com");
		driver.findElement(By.cssSelector("input#FSsubmit")).click();
		Thread.sleep(3000);
		
		
		driver.switchTo().defaultContent();
		String eleText = driver.findElement(By.tagName("h3")).getText();
		System.out.println(eleText);
		
		Thread.sleep(1000);
		
		driver.quit();
	}

}
