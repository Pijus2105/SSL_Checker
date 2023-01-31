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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ttt {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("https://pagespeed.web.dev/report?url=https%3A%2F%2Fwww.issuewire.com%2F");
		
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@jsname,'EtXgf')]//c-wiz[contains(@jsrenderer,'wjovdb')]//div//div[contains(@class,'Xp7cSe')]//div[contains(@class,'deAhhc')]//div[contains(@class,'wRXBI')]//div//div[contains(@class,'lh-category-header lh-category-header__finalscreenshot')]")));
		WebElement rt = driver.findElement(By.xpath("//div[contains(@jsname,'EtXgf')]//c-wiz[contains(@jsrenderer,'wjovdb')]//div//div[contains(@class,'Xp7cSe')]//div[contains(@class,'deAhhc')]//div[contains(@class,'wRXBI')]//div//div[contains(@class,'lh-category-header lh-category-header__finalscreenshot')]"));
		//WebDriverWait waite = new WebDriverWait(driver, Duration.ofSeconds(40));
		//Thread.sleep(12000);
		File src = rt.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:/Screenshot/photo1.png"));
	}

}
