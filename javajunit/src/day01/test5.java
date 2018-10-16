package day01;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.thoughtworks.selenium.webdriven.commands.IsAlertPresent;

public class test5 {

	//jd登录页，不输入任何信息，直接点击登录，对弹出的提示信息是否
	//是否包含两行信息内容进行断言
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
		driver.findElement(By.partialLinkText("请登录")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("账户登录")).click();
		driver.findElement(By.id("loginsubmit")).click();
		//判断提示框是否出现
		Alert a=driver.switchTo().alert();
		assertTrue(isAlertPresent());
	}

}
