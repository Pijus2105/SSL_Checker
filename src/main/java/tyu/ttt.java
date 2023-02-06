package tyu;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ttt {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		//driver.get("https://pagespeed.web.dev/report?url=https%3A%2F%2Fwww.issuewire.com%2F");
		driver.get("https://www.thesslstore.com/ssltools/ssl-checker.php#results");
		
		WebElement Third = driver.findElement(By.xpath("//input[@id='url']"));
		
		driver.findElement(By.xpath("//input[@id='CheckSSL']")).click();
		
		WebDriverWait Thirdwait = new WebDriverWait(driver, Duration.ofSeconds(50));
		Thirdwait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='chkserver']")));
		WebElement Thirdwaitrt = driver.findElement(By.xpath("//div[@class='chkserver']"));
		
		Thread.sleep(50000);
		
		
		WebElement VPC = driver.findElement(By.xpath("//div[@class='chkserver']"));
        WheelInput.ScrollOrigin scrollOriginVPC = WheelInput.ScrollOrigin.fromElement(VPC);
        new Actions(driver).scrollFromOrigin(scrollOriginVPC, 0, 250).perform();
		
		
		File Thirdwaitrtsrc = Thirdwaitrt.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(Thirdwaitrtsrc, new File("C:/Users/Elphill/eclipse-workspace/Automation_Practice_J/Screenshot/VideoPromotion.png"));		 
		 
	}

}
