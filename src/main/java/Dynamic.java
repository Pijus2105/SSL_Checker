import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput;
import org.openqa.selenium.interactions.WheelInput.ScrollOrigin;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;



public class Dynamic {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.manage().window().maximize();
		
		File fileName = new File("C:\\Users\\Elphill\\eclipse-workspace\\Automation_Practice_J\\DataTable\\DataTable1.xlsx");
		FileInputStream fis = new FileInputStream(fileName);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
			//XSSFWorkbook wb = new XSSFWorkbook(fis);
			

			XSSFSheet sheet = wb.getSheet("Test");
			int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();
			 //WebDriver driver = new ChromeDriver();
		
			 
			driver.get("https://www.thesslstore.com/ssltools/ssl-checker.php#results");
			
			//1-IssueWire
			WebElement first = driver.findElement(By.xpath("//input[@id='url']"));
			Thread.sleep(5000);
			first.sendKeys(sheet.getRow(0).getCell(0).getStringCellValue());
			first.sendKeys(Keys.ENTER);
			//driver.findElement(By.xpath("//input[@id='CheckSSL']")).
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='chkserver']")));
			WebElement rt = driver.findElement(By.xpath("//div[@class='chkserver']"));
			
			Thread.sleep(5000);
			
			WebElement iframe = driver.findElement(By.xpath("//div[@class='chkserver']"));
	        WheelInput.ScrollOrigin scrollOrigin = WheelInput.ScrollOrigin.fromElement(iframe);
	        new Actions(driver).scrollFromOrigin(scrollOrigin, 100, 200).perform();
			
			File src = rt.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File("C:/Users/Elphill/eclipse-workspace/Automation_Practice_J/Screenshot/IssueWire.png"));
						
			Thread.sleep(5000);


			
			
			
			//2-DMR
			
			
			WebElement second = driver.findElement(By.xpath("//input[@id='url']"));
			second.clear();
			Thread.sleep(5000);
			second.sendKeys(sheet.getRow(1).getCell(0).getStringCellValue());
			second.sendKeys(Keys.ENTER);
			//driver.findElement(By.xpath("//input[@id='CheckSSL']")).click();
			
			WebDriverWait secondwait = new WebDriverWait(driver, Duration.ofSeconds(50));
			secondwait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='chkserver']")));
			WebElement secondwaitrt = driver.findElement(By.xpath("//div[@class='chkserver']"));
			
			Thread.sleep(50000);
			
			
			WebElement frame = driver.findElement(By.xpath("//div[@class='chkserver']"));
	        WheelInput.ScrollOrigin scrollOriginn = WheelInput.ScrollOrigin.fromElement(frame);
	        new Actions(driver).scrollFromOrigin(scrollOriginn, 100, 200).perform();
			
					
			File secondwaitrtsrc = secondwaitrt.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(secondwaitrtsrc, new File("C:/Users/Elphill/eclipse-workspace/Automation_Practice_J/Screenshot/DailyMusicRoll.png"));
			

	
			
			
			//3-VideoPromotion
			WebElement Third = driver.findElement(By.xpath("//input[@id='url']"));
			Third.clear();
			Thread.sleep(5000);
			Third.sendKeys(sheet.getRow(2).getCell(0).getStringCellValue());
			Third.sendKeys(Keys.ENTER);
			//driver.findElement(By.xpath("//input[@id='CheckSSL']")).
			
			WebDriverWait Thirdwait = new WebDriverWait(driver, Duration.ofSeconds(50));
			Thirdwait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='chkserver']")));
			WebElement Thirdwaitrt = driver.findElement(By.xpath("//div[@class='chkserver']"));
			
			Thread.sleep(50000);
			
			
			WebElement VPC = driver.findElement(By.xpath("//div[@class='chkserver']"));
	        WheelInput.ScrollOrigin scrollOriginVPC = WheelInput.ScrollOrigin.fromElement(VPC);
	        new Actions(driver).scrollFromOrigin(scrollOriginVPC, 0, 250).perform();
			
			
			File Thirdwaitrtsrc = Thirdwaitrt.getScreenshotAs(OutputType.FILE);
			
			FileUtils.copyFile(Thirdwaitrtsrc, new File("C:/Users/Elphill/eclipse-workspace/Automation_Practice_J/Screenshot/VideoPromotion.png"));		 
			 
	
			
			
		
			
	       //4-VideoIpsum
			WebElement Fourth = driver.findElement(By.xpath("//input[@id='url']"));
			Fourth.clear();
			Thread.sleep(5000);
			Fourth.sendKeys(sheet.getRow(3).getCell(0).getStringCellValue());
			Fourth.sendKeys(Keys.ENTER);
			//driver.findElement(By.xpath("//input[@id='CheckSSL']"))
			
			WebDriverWait Fourthwait = new WebDriverWait(driver, Duration.ofSeconds(50));
			Fourthwait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='chkserver']")));
			WebElement Fourthwaitrt = driver.findElement(By.xpath("//div[@class='chkserver']"));
			
			Thread.sleep(50000);
			
			WebElement ifram = driver.findElement(By.xpath("//div[@class='chkserver']"));
	        WheelInput.ScrollOrigin scrollOrigi = WheelInput.ScrollOrigin.fromElement(ifram);
	        new Actions(driver).scrollFromOrigin(scrollOrigi, 100, 200).perform();
			
			
			
			File Fourthwaitrtsrc = Fourthwaitrt.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(Fourthwaitrtsrc, new File("C:/Users/Elphill/eclipse-workspace/Automation_Practice_J/Screenshot/VideoIpsum.png"));
			
			
			
			
			
			
			
			
			
			
			//5-MusicPromotion
			WebElement Fifth = driver.findElement(By.xpath("//input[@id='url']"));
			Fifth.clear();
			Thread.sleep(5000);
			Fifth.sendKeys(sheet.getRow(4).getCell(0).getStringCellValue());
			Fifth.sendKeys(Keys.ENTER);
			//driver.findElement(By.xpath("//input[@id='CheckSSL']")).sendKeys(Keys.ENTER);
			
			WebDriverWait Fifthwait = new WebDriverWait(driver, Duration.ofSeconds(50));
			Fifthwait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='chkserver']")));
			WebElement Fifthwaitrt = driver.findElement(By.xpath("//div[@class='chkserver']"));
			
			Thread.sleep(50000);
			
			WebElement iframmpc = driver.findElement(By.xpath("//div[@class='chkserver']"));
	        WheelInput.ScrollOrigin scrollOrigimpc = WheelInput.ScrollOrigin.fromElement(iframmpc);
	        new Actions(driver).scrollFromOrigin(scrollOrigimpc, 100, 200).perform();
			
			File Fifthwaitrtsrc = Fifthwaitrt.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(Fifthwaitrtsrc, new File("C:/Users/Elphill/eclipse-workspace/Automation_Practice_J/Screenshot/MusicPromotionClub.png"));
			 
			
			
			
			
			
			
			//6-Pro News
			WebElement Six = driver.findElement(By.xpath("//input[@id='url']"));
			Six.clear();
			Thread.sleep(5000);
			Six.sendKeys(sheet.getRow(5).getCell(0).getStringCellValue());
			Six.sendKeys(Keys.ENTER);
			//driver.findElement(By.xpath("//input[@id='CheckSSL']")).sendKeys(Keys.ENTER);
			
			WebDriverWait Sixwait = new WebDriverWait(driver, Duration.ofSeconds(50));
			Sixwait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='chkserver']")));
			WebElement Sixwaitrt = driver.findElement(By.xpath("//div[@class='chkserver']"));
			
			Thread.sleep(50000);
			
			WebElement iframpro = driver.findElement(By.xpath("//div[@class='chkserver']"));
	        WheelInput.ScrollOrigin scrollOrigipro = WheelInput.ScrollOrigin.fromElement(iframpro);
	        new Actions(driver).scrollFromOrigin(scrollOrigipro, 100, 200).perform();
			
			File Sixwaitrtsrc = Sixwaitrt.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(Sixwaitrtsrc, new File("C:/Users/Elphill/eclipse-workspace/Automation_Practice_J/Screenshot/ProNewsReport.png"));
		
	
	
	
	
			
			
			
			//6-York Pedia
			WebElement Seventh = driver.findElement(By.xpath("//input[@id='url']"));
			Seventh.clear();
			Thread.sleep(5000);
			Seventh.sendKeys(sheet.getRow(6).getCell(0).getStringCellValue());
			Seventh.sendKeys(Keys.ENTER);
			//driver.findElement(By.xpath("//input[@id='CheckSSL']")).sendKeys(Keys.ENTER);
			
			WebDriverWait Seventhwait = new WebDriverWait(driver, Duration.ofSeconds(50));
			Seventhwait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='chkserver']")));
			WebElement Seventhwaitrt = driver.findElement(By.xpath("//div[@class='chkserver']"));
			
			Thread.sleep(50000);
			
			WebElement iframyork = driver.findElement(By.xpath("//div[@class='chkserver']"));
	        WheelInput.ScrollOrigin scrollOrigiyork = WheelInput.ScrollOrigin.fromElement(iframyork);
	        new Actions(driver).scrollFromOrigin(scrollOrigiyork, 100, 200).perform();
			
			File Seventhwaitrtsrc = Seventhwaitrt.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(Seventhwaitrtsrc, new File("C:/Users/Elphill/eclipse-workspace/Automation_Practice_J/Screenshot/Yorkpedia.png"));
			
			
			
			
			
			
			
			//6-worldfrontnews
			WebElement Eitghth = driver.findElement(By.xpath("//input[@id='url']"));
			Eitghth.clear();
			Thread.sleep(5000);
			Eitghth.sendKeys(sheet.getRow(7).getCell(0).getStringCellValue());
			Eitghth.sendKeys(Keys.ENTER);
			//driver.findElement(By.xpath("//input[@id='CheckSSL']")).sendKeys(Keys.ENTER);
			
			WebDriverWait Eitghthwait = new WebDriverWait(driver, Duration.ofSeconds(50));
			Eitghthwait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='chkserver']")));
			WebElement Eitghthwaitrt = driver.findElement(By.xpath("//div[@class='chkserver']"));
			
			Thread.sleep(50000);
			
			WebElement iframfront = driver.findElement(By.xpath("//div[@class='chkserver']"));
	        WheelInput.ScrollOrigin scrollOrigifront = WheelInput.ScrollOrigin.fromElement(iframfront);
	        new Actions(driver).scrollFromOrigin(scrollOrigifront, 100, 200).perform();
			
			File Eitghthwaitrtsrc = Eitghthwaitrt.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(Eitghthwaitrtsrc, new File("C:/Users/Elphill/eclipse-workspace/Automation_Practice_J/Screenshot/worldfrontnews.png"));
			
			
			
			//6-fastnewsmedia
			WebElement Nine = driver.findElement(By.xpath("//input[@id='url']"));
			Nine.clear();
			Thread.sleep(5000);
			Nine.sendKeys(sheet.getRow(8).getCell(0).getStringCellValue());
			Nine.sendKeys(Keys.ENTER);
			//driver.findElement(By.xpath("//input[@id='CheckSSL']")).sendKeys(Keys.ENTER);
			
			WebDriverWait Ninewait = new WebDriverWait(driver, Duration.ofSeconds(50));
			Ninewait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='chkserver']")));
			WebElement Ninewaitrt = driver.findElement(By.xpath("//div[@class='chkserver']"));
			
			Thread.sleep(50000);
			
			WebElement iframfast = driver.findElement(By.xpath("//div[@class='chkserver']"));
	        WheelInput.ScrollOrigin scrollOrigifast = WheelInput.ScrollOrigin.fromElement(iframfast);
	        new Actions(driver).scrollFromOrigin(scrollOrigifast, 100, 200).perform();
			
			File Ninewaitrtsrc = Ninewaitrt.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(Ninewaitrtsrc, new File("C:/Users/Elphill/eclipse-workspace/Automation_Practice_J/Screenshot/fastnewsmedia.png"));
			
			
			
			
			//6-allnewsstories
			WebElement Ten = driver.findElement(By.xpath("//input[@id='url']"));
			Ten.clear();
			Thread.sleep(5000);
			Ten.sendKeys(sheet.getRow(9).getCell(0).getStringCellValue());
			Ten.sendKeys(Keys.ENTER);
			//driver.findElement(By.xpath("//input[@id='CheckSSL']")).sendKeys(Keys.ENTER);
			
			WebDriverWait Tenwait = new WebDriverWait(driver, Duration.ofSeconds(50));
			Tenwait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='chkserver']")));
			WebElement Tenwaitrt = driver.findElement(By.xpath("//div[@class='chkserver']"));
			
			Thread.sleep(50000);
			
			WebElement iframall = driver.findElement(By.xpath("//div[@class='chkserver']"));
	        WheelInput.ScrollOrigin scrollOrigiall = WheelInput.ScrollOrigin.fromElement(iframall);
	        new Actions(driver).scrollFromOrigin(scrollOrigiall, 100, 200).perform();
			
			File Tenwaitrtsrc = Tenwaitrt.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(Tenwaitrtsrc, new File("C:/Users/Elphill/eclipse-workspace/Automation_Practice_J/Screenshot/allnewsstories.png"));
			
			
			
			
			//6-themagazineplus
			WebElement Eleven = driver.findElement(By.xpath("//input[@id='url']"));
			Eleven.clear();
			Thread.sleep(5000);
			Eleven.sendKeys(sheet.getRow(10).getCell(0).getStringCellValue());
			Eleven.sendKeys(Keys.ENTER);
			//driver.findElement(By.xpath("//input[@id='CheckSSL']")).sendKeys(Keys.ENTER);
			
			WebDriverWait Elevenwait = new WebDriverWait(driver, Duration.ofSeconds(50));
			Elevenwait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='chkserver']")));
			WebElement Elevenwaitrt = driver.findElement(By.xpath("//div[@class='chkserver']"));
			
			Thread.sleep(50000);
			
			WebElement iframagazine = driver.findElement(By.xpath("//div[@class='chkserver']"));
	        WheelInput.ScrollOrigin scrollOrigimagazine = WheelInput.ScrollOrigin.fromElement(iframagazine);
	        new Actions(driver).scrollFromOrigin(scrollOrigimagazine, 100, 200).perform();
			
			File Elevenwaitrtsrc = Elevenwaitrt.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(Elevenwaitrtsrc, new File("C:/Users/Elphill/eclipse-workspace/Automation_Practice_J/Screenshot/themagazineplus.png"));
	
	
			
			
			
			
			//6-switchingfashion
			WebElement Twelve = driver.findElement(By.xpath("//input[@id='url']"));
			Twelve.clear();
			Thread.sleep(5000);
			Twelve.sendKeys(sheet.getRow(11).getCell(0).getStringCellValue());
			Twelve.sendKeys(Keys.ENTER);
			//driver.findElement(By.xpath("//input[@id='CheckSSL']")).sendKeys(Keys.ENTER);
			
			WebDriverWait Twelvewait = new WebDriverWait(driver, Duration.ofSeconds(50));
			Twelvewait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='chkserver']")));
			WebElement Twelvewaitrt = driver.findElement(By.xpath("//div[@class='chkserver']"));
			
			Thread.sleep(50000);
			
			WebElement ifraswitch = driver.findElement(By.xpath("//div[@class='chkserver']"));
	        WheelInput.ScrollOrigin scrollOrigiswitch = WheelInput.ScrollOrigin.fromElement(ifraswitch);
	        new Actions(driver).scrollFromOrigin(scrollOrigiswitch, 100, 200).perform();
	        
			File Twelvewaitrtsrc = Twelvewaitrt.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(Twelvewaitrtsrc, new File("C:/Users/Elphill/eclipse-workspace/Automation_Practice_J/Screenshot/switchingfashion.png"));
			
			
			
			
			//6-guruobserver
			WebElement Thirteen = driver.findElement(By.xpath("//input[@id='url']"));
			Thirteen.clear();
			Thread.sleep(5000);
			Thirteen.sendKeys(sheet.getRow(12).getCell(0).getStringCellValue());
			Thirteen.sendKeys(Keys.ENTER);
			//driver.findElement(By.xpath("//input[@id='CheckSSL']")).sendKeys(Keys.ENTER);
			
			WebDriverWait Thirteenwait = new WebDriverWait(driver, Duration.ofSeconds(50));
			Thirteenwait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='chkserver']")));
			WebElement Thirteenwaitrt = driver.findElement(By.xpath("//div[@class='chkserver']"));
			
			Thread.sleep(50000);
			
			WebElement ifrasguru = driver.findElement(By.xpath("//div[@class='chkserver']"));
	        WheelInput.ScrollOrigin scrollOrigiguru = WheelInput.ScrollOrigin.fromElement(ifrasguru);
	        new Actions(driver).scrollFromOrigin(scrollOrigiguru, 100, 200).perform();
			
			File Thirteenwaitrtsrc = Thirteenwaitrt.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(Thirteenwaitrtsrc, new File("C:/Users/Elphill/eclipse-workspace/Automation_Practice_J/Screenshot/guruobserver.png"));
	
			
			
			
			
			//6-yourdigitalwall
			WebElement Fouteen = driver.findElement(By.xpath("//input[@id='url']"));
			Fouteen.clear();
			Thread.sleep(5000);
			Fouteen.sendKeys(sheet.getRow(13).getCell(0).getStringCellValue());
			Fouteen.sendKeys(Keys.ENTER);
			//driver.findElement(By.xpath("//input[@id='CheckSSL']")).sendKeys(Keys.ENTER);
			
			WebDriverWait Fouteenwait = new WebDriverWait(driver, Duration.ofSeconds(50));
			Fouteenwait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='chkserver']")));
			WebElement Fouteenwaitrt = driver.findElement(By.xpath("//div[@class='chkserver']"));
			
			Thread.sleep(50000);
			
			WebElement ifraswall = driver.findElement(By.xpath("//div[@class='chkserver']"));
	        WheelInput.ScrollOrigin scrollOrigiwall = WheelInput.ScrollOrigin.fromElement(ifraswall);
	        new Actions(driver).scrollFromOrigin(scrollOrigiwall, 100, 200).perform();
	        
			File Fouteenwaitrtsrc = Fouteenwaitrt.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(Fouteenwaitrtsrc, new File("C:/Users/Elphill/eclipse-workspace/Automation_Practice_J/Screenshot/yourdigitalwall.png"));
			
			
			
			//6-soulsplay
			WebElement Fifteen = driver.findElement(By.xpath("//input[@id='url']"));
			Fifteen.clear();
			Thread.sleep(5000);
			Fifteen.sendKeys(sheet.getRow(14).getCell(0).getStringCellValue());
			Fifteen.sendKeys(Keys.ENTER);
			//driver.findElement(By.xpath("//input[@id='CheckSSL']")).sendKeys(Keys.ENTER);
			
			WebDriverWait Fifteenwait = new WebDriverWait(driver, Duration.ofSeconds(50));
			Fifteenwait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='chkserver']")));
			WebElement Fifteenwaitrt = driver.findElement(By.xpath("//div[@class='chkserver']"));
			
			Thread.sleep(50000);
			
			WebElement ifrassouls = driver.findElement(By.xpath("//div[@class='chkserver']"));
	        WheelInput.ScrollOrigin scrollOrigisouls = WheelInput.ScrollOrigin.fromElement(ifrassouls);
	        new Actions(driver).scrollFromOrigin(scrollOrigisouls, 100, 200).perform();
			
			File Fifteenwaitrtsrc = Fifteenwaitrt.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(Fifteenwaitrtsrc, new File("C:/Users/Elphill/eclipse-workspace/Automation_Practice_J/Screenshot/soulsplay.png"));
			
			
			
			
			
			//6-adhoards
			WebElement Sixteen = driver.findElement(By.xpath("//input[@id='url']"));
			Sixteen.clear();
			Thread.sleep(5000);
			Sixteen.sendKeys(sheet.getRow(15).getCell(0).getStringCellValue());
			Sixteen.sendKeys(Keys.ENTER);
			//driver.findElement(By.xpath("//input[@id='CheckSSL']")).sendKeys(Keys.ENTER);
			
			WebDriverWait Sixteenwait = new WebDriverWait(driver, Duration.ofSeconds(50));
			Sixteenwait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='chkserver']")));
			WebElement Sixteenwaitrt = driver.findElement(By.xpath("//div[@class='chkserver']"));
			
			Thread.sleep(50000);
			
			WebElement ifrasadhoards = driver.findElement(By.xpath("//div[@class='chkserver']"));
	        WheelInput.ScrollOrigin scrollOrigiadhoards = WheelInput.ScrollOrigin.fromElement(ifrasadhoards);
	        new Actions(driver).scrollFromOrigin(scrollOrigiadhoards, 100, 200).perform();
			
			File Sixteenwaitrtsrc = Sixteenwaitrt.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(Sixteenwaitrtsrc, new File("C:/Users/Elphill/eclipse-workspace/Automation_Practice_J/Screenshot/adhoards.png"));
			
			
			
			//6-intelligenceninja
			WebElement Seventeen = driver.findElement(By.xpath("//input[@id='url']"));
			Seventeen.clear();
			Thread.sleep(5000);
			Seventeen.sendKeys(sheet.getRow(16).getCell(0).getStringCellValue());
			Seventeen.sendKeys(Keys.ENTER);
			//driver.findElement(By.xpath("//input[@id='CheckSSL']")).sendKeys(Keys.ENTER);
			
			WebDriverWait Seventeenwait = new WebDriverWait(driver, Duration.ofSeconds(50));
			Seventeenwait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='chkserver']")));
			WebElement Seventeenwaitrt = driver.findElement(By.xpath("//div[@class='chkserver']"));
			
			Thread.sleep(50000);
			
			WebElement ifrasintelli = driver.findElement(By.xpath("//div[@class='chkserver']"));
	        WheelInput.ScrollOrigin scrollOrigiintelli = WheelInput.ScrollOrigin.fromElement(ifrasintelli);
	        new Actions(driver).scrollFromOrigin(scrollOrigiintelli, 100, 200).perform();
			
			File Seventeenwaitrtsrc = Seventeenwaitrt.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(Seventeenwaitrtsrc, new File("C:/Users/Elphill/eclipse-workspace/Automation_Practice_J/Screenshot/intelligenceninja.png"));
			
			
			
			
			//6-elements24x7
			WebElement Eightheen = driver.findElement(By.xpath("//input[@id='url']"));
			Eightheen.clear();
			Thread.sleep(5000);
			Eightheen.sendKeys(sheet.getRow(17).getCell(0).getStringCellValue());
			Eightheen.sendKeys(Keys.ENTER);
			//driver.findElement(By.xpath("//input[@id='CheckSSL']")).sendKeys(Keys.ENTER);
			
			WebDriverWait Eightheenwait = new WebDriverWait(driver, Duration.ofSeconds(50));
			Eightheenwait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='chkserver']")));
			WebElement Eightheenwaitrt = driver.findElement(By.xpath("//div[@class='chkserver']"));
			
			Thread.sleep(50000);
			
			WebElement ifrasele = driver.findElement(By.xpath("//div[@class='chkserver']"));
	        WheelInput.ScrollOrigin scrollOrigiele = WheelInput.ScrollOrigin.fromElement(ifrasele);
	        new Actions(driver).scrollFromOrigin(scrollOrigiele, 100, 200).perform();
			
			File Eightheenwaitrtsrc = Eightheenwaitrt.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(Eightheenwaitrtsrc, new File("C:/Users/Elphill/eclipse-workspace/Automation_Practice_J/Screenshot/elements24x7.png"));
			
			
			//6-upworldnews
			WebElement Nineteen = driver.findElement(By.xpath("//input[@id='url']"));
			Nineteen.clear();
			Thread.sleep(5000);
			Nineteen.sendKeys(sheet.getRow(18).getCell(0).getStringCellValue());
			Nineteen.sendKeys(Keys.ENTER);
			//driver.findElement(By.xpath("//input[@id='CheckSSL']")).sendKeys(Keys.ENTER);
			
			WebDriverWait Nineteenwait = new WebDriverWait(driver, Duration.ofSeconds(50));
			Nineteenwait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='chkserver']")));
			WebElement Nineteenwaitrt = driver.findElement(By.xpath("//div[@class='chkserver']"));
			
			Thread.sleep(50000);
			
			WebElement ifrasup = driver.findElement(By.xpath("//div[@class='chkserver']"));
	        WheelInput.ScrollOrigin scrollOrigiup = WheelInput.ScrollOrigin.fromElement(ifrasup);
	        new Actions(driver).scrollFromOrigin(scrollOrigiup, 100, 200).perform();
			
			File Nineteenwaitrtsrc = Nineteenwaitrt.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(Nineteenwaitrtsrc, new File("C:/Users/Elphill/eclipse-workspace/Automation_Practice_J/Screenshot/upworldnews.png"));
			
			
			
			//6-globalpostmedia
			WebElement Twenty = driver.findElement(By.xpath("//input[@id='url']"));
			Twenty.clear();
			Thread.sleep(5000);
			Twenty.sendKeys(sheet.getRow(19).getCell(0).getStringCellValue());
			Twenty.sendKeys(Keys.ENTER);
			//driver.findElement(By.xpath("//input[@id='CheckSSL']")).sendKeys(Keys.ENTER);
			
			WebDriverWait Twentywait = new WebDriverWait(driver, Duration.ofSeconds(50));
			Twentywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='chkserver']")));
			WebElement Twentywaitrt = driver.findElement(By.xpath("//div[@class='chkserver']"));
			
			Thread.sleep(50000);
			
			WebElement ifraglobal = driver.findElement(By.xpath("//div[@class='chkserver']"));
	        WheelInput.ScrollOrigin scrollOrigiglobal= WheelInput.ScrollOrigin.fromElement(ifraglobal);
	        new Actions(driver).scrollFromOrigin(scrollOrigiglobal, 100, 200).perform();
			
			File Twentywaitrtsrc = Twentywaitrt.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(Twentywaitrtsrc, new File("C:/Users/Elphill/eclipse-workspace/Automation_Practice_J/Screenshot/globalpostmedia.png"));
			
			
			
			//6-scoop24x7
			
			WebElement TwentyOne = driver.findElement(By.xpath("//input[@id='url']"));
			TwentyOne.clear();
			Thread.sleep(5000);
			TwentyOne.sendKeys(sheet.getRow(20).getCell(0).getStringCellValue());
			TwentyOne.sendKeys(Keys.ENTER);
			//driver.findElement(By.xpath("//input[@id='CheckSSL']")).sendKeys(Keys.ENTER);
			
			WebDriverWait TwentyOnewait = new WebDriverWait(driver, Duration.ofSeconds(50));
			TwentyOnewait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='chkserver']")));
			WebElement TwentyOnewaitrt = driver.findElement(By.xpath("//div[@class='chkserver']"));
			
			Thread.sleep(50000);
			
			WebElement ifrascoop = driver.findElement(By.xpath("//div[@class='chkserver']"));
	        WheelInput.ScrollOrigin scrollOrigiscoop= WheelInput.ScrollOrigin.fromElement(ifrascoop);
	        new Actions(driver).scrollFromOrigin(scrollOrigiscoop, 100, 200).perform();
			
			File TwentyOnewaitrtsrc = TwentyOnewaitrt.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(TwentyOnewaitrtsrc, new File("C:/Users/Elphill/eclipse-workspace/Automation_Practice_J/Screenshot/scoop24x7.png"));
			
			
			
			
            
			//6-livenewsviews
			WebElement TwentyThree = driver.findElement(By.xpath("//input[@id='url']"));
			TwentyThree.clear();
			Thread.sleep(5000);
			TwentyThree.sendKeys(sheet.getRow(21).getCell(0).getStringCellValue());
			TwentyThree.sendKeys(Keys.ENTER);
			//driver.findElement(By.xpath("//input[@id='CheckSSL']")).sendKeys(Keys.ENTER);
			
			WebDriverWait TwentyThreewait = new WebDriverWait(driver, Duration.ofSeconds(50));
			TwentyThreewait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='chkserver']")));
			WebElement TwentyThreewaitrt = driver.findElement(By.xpath("//div[@class='chkserver']"));
			
			Thread.sleep(50000);
			
			WebElement ifralive = driver.findElement(By.xpath("//div[@class='chkserver']"));
	        WheelInput.ScrollOrigin scrollOrigilive= WheelInput.ScrollOrigin.fromElement(ifralive);
	        new Actions(driver).scrollFromOrigin(scrollOrigilive, 100, 200).perform();
	        
			File TwentyThreewaitrtsrc = TwentyThreewaitrt.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(TwentyThreewaitrtsrc, new File("C:/Users/Elphill/eclipse-workspace/Automation_Practice_J/Screenshot/livenewsviews.png"));
			
			
			
			
			
			//6-iliveupdates
			WebElement TwentyFour = driver.findElement(By.xpath("//input[@id='url']"));
			TwentyFour.clear();
			Thread.sleep(5000);
			TwentyFour.sendKeys(sheet.getRow(22).getCell(0).getStringCellValue());
			TwentyFour.sendKeys(Keys.ENTER);
			//driver.findElement(By.xpath("//input[@id='CheckSSL']")).sendKeys(Keys.ENTER);
			
			WebDriverWait TwentyFourwait = new WebDriverWait(driver, Duration.ofSeconds(50));
			TwentyFourwait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='chkserver']")));
			WebElement TwentyFourwaitrt = driver.findElement(By.xpath("//div[@class='chkserver']"));
			
			Thread.sleep(50000);
			
			WebElement ifraupdates = driver.findElement(By.xpath("//div[@class='chkserver']"));
	        WheelInput.ScrollOrigin scrollOrigiupdates= WheelInput.ScrollOrigin.fromElement(ifraupdates);
	        new Actions(driver).scrollFromOrigin(scrollOrigiupdates, 100, 200).perform();
			
			File TwentyFourwaitrtsrc = TwentyFourwaitrt.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(TwentyFourwaitrtsrc, new File("C:/Users/Elphill/eclipse-workspace/Automation_Practice_J/Screenshot/iliveupdates.png"));
			
			
			
			
			//6-kafeibeauty
			WebElement TwentyFive = driver.findElement(By.xpath("//input[@id='url']"));
			TwentyFive.clear();
			Thread.sleep(5000);
			TwentyFive.sendKeys(sheet.getRow(23).getCell(0).getStringCellValue());
			TwentyFive.sendKeys(Keys.ENTER);
			//driver.findElement(By.xpath("//input[@id='CheckSSL']")).sendKeys(Keys.ENTER);
			
			WebDriverWait TwentyFivewait = new WebDriverWait(driver, Duration.ofSeconds(50));
			TwentyFivewait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='chkserver']")));
			WebElement TwentyFivewaitrt = driver.findElement(By.xpath("//div[@class='chkserver']"));
			
			Thread.sleep(50000);
			
			WebElement ifrakafei = driver.findElement(By.xpath("//div[@class='chkserver']"));
	        WheelInput.ScrollOrigin scrollOrigikafei= WheelInput.ScrollOrigin.fromElement(ifrakafei);
	        new Actions(driver).scrollFromOrigin(scrollOrigikafei, 100, 200).perform();
			
			File TwentyFivewaitrtsrc = TwentyFivewaitrt.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(TwentyFivewaitrtsrc, new File("C:/Users/Elphill/eclipse-workspace/Automation_Practice_J/Screenshot/kafeibeauty.png"));
			
			
			
			//6-emediagasm
			WebElement TwentySix = driver.findElement(By.xpath("//input[@id='url']"));
			TwentySix.clear();
			Thread.sleep(5000);
			TwentySix.sendKeys(sheet.getRow(24).getCell(0).getStringCellValue());
			TwentySix.sendKeys(Keys.ENTER);
			//driver.findElement(By.xpath("//input[@id='CheckSSL']")).sendKeys(Keys.ENTER);
			
			WebDriverWait TwentySixwait = new WebDriverWait(driver, Duration.ofSeconds(50));
			TwentySixwait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='chkserver']")));
			WebElement TwentySixwaitrt = driver.findElement(By.xpath("//div[@class='chkserver']"));
			
			Thread.sleep(50000);
			
			WebElement ifraemedi = driver.findElement(By.xpath("//div[@class='chkserver']"));
	        WheelInput.ScrollOrigin scrollOrigiemedi= WheelInput.ScrollOrigin.fromElement(ifraemedi);
	        new Actions(driver).scrollFromOrigin(scrollOrigiemedi, 100, 200).perform();
			
			File TwentySixwaitrtsrc = TwentySixwaitrt.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(TwentySixwaitrtsrc, new File("C:/Users/Elphill/eclipse-workspace/Automation_Practice_J/Screenshot/emediagasm.png"));
			
			
			
			
			
			//6-stocknewsdesk
			WebElement TwentySeven = driver.findElement(By.xpath("//input[@id='url']"));
			TwentySeven.clear();
			Thread.sleep(5000);
			TwentySeven.sendKeys(sheet.getRow(25).getCell(0).getStringCellValue());
			TwentySeven.sendKeys(Keys.ENTER);
			//driver.findElement(By.xpath("//input[@id='CheckSSL']")).sendKeys(Keys.ENTER);
			
			WebDriverWait TwentySevenwait = new WebDriverWait(driver, Duration.ofSeconds(50));
			TwentySevenwait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='chkserver']")));
			WebElement TwentySevenwaitrt = driver.findElement(By.xpath("//div[@class='chkserver']"));
			
			Thread.sleep(50000);
			
			WebElement ifrastock = driver.findElement(By.xpath("//div[@class='chkserver']"));
	        WheelInput.ScrollOrigin scrollOrigistock= WheelInput.ScrollOrigin.fromElement(ifrastock);
	        new Actions(driver).scrollFromOrigin(scrollOrigistock, 100, 200).perform();
			
			File TwentySevenwaitrtsrc = TwentySevenwaitrt.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(TwentySevenwaitrtsrc, new File("C:/Users/Elphill/eclipse-workspace/Automation_Practice_J/Screenshot/stocknewsdesk.png"));
			
			
			
			
			//6-spindigit
			WebElement TwentyEight = driver.findElement(By.xpath("//input[@id='url']"));
			TwentyEight.clear();
			Thread.sleep(5000);
			TwentyEight.sendKeys(sheet.getRow(26).getCell(0).getStringCellValue());
			TwentyEight.sendKeys(Keys.ENTER);
			//driver.findElement(By.xpath("//input[@id='CheckSSL']")).sendKeys(Keys.ENTER);
			
			WebDriverWait TwentyEightwait = new WebDriverWait(driver, Duration.ofSeconds(50));
			TwentyEightwait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='chkserver']")));
			WebElement TwentyEightwaitrt = driver.findElement(By.xpath("//div[@class='chkserver']"));
			
			Thread.sleep(50000);
			
			WebElement ifraspindigit = driver.findElement(By.xpath("//div[@class='chkserver']"));
	        WheelInput.ScrollOrigin scrollOrigispindigit= WheelInput.ScrollOrigin.fromElement(ifraspindigit);
	        new Actions(driver).scrollFromOrigin(scrollOrigispindigit, 100, 200).perform();
	        
			File TwentyEightwaitrtsrc = TwentyEightwaitrt.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(TwentyEightwaitrtsrc, new File("C:/Users/Elphill/eclipse-workspace/Automation_Practice_J/Screenshot/spindigit.png"));
	
	
			
			
			
			
			//6-superyachtin
