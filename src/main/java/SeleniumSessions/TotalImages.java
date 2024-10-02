package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalImages {
	
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
//		List<WebElement> imglinks = driver.findElements(By.tagName("img"));
//		int imgCount = imglinks.size();
//		System.out.println(imgCount);
//		
////		for(int i=0;i<len;i++) {
////			String srcValue= imglinks.get(i).getAttribute("src");
////			System.out.println(srcValue);
////		}
//		
//		for(WebElement e:imglinks) {
//			String srcValue = e.getAttribute("src");
//			System.out.println(srcValue);
//		}
		
		List<WebElement> linkList = driver.findElements(By.tagName("a"));
		System.out.println(linkList.size());
		
		
		for(WebElement e:linkList) {
			String text = e.getText();
			String herfVal = e.getAttribute("href");
			System.out.println(text + ":" + herfVal);
		}
		
		
		driver.quit();
		
		
		
		
				

	}

}
