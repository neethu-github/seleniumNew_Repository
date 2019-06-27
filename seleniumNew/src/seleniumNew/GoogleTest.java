package seleniumNew;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {
	WebDriver driver;
	@BeforeMethod
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
	}
	@Test(priority=1)
	public void GoogleTitleTest()
	{
	String title=driver.getTitle();
	 System.out.println(title);
	 }

	//5
	@Test
	public void googleLogoTest()
	{
	boolean b=driver.findElement(By.id("hplogo")).isDisplayed();
	}

	@Test
	public void searchBtmTest()
	{
		driver.findElement(By.name("q")).sendKeys("Wipro jobs");
	}
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}
}
