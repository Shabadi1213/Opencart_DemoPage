package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class JavaScriptExecutorConcept {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		driver.manage().window().maximize();
		
		JavasScriptUtil jsUtil = new JavasScriptUtil(driver);
		By fname = By.id("input-firstname");
		WebElement firstname = driver.findElement(fname);
		
		jsUtil.flash(firstname);
		
		
//		String title = jsUtil.getTitleJavaScript();
//		System.out.println(title);
//		
//		String URL = jsUtil.getURLJavaScript();
//		System.out.println(URL);
//		
//		String pageText = jsUtil.getPageInnerText();
//		System.out.println(pageText);
//		if(pageText.contains("DPF Privacy Policy")) {
//			System.out.println("Pass");
//		}
//		
//		Thread.sleep(2000);
//		
//		jsUtil.scrollPageDown();
//		Thread.sleep(1000);
//		jsUtil.scrollPageUp();
//		Thread.sleep(1000);
//		jsUtil.scrollMiddlePage();
//		Thread.sleep(1000);
		
		driver.quit();
		
//		jsUtil.pageZoom("40.0");
//		Thread.sleep(1000);
//		jsUtil.pageZoom("400.0");
		
//		jsUtil.goForwardwithJs();
//		Thread.sleep(1000);
//		jsUtil.goBackWithJs();
//		Thread.sleep(1000);
//		jsUtil.pageRefereshWithJs();
//		Thread.sleep(1000);
		
//		jsUtil.generateJsAlert("Hello Java");
//		Thread.sleep(2000);
//		driver.quit();
		
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		String title = js.executeScript("return document.title;").toString();
//		System.out.println(title);
//	
//		
//		String URL = js.executeScript("return document.URL;").toString();
//		System.out.println(URL);
//		
	}
	
	
//	public static void getTitleJavaScript() {
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		String title = js.executeScript("return document.title;").toString();
//		System.out.println(title);
//	}
//
//	
//   public static void getURLJavaScript() {
//	   JavascriptExecutor js = (JavascriptExecutor)driver;
//	   String URL = js.executeScript("return document.URL;").toString();
//	   System.out.println(URL);
//   }
	
}
