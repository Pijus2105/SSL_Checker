import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fina {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("https://pagespeed.web.dev/");
		
		Thread.sleep(1000);
		String n = Keys.chord(Keys.CONTROL,Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@href='./']"));

	}

}
