import org.openqa.selenium.chrome.ChromeDriver;

public class DemoAutomation {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse-java-2023-09-R-win32-x86_64\\chrome-driver\\chromedriver.exe");		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		
	}

}
