package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Mp3PlayersList {

	public static void main(String[] args) throws InterruptedException {
		
		BrowserUtil brUtil = new BrowserUtil();
		WebDriver driver = brUtil.initDriver("Chrome");
		brUtil.getUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		brUtil.maxWindow();
		
		
		ElementUtil eleUtil = new ElementUtil(driver);
		
		By mp3player = By.linkText("MP3 Players");
		By component = By.linkText("Components");
		By componentsList = By.xpath("//*[@id='menu']/div/ul/li[3]//div/ul/li");
		By mp3Playerslist = By.xpath("//*[@id='menu']/div//ul/li[8]/div/div/ul/li");
		
		
		
		eleUtil.doClick(component);
		Thread.sleep(1000);
		List<String> compList = eleUtil.getElementsText(componentsList);
//		System.out.println(compList);
		for(String e:compList) {
			System.out.println(e);
		}
		
		System.out.println("=============Mp3Player===============");
		
		eleUtil.doClick(mp3player);
		Thread.sleep(1000);
		List<String> playerList = eleUtil.getElementsText(mp3Playerslist);
		int count =1;
		for(String e:playerList) {
			System.out.println(count + " = " + e);
			count++;
		}
		
		
		
		
		
		
		
	
		brUtil.closeBrowser();

	}

}
