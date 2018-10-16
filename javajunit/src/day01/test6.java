package day01;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class test6 {
	WebDriver driver;

	@Before
	public void setUp() throws Exception {
		driver=new FirefoxDriver();
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		driver.get("https://www.jd.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement we=driver.findElement(By.xpath(".//*[@id='ttbar-myjd']/div[1]/a"));
		Select s=new Select(we);
		s.selectByVisibleText("·µÐÞÍË»»»õ");
		Thread.sleep(3000);
	}

}
