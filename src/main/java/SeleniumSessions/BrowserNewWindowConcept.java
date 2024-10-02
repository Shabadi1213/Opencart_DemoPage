package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserNewWindowConcept {

	public static void main(String[] args) throws InterruptedException {

         WebDriver driver = new ChromeDriver();
         driver.get("https://www.orangehrm.com/en/30-day-free-trial");
         driver.manage().window().maximize();
        String parentWindowId = driver.getWindowHandle();
         
//         driver.switchTo().newWindow(WindowType.TAB);
           driver.switchTo().newWindow(WindowType.WINDOW);
         driver.get("https://www.bigbasket.com/");
         System.out.println("Child window Title page : "+  driver.getTitle());
         Thread.sleep(1000);
         driver.close();
         
         driver.switchTo().window(parentWindowId);
         System.out.println("Parent window Title page : " + driver.getTitle());
         Thread.sleep(1500);
         driver.quit();
         
         

	}

}
