package Parent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loops {

	public static void main(String[] args) throws Exception {
		
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver",
				"D:\\SELENIUM_WORKSPACE\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://authvchnform.cognizant.com/vpn/tmindex.html");
		Thread.sleep(2000);
		String title=driver.getTitle();
		System.out.println(title);	
		System.out.println("We are Launched!!");
		driver.quit();
        System.out.println("Browser Closed Successully");
	}

}
