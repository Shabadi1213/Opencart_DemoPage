package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadHandle {
	
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/upload");
		driver.manage().window().maximize();
		
		
		By fileUpload = By.id("file-upload");
		By fileSubmit = By.id("file-submit");
		WebElement chooseFile = driver.findElement(fileUpload);
		WebElement fileClick = driver.findElement(fileSubmit);
		chooseFile.sendKeys("C:/Users/shwet/OneDrive/Desktop/tomcruse24@gmail.com.txt");
		Thread.sleep(1000);
		fileClick.click();
		
		
		driver.quit();

	}

}
