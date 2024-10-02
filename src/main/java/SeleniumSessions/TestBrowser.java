package SeleniumSessions;

public class TestBrowser {

	public static void main(String[] args) throws InterruptedException {

		BrowserUtil br = new BrowserUtil();
		
		br.initDriver("Chrome");
		
		br.getUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		br.maxWindow();
		Thread.sleep(1500);
		
		br.getUrl("https://www.amazon.com");
		br.maxWindow();
		Thread.sleep(1500);
		
		
        String currUrl = br.getPageUrl();
        System.out.println(currUrl);
        
        String title = br.getPageTitle();
        System.out.println(title);
        if(title.contains("Amazon")) {
        	System.out.println("Test Pass");
        }
        else {
        	System.out.println("Test fail");
        }
        
        br.closeBrowser();
	}

}