//			WebElement TwentyNine = driver.findElement(By.xpath("//input[@id='url']"));
//			TwentyNine.clear();
//			Thread.sleep(5000);
//			TwentyNine.sendKeys(sheet.getRow(27).getCell(0).getStringCellValue());
//			driver.findElement(By.xpath("//input[@id='CheckSSL']")).click();
//			
//			WebDriverWait TwentyNinewait = new WebDriverWait(driver, Duration.ofSeconds(50));
//			TwentyNinewait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='chkserver']")));
//			WebElement TwentyNinewaitrt = driver.findElement(By.xpath("//div[@class='chkserver']"));
//			
//			Thread.sleep(50000);
//			
//			
//			File TwentyNinewaitrtsrc = TwentyNinewaitrt.getScreenshotAs(OutputType.FILE);
//			FileUtils.copyFile(TwentyNinewaitrtsrc, new File("C:/Users/Elphill/eclipse-workspace/Automation_Practice_J/Screenshot/superyachtin.png"));
			
			
			
			
			
			//6-frontpews
//			WebElement Thirty = driver.findElement(By.xpath("//input[@id='url']"));
//			Thirty.clear();
//			Thread.sleep(5000);
//			Thirty.sendKeys(sheet.getRow(28).getCell(0).getStringCellValue());
//			driver.findElement(By.xpath("//input[@id='CheckSSL']")).click();
//			
//			WebDriverWait Thirtywait = new WebDriverWait(driver, Duration.ofSeconds(50));
//			Thirtywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='chkserver']")));
//			WebElement Thirtywaitrt = driver.findElement(By.xpath("//div[@class='chkserver']"));
//			
//			Thread.sleep(50000);
//			
//			
//			File Thirtywaitrtsrc = Thirtywaitrt.getScreenshotAs(OutputType.FILE);
//			FileUtils.copyFile(Thirtywaitrtsrc, new File("C:/Users/Elphill/eclipse-workspace/Automation_Practice_J/Screenshot/frontpews.png"));
	   }
			

	}




