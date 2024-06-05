package Buy1;

import java.awt.Robot;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Buy {
	WebDriver wd;
	Robot r;
	WebDriverWait wait;
	JavascriptExecutor js;
	
	
	@BeforeTest
	public void t() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriverManager.chromedriver().setup();
		wd= new ChromeDriver(options);
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		wd.get("https://flexipill-ui-new-staging.vercel.app/");
	}
	@Test
	public void ft() throws InterruptedException {
	wd.findElement(By.xpath("(//*[@class='Header_btnLinkWhite__rHyPy'])[3]")).click();
	wd.findElement(By.xpath("//*[@placeholder='Enter your number']")).sendKeys("9347117739");
	wd.findElement(By.xpath("//*[@class='MuiTypography-root MuiTypography-body1 platinumrx-1bx7d16']")).click();
	Thread.sleep(20000);
	wd.findElement(By.xpath("//*[@type='text']")).sendKeys("paracetomol");
	wd.findElement(By.xpath("//*[@class='Searchbar_searchBtnLanding__HdOMy']")).click();
    wd.findElement(By.xpath("//*[@class='Header_cartButton__Giyrb']")).click();
    WebElement element = wd.findElement(By.xpath("(//*[@tabindex='0'])[4]"));
    JavascriptExecutor js = (JavascriptExecutor) wd;
    js.executeScript("arguments[0].scrollIntoView(true);", element);

    wd.findElement(By.xpath("(//*[@tabindex='0'])[4]")).click();
    Set<String> wk = wd.getWindowHandles();
   	for (String windowHandle : wk) {			    
   	wd.switchTo().window(windowHandle);	
   	wd.findElement(By.xpath("//*[@placeholder='Your Name']")).sendKeys("Prudhvi");
   	wd.findElement(By.xpath("//*[@placeholder='Pin code']")).sendKeys("530067");
   	wd.findElement(By.xpath("//*[@placeholder='House number, floor']")).sendKeys("1st floor,1-167");
   	wd.findElement(By.xpath("//*[@placeholder='Building name, locality']")).sendKeys("Trinity school");
	wd.findElement(By.xpath("//*[@placeholder='City']")).sendKeys("Bangalore");
	wd.findElement(By.xpath("//*[@placeholder='State']")).sendKeys("Karnataka");
	wd.findElement(By.xpath("//*[@placeholder='Patient's Name']")).sendKeys("xyzz");
	wd.findElement(By.xpath("//*[@id=':rg:']")).sendKeys("45");
	wd.findElement(By.xpath("(//*[@type='radio'])[4]")).click();
	wd.findElement(By.xpath("(//*[@type='button'])[10]")).click();
   	
   	
	}
	}
}
	

	
	
	
	
