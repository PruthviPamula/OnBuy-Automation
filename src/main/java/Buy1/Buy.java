package Buy1;

import java.awt.Robot;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
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
	
	@BeforeTest
	public void t() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriverManager.chromedriver().setup();
		wd= new ChromeDriver(options);
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		wd.get("https://www.onbuy.com/gb/");
		
		
	}
	@Test
	public void t1() {
	wd.findElement(By.xpath("(//*[@class='CybotCookiebotDialogBodyButton'])[2]")).click();
	//Login Functionality
	wd.findElement(By.xpath("//*[@class='ob-font-bold ob-hidden xl:ob-block']")).click();
	wd.findElement(By.xpath("(//*[@type='email'])[1]")).sendKeys("pruthvigowdpamal");  // Testing with negative data
	wd.findElement(By.xpath("(//*[@type='email'])[1]")).clear();
	wd.findElement(By.xpath("(//*[@type='email'])[1]")).sendKeys("pruthvigowdpamala@gmail.com");
	wd.findElement(By.xpath("//*[@id='onbuy-login']")).click();
	wd.findElement(By.xpath("//*[@type='password']")).sendKeys("185232@Ram");
	wd.findElement(By.xpath("//*[@id='onbuy-login']")).click();
	//Log out Functionality
	wd.findElement(By.xpath("//*[text()= 'Hi Pruthvi']")).click();
	wd.findElement(By.xpath("//*[text()= 'Log Out']")).click();
	//Re Login Functionality
	wd.findElement(By.xpath("//*[@class='ob-font-bold ob-hidden xl:ob-block']")).click();
	wd.findElement(By.xpath("(//*[@type='email'])[1]")).sendKeys("pruthvigowdpamala@gmail.com");
	wd.findElement(By.xpath("//*[@id='onbuy-login']")).click();
	wd.findElement(By.xpath("//*[@type='password']")).sendKeys("185232@Ram");
	wd.findElement(By.xpath("//*[@id='onbuy-login']")).click();
}
}
